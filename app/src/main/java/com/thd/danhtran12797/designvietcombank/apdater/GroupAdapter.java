package com.thd.danhtran12797.designvietcombank.apdater;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.thd.danhtran12797.designvietcombank.R;
import com.thd.danhtran12797.designvietcombank.ScreenUtils;

import java.security.acl.Group;

public class GroupAdapter extends RecyclerView.Adapter<GroupAdapter.GroupViewHolder> {

    @NonNull
    @Override
    public GroupAdapter.GroupViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        return new GroupViewHolder(layoutInflater.inflate(R.layout.item_group, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull GroupAdapter.GroupViewHolder holder, int position) {
//        holder.setDataView(R.drawable.banhtrangtron);
    }

    @Override
    public int getItemCount() {
        return 3;
    }

    public class GroupViewHolder extends RecyclerView.ViewHolder {
        private RecyclerView recyclerView;
        public GroupViewHolder(@NonNull View itemView) {
            super(itemView);
            recyclerView=itemView.findViewById(R.id.recycler_group2);
            setRecyclerView(recyclerView);
        }
//        public void setDataView(int image){
//            imageView.setImageResource(image);
//        }
        public void setRecyclerView(RecyclerView recyclerView){
            Group2Adapter group2Adapter=new Group2Adapter();
            recyclerView.setAdapter(group2Adapter);
        }
    }
}
