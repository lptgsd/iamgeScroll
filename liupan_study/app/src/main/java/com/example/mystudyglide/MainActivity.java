package com.example.mystudyglide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.mystudyglide.adapter.ImageListRecyclerViewAdapter;
import com.example.mystudyglide.adapter.StaggeredDividerItemDecoration;
import com.example.mystudyglide.dto.ImageResponse;
import com.example.mystudyglide.dto.ListItemDto;
import com.example.mystudyglide.network.NetWorkConfig;
import com.example.mystudyglide.network.NetWorkInterface;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnLoadMoreListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Query;

public class MainActivity extends AppCompatActivity  implements ComponentCallbacks2 {

    private   SmartRefreshLayout refreshLayout;
    private   RecyclerView  recyclerView;
    private   EditText editText;
    private   Button button_search;

    private   ImageListRecyclerViewAdapter imageListRecyclerViewAdapter;
    private   String searchValue = "上海"; //默认北京，实际项目，可以加入定位功能获取城市
    private   int page  = 0;
    private   int pageNumber = 20 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView(4,3);
        initData(searchValue,page,pageNumber);

    }

    /**
     * @auth  liupan
     * @param voffset  上下间距
     * @param hCount  垂直方向条目
     */
    private  void initView(int voffset,int hCount){
        refreshLayout  = (SmartRefreshLayout)findViewById(R.id.refreshLayout);
        recyclerView  = (RecyclerView)findViewById(R.id.recyclerView);
        editText = (EditText)findViewById(R.id.editText);
        button_search = (Button)findViewById(R.id.button_search);

        //垂直方向的3列
         StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(hCount, StaggeredGridLayoutManager.VERTICAL);
        //防止Item切换
        layoutManager.setGapStrategy(StaggeredGridLayoutManager.GAP_HANDLING_NONE);
        recyclerView.addItemDecoration(new StaggeredDividerItemDecoration(this,voffset,hCount));
        recyclerView.setLayoutManager(layoutManager);
        imageListRecyclerViewAdapter = new ImageListRecyclerViewAdapter(this,null);
        recyclerView.setAdapter(imageListRecyclerViewAdapter);
        refreshLayout.setOnRefreshListener(new OnRefreshListener(){
            @Override
            public void onRefresh(RefreshLayout refreshLayout) {
                page = 0;
                initData(searchValue,page,pageNumber);
            }
        });
        refreshLayout.setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore(RefreshLayout refreshLayout) {
                page += 1;
                initData(searchValue,page,pageNumber);
            }
        });
        button_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hideKeyboard(editText);
                searchValue =   editText.getText().toString();
                initData(searchValue,page,pageNumber);
            }
        });


    }

    /**
     * 初始化data
     */
    private void initData(String searchValue, final int  page , int  pageNumber){
        initNetWorkApi().getImage(searchValue,page,pageNumber).enqueue(new Callback<ImageResponse>() {
            @Override
            public void onResponse(Call<ImageResponse> call, Response<ImageResponse> response) {
                finishGetData();
                List<ListItemDto> list = response.body().getList();
                //填充数据
                if(page == 0){
                    imageListRecyclerViewAdapter.notifyData(list);
                }else{
                    imageListRecyclerViewAdapter.addMoreValue(list);
                }

            }

            @Override
            public void onFailure(Call<ImageResponse> call, Throwable t) {
                finishGetData();
                Toast.makeText(MainActivity.this,"数据加载异常~",Toast.LENGTH_LONG).show();
            }
        });
    }

    /**
     * 数据请求完毕，恢复Ui
     */
    private  void finishGetData(){
        if(refreshLayout!=null){
            refreshLayout.finishRefresh(true);
            refreshLayout.finishLoadMore(true);
        }
    }

    @Override
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);

    }


    /**
     * 初始化网络请求，正常项目应编写在全局Application内，本次demo在Activity内使用
     * @auth liupan
     * @return
     */
    public NetWorkInterface initNetWorkApi(){
        //设置请求头Map
        Map<String ,String> headersMap = new HashMap<>();
        Retrofit retrofit = new Retrofit.Builder()
                //设置网络请求的Url地址
                .baseUrl(NetWorkConfig.API)
                //设置数据解析器
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        // 创建网络请求接口的实例
        NetWorkInterface mApi = retrofit.create(NetWorkInterface.class);
        return  mApi;
    }
    //隐藏键盘
    private void hideKeyboard(View view){
        InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService(Context.INPUT_METHOD_SERVICE);
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(),0);
    }

}
