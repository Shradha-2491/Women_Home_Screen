package com.theswastika.womenhomescreen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class SubCategoryActivity extends AppCompatActivity {
    RecyclerView recyclerView1, recyclerView2;
    SubAdapter adapter;
    String sub_title;
    TextView subCategory;
    List<Product> productList1, productList2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_category);

        recyclerView1 = (RecyclerView) findViewById(R.id.subRecyclerView1);
        recyclerView2 = (RecyclerView) findViewById(R.id.subRecyclerView2);
        subCategory = findViewById((R.id.sub_category));

        Bundle extras = getIntent().getExtras();
        if(extras != null){
            sub_title = extras.getString("Main Category");
            subCategory.setText(sub_title);
        }

        if (sub_title.equals("Western")){
            recyclerView1.setHasFixedSize(true);
            recyclerView1.setLayoutManager(new LinearLayoutManager(this));
            productList1 = new ArrayList<>();
            productList1.add(new Product(1, "Western Dress", R.drawable.western_dress));
            productList1.add(new Product(1, "Jumpsuits", R.drawable.jumpsuit));

            recyclerView2.setHasFixedSize(true);
            recyclerView2.setLayoutManager(new LinearLayoutManager(this));
            productList2 = new ArrayList<>();
            productList2.add(new Product(1, "Rompers", R.drawable.rompers));
            productList2.add(new Product(1, "Maternity Dress", R.drawable.maternity));
        }
        if (sub_title.equals("Ethinic")){
            recyclerView1.setHasFixedSize(true);
            recyclerView1.setLayoutManager(new LinearLayoutManager(this));
            productList1 = new ArrayList<>();
            productList1.add(new Product(1, "Ethinic Dress", R.drawable.ethnic_dress));
            productList1.add(new Product(1, "Saree", R.drawable.saree));
            productList1.add(new Product(1, "Kurta and Palazzo", R.drawable.kurta_palazzo));

            recyclerView2.setHasFixedSize(true);
            recyclerView2.setLayoutManager(new LinearLayoutManager(this));
            productList2 = new ArrayList<>();
            productList2.add(new Product(1, "Kurta Set", R.drawable.kurta_set));
            productList2.add(new Product(1, "Lehenga", R.drawable.lehenga));
            productList2.add(new Product(1, "Clothing Set", R.drawable.clothing_set));
        }
        if (sub_title.equals("Top's")){
            recyclerView1.setHasFixedSize(true);
            recyclerView1.setLayoutManager(new LinearLayoutManager(this));
            productList1 = new ArrayList<>();
            productList1.add(new Product(1, "Tops", R.drawable.top_sub));
            productList1.add(new Product(1, "Sweatshirts", R.drawable.sweat_shirt));
            productList1.add(new Product(1, "Shrugs and Stole", R.drawable.shrug_stole));
            productList1.add(new Product(1, "Duppatta", R.drawable.duppatta));
            productList1.add(new Product(1, "Jackets", R.drawable.jackets));

            recyclerView2.setHasFixedSize(true);
            recyclerView2.setLayoutManager(new LinearLayoutManager(this));
            productList2 = new ArrayList<>();
            productList2.add(new Product(1, "Kurta and Tunics", R.drawable.kurta_tunic));
            productList2.add(new Product(1, "Blazar", R.drawable.blazar));
            productList2.add(new Product(1, "T-Shirts", R.drawable.t_shirt));
            productList2.add(new Product(1, "Shirts", R.drawable.shirts));
            productList2.add(new Product(1, "Maxi Dress", R.drawable.maxi));
        }
        if (sub_title.equals("Bottom's")){
            recyclerView1.setHasFixedSize(true);
            recyclerView1.setLayoutManager(new LinearLayoutManager(this));
            productList1 = new ArrayList<>();
            productList1.add(new Product(1, "Skirts", R.drawable.skirts_sub));
            productList1.add(new Product(1, "Trousers and Capris", R.drawable.trousers_capris));
            productList1.add(new Product(1, "Jeans and Jeggings", R.drawable.jeans_jeggings));

            recyclerView2.setHasFixedSize(true);
            recyclerView2.setLayoutManager(new LinearLayoutManager(this));
            productList2 = new ArrayList<>();
            productList2.add(new Product(1, "Joggers", R.drawable.joggers));
            productList2.add(new Product(1, "Shorts", R.drawable.shorts));
        }

        adapter=new SubAdapter(this, productList1);
        recyclerView1.setAdapter(adapter);

        adapter=new SubAdapter(this, productList2);
        recyclerView2.setAdapter(adapter);
    }
}