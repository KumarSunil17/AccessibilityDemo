package com.example.kumarsunil.accessibilitydemo;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class ListViewHolder extends RecyclerView.ViewHolder {
    private TextView head,body;
    private View card;

    public ListViewHolder(@NonNull View itemView) {
        super(itemView);
        head = itemView.findViewById(R.id.list_row_heading);
        body = itemView.findViewById(R.id.list_row_description);
        card = itemView.findViewById(R.id.main_card);
    }

    public void setHead(String head) {
        this.head.setText(head);
    }

    public void setBody(String body) {
        this.body.setText(body);
    }

    public View getCard() {
        return card;
    }
}
