package com.example.admin.mylovelyplace.data;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.admin.mylovelyplace.data.model.Category;
import com.example.admin.mylovelyplace.data.model.DBUtitls;
import com.example.admin.mylovelyplace.data.model.Place;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 7/18/2017.
 */

public class PlaceRepo {
    private static PlaceRepo Instance;
    private static PlaceSQliteHelper placeSQliteHelper;

    private PlaceRepo(Context context) {
        placeSQliteHelper = new PlaceSQliteHelper(context);
    }

    public static PlaceRepo getInstance(Context context) {
        return (Instance == null) ? new PlaceRepo(context) : Instance;
    }

    public List<Category> getCategories() {
        List<Category> categories = new ArrayList<>();

        SQLiteDatabase database = placeSQliteHelper.getReadableDatabase();

        String[] column = {
                DBUtitls.COLUMN_CATEGORY_ID,
                DBUtitls.COLUMN_CATEGORY_NAME
        };

        Cursor cursor = database.query(DBUtitls.CATEGORY_TABLE_NAME, column, null, null, null, null, null);

        if (cursor != null && cursor.getCount() > 0) {
            while (cursor.moveToNext()) {
                String categoryID = cursor.getString(cursor.getColumnIndexOrThrow(DBUtitls.COLUMN_CATEGORY_ID));
                String categoryName = cursor.getString(cursor.getColumnIndexOrThrow(DBUtitls.COLUMN_CATEGORY_NAME));

                categories.add(new Category(categoryID, categoryName));
            }
        }

        if (cursor != null) {
            cursor.close();
        }

        database.close();

        return categories;
    }

    public List<Place> getPlaces(String cateID) { // Lấy danh sách place
        List<Place> places = new ArrayList<>();

        SQLiteDatabase database = placeSQliteHelper.getReadableDatabase();

        String selection = DBUtitls.COLUMN_PLACE_CATEGORY_ID + " = ?";
        String[] selectionArgs = {cateID};

        String[] column = {
                DBUtitls.COLUMN_PLACE_ID,
                DBUtitls.COLUMN_PLACE_CATEGORY_ID,
                DBUtitls.COLUMN_PLACE_NAME,
                DBUtitls.COLUMN_PLACE_ADDRESS,
                DBUtitls.COLUMN_PLACE_DESCRIPTION,
                DBUtitls.COLUMN_PLACE_IMAGE,
                DBUtitls.COLUMN_PLACE_LAT,
                DBUtitls.COLUMN_PLACE_LNG
        };

        Cursor cursor = database.query(DBUtitls.PLACE_TABLE_NAME, column, selection, selectionArgs, null, null, null);

        if (cursor != null && cursor.getCount() > 0) {
            while (cursor.moveToNext()) {
                String placeID = cursor.getString(cursor.getColumnIndexOrThrow(DBUtitls.COLUMN_CATEGORY_ID));
                String placeCategoryID = cursor.getString(cursor.getColumnIndexOrThrow(DBUtitls.COLUMN_PLACE_CATEGORY_ID));
                String placeName = cursor.getString(cursor.getColumnIndexOrThrow(DBUtitls.COLUMN_PLACE_NAME));
                String placeAddress = cursor.getString(cursor.getColumnIndexOrThrow(DBUtitls.COLUMN_PLACE_ADDRESS));
                String placeDescription = cursor.getString(cursor.getColumnIndexOrThrow(DBUtitls.COLUMN_PLACE_DESCRIPTION));
                byte[] placeImage = cursor.getBlob(cursor.getColumnIndexOrThrow(DBUtitls.COLUMN_PLACE_IMAGE));
                double placeLat = cursor.getDouble(cursor.getColumnIndexOrThrow(DBUtitls.COLUMN_PLACE_LAT));
                double placeLong = cursor.getDouble(cursor.getColumnIndexOrThrow(DBUtitls.COLUMN_PLACE_LNG));

                places.add(new Place.Builder().setPlaceID(placeID).setPlaceCategoryID(placeCategoryID).setPlaceName(placeName).setPlaceAddress(placeAddress).setPlaceDescription(placeDescription).setPlaceImage(placeImage).setPlaceLat(placeLat).setPlaceLng(placeLong).builder());
            }
        }

        if (cursor != null) {
            cursor.close();
        }

        database.close();

        return places;
    }

    public Place getPlace(String cateID, String placeID) {
        Place place = null;

        SQLiteDatabase database = placeSQliteHelper.getReadableDatabase();

        String selection = DBUtitls.COLUMN_PLACE_ID + " = ?" + DBUtitls.COLUMN_PLACE_CATEGORY_ID + " = ?";

        String[] selectionArgs = {placeID, cateID};

        String[] column = {
                DBUtitls.COLUMN_PLACE_ID,
                DBUtitls.COLUMN_PLACE_CATEGORY_ID,
                DBUtitls.COLUMN_PLACE_NAME,
                DBUtitls.COLUMN_PLACE_ADDRESS,
                DBUtitls.COLUMN_PLACE_DESCRIPTION,
                DBUtitls.COLUMN_PLACE_IMAGE,
                DBUtitls.COLUMN_PLACE_LAT,
                DBUtitls.COLUMN_PLACE_LNG
        };

        Cursor cursor = database.query(DBUtitls.PLACE_TABLE_NAME, column, selection, selectionArgs, null, null, null);

        if (cursor != null && cursor.getCount() > 0) {
            cursor.moveToFirst();

            String plID = cursor.getString(cursor.getColumnIndexOrThrow(DBUtitls.COLUMN_CATEGORY_ID));
            String placeCategoryID = cursor.getString(cursor.getColumnIndexOrThrow(DBUtitls.COLUMN_PLACE_CATEGORY_ID));
            String placeName = cursor.getString(cursor.getColumnIndexOrThrow(DBUtitls.COLUMN_PLACE_NAME));
            String placeAddress = cursor.getString(cursor.getColumnIndexOrThrow(DBUtitls.COLUMN_PLACE_ADDRESS));
            String placeDescription = cursor.getString(cursor.getColumnIndexOrThrow(DBUtitls.COLUMN_PLACE_DESCRIPTION));
            byte[] placeImage = cursor.getBlob(cursor.getColumnIndexOrThrow(DBUtitls.COLUMN_PLACE_IMAGE));
            double placeLat = cursor.getDouble(cursor.getColumnIndexOrThrow(DBUtitls.COLUMN_PLACE_LAT));
            double placeLong = cursor.getDouble(cursor.getColumnIndexOrThrow(DBUtitls.COLUMN_PLACE_LNG));

            place = new Place.Builder()
                    .setPlaceID(plID)
                    .setPlaceCategoryID(placeCategoryID)
                    .setPlaceName(placeName)
                    .setPlaceAddress(placeAddress)
                    .setPlaceDescription(placeDescription)
                    .setPlaceImage(placeImage)
                    .setPlaceLat(placeLat)
                    .setPlaceLng(placeLong)
                    .builder();
        }

        if (cursor != null) {
            cursor.close();
        }

        database.close();

        return place;
    }

    public void insert(Place place) {
        SQLiteDatabase database = placeSQliteHelper.getWritableDatabase();

        ContentValues contentValues = new ContentValues();
        contentValues.put("COLUMN_PLACE_ID", place.getPlaceID());
        contentValues.put("COLUMN_PLACE_CATEGORY_ID", place.getPlaceCategoryID());
        contentValues.put("COLUMN_PLACE_NAME", place.getPlaceName());
        contentValues.put("COLUMN_PLACE_ADDRESS", place.getPlaceAddress());
        contentValues.put("COLUMN_PLACE_DESCRIPTION", place.getPlaceDescription());
        contentValues.put("COLUMN_PLACE_IMAGE", place.getPlaceImage());
        contentValues.put("COLUMN_PLACE_LAT", place.getPlaceLat());
        contentValues.put("COLUMN_PLACE_LNG", place.getPlaceLng());

        database.insert(DBUtitls.PLACE_TABLE_NAME, null, contentValues);

        database.close();
    }

    public void deletePlace(String plID) {
        SQLiteDatabase database = placeSQliteHelper.getWritableDatabase();

        String selection = DBUtitls.COLUMN_PLACE_ID + " = ?";
        String [] seelectionArgs = {plID};

        database.delete(DBUtitls.PLACE_TABLE_NAME, selection, seelectionArgs);

        database.close();
    }

    public void update(Place place) {
        SQLiteDatabase database = placeSQliteHelper.getWritableDatabase();

        String selection = DBUtitls.COLUMN_PLACE_ID + " = ?";
        String[] seletionArgs = {place.getPlaceID()};

        ContentValues contentValues = new ContentValues();
        contentValues.put("COLUMN_PLACE_ID", place.getPlaceID());
        contentValues.put("COLUMN_PLACE_CATEGORY_ID", place.getPlaceCategoryID());
        contentValues.put("COLUMN_PLACE_NAME", place.getPlaceName());
        contentValues.put("COLUMN_PLACE_ADDRESS", place.getPlaceAddress());
        contentValues.put("COLUMN_PLACE_IMAGE", place.getPlaceImage());
        contentValues.put("COLUMN_PLACE_LAT", place.getPlaceLat());
        contentValues.put("COLUMN_PLACE_LNG", place.getPlaceLng());

        database.update(DBUtitls.PLACE_TABLE_NAME, contentValues, selection, seletionArgs);

        database.close();
    }
}
