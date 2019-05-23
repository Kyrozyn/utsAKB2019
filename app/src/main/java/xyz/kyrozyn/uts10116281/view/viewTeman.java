package xyz.kyrozyn.uts10116281.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import xyz.kyrozyn.uts10116281.R;
import xyz.kyrozyn.uts10116281.model.Teman;

public class viewTeman extends AppCompatActivity {
    Teman teman;
    public viewTeman(Teman teman){
        this.teman = teman;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_teman);
        ArrayList<String> ar = new ArrayList();
        ar.add("NIM : "+teman.getNim());
        ar.add("Nama : "+teman.getNama());
        ar.add("Kelas : "+teman.getKelas());
        ar.add("Email : "+teman.getEmail());
        ar.add("Telepon :"+teman.getTelepon());
        String[] stringArray = ar.toArray(new String[0]);
        ArrayAdapter adapter = new ArrayAdapter<>(this,
                R.layout.activity_listview, stringArray);
        ListView listView = this.findViewById(R.id.mobile_list);
        listView.setAdapter(adapter);
    }

}
