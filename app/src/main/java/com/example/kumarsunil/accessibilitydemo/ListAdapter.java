package com.example.kumarsunil.accessibilitydemo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListViewHolder> {
    List<Data> l;
    Context c;

    public ListAdapter(List<Data> l, Context c) {
        this.l = l;
        this.c = c;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(c).inflate(R.layout.list_row,viewGroup,false);
        return new ListViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder listViewHolder, int i) {
        listViewHolder.setBody(l.get(i).getBody());
        listViewHolder.setHead(l.get(i).getHead());
        listViewHolder.getCard().setOnClickListener(e -> Toast.makeText(c, "List index "+i+" clicked", Toast.LENGTH_SHORT).show());
        String body = l.get(i).getBody();
        String head = l.get(i).getHead();
        listViewHolder.getCard().setContentDescription(head+body);
    }

    @Override
    public int getItemCount() {
        return l.size();
    }
}
