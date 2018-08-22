package com.project.opencvperson;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;


public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    List<Items> items;
    Context context;

    public Adapter(List<Items> items, Context context) {
        this.items = items;
        this.context = context;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Log.e("eeeere",items.get(position).getCc_count());
        holder.tv_count.setText(items.get(position).getCc_count()+" 명");
        holder.tv_date.setText(items.get(position).getCc_date());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView tv_count, tv_date;

        public ViewHolder(View itemView) {
            super(itemView);
            tv_count=itemView.findViewById(R.id.tv_count);
            tv_date=itemView.findViewById(R.id.tv_date);
        }
    }
}
