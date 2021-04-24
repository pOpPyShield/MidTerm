package com.example.midterm;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ExampleAdapter  extends RecyclerView.Adapter<ExampleAdapter.ExampleViewHolder> {
    private ArrayList<Item> mExamoleList;
    private OnItemClickListener mListerner;
    public interface OnItemClickListener {
        void onItemClick(int position);
    }
    public void setOnClickListener(OnItemClickListener listener) {
        mListerner = listener;
    }
    public static class ExampleViewHolder extends RecyclerView.ViewHolder {
        public TextView maspText;

        public TextView giatienText;
        public ExampleViewHolder(View itemView) {
            super(itemView);
            this.maspText = itemView.findViewById(R.id.ma_sp_card);
            this.giatienText= itemView.findViewById(R.id.gia_tien_card);
            itemView.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {

                }
            });
        }
    }

    public ExampleAdapter(ArrayList<Item> exampleList) {
        mExamoleList = exampleList;
    }

    public ExampleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.tem, parent, false );
        ExampleViewHolder evh = new ExampleViewHolder(v);
        return evh;
    }

    public  void onBindViewHolder(ExampleViewHolder holder, int position) {
        Item currentItem = mExamoleList.get(position);
        holder.maspText.setText(currentItem.getMaSp());
        holder.giatienText.setText(currentItem.getGiaTien());
    }

    public int getItemCount() {
        return mExamoleList.size();
    }
 }
