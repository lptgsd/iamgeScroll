package com.example.mystudyglide.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.TransitionOptions;
import com.bumptech.glide.request.RequestOptions;
import com.example.mystudyglide.R;
import com.example.mystudyglide.dto.ListItemDto;

import org.w3c.dom.Text;

import java.util.List;

public class ImageListRecyclerViewAdapter extends RecyclerView.Adapter<ImageListRecyclerViewAdapter.ImageViewHolder> {

    Context context;
    List<ListItemDto> list;


    public class ImageViewHolder extends RecyclerView.ViewHolder {
        private ImageView ivImage;
        private TextView textView;

        public ImageViewHolder(View view) {
            super(view);
            ivImage = (ImageView) view.findViewById(R.id.image);
            textView = (TextView) view.findViewById(R.id.name);
        }

    }

    public ImageListRecyclerViewAdapter(Context context, List<ListItemDto> list){
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ImageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //LayoutInflater.from指定写法
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.image_item, parent, false);
        return new ImageViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ImageViewHolder holder, int position) {
        ListItemDto itemDto = list.get(position);
        if(itemDto == null){
            return;
        }
        RequestOptions options = new RequestOptions().centerCrop();
        Glide.with(context).load(itemDto.get_thumb()).apply(options).into(holder.ivImage);
        holder.textView.setText(itemDto.getTitle()==null?"":itemDto.getTitle());
    }



    @Override
    public int getItemCount() {
        if(list == null){
            return  0;
        }

        return list.size();
    }

    //加载更多数据
    public  void addMoreValue(List<ListItemDto> list){
        if(this.list != null && list!=null){
            this.list.addAll(list);
            notifyDataSetChanged();
        }
    }
    //刷新页面数据
    public void notifyData(List<ListItemDto> list) {
        this.list = list;
        this.notifyDataSetChanged();
    }
}
