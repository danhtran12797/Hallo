package com.thd.danhtran12797.designvietcombank.apdater;

import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.thd.danhtran12797.designvietcombank.R;

public class OptionAdapter extends RecyclerView.Adapter<OptionAdapter.OptionViewHolder> {
    @NonNull
    @Override
    public OptionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());

        return new OptionViewHolder(layoutInflater.inflate(R.layout.item_option, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull OptionViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public class OptionViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView;
        public OptionViewHolder(@NonNull View itemView) {
            super(itemView);
        }
        public void setData(){

        }
    }
}
