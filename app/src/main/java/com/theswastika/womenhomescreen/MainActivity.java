package com.theswastika.womenhomescreen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    SliderView sliderView;
    RecyclerView horRecyclerView;
    RecyclerView recyclerView;
    SliderAdapter sliderAdapter;
    ProductAdapter adapter;
    List<Product> productList;
    ArrayList<PopularProduct>  popularProducts;
    PopularAdapter popularAdapter;

    int[] sliderImage = {
            R.drawable.for_banner1,
            R.drawable.for_banner2,
            R.drawable.for_banner3,
            R.drawable.for_banner4
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sliderView = findViewById(R.id.image_slider);
        horRecyclerView = findViewById(R.id.hor_recycler_view);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        Integer[] popularPhoto = {R.drawable.popular1, R.drawable.popular2, R.drawable.popularkurta3,
                R.drawable.popular4, R.drawable.popular5};

        String[]  popularTitles = {"Black Printed Gown", "Pink Western Dress", "White Simple and designer Kurta",
                "Pink Floral Ring Loop Midi Dress", "White Printed Top"};

        String[] popularPrice = {"Rs. 1140","Rs. 1180", "Rs. 1200", "Rs. 1234", "Rs. 680"};


        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));//by default vertical
        
        productList = new ArrayList<>();
        productList.add(new Product(1, "Western", R.drawable.dress));
        productList.add(new Product(1, "Ethinic", R.drawable.indian));
        productList.add(new Product(1, "Top's", R.drawable.tops));
        productList.add(new Product(1, "Bottom's", R.drawable.skirts));

        popularProducts = new ArrayList<>();
        for(int i=0; i<popularPhoto.length; i++){
            PopularProduct product = new PopularProduct(popularPhoto[i], popularTitles[i], popularPrice[i]);
            popularProducts.add(product);
        }

        LinearLayoutManager layoutManager = new LinearLayoutManager( MainActivity.this, LinearLayoutManager.HORIZONTAL, false);

        horRecyclerView.setLayoutManager(layoutManager);
        horRecyclerView.setItemAnimator(new DefaultItemAnimator());

        sliderAdapter = new SliderAdapter(sliderImage);
        sliderView.setSliderAdapter(sliderAdapter);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderView.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);
        sliderView.startAutoCycle();

        popularAdapter = new PopularAdapter(MainActivity.this, popularProducts);
        horRecyclerView.setAdapter(popularAdapter);

        adapter=new ProductAdapter(this, productList);
        recyclerView.setAdapter(adapter);
    }
}