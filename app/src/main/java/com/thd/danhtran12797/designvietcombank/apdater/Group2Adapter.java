package com.thd.danhtran12797.designvietcombank.apdater;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.thd.danhtran12797.designvietcombank.R;
import com.thd.danhtran12797.designvietcombank.ScreenUtils;

public class Group2Adapter extends RecyclerView.Adapter<Group2Adapter.Group2ViewHolder> {

    @NonNull
    @Override
    public Group2Adapter.Group2ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        return new Group2ViewHolder(layoutInflater.inflate(R.layout.item_group2, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull Group2Adapter.Group2ViewHolder holder, int position) {
//        holder.setDataView(R.drawable.banhtrangtron);
    }

    @Override
    public int getItemCount() {
        return 8;
    }

    public class Group2ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView;
        public Group2ViewHolder(@NonNull View itemView) {
            super(itemView);

        }
    }
}
