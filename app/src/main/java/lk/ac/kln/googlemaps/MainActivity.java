package lk.ac.kln.googlemaps;


import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


import androidx.fragment.app.FragmentActivity;

public  class MainActivity extends FragmentActivity implements OnMapReadyCallback{

@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    SupportMapFragment mapFragment=(SupportMapFragment)getSupportFragmentManager()
            .findFragmentById(R.id.map);
        mapFragment.getMapAsync( this);
    }
    @Override
    public void onMapReady(GoogleMap map){
        LatLng chava = new LatLng(9.662423, 80.169391);
        MarkerOptions options=new MarkerOptions().position(chava).title("home");
                map.addMarker(options);
                map.moveCamera(CameraUpdateFactory.newLatLng(chava));
    }
}

