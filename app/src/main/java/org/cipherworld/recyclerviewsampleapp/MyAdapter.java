package org.cipherworld.recyclerviewsampleapp;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    String[] headings={
            "Heading 1",
            "Heading 2",
            "Heading 3",
            "Heading 4",
            "Heading 5",
            "Heading 6",
            "Heading 7",
            "Heading 8",
            "Heading 9"
    };
    String[] tagLine={
            "tagLine 1",
            "tagLine 2",
            "tagLine 3",
            "tagLine 4",
            "tagLine 5",
            "tagLine 6",
            "tagLine 7",
            "tagLine 8",
            "tagLine 9"
    };
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.tv1.setText(headings[position]);
        holder.tv2.setText(tagLine[position]);
    }

    @Override
    public int getItemCount() {
        return headings.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tv1, tv2;
        public MyViewHolder(View itemView) {
            super(itemView);
            tv1 = itemView.findViewById(R.id.tv1);
            tv2 = itemView.findViewById(R.id.tv2);
        }
    }
}
