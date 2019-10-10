package com.frunaos.appaustral.ui.home;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import com.frunaos.appaustral.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class HomeFragment extends Fragment {
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

    public HomeFragment() {
        // Required empty public constructor

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);

        SupportMapFragment mapFragment = (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.frg);  //use SuppoprtMapFragment for using in fragment instead of activity  MapFragment = activity   SupportMapFragment = fragment
        mapFragment.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(GoogleMap mMap) {
                mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);

                mMap.clear(); //clear old markers
                final LatLngBounds ADELAIDE = new LatLngBounds( new LatLng(-41.686771, -72.958514), new LatLng(-41.469326, -72.629929));
                mMap.setLatLngBoundsForCameraTarget(ADELAIDE);

                CameraPosition googlePlex = CameraPosition.builder()
                        .target(new LatLng(-41.4657400, -72.9428900))
                        .zoom(10)
                        .bearing(0)
                        .tilt(45)
                        .build();

                mMap.animateCamera(CameraUpdateFactory.newCameraPosition(googlePlex), 10000, null);


                // Add a marker in Puerto montt and move the camera -41.4657400, -72.9428900
                LatLng PM = new LatLng(-41.4657400, -72.9428900);
                MarkerOptions markerOptionsPM =
                        new MarkerOptions()
                                .position(PM)
                                .title("Puerto Montt")
                                .snippet("Capital de la provincia de Llanquihue y de la Región de Los Lagos.")
                                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE));
                marker_PM = mMap.addMarker(markerOptionsPM);

                mMap.moveCamera(CameraUpdateFactory.newLatLng(PM));


                LatLng pelluco = new LatLng(-41.486585, -72.901386);
                MarkerOptions markerOptionsPelluco =
                        new MarkerOptions()
                                .position(pelluco)
                                .title("Pelluco")
                                .snippet("Balneario Pelluco")
                                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE));
                pelluco_marker = mMap.addMarker(markerOptionsPelluco);


                LatLng pelluhuin = new LatLng(-41.493914, -72.896566);
                MarkerOptions markerOptionsPelluhuin =
                        new MarkerOptions()
                                .position(pelluhuin)
                                .title("Pelluhuin")
                                .snippet("Balneario Pelluhuín.")
                                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE));
                pelluhuin_marker = mMap.addMarker(markerOptionsPelluhuin);


                LatLng coihuin = new LatLng(-41.486304, -72.861439);
                MarkerOptions markerOptionsCoihuin =
                        new MarkerOptions()
                                .position(coihuin)
                                .title("Coihuin")
                                .snippet("Bahia de Coihuin.")
                                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE));
                coihuin_marker = mMap.addMarker(markerOptionsCoihuin);

                LatLng chamiza = new LatLng(-41.482950, -72.845179);
                MarkerOptions markerOptionsChamiza =
                        new MarkerOptions()
                                .position(chamiza)
                                .title("Chamiza")
                                .snippet("Localidad Rural")
                                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE));
                chamiza_marker = mMap.addMarker(markerOptionsChamiza);

                LatLng blue_rock = new LatLng(-41.503688, -72.800114);
                MarkerOptions markerOptionsBR =
                        new MarkerOptions()
                                .position(blue_rock)
                                .title("Piedra Azul")
                                .snippet("Localidad Rural")
                                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE));
                br_marker = mMap.addMarker(markerOptionsBR);

                LatLng pichiquillaipe = new LatLng(-41.522128, -72.763744);
                MarkerOptions markerOptionsPichiquillaipe =
                        new MarkerOptions()
                                .position(pichiquillaipe)
                                .title("Pichiquillaipe")
                                .snippet("Localidad Rural")
                                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE));
                pichiquillaipe_marker = mMap.addMarker(markerOptionsPichiquillaipe);

                LatLng quillaipe = new LatLng(-41.527532, -72.745565);
                MarkerOptions markerOptionsQuillaipe =
                        new MarkerOptions()
                                .position(quillaipe)
                                .title("Quillaipe")
                                .snippet("Localidad Rural")
                                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE));
                q_marker = mMap.addMarker(markerOptionsQuillaipe);

                LatLng metri = new LatLng(-41.592477, -72.702301);
                MarkerOptions markerOptionsMetri =
                        new MarkerOptions()
                                .position(metri)
                                .title("Metri")
                                .snippet("Localidad Rural")
                                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE));
                metri_marker = mMap.addMarker(markerOptionsMetri);

                LatLng lenca = new LatLng(-41.616711, -72.666701);
                MarkerOptions markerOptionsLenca =
                        new MarkerOptions()
                                .position(lenca)
                                .title("Lenca")
                                .snippet("Localidad Rural")
                                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE));
                lenca_marker = mMap.addMarker(markerOptionsLenca);

                LatLng chaicas = new LatLng(-41.606301, -72.683388);
                MarkerOptions markerOptionsChaicas =
                        new MarkerOptions()
                                .position(chaicas)
                                .title("Chaicas")
                                .snippet("Localidad Rural")
                                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE));
                chaicas_marker = mMap.addMarker(markerOptionsChaicas);

                LatLng cl_gutierrez = new LatLng(-41.660768, -72.663512);
                MarkerOptions markerOptionsCl_gutierrez =
                        new MarkerOptions()
                                .position(cl_gutierrez)
                                .title("Caleta Gutierrez")
                                .snippet("Localidad Rural")
                                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE));
                cl_gutierrez_marker = mMap.addMarker(markerOptionsCl_gutierrez);

                LatLng cl_la_arena = new LatLng(-41.691045, -72.638697);
                MarkerOptions markerOptionsCL_Arena =
                        new MarkerOptions()
                                .position(cl_la_arena)
                                .title("Caleta la Arena")
                                .snippet("Localidad Rural")
                                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE));
                cl_la_arena_marker = mMap.addMarker(markerOptionsCL_Arena);

            }

        });


        return rootView;
    }

    private BitmapDescriptor bitmapDescriptorFromVector(Context context, int vectorResId) {
        Drawable vectorDrawable = ContextCompat.getDrawable(context, vectorResId);
        vectorDrawable.setBounds(0, 0, vectorDrawable.getIntrinsicWidth(), vectorDrawable.getIntrinsicHeight());
        Bitmap bitmap = Bitmap.createBitmap(vectorDrawable.getIntrinsicWidth(), vectorDrawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        vectorDrawable.draw(canvas);
        return BitmapDescriptorFactory.fromBitmap(bitmap);
    }

}