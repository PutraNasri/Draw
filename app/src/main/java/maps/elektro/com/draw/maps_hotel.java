package maps.elektro.com.draw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class maps_hotel extends Activity implements OnMapReadyCallback{
    GoogleMap gMaps;
    String nama;
    TextView namaP;
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps_hotel);
        MapFragment mapFragment = (MapFragment) getFragmentManager()
                .findFragmentById(R.id.maps);

        mapFragment.getMapAsync(this);

        try {
            initializeMaps();
            gMaps.addMarker(new MarkerOptions()
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.marktraf))
                    .position(new LatLng(5.5563146, 95.3414))
                    .visible(true)
                    .title("Hermes Palace Hotel"));
            gMaps.addMarker(new MarkerOptions()
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.marktraf))
                    .position(new LatLng(5.537164,95.341177))
                    .visible(true)
                    .title("Grand Nanggroe Hotel"));
            gMaps.addMarker(new MarkerOptions()
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.marktraf))
                    .position(new LatLng(5.555781,95.317238))
                    .visible(true)
                    .title("Hotel Lading"));
            gMaps.addMarker(new MarkerOptions()
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.marktraf))
                    .position(new LatLng(5.530422,95.330543))
                    .visible(true)
                    .title("Ring Road Hotel"));

            gMaps.setMyLocationEnabled(true);
            CameraPosition cameraPosition = new CameraPosition.Builder().target(new LatLng(5.484702, 95.227189)).zoom(10).build();
            gMaps.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
            gMaps.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition), 2000, null);
        } catch (Exception e) {
        }}
    public void rood(View view)
    {
        gMaps.setMapType(GoogleMap.MAP_TYPE_NORMAL);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_maps_hotel, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    @Override
    public void onMapReady (GoogleMap googleMap){
        gMaps.setMapType(GoogleMap.MAP_TYPE_NORMAL);
    }


    @TargetApi(Build.VERSION_CODES.HONEYCOMB)

    private void initializeMaps() {
        if (gMaps == null) {
            gMaps = ((MapFragment) getFragmentManager().findFragmentById(R.id.maps)).getMap();

            if (gMaps == null) {
                Toast.makeText(getApplicationContext(), "Unable to create maps", Toast.LENGTH_SHORT).show();
            }
        }
    }}
