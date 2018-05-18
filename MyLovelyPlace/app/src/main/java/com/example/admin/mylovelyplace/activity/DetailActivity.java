package com.example.admin.mylovelyplace.activity;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.admin.mylovelyplace.R;
import com.example.admin.mylovelyplace.data.PlaceRepo;
import com.example.admin.mylovelyplace.data.model.ActivityUtitls;
import com.example.admin.mylovelyplace.data.model.Place;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class DetailActivity extends AppCompatActivity {
    @BindView(R.id.imgDetailAct_ImagePlace)
    ImageView imgDetailAct_ImagePlace;

    @BindView(R.id.edtDetailAct_PlaceName)
    EditText edtDetailAct_PlaceName;

    @BindView(R.id.edtDetailAct_PlaceAddress)
    EditText edtDetailAct_PlaceAddress;

    @BindView(R.id.edtDetailAct_PlaceDescription)
    EditText edtDetailAct_PlaceDescription;

    private String placeID;
    private String categoryID;
    private PlaceRepo placeRepo;
    private Place place;
    private ProgressDialog progressDialog;
    private AlertDialog.Builder alertDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ButterKnife.bind(this);
        init();
    }

    private void init() {
        placeID = getIntent().getStringExtra(ActivityUtitls.PLACE_KEY_PUT_EXTRA);
        categoryID = getIntent().getStringExtra(ActivityUtitls.CATEGORY_KEY_PUT_EXTRA);
        placeRepo = PlaceRepo.getInstance(DetailActivity.this);
        initProgessDialog();
        getPlace();
    }

    private void getPlace() {
        place = placeRepo.getPlace(categoryID, placeID);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (place.getPlaceImage() != null) {
                    Bitmap placeBitmap = BitmapFactory.decodeByteArray(place.getPlaceImage(), 0, place.getPlaceImage().length);
                    imgDetailAct_ImagePlace.setImageBitmap(placeBitmap);
                }
                edtDetailAct_PlaceName.setText(place.getPlaceName());
                edtDetailAct_PlaceAddress.setText(place.getPlaceAddress());
                edtDetailAct_PlaceDescription.setText(place.getPlaceDescription());
                progressDialog.dismiss();
            }
        }, 2000);
    }

    private void initProgessDialog() {
        progressDialog = new ProgressDialog(DetailActivity.this);
        progressDialog.setIndeterminate(true);
        progressDialog.setMessage(getResources().getString(R.string.text_loading));
        progressDialog.setCanceledOnTouchOutside(false);
        progressDialog.show();
    }

    @OnClick(R.id.ibDetailAct_ImageDelete)
    private void onClickDelete() {
        final AlertDialog ad;
        alertDialog = new AlertDialog.Builder(DetailActivity.this);
        alertDialog.setTitle(getResources().getString(R.string.text_warning));
        alertDialog.setMessage(getResources().getString(R.string.do_you_want_delete) + "" + place.getPlaceName() + " ?");
        alertDialog.setNegativeButton(getResources().getString(R.string.alert_negati), new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                alertDialog.show().dismiss();
            }
        });


        alertDialog.setPositiveButton(getResources().getString(R.string.alert_positi), new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                placeRepo.deletePlace(placeID);
            }
        });
        alertDialog.show();
    }

    @OnClick(R.id.ibDetailAct_ImageEdit)
    private void OnClickEdit() {
        startActivity(new Intent(DetailActivity.this, AddEditActivity.class));
    }

    @OnClick(R.id.ibDetailAct_ImageDescription)
    private void onClickDescription() {

    }
}