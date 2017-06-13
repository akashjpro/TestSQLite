package com.adida.aka.testsqlite;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Aka on 6/14/2017.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    Activity mContext;
    List<String> mList;

    public Adapter(Activity mContext, List<String> mList) {
        this.mContext = mContext;
        this.mList = mList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.txtText.setText(mList.get(position));
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        TextView txtText;
        Button btnClick;
        public ViewHolder(View itemView) {
            super(itemView);
            txtText = (TextView) itemView.findViewById(R.id.textView);
            btnClick = (Button) itemView.findViewById(R.id.button);
        }
    }


}
