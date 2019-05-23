/*
NIM : 10116281
Nama : Andreas Rizki Rizaldi
Kelas : IF-7
Dibuat : 22-05-2019
 */
package xyz.kyrozyn.uts10116281.view;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import xyz.kyrozyn.uts10116281.R;

public class kontakFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view;
        view = inflater.inflate(R.layout.fragment_kontak, container, false);
        ImageView t = view.findViewById(R.id.imageFacebook);
        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent uriIntent = new Intent(Intent.ACTION_VIEW);
                uriIntent.setData(Uri.parse("https://www.facebook.com/kyrozyn"));
                startActivity(uriIntent);
            }
        });
        ImageView z = view.findViewById(R.id.imageInstagram);
        z.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent uriIntent = new Intent(Intent.ACTION_VIEW);
                uriIntent.setData(Uri.parse("https://www.instagram.com/rizurila"));
                startActivity(uriIntent);
            }
        });
        ImageView a = view.findViewById(R.id.imageEmail);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent uriIntent = new Intent(Intent.ACTION_VIEW);
                uriIntent.setData(Uri.parse("mailto:arizkirizaldi@email.unikom.ac.id"));
                startActivity(uriIntent);
            }
        });
        return view;
    }
}
