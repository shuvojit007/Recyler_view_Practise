package com.example.shobojit.recyler_view_practise.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.shobojit.recyler_view_practise.Model.List_data;
import com.example.shobojit.recyler_view_practise.Model.Recycler_Data;
import com.example.shobojit.recyler_view_practise.R;

import java.util.List;

/**
 * Created by SHOBOJIT on 5/10/2017.
 */

public class Recycler_adapter extends RecyclerView.Adapter<Recycler_adapter.RecHolder> {
    List<List_data> listData;
    LayoutInflater inflater;

    public Recycler_adapter(List<List_data> listData, Context c) {
        this.listData = listData;
        inflater =LayoutInflater.from(c);
    }

    @Override
    public RecHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.list_item,parent,false);
        return new RecHolder(v);
    }

    @Override
    public void onBindViewHolder(RecHolder holder, int position) {
        List_data data = listData.get(position);
        holder.name.setText(data.getName());
        holder.icon.setImageResource(data.getIcon());
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    class RecHolder extends RecyclerView.ViewHolder {
        private TextView name;
        private ImageView icon;
        //private View Container;
        public RecHolder(View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.rectxt);
            icon = (ImageView) itemView.findViewById(R.id.recimg);
           // Container = itemView.findViewById(R.id.list_root);
        }
    }
}
