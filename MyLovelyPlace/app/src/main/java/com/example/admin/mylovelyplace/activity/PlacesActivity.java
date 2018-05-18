package com.example.admin.mylovelyplace.activity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.example.admin.mylovelyplace.R;
import com.example.admin.mylovelyplace.adapter.PlacesAdapter;
import com.example.admin.mylovelyplace.data.PlaceRepo;
import com.example.admin.mylovelyplace.data.model.ActivityUtitls;
import com.example.admin.mylovelyplace.data.model.Place;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class PlacesActivity extends AppCompatActivity {
    @BindView(R.id.lvPlacesAct)
    ListView lvPlacesAct;

    @BindView(R.id.btnPlacesAct_ShowAllOnMap)
    Button btnPlacesAct_ShowAllOnMap;

    @BindView(R.id.txtvNoData)
    TextView txtvNoData;

    private String categoryID;
    private List<Place> places = new ArrayList<>();
    private PlacesAdapter placesAdapter;
    private PlaceRepo placeRepo;
    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places);

        ButterKnife.bind(PlacesActivity.this);
        init();
        onClickListView();
    }

    private void init() {
        categoryID = getIntent().getExtras().getString(ActivityUtitls.CATEGORY_KEY_PUT_EXTRA);
        placesAdapter = new PlacesAdapter(PlacesActivity.this, places);
        placeRepo = PlaceRepo.getInstance(PlacesActivity.this);
        initProgressBar();
        getDataPlace();
        lvPlacesAct.setAdapter(placesAdapter);
    }

    private void getDataPlace() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                places = placeRepo.getPlaces(categoryID);

                if (!places.isEmpty()) {
                    txtvNoData.setText(View.GONE);
                }

                placesAdapter.updateData(places);
                progressDialog.dismiss();
            }
        }, 2000);
    }

    private void initProgressBar() {
        progressDialog = new ProgressDialog(PlacesActivity.this);
        progressDialog.setIndeterminate(true);
        progressDialog.setMessage(getResources().getString(R.string.text_loading));
        progressDialog.setCanceledOnTouchOutside(false);
        progressDialog.show();
    }

    private void onClickListView() {
        lvPlacesAct.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Place place = places.get(i);
                Intent placeIntent = new Intent(PlacesActivity.this, DetailActivity.class);
                placeIntent.putExtra(ActivityUtitls.PLACE_KEY_PUT_EXTRA, place.getPlaceID());
                placeIntent.putExtra(ActivityUtitls.CATEGORY_KEY_PUT_EXTRA, place.getPlaceCategoryID());
                startActivity(placeIntent);
            }
        });
    }

    @OnClick(R.id.fabPlaceAct_AddEdit)
    private void onClickFab() {
        startActivity(new Intent(PlacesActivity.this, AddEditActivity.class));
    }
}