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
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import xyz.kyrozyn.uts10116281.view.viewPagerAdapter;
import xyz.kyrozyn.uts10116281.view.homeFragment;
import xyz.kyrozyn.uts10116281.view.kontakFragment;
import xyz.kyrozyn.uts10116281.view.profilFragment;

public class MainActivity extends AppCompatActivity  {
    private ViewPager pager;
    MenuItem prevMenuItem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final BottomNavigationView bottomNavigationView =
        findViewById(R.id.bn_main);
        this.pager = findViewById(R.id.viewpager);

        pager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if (prevMenuItem != null) {
                    prevMenuItem.setChecked(false);
                } else {
                    bottomNavigationView.getMenu().getItem(0).setChecked(false);
                }
                Log.d("page", "onPageSelected: " + position);
                bottomNavigationView.getMenu().getItem(position).setChecked(true);
                prevMenuItem = bottomNavigationView.getMenu().getItem(position);

            }


            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.home_menu:
                                pager.setCurrentItem(0);
                                break;
                            case R.id.kontak:
                                pager.setCurrentItem(2);
                                break;
                            case R.id.profil_menu:
                                pager.setCurrentItem(1);
                                break;
                        }
                        return false;
                    }
                });
        setupViewPager(pager);
    }

    private void setupViewPager(ViewPager viewPager) {
        viewPagerAdapter viewPagerAdapter = new viewPagerAdapter(getSupportFragmentManager());
        Fragment homeFragment = new homeFragment();
        Fragment kontakFragment = new kontakFragment();
        Fragment profilFragment = new profilFragment();
        viewPagerAdapter.addFragment(homeFragment);
        viewPagerAdapter.addFragment(profilFragment);
        viewPagerAdapter.addFragment(kontakFragment);
        viewPager.setAdapter(viewPagerAdapter);
    }
}

