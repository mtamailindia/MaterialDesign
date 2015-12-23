package com.mta.aimationapplication;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by anurag.pal on 12/23/2015.
 */
public class Adapter extends RecyclerView.Adapter<Adapter.CustomViewHolder> {

    private String strList[] = {"Item","Item","Item","Item","Item","Item","Item","Item","Item","Item","Item","Item","Item","Item","Item","Item",
            "Item","Item","Item","Item","Item","Item","Item","Item","Item",};

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_row, null);
        CustomViewHolder viewHolder = new CustomViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {
            String string = strList[position].toString();
            holder.tvTitle.setText(string);
    }

    @Override
    public int getItemCount() {
        return strList.length;
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {

        TextView tvTitle;

        public CustomViewHolder(View itemView) {
            super(itemView);
            tvTitle = (TextView) itemView.findViewById(R.id.title);
        }
    }
}
