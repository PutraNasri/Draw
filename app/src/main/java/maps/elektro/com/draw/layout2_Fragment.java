package maps.elektro.com.draw;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by byonge on 8/19/2015.
 */
public class layout2_Fragment extends Fragment{
    View rootview;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        rootview = inflater.inflate(R.layout.layout2, container, false);
        Button a = (Button) rootview.findViewById(R.id.button1);
        Button b = (Button) rootview.findViewById(R.id.button2);
        Button c = (Button) rootview.findViewById(R.id.button3);
        Button d = (Button) rootview.findViewById(R.id.button4);

        Button e = (Button) rootview.findViewById(R.id.imageView1);

        Button f = (Button) rootview.findViewById(R.id.imageView2);
        Button g = (Button) rootview.findViewById(R.id.imageView3);
        Button h = (Button) rootview.findViewById(R.id.imageView4);

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), maps_daus.class);
                startActivity(intent);
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), maps_bireun.class);
                startActivity(intent);
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), maps_razali.class);
                startActivity(intent);
            }
        });
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), maps_hasan.class);
                startActivity(intent);
            }
        });

        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), info_daus.class);
                startActivity(intent);
            }
        });

        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), info_bireun.class);
                startActivity(intent);
            }
        });
        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), info_razali.class);
                startActivity(intent);
            }
        });
        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), info_hasan.class);
                startActivity(intent);
            }
        });


        return rootview;
    }

}

