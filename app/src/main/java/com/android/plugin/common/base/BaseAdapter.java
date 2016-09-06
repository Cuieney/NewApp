package com.android.plugin.common.base;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by cuieney on 16/4/7.
 */
public abstract class BaseAdapter<T> extends android.widget.BaseAdapter {
    public List<T> list;
    public Context context;
    public LayoutInflater inflater;
    public OnItemLongClickListener onItemLongClickListener;
    private OnItemClickListener onItemClickListener;
    public boolean isShake;

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    public void setOnItemLongClickListener(OnItemLongClickListener onItemLongClickListener) {
        this.onItemLongClickListener = onItemLongClickListener;
    }
    public void setLongClickShake(boolean isShake){
        this.isShake = isShake;
    }

    public interface OnItemLongClickListener{
        void onItemLongClick(int position);
    }

    public interface OnItemClickListener{
        void onItemClick(int position);
    }

    public BaseAdapter(List<T> list, Context context) {
        this.context = context;
        this.list = new ArrayList<T>();
        this.addAll(list);
        inflater = inflater.from(context);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    public void addAll(Collection<? extends T> collection) {
        addAll(list.size(), collection);
    }

    public void addAll(int position, Collection<? extends T> collection) {
        list.addAll(position, collection);
        notifyDataSetChanged();
    }

    public void clear() {
        list.clear();
        notifyDataSetChanged();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        convertView = getViewContainer(position, convertView, parent);

        convertView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if (onItemLongClickListener != null) {
                    onItemLongClickListener.onItemLongClick(position);
                }
                return isShake;
            }
        });
        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onItemClickListener != null) {
                    onItemClickListener.onItemClick(position);
                }
            }
        });
        return convertView;
    }

    protected abstract View getViewContainer(int position, View convertView, ViewGroup parent);
}
