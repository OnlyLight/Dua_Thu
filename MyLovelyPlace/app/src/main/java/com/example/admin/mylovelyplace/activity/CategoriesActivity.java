package com.example.admin.mylovelyplace.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.admin.mylovelyplace.R;
import com.example.admin.mylovelyplace.data.PlaceRepo;
import com.example.admin.mylovelyplace.data.model.ActivityUtitls;
import com.example.admin.mylovelyplace.data.model.Category;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class CategoriesActivity extends AppCompatActivity {
    @BindView(R.id.txtvCategories_restaurant)
    TextView txtvRestaurant;

    @BindView(R.id.txtvGategories_cinema)
    TextView txtvCinema;

    @BindView(R.id.txtvCategories_fashion)
    TextView txtvFashion;

    @BindView(R.id.txtvCategories_atm)
    TextView txtvATM;

    private PlaceRepo placeRepo;
    private List<Category> arrCategory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);

        ButterKnife.bind(this);
        init();
        setText();
    }

    private void changePlacesActivity(String categoryID) {
        Intent placesIntent = new Intent(CategoriesActivity.this, PlacesActivity.class);
        placesIntent.putExtra(ActivityUtitls.CATEGORY_KEY_PUT_EXTRA, categoryID);
        startActivity(placesIntent);
    }

    private void setText() {
        txtvRestaurant.setText("Restaurant");
        txtvCinema.setText("Cinema");
        txtvFashion.setText("Fashion");
        txtvATM.setText("ATM");
    }

    private void init() {
        placeRepo = PlaceRepo.getInstance(this);
        arrCategory = new ArrayList<>();
        arrCategory = placeRepo.getCategories();
    }

    @OnClick(R.id.layout_Restaurant)
    public void clickRestaurant(View v) {
        String categoryID = arrCategory.get(0).getCategoryID();
        changePlacesActivity(categoryID);
    }

    @OnClick(R.id.layout_Cinema)
    public void clickCinema(View v) {
        String categoryID = arrCategory.get(1).getCategoryID();
        changePlacesActivity(categoryID);
    }

    @OnClick(R.id.layout_Fashion)
    public void clickFashion(View v) {
        String categoryID = arrCategory.get(2).getCategoryID();
        changePlacesActivity(categoryID);
    }

    @OnClick(R.id.layout_ATM)
    public void clickATm(View v) {
        String categoryID = arrCategory.get(3).getCategoryID();
        changePlacesActivity(categoryID);
    }
}
