package com.codekul.gridlayoutjava;

import android.content.Context;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class myAdapter extends BaseAdapter{
    private final Context context;
    private final ArrayList<myItem> dataset;
    private LayoutInflater inflater;
 public myAdapter(Context context, ArrayList<myItem> dataset)
 {
     this.context = context;
     this.dataset = dataset;
inflater = LayoutInflater.from(context);
 }
    @Override
    public int getCount() {
        return dataset.size();
    }

    @Override
    public Object getItem(int position) {
        return dataset.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

//     View view = null;
//     if(convertView == null)
//     {
//         // for memmory optimization use ConvertView
//         inflater.inflate(R.layout.griditem,parent,false) ;
//
//     }
//     else {
//         view =convertView;
//     }
        View view =  inflater.inflate(R.layout.griditem,parent,false) ;

        ((ImageView)view.findViewById(R.id.imgIc)).setBackgroundResource(dataset.get(position).img);
        ((TextView)view.findViewById(R.id.txtgrid)).setText(dataset.get(position).txt.toString());
     return view;
    }
}
