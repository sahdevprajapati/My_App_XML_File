package com.example.xmldesign;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ExAdapter extends RecyclerView.Adapter<ExAdapter.ExViewHolder>{
    private ArrayList<ExItem> mExlist;

    public static class ExViewHolder extends RecyclerView.ViewHolder{
        public ImageView mImageview;
        public TextView mTextview1;
        public TextView mTextview2;
        public TextView mTextview3;
        public ExViewHolder(View itemView){
            super(itemView);
            mImageview=itemView.findViewById (R.id.imageview);
            mTextview1=itemView.findViewById (R.id.textview1);
            mTextview2=itemView.findViewById (R.id.textview2);
            mTextview3=itemView.findViewById (R.id.textview3);
        }
    }

    public ExAdapter(ArrayList<ExItem> exList){
        mExlist=exList;
    }
    @NonNull
    @Override
    public ExViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from (parent.getContext ()).inflate (R.layout.item,parent,false);
        ExViewHolder evh=new ExViewHolder (v);
        return evh;
    }

    @Override
    public void onBindViewHolder(@NonNull ExViewHolder holder, int position) {

        ExItem currentItem=mExlist.get (position);

        holder.mImageview.setImageResource (currentItem.getmImageResource ());
        holder.mTextview1.setText (currentItem.getText1 ());
        holder.mTextview2.setText (currentItem.getText2 ());
        holder.mTextview3.setText (currentItem.getText3 ());
    }

    @Override
    public int getItemCount() {
        return mExlist.size ();
    }
}
