package com.example.kumarsunil.accessibilitydemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Data> l;
    RecyclerView r;
    ListAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        l = new ArrayList<>();
        l.add(new Data("JavaScript"," JavaScript was the most popular programming language with 65% of people using it and they have this thing divided up."));
        l.add(new Data("Python","Python makes a lot of sense. It's a really good language, high adoption, high movement in that space."));
        l.add(new Data("C#","C# is a very versatile language."));
        l.add(new Data("Java","Java, very good language. Very good language for corporate development, environments. A lot of companies have a lot of technology invested in Java."));
        l.add(new Data("PHP","PHP is really a—as much as it's a nasty language, it's really quick to learn, and to prototype and to get stuff done. That's why it's still around."));
        adapter = new ListAdapter(l,MainActivity.this);

        r = findViewById(R.id.container_list);
        r.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        r.setAdapter(adapter);
        adapter.notifyDataSetChanged();

        r.setHasFixedSize(true);
    }
}
