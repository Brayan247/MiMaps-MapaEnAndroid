package com.istl.mimaps;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

import androidx.annotation.NonNull;

public class MiPosicion implements LocationListener {

    public static double latitud;
    public static double longitud;
    public static double altitud;
    public static boolean statusGPS;

    @Override
    public void onLocationChanged(@NonNull Location location) {
        latitud = location.getLatitude();
        longitud = location.getLongitude();
        altitud = location.getAltitude();
    }

    @Override
    public void onProviderEnabled(@NonNull String provider) {
        statusGPS = true;
    }

    @Override
    public void onProviderDisabled(@NonNull String provider) {
        statusGPS = false;
    }
}
