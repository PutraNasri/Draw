package maps.elektro.com.draw;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.maps.model.*;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;



import android.app.Activity;


public class maps_banda extends Activity implements OnMapReadyCallback {
    GoogleMap gMaps;
    String nama;
    TextView namaP;
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps_banda);
        MapFragment mapFragment = (MapFragment) getFragmentManager()
                .findFragmentById(R.id.maps);
        mapFragment.getMapAsync(this);
        Intent intent = getIntent();
        nama = intent.getStringExtra("nama");
        setInfo(nama);
    }
    public void setInfo(String place){


        if(place.equalsIgnoreCase("Lampuuk")) {
            try {
                initializeMaps();
                gMaps.addMarker(new MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromResource(R.drawable.wisataa))
                        .position(new LatLng(5.484702, 95.227189))
                        .visible(true)
                        .title("Lampuuk"));

                gMaps.setMyLocationEnabled(true);
                CameraPosition cameraPosition = new CameraPosition.Builder().target(new LatLng(5.484702, 95.227189)).zoom(10).build();
                gMaps.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
                gMaps.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition), 2000, null);

            } catch (Exception e) {
            }
        }else if(place.equalsIgnoreCase("Pasir Putih")){
            try {
                initializeMaps();
                gMaps.addMarker(new MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromResource(R.drawable.wisataa))
                        .position(new LatLng(5.616388, 95.544274))
                        .visible(true)
                        .title("Pasir Putih"));
                gMaps.setMyLocationEnabled(true);

                CameraPosition cameraPosition = new CameraPosition.Builder().target(new LatLng(5.616388, 95.544274)).zoom(10).build();
                gMaps.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
                gMaps.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition), 2000, null);
            } catch (Exception e) {
            }
        }else{}
        if(place.equalsIgnoreCase("Lhouk mata ie")) {
            try {
                initializeMaps();
                gMaps.addMarker(new MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromResource(R.drawable.wisataa))
                        .position(new LatLng(5.571272, 95.226381))
                        .title("Lhouk mata ie"));

                gMaps.setMyLocationEnabled(true);
                CameraPosition cameraPosition = new CameraPosition.Builder().target(new LatLng(5.571272, 95.226381)).zoom(10).build();
                gMaps.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
                gMaps.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition), 2000, null);

            } catch (Exception e) {
            }
        }else if(place.equalsIgnoreCase("Tugu Nol KM")){
            try {
                initializeMaps();
                gMaps.addMarker(new MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromResource(R.drawable.wisataa))
                        .position(new LatLng(5.906016, 95.216867))
                        .title("Tugu Nol Kilometer"));

                gMaps.setMyLocationEnabled(true);
                CameraPosition cameraPosition = new CameraPosition.Builder().target(new LatLng(5.906016, 95.216867)).zoom(10).build();
                gMaps.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
                gMaps.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition), 2000, null);
            } catch (Exception e) {
            }
        }else{}
        if(place.equalsIgnoreCase("Iboih Sabang")) {
            try {
                initializeMaps();
                gMaps.addMarker(new MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromResource(R.drawable.wisataa))
                        .position(new LatLng(5.875183, 95.255673))
                        .title("Iboih Sabang"));

                gMaps.setMyLocationEnabled(true);
                CameraPosition cameraPosition = new CameraPosition.Builder().target(new LatLng(5.875183, 95.255673)).zoom(10).build();
                gMaps.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
                gMaps.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition), 2000, null);

            } catch (Exception e) {
            }
        }else if(place.equalsIgnoreCase("Pantai ulee lheue")){
            try {
                initializeMaps();
                gMaps.addMarker(new MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromResource(R.drawable.wisataa))
                        .position(new LatLng(5.559172, 95.284337))
                        .title("Pantai ulee lheue"));

                gMaps.setMyLocationEnabled(true);
                CameraPosition cameraPosition = new CameraPosition.Builder().target(new LatLng(5.559172, 95.284337)).zoom(10).build();
                gMaps.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
                gMaps.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition), 2000, null);
            } catch (Exception e) {
            }
        }else{}
        if(place.equalsIgnoreCase("Waterboom ulee lheue")) {
            try {
                initializeMaps();
                gMaps.addMarker(new MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromResource(R.drawable.wisataa))
                        .position(new LatLng(5.551545, 95.286376))
                        .title("Waterboom ulee lheue"));

                gMaps.setMyLocationEnabled(true);
                CameraPosition cameraPosition = new CameraPosition.Builder().target(new LatLng(5.551545, 95.286376)).zoom(10).build();
                gMaps.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
                gMaps.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition), 2000, null);

            } catch (Exception e) {
            }
        }else if(place.equalsIgnoreCase("Mataie Hillside")){
            try {
                initializeMaps();
                gMaps.addMarker(new MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromResource(R.drawable.wisataa))
                        .position(new LatLng(5.486962, 95.289841))
                        .title("Mataie Hillside"));

                gMaps.setMyLocationEnabled(true);
                CameraPosition cameraPosition = new CameraPosition.Builder().target(new LatLng(5.486962, 95.289841)).zoom(10).build();
                gMaps.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
                gMaps.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition), 2000, null);
            } catch (Exception e) {
            }
        }else{}
        if(place.equalsIgnoreCase("Wisata Alam Taman Rusa")) {
            try {
                initializeMaps();
                gMaps.addMarker(new MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromResource(R.drawable.wisataa))
                        .position(new LatLng(5.450278, 95.367439))
                        .title("Wisata Alam Taman Rusa"));

                gMaps.setMyLocationEnabled(true);
                CameraPosition cameraPosition = new CameraPosition.Builder().target(new LatLng(5.450278, 95.367439)).zoom(10).build();
                gMaps.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
                gMaps.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition), 2000, null);

            } catch (Exception e) {
            }
        }else if(place.equalsIgnoreCase("Wahana impian Malaka")){
            try {

                initializeMaps();
                gMaps.addMarker(new MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromResource(R.drawable.wisataa))
                        .position(new LatLng(5.419543, 95.404034))
                        .title("Wahana impian Malaka"));

                gMaps.setMyLocationEnabled(true);
                CameraPosition cameraPosition = new CameraPosition.Builder().target(new LatLng(5.419543, 95.404034)).zoom(10).build();
                gMaps.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
                gMaps.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition), 2000, null);
            } catch (Exception e) {
            }
        }else{}
        if(place.equalsIgnoreCase("waduk keliling")) {
            try {
                initializeMaps();
                gMaps.addMarker(new MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromResource(R.drawable.wisataa))
                        .position(new LatLng(5.364700, 95.481007))
                        .title("waduk keliling"));

                gMaps.setMyLocationEnabled(true);
                CameraPosition cameraPosition = new CameraPosition.Builder().target(new LatLng(5.364700, 95.481007)).zoom(10).build();
                gMaps.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
                gMaps.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition), 2000, null);

            } catch (Exception e) {
            }
        }else if(place.equalsIgnoreCase("Saree Aceh")){
            try {
                initializeMaps();
                gMaps.addMarker(new MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromResource(R.drawable.wisataa))
                        .position(new LatLng(5.476816, 95.714189))
                        .title("Saree Aceh"));

                gMaps.setMyLocationEnabled(true);
                CameraPosition cameraPosition = new CameraPosition.Builder().target(new LatLng(5.476816, 95.714189)).zoom(10).build();
                gMaps.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
                gMaps.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition), 2000, null);
            } catch (Exception e) {
            }
        }else{}
        if(place.equalsIgnoreCase("Gunung Berapi Jaboi")) {
            try {
                initializeMaps();
                gMaps.addMarker(new MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromResource(R.drawable.wisataa))
                        .position(new LatLng(5.808729, 95.307655))
                        .title("Gunung Berapi Jaboi"));

                gMaps.setMyLocationEnabled(true);
                CameraPosition cameraPosition = new CameraPosition.Builder().target(new LatLng(5.808729, 95.307655)).zoom(10).build();
                gMaps.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
                gMaps.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition), 2000, null);

            } catch (Exception e) {
            }
        }else if(place.equalsIgnoreCase("Pantai Sumur Tiga")){
            try {
                initializeMaps();
                gMaps.addMarker(new MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromResource(R.drawable.wisataa))
                        .position(new LatLng(5.892762, 95.339519))
                        .title("Pantai Sumur Tiga"));

                gMaps.setMyLocationEnabled(true);
                CameraPosition cameraPosition = new CameraPosition.Builder().target(new LatLng(5.892762, 95.339519)).zoom(10).build();
                gMaps.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
                gMaps.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition), 2000, null);
            } catch (Exception e) {
            }
        }else{}
        if(place.equalsIgnoreCase("Casanemo")) {
            try {
                initializeMaps();
                gMaps.addMarker(new MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromResource(R.drawable.wisataa))
                        .position(new LatLng(5.888442, 95.343850))
                        .title("Casanemo"));

                gMaps.setMyLocationEnabled(true);
                CameraPosition cameraPosition = new CameraPosition.Builder().target(new LatLng(5.888442, 95.343850)).zoom(10).build();
                gMaps.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
                gMaps.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition), 2000, null);

            } catch (Exception e) {
            }
        }else if(place.equalsIgnoreCase("Benteng Jepang")){
            try {
                initializeMaps();
                gMaps.addMarker(new MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromResource(R.drawable.wisataa))
                        .position(new LatLng(5.847085, 95.373722))
                        .title("Benteng Jepang"));

                gMaps.setMyLocationEnabled(true);
                CameraPosition cameraPosition = new CameraPosition.Builder().target(new LatLng(5.847085, 95.373722)).zoom(10).build();
                gMaps.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
                gMaps.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition), 2000, null);
            } catch (Exception e) {
            }
        }else{}
        if(place.equalsIgnoreCase("Pantai Anoi Itam")) {
            try {
                initializeMaps();
                gMaps.addMarker(new MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromResource(R.drawable.wisataa))
                        .position(new LatLng(5.837190, 95.373915))
                        .title("Pantai Anoi Itam"));

                gMaps.setMyLocationEnabled(true);
                CameraPosition cameraPosition = new CameraPosition.Builder().target(new LatLng(5.837190, 95.373915)).zoom(10).build();
                gMaps.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
                gMaps.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition), 2000, null);

            } catch (Exception e) {
            }
        }else if(place.equalsIgnoreCase("Pantai gapang")){
            try {
                initializeMaps();
                gMaps.addMarker(new MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromResource(R.drawable.wisataa))
                        .position(new LatLng(5.853319, 95.270376))
                        .title("Pantai gapang"));

                gMaps.setMyLocationEnabled(true);
                CameraPosition cameraPosition = new CameraPosition.Builder().target(new LatLng(5.853319, 95.270376)).zoom(10).build();
                gMaps.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
                gMaps.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition), 2000, null);
            } catch (Exception e) {
            }
        }else{}
        if(place.equalsIgnoreCase("Sabang Fair")) {
            try {
                initializeMaps();
                gMaps.addMarker(new MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromResource(R.drawable.wisataa))
                        .position(new LatLng(5.893201, 95.311363))
                        .title("Sabang Fair"));

                gMaps.setMyLocationEnabled(true);
                CameraPosition cameraPosition = new CameraPosition.Builder().target(new LatLng(5.893201, 95.311363)).zoom(10).build();
                gMaps.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
                gMaps.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition), 2000, null);

            } catch (Exception e) {
            }
        }else if(place.equalsIgnoreCase("Pantan Terong, Takengon")){
            try {
                initializeMaps();
                gMaps.addMarker(new MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromResource(R.drawable.wisataa))
                        .position(new LatLng(4.647343, 96.807856))
                        .title("Pantan Terong, Takengon"));

                gMaps.setMyLocationEnabled(true);
                CameraPosition cameraPosition = new CameraPosition.Builder().target(new LatLng(4.647343, 96.807856)).zoom(10).build();
                gMaps.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
                gMaps.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition), 2000, null);
            } catch (Exception e) {
            }
        }else{}
        if(place.equalsIgnoreCase("Danau Laut Tawar")) {
            try {
                initializeMaps();
                gMaps.addMarker(new MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromResource(R.drawable.wisataa))
                        .position(new LatLng(4.629911, 96.862150))
                        .title("Danau Laut Tawar"));

                gMaps.setMyLocationEnabled(true);
                CameraPosition cameraPosition = new CameraPosition.Builder().target(new LatLng(4.629911, 96.862150)).zoom(10).build();
                gMaps.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
                gMaps.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition), 2000, null);

            } catch (Exception e) {
            }
        }else if(place.equalsIgnoreCase("Pulau Banyak")){
            try {
                initializeMaps();
                gMaps.addMarker(new MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromResource(R.drawable.wisataa))
                        .position(new LatLng(2.177850, 97.248843))
                        .title("Pulau Banyak"));

                gMaps.setMyLocationEnabled(true);
                CameraPosition cameraPosition = new CameraPosition.Builder().target(new LatLng(2.177850, 97.248843)).zoom(10).build();
                gMaps.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
                gMaps.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition), 2000, null);
            } catch (Exception e) {
            }
        }else{}
        if(place.equalsIgnoreCase("Pulo Aceh")) {
            try {
                initializeMaps();
                gMaps.addMarker(new MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromResource(R.drawable.wisataa))
                        .position(new LatLng(5.697197, 95.090978))
                        .title("Pulo Aceh"));

                gMaps.setMyLocationEnabled(true);
                CameraPosition cameraPosition = new CameraPosition.Builder().target(new LatLng(5.697197, 95.090978)).zoom(10).build();
                gMaps.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
                gMaps.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition), 2000, null);

            } catch (Exception e) {
            }
        }else if(place.equalsIgnoreCase("")){
            try {

                initializeMaps();
                gMaps.setMyLocationEnabled(true);
                CameraPosition cameraPosition = new CameraPosition.Builder().target(new LatLng(5.906016, 95.216867)).zoom(10).build();
                gMaps.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
                gMaps.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition), 2000, null);
            } catch (Exception e) {
            }
        }else{}
        if(place.equalsIgnoreCase("Pantai Jantang")) {
            try {
                initializeMaps();
                gMaps.addMarker(new MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromResource(R.drawable.wisataa))
                        .position(new LatLng(5.265037, 95.245556))
                        .title("Pantai Jantang (Hidden Beach), Aceh Besar"));

                gMaps.setMyLocationEnabled(true);
                CameraPosition cameraPosition = new CameraPosition.Builder().target(new LatLng(5.265037, 95.245556)).zoom(10).build();
                gMaps.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
                gMaps.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition), 2000, null);

            } catch (Exception e) {
            }
        }else if(place.equalsIgnoreCase("Air Terjun Suhom")){
            try {
                initializeMaps();
                gMaps.addMarker(new MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromResource(R.drawable.wisataa))
                        .position(new LatLng(5.284823, 95.261993))
                        .title("Air Terjun"));

                gMaps.setMyLocationEnabled(true);
                CameraPosition cameraPosition = new CameraPosition.Builder().target(new LatLng(5.284823, 95.261993)).zoom(10).build();
                gMaps.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
                gMaps.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition), 2000, null);
            } catch (Exception e) {
            }
        }else{}
        if(place.equalsIgnoreCase("Brayeung Leupung")) {
            try {
                initializeMaps();
                gMaps.addMarker(new MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromResource(R.drawable.wisataa))
                        .position(new LatLng(5.367738, 95.284268))
                        .title("Brayeung Leupung"));

                gMaps.setMyLocationEnabled(true);
                CameraPosition cameraPosition = new CameraPosition.Builder().target(new LatLng(5.367738, 95.284268)).zoom(10).build();
                gMaps.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
                gMaps.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition), 2000, null);

            } catch (Exception e) {
            }
        }else if(place.equalsIgnoreCase("Air Panas")){
            try {
                initializeMaps();
                gMaps.addMarker(new MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromResource(R.drawable.wisataa))
                        .position(new LatLng(5.547023, 95.547619))
                        .title("Pemandian Air Panas Aceh Besar"));

                gMaps.setMyLocationEnabled(true);
                CameraPosition cameraPosition = new CameraPosition.Builder().target(new LatLng(5.547023, 95.547619)).zoom(10).build();
                gMaps.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
                gMaps.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition), 2000, null);
            } catch (Exception e) {
            }
        }else{}
        if(place.equalsIgnoreCase("Bukit Lamreh")) {
            try {
                initializeMaps();
                gMaps.addMarker(new MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromResource(R.drawable.wisataa))
                        .position(new LatLng(5.616388, 95.544274))
                        .title("Wisata Bukit Lamreh, ujung kelindu, Aceh Besar"));

                gMaps.setMyLocationEnabled(true);
                CameraPosition cameraPosition = new CameraPosition.Builder().target(new LatLng(5.616388, 95.544274)).zoom(10).build();
                gMaps.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
                gMaps.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition), 2000, null);

            } catch (Exception e) {
            }
        }}
    public void rood(View view)
    {
        gMaps.setMapType(GoogleMap.MAP_TYPE_NORMAL);
    }
    public void sat(View view)
    {
        gMaps.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
    }

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    private void initializeMaps() {
        if (gMaps == null) {
            gMaps = ((MapFragment) getFragmentManager().findFragmentById(R.id.maps)).getMap();

            if(gMaps == null) {
                Toast.makeText(getApplicationContext(), "Unable to create maps", Toast.LENGTH_SHORT).show();
            }
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_maps_banda, menu);
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
    public void onMapReady(GoogleMap googleMap) {
        gMaps.setMapType(GoogleMap.MAP_TYPE_NORMAL);
    }
}
