/*
NIM : 10116281
Nama : Andreas Rizki Rizaldi
Kelas : IF-7
Dibuat : 21-05-2019
 */
package xyz.kyrozyn.uts10116281.view;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import xyz.kyrozyn.uts10116281.R;
import xyz.kyrozyn.uts10116281.model.Teman;
import xyz.kyrozyn.uts10116281.presenter.kontakPresenter;

public class kontakFragment extends Fragment {
    String[] mobileArray = {"Android","IPhone","WindowsMobile","Blackberry",
            "WebOS","Ubuntu","Windows7","Max OS X"};
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view;
        ArrayList<String> ar = new ArrayList();
        view = inflater.inflate(R.layout.fragment_kontak, container, false);
        kontakPresenter pre = new kontakPresenter();
        for (Teman t: pre.TampilSemua()) {
            ar.add(t.getNama());
        }
        String[] stringArray = ar.toArray(new String[0]);
        ArrayAdapter adapter = new ArrayAdapter<>(view.getContext(),
                R.layout.activity_listview, stringArray);
        ListView listView = view.findViewById(R.id.mobile_list);
        listView.setAdapter(adapter);
        return view;
    }
}
