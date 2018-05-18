package com.quangduyv2017.demo_googlemap;


import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements GoogleMap.OnMarkerClickListener, OnMapReadyCallback {

    private static final String Database_Name = "Street.sqlite";
    private GoogleMap mMap;
    private Location location;
    private LocationManager locationManager;
    private Marker mThoiDai;
    private ArrayList<Street> arrStreet;
    private LatLng thoiDai = new LatLng(16.053833, 108.237927);
    private double latitude, longitude;

    private SQLiteDatabase sqLiteDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in thoiDai and move the camera
        mThoiDai = mMap.addMarker(new MarkerOptions().position(thoiDai));
        mThoiDai.setTag(0);

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(thoiDai, 15));

        mMap.setOnMarkerClickListener(this);

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }

        // Lấy vị trí hiện tại
        locationManager = (LocationManager) getSystemService(LOCATION_SERVICE);
        String provider = locationManager.getBestProvider(new Criteria(), false);
        location = locationManager.getLastKnownLocation(provider);
        latitude = location.getLatitude();
        longitude = location.getLongitude();

        if (location != null) {
            LatLng latLng = new LatLng(latitude, longitude);

            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(latLng, 15));
        }
        mMap.setMyLocationEnabled(true);
    }

    public void createCustomInfomation(int position) {
        sqLiteDatabase = DatabaseHelper.initDatabase(MapsActivity.this, Database_Name);
        Cursor cursor = sqLiteDatabase.rawQuery("select * from Street", null);
        cursor.moveToPosition(position);

        Dialog dialog = new Dialog(MapsActivity.this, android.R.style.Theme_DeviceDefault_Dialog_NoActionBar);
        dialog.setContentView(R.layout.custom_infomation);
        dialog.setCancelable(true);

        TextView txtvTen = (TextView) dialog.findViewById(R.id.txtvTen);
        TextView txtvDiaChi = (TextView) dialog.findViewById(R.id.txtvDiaChi);
        ImageView imgNotification = (ImageView) dialog.findViewById(R.id.imgNotification);

        Street street = arrStreet.get(position);
        txtvTen.setText(cursor.getString(1));
        txtvDiaChi.setText(cursor.getString(2));
        byte[] hinh = cursor.getBlob(3);
        street.setHinh(hinh);

        Bitmap bitmap = BitmapFactory.decodeByteArray(street.getHinh(), 0, street.getHinh().length);
        imgNotification.setImageBitmap(bitmap);

        dialog.show();
    }

    @Override
    public boolean onMarkerClick(Marker marker) {
        Integer clickCount = (Integer) marker.getTag();

        if (clickCount != null) {
            clickCount = clickCount + 1;
            marker.setTag(clickCount);
            createCustomInfomation(clickCount);
        }
        return false;
    }
}