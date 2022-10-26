package com.example.bterjavacode;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.bterjavacode.databinding.ActivityMapsBinding;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

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
        LatLng feua = new LatLng(14.410699895415755, 121.0380546798303);//A
        mMap.addMarker(new MarkerOptions().position(feua).title("FEU Alabang Drop-off Point"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(feua));
        LatLng festi = new LatLng(14.41755, 121.04052);//B
        mMap.addMarker(new MarkerOptions().position(festi).title("Festival Mall Drop-Off Point 1"));
        LatLng mktTerminal = new LatLng(14.424237250117503, 121.031766999137);//C
        mMap.addMarker(new MarkerOptions().position(mktTerminal).title(" Alabang MKT Terminal"));
        LatLng baclaranTerminal = new LatLng(14.53414433, 120.9981471);//D
        mMap.addMarker(new MarkerOptions().position(baclaranTerminal).title("Baclaran Terminal"));
        LatLng libradaSt = new LatLng(14.52223473, 120.9967539);//E
        mMap.addMarker(new MarkerOptions().position(libradaSt).title("Quirino Avenue Librada Street"));
        LatLng jalandoniSt = new LatLng(14.55438577, 120.9851946);//F
        mMap.addMarker(new MarkerOptions().position(jalandoniSt).title("Quirino Avenue Jalandoni Street"));
        LatLng genLuna = new LatLng(14.41264687, 120.9985847);//G
        mMap.addMarker(new MarkerOptions().position(genLuna).title("Quirino Avenue General Luna"));
        LatLng buenaventura = new LatLng(14.48550503, 120.9850211);//H
        mMap.addMarker(new MarkerOptions().position(buenaventura).title("Quirino Avenue Buenaventura"));
        LatLng bfGoodrich = new LatLng(14.57926916, 120.9985623);//I
        mMap.addMarker(new MarkerOptions().position(bfGoodrich).title("Quirino Avenue BF Goodrich"));
        LatLng castilloSt = new LatLng(14.47250629, 120.9911067);//J
        mMap.addMarker(new MarkerOptions().position(castilloSt).title("Alabang Castillo Street"));
        LatLng alabangMain = new LatLng(14.4171664, 121.0451872);//K
        mMap.addMarker(new MarkerOptions().position(alabangMain).title("Alabang Main Street"));
        LatLng alabangLPMuntiBldg = new LatLng(14.44508776, 120.9933165);//L
        mMap.addMarker(new MarkerOptions().position(alabangLPMuntiBldg).title("Alabang Las Pinas Muntinlupa Bldg."));
        LatLng vacPHTI = new LatLng(14.5676969003949, 121.0224387);//M
        mMap.addMarker(new MarkerOptions().position(vacPHTI).title("Alabang Vac PHTI"));
        LatLng troikaFurnishing = new LatLng(14.46260598, 120.9615692);//N
        mMap.addMarker(new MarkerOptions().position(troikaFurnishing).title("Alabang Troika Furnishing"));
        LatLng mAlvarez = new LatLng(14.42835051, 121.0026374);//O
        mMap.addMarker(new MarkerOptions().position(mAlvarez).title("Alabang M. Alvarez"));
        LatLng mod120Ave = new LatLng(14.42541484, 121.0126543);//P
        mMap.addMarker(new MarkerOptions().position(mod120Ave).title("Alabang Mod 120 Avenue"));
        LatLng twinCinema = new LatLng(14.42327501, 121.0299647);//Q
        mMap.addMarker(new MarkerOptions().position(twinCinema).title("Alabang Twin Cinema"));
        LatLng acaciaSt = new LatLng(14.3930641, 121.0113036);//R
        mMap.addMarker(new MarkerOptions().position(acaciaSt).title("Alabang Acacia Street"));


        mMap.setMinZoomPreference(12.5f);
        mMap.setMaxZoomPreference(20.0f);
    }
    }