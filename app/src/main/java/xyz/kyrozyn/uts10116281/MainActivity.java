/*
NIM : 10116281
Nama : Andreas Rizki Rizaldi
Kelas : IF-7
Dibuat : 21-05-2019
 */

package xyz.kyrozyn.uts10116281;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import xyz.kyrozyn.uts10116281.view.homeFragment;
import xyz.kyrozyn.uts10116281.view.kontakFragment;
import xyz.kyrozyn.uts10116281.view.profilFragment;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadFragment(new homeFragment());
        BottomNavigationView bottomNavigationView =
        findViewById(R.id.bn_main);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);

    }
    private boolean loadFragment(Fragment fragment) {
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fl_container, fragment)
                    .commit();
            return true;
        }
        return false;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        Fragment fragment = null;
        switch (menuItem.getItemId()){
            case R.id.home_menu:
                fragment = new homeFragment();
                break;
            case R.id.kontak:
                fragment = new kontakFragment();
                break;
            case R.id.profil_menu:
                fragment = new profilFragment();
                break;
        }
        return loadFragment(fragment);
    }
}
