package com.example.shobojit.recyler_view_practise.Ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.shobojit.recyler_view_practise.Adapter.Recycler_adapter;
import com.example.shobojit.recyler_view_practise.Model.Recycler_Data;
import com.example.shobojit.recyler_view_practise.R;

public class ListActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    private Recycler_adapter recadp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.reclist);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recadp = new Recycler_adapter(Recycler_Data.getListItem(),this);
        recyclerView.setAdapter(recadp);
    }
}
