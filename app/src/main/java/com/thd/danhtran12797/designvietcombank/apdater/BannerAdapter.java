package com.thd.danhtran12797.designvietcombank.apdater;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.thd.danhtran12797.designvietcombank.R;
import com.thd.danhtran12797.designvietcombank.ScreenUtils;

public class BannerAdapter extends RecyclerView.Adapter<BannerAdapter.BannerViewHolder> {


    @NonNull
    @Override
    public BannerAdapter.BannerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        return new BannerViewHolder(layoutInflater.inflate(R.layout.item_banner, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull BannerAdapter.BannerViewHolder holder, int position) {
//        holder.setDataView(R.drawable.banhtrangtron);
    }

    @Override
    public int getItemCount() {
        return 3;
    }

    public class BannerViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView;
        public BannerViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.getLayoutParams().width= ScreenUtils.getInstance().getWidth()-ScreenUtils.getInstance().dpToPx(35);
            imageView=itemView.findViewById(R.id.image_banner);
        }
        public void setDataView(int image){
            imageView.setImageResource(image);
        }
    }
}
