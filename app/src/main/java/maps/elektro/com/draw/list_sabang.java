package maps.elektro.com.draw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.internal.widget.AdapterViewCompat;
import android.support.v7.internal.widget.AdapterViewCompat.OnItemClickListener;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;

public class list_sabang extends Activity {
    Intent intent = getIntent();

    private ListView lv;
    EditText inputSearch;
    ArrayList<HashMap<String, String>> placeList;


    ArrayAdapter<String> adapter;
    String[] listt={"Tugu Nol KM", "Iboih Sabang", "Gunung Berapi Jaboi", "Pantai Sumur Tiga", "Casanemo", "Benteng Jepang", "Pantai Anoi Itam", "Pantai gapang", "Sabang Fair", "Danau Laut Tawar"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_sabang);
        lv = (ListView) findViewById(R.id.list_View);
        inputSearch = (EditText) findViewById(R.id.inputSearch);


        adapter = new ArrayAdapter<String>(this, R.layout.sabang_filter,
                R.id.place_name, listt);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String nama_place = lv.getItemAtPosition(position).toString();

                Intent intent = new Intent(getApplicationContext(), Detail_Place.class);

                intent.putExtra("nama_place", nama_place);

                startActivity(intent);

            }
        });



        inputSearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence cs, int arg1, int arg2,
                                      int arg3) {
                list_sabang.this.adapter.getFilter().filter(cs);
            }

            @Override
            public void beforeTextChanged(CharSequence arg0, int arg1,
                                          int arg2, int arg3) {
            }

            @Override
            public void afterTextChanged(Editable arg0) {
                // TODO Auto-generated method stub
            }
        });

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_list_sabang, menu);
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
}
