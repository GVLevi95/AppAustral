package com.frunaos.appaustral;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback, GoogleMap.OnMarkerClickListener{

    private GoogleMap mMap;
    private static final int LOCATION_REQUEST_CODE = 1;
    private Marker marker_PM;
    private Marker pelluco_marker;
    private Marker pelluhuin_marker;
    private Marker coihuin_marker;
    private Marker chamiza_marker;
    private Marker br_marker;
    private Marker pichiquillaipe_marker;
    private Marker q_marker;
    private Marker metri_marker;
    private Marker lenca_marker;
    private Marker chaicas_marker;
    private Marker cl_gutierrez_marker;
    private Marker cl_la_arena_marker;


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

        // Add a marker in Puerto montt and move the camera -41.4657400, -72.9428900
        LatLng PM = new LatLng(-41.4657400, -72.9428900);
        MarkerOptions markerOptionsPM = new MarkerOptions()
                        .position(PM)
                        .title("Puerto Montt")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE));

                        mMap.moveCamera(CameraUpdateFactory.newLatLng(PM));

                        googleMap.setOnMarkerClickListener(this);

        marker_PM = googleMap.addMarker(markerOptionsPM);



        // Delimitar zoom
        googleMap.setMinZoomPreference(10);
        CameraPosition cameraPosition = new CameraPosition.Builder()
                .target(PM)
                .zoom(10)
                .bearing(360)
                .tilt(90).build();
        googleMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));


        // gps y permisos
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)
                == PackageManager.PERMISSION_GRANTED) {
            mMap.setMyLocationEnabled(true);
        } else {
            if (ActivityCompat.shouldShowRequestPermissionRationale(this,
                    Manifest.permission.ACCESS_FINE_LOCATION)) {
                // Mostrar diálogo explicativo
            } else {
                // Solicitar permiso
                ActivityCompat.requestPermissions(
                        this,
                        new String[]{Manifest.permission.ACCESS_FINE_LOCATION},
                        LOCATION_REQUEST_CODE);
            }
        }

        mMap.getUiSettings().setZoomControlsEnabled(true);
        mMap.getUiSettings().setMapToolbarEnabled(false);

        LatLng pelluco = new LatLng(-41.489681, -72.893700);
        MarkerOptions markerOptionsPelluco =
                new MarkerOptions()
                        .position(pelluco)
                        .title("Pelluco")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE));
         pelluco_marker = googleMap.addMarker(markerOptionsPelluco);


        LatLng pelluhuin = new LatLng(-41.489681, -72.893700);
        MarkerOptions markerOptionsPelluhuin =
                new MarkerOptions()
                        .position(pelluhuin)
                        .title("Pelluhuin")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE));
        pelluhuin_marker = googleMap.addMarker(markerOptionsPelluhuin);


        LatLng coihuin = new LatLng(-41.486304, -72.861439);
        MarkerOptions markerOptionsCoihuin =
                new MarkerOptions()
                        .position(coihuin)
                        .title("Coihuin")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE));
        coihuin_marker = googleMap.addMarker(markerOptionsCoihuin);

        LatLng chamiza = new LatLng(-41.482950, -72.845179);
        MarkerOptions markerOptionsChamiza =
                new MarkerOptions()
                        .position(chamiza)
                        .title("Chamiza")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE));
        chamiza_marker = googleMap.addMarker(markerOptionsChamiza);

        LatLng blue_rock = new LatLng(-41.503688, -72.800114);
        MarkerOptions markerOptionsBR =
                new MarkerOptions()
                        .position(blue_rock)
                        .title("Piedra Azul")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE));
        br_marker = googleMap.addMarker(markerOptionsBR);

        LatLng pichiquillaipe = new LatLng(-41.522128, -72.763744);
        MarkerOptions markerOptionsPichiquillaipe =
                new MarkerOptions()
                        .position(pichiquillaipe)
                        .title("")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE));
        pichiquillaipe_marker = googleMap.addMarker(markerOptionsPichiquillaipe);

        LatLng quillaipe = new LatLng(-41.527532, -72.745565);
        MarkerOptions markerOptionsQuillaipe =
                new MarkerOptions()
                        .position(quillaipe)
                        .title("Quillaipe")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE));
        q_marker = googleMap.addMarker(markerOptionsQuillaipe);

        LatLng metri = new LatLng(-41.592477, -72.702301);
        MarkerOptions markerOptionsMetri =
                new MarkerOptions()
                        .position(metri)
                        .title("Metri")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE));
        metri_marker = googleMap.addMarker(markerOptionsMetri);

        LatLng lenca = new LatLng(-41.606301, -72.683388);
        MarkerOptions markerOptionsLenca =
                new MarkerOptions()
                        .position(lenca)
                        .title("Lenca")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE));
        lenca_marker = googleMap.addMarker(markerOptionsLenca);

        LatLng chaicas = new LatLng(-41.615210, -72.658393);
        MarkerOptions markerOptionsChaicas =
                new MarkerOptions()
                        .position(chaicas)
                        .title("Chaicas")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE));
        chaicas_marker = googleMap.addMarker(markerOptionsChaicas);

        LatLng cl_gutierrez = new LatLng(-41.660768, -72.663512);
        MarkerOptions markerOptionsCl_gutierrez =
                new MarkerOptions()
                        .position(cl_gutierrez)
                        .title("Caleta Gutierrez")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE));
       cl_gutierrez_marker = googleMap.addMarker(markerOptionsCl_gutierrez);

        LatLng cl_la_arena = new LatLng(-41.691045, -72.638697);
        MarkerOptions markerOptionsCL_Arena =
                new MarkerOptions()
                        .position(cl_la_arena)
                        .title("Caleta la Arena")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE));
        cl_la_arena_marker = googleMap.addMarker(markerOptionsCL_Arena);

    }



    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions,
                                           @NonNull int[] grantResults) {
        if (requestCode == LOCATION_REQUEST_CODE) {
            // ¿Permisos asignados?
            if (permissions.length > 0 &&
                    permissions[0].equals(Manifest.permission.ACCESS_FINE_LOCATION) &&
                    grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                mMap.setMyLocationEnabled(true);
            } else {
                Toast.makeText(this, "Error de permisos", Toast.LENGTH_LONG).show();
            }

        }
    }

    @Override
    public boolean onMarkerClick(Marker marker) {
        if (marker.equals(marker_PM)) {
            Intent intent = new Intent(this, ScrollingActivity_InfoPlace.class);

            startActivity(intent);
        }
        return false;
    }
}
