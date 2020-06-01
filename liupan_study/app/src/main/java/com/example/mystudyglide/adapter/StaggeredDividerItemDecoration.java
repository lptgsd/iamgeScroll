package com.example.mystudyglide.adapter;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.TypedValue;
import android.view.View;

/**
 * 控制adapter内的item间距
 */
public class StaggeredDividerItemDecoration extends RecyclerView.ItemDecoration{
    private Context context;
    private int interval;
    private int spanCount;

    /**
     * @param interval item的间距
     * @param spanCount 列数
     * */
    public StaggeredDividerItemDecoration(Context context, int interval, int spanCount) {
        this.context = context;
        this.interval = interval;
        this.spanCount = spanCount;
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        StaggeredGridLayoutManager.LayoutParams params = (StaggeredGridLayoutManager.LayoutParams) view.getLayoutParams();
        // 获取item在span中的下标
        int spanIndex = params.getSpanIndex();
        //得出当前图片所在第几列
        int positon = spanIndex % spanCount;
        switch (positon){
            case 0:
                outRect.left = interval;
                break;
            case 1:
                outRect.left =  interval;
                outRect.right =  interval;
                break;
            case 2:
                outRect.right =  interval;
                break;
            default:
                break;
        }
        // 下方间隔
        outRect.bottom =  interval;
    }

}
