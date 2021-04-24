package com.example.midterm;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    //private RecyclerView.Adapter  mAdapter;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    ArrayList<Item> exampleItem = new ArrayList<>();
    private EditText edtSP;
    private EditText edtMota;
    private EditText edtGiatien;
    private Button btnAdd;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtSP = findViewById(R.id.editText_masp);
        edtGiatien = findViewById(R.id.editText_giatien);
        edtMota = findViewById(R.id.editText_mota);
        btnAdd = findViewById(R.id.button_them);
        exampleItem.add(new Item("M006", "asjdadh", "2000"));
        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new ExampleAdapter(exampleItem);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mAdapter.notifyDataSetChanged();

        btnAdd.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                insertItem(new Item(edtSP.getText().toString(),edtMota.getText().toString(), edtGiatien.getText().toString()));
            }
        });

    }

    public void insertItem(Item item) {
        exampleItem.add(item);
        mAdapter.notifyDataSetChanged();
    }
}
