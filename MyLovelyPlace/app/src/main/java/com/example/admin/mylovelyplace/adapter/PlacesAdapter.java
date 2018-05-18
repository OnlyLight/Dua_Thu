package com.example.admin.mylovelyplace.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.admin.mylovelyplace.R;
import com.example.admin.mylovelyplace.data.model.Place;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by admin on 7/24/2017.
 */

public class PlacesAdapter extends BaseAdapter {
    private Context context;
    private List<Place> arrPlaces;

    public PlacesAdapter(Context context, List<Place> arrPlaces) {
        this.context = context;
        this.arrPlaces = arrPlaces;
    }

    public void updateData(List<Place> arrPlaces) {
        this.arrPlaces = arrPlaces;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return arrPlaces.size();
    }

    @Override
    public Object getItem(int i) {
        return arrPlaces.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    // class để khởi tạo 1 lần không phải khởi tạo lại
    private class PlaceViewHolder {
        @BindView(R.id.imgItemPlace)
        ImageView imgItemPlace;

        @BindView(R.id.txtvItemPlace_Name)
        TextView txtvItemPlace_Name;

        @BindView(R.id.txtvItemPlace_Address)
        TextView txtvItemPlace_Address;

        @BindView(R.id.txtvItemPlace_Derscription)
        TextView txtvItemPlace_Derscription;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        PlaceViewHolder placeViewHolder;

        if (view == null) {
            placeViewHolder = new PlaceViewHolder();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.item_place, viewGroup, false);

            // Ánh xạ bằng butterKnife thông số 1 class khởi tạo, thông số 2 là nơi chứa view của mình
            ButterKnife.bind(placeViewHolder, view);
            view.setTag(placeViewHolder);
        }

        placeViewHolder = (PlaceViewHolder) view.getTag();

        // Lấy ra từng object place
        Place place = (Place) getItem(i);

        // convert bitmap sang mảng byte
        if (place.getPlaceImage() != null) {
            Bitmap placeBitmap = BitmapFactory.decodeByteArray(place.getPlaceImage(), 0, place.getPlaceImage().length);
            placeViewHolder.imgItemPlace.setImageBitmap(placeBitmap);
        }

        placeViewHolder.txtvItemPlace_Name.setText(place.getPlaceName());
        placeViewHolder.txtvItemPlace_Address.setText(place.getPlaceAddress());
        placeViewHolder.txtvItemPlace_Derscription.setText(place.getPlaceDescription());

        return view;
    }
}
