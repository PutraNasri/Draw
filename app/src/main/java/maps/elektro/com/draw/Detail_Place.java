package maps.elektro.com.draw;

import android.content.Intent;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import android.app.Activity;


public class Detail_Place extends Activity {

    String nama_place;
    TextView namaPlace,infoPlace,imageView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail__place);
        namaPlace=(TextView) findViewById(R.id.nama_place);
        infoPlace=(TextView) findViewById(R.id.info_place);
        Intent intent = getIntent();
        nama_place = intent.getStringExtra("nama_place");
        namaPlace.setText(nama_place);
        setInfo(nama_place);
    }
    public void setInfo(String place){
        if(place.equalsIgnoreCase("Lampuuk")) {
            infoPlace.setText("kost ini menyediakan kamar-kamar yang nyaman untuk di huni oleh keluarga ataupun seorang mahasiswa "+
                    "saat bertandang ke Provinsi Nanggroe Aceh Darussalam. anda bisa langsung bisa hubungi kontak " +
                    "yang ada di sini,agar bisa langsung menyewa " +
                    "" +
                    "" +
                    "" +
                    "" +
                    "Contact = 085260243138" +
                    "Pin   = 12hfg6");
            ImageView imageView = (ImageView) findViewById(R.id.image_View2);
            imageView.setImageResource(R.drawable.lampuuk);


        }else if(place.equalsIgnoreCase("Pasir Putih")){
            infoPlace.setText("kost ini menyediakan kamar-kamar yang nyaman untuk di huni oleh keluarga ataupun seorang mahasiswa "+
                    "saat bertandang ke Provinsi Nanggroe Aceh Darussalam. anda bisa langsung bisa hubungi kontak " +
                    "yang ada di sini,agar bisa langsung menyewa " +
                    "" +
                    "" +
                    "" +
                    "" +
                    "Contact = 085260243138" +
                    "Pin   = 12hfg6" );
            ImageView imageView = (ImageView) findViewById(R.id.image_View2);
            imageView.setImageResource(R.drawable.pasir);
        }else{}
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_detail__place, menu);
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

    public void onClicktombolmaps(View view) {
        TextView nama_plac=(TextView) findViewById (R.id.nama_place);
        String nama=nama_plac.getText().toString();
        Intent intent= new Intent(getApplicationContext(),maps_banda.class);
        intent.putExtra("nama", nama);
        startActivity(intent);
    }
}
