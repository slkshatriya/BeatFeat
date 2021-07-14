package com.technocrats.beatfeat.activity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.technocrats.beatfeat.adapter.ProductAdapter1;
import com.technocrats.beatfeat.R;
import com.technocrats.beatfeat.model.model;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    RecyclerView prodItemRecycler1;
    ProductAdapter1 productAdapter1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageSlider imageSlider = findViewById(R.id.image_slider);
        List<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.cr2, "Workouts At Home", ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.cr3, "Anytime Anywhere", ScaleTypes.FIT));

        imageSlider.setImageList(slideModels);

        List<model> productsList = new ArrayList<>();
        productsList.add(new model(1, "Exercise-One", "Time : 2 min", R.drawable.exersice_1));
        productsList.add(new model(2, "Exercise-Two", "Time : 2 min", R.drawable.exersice_2));
        productsList.add(new model(3, "Exercise-Three", "Time : 2 min", R.drawable.exersice_3));
        productsList.add(new model(4, "Exercise-Four", "Time : 2 min", R.drawable.exersice_4));
        productsList.add(new model(5, "Exercise-Five", "Time : 2 min", R.drawable.exersice_5));
        productsList.add(new model(6, "Exercise-Six", "Time : 2 min", R.drawable.exersice_6));
        productsList.add(new model(7, "Exercise-Seven", "Time : 2 min", R.drawable.exersice_7));
        productsList.add(new model(8, "Exercise-Eight", "Time : 2 min", R.drawable.exersice_8));
        productsList.add(new model(9, "Exercise-Nine", "Time : 2 min", R.drawable.exersice_9));
        productsList.add(new model(10, "Exercise-Ten", "Time : 2 min", R.drawable.exersice_10));
        productsList.add(new model(11, "Exercise-Eleven", "Time : 2 min", R.drawable.exersice_11));
        productsList.add(new model(12, "Exercise-Twelve", "Time : 2 min", R.drawable.exersice_12));
        productsList.add(new model(13, "Exercise-Thirteen", "Time : 2 min", R.drawable.exersice_13));
        productsList.add(new model(14, "Exercise-Fourteen", "Time : 2 min", R.drawable.exersice_14));
        productsList.add(new model(15, "Exercise-Fifteen", "Time : 2 min", R.drawable.exersice_15));

        setProdItemRecycler1(productsList);
    }
    private void setProdItemRecycler1(List<model> productsList){

        prodItemRecycler1 = findViewById(R.id.recview1);
        LinearLayoutManager layoutManager
                = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        prodItemRecycler1.setLayoutManager(layoutManager);
        productAdapter1 = new ProductAdapter1(this, productsList);
        prodItemRecycler1.setAdapter(productAdapter1);

    }
}