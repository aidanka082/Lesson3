package com.example.homework3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class TaskAdapter extends RecyclerView.Adapter<TaskAdapter.ViewHolder>{
    List<TaskModel>list;
    Context context;

    public TaskAdapter(List<TaskModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public TaskAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_task,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder( TaskAdapter.ViewHolder holder, int position) {
        holder.txtTitle.setText(list.get(position).getTitle());
        holder.imageView.setImageResource(list.get(position).getImage());
        holder.description.setText(list.get(position).getDescription());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView txtTitle;
        TextView description;
        ImageView imageView;

        public ViewHolder( View itemView) {
            super(itemView);
            txtTitle = itemView.findViewById(R.id.item_txt);
            description = itemView.findViewById(R.id.des_txt);
            imageView = itemView.findViewById(R.id.item_image);
        }
    }
}
