package com.web2droid.bottomnavigationview;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.web2droid.bottomnavigationview.fragment.HomeFragment;

public class MainActivity extends AppCompatActivity {


    Bundle bundle;
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            //creating fragment object
            Fragment fragment = null;
            //initializing the fragment object which is selected
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    setTitle(R.string.title_home);
                    bundle = new Bundle();
                    bundle.putString("Value", getString(R.string.title_home));
                    HomeFragment homeFragment1 = new HomeFragment();
                    homeFragment1.setArguments(bundle);
                    fragment = homeFragment1;
                    break;
                case R.id.navigation_dashboard:
                    bundle = new Bundle();
                    bundle.putString("Value", getString(R.string.title_dashboard));
                    HomeFragment homeFragment2 = new HomeFragment();
                    homeFragment2.setArguments(bundle);
                    fragment = homeFragment2;
                    break;
                case R.id.navigation_notifications:
                    bundle = new Bundle();
                    bundle.putString("Value", getString(R.string.title_notifications));
                    HomeFragment homeFragment3 = new HomeFragment();
                    homeFragment3.setArguments(bundle);
                    fragment = homeFragment3;
                    break;

            }

            //replacing the fragment
            if (fragment != null) {
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.content, fragment);
                ft.setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out);
                ft.commit();
                return true;
            }

            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        navigation.getMenu().getItem(0).setChecked(true);
        bundle = new Bundle();
        bundle.putString("Value", getString(R.string.title_home));
        HomeFragment homeFragment = new HomeFragment();
        homeFragment.setArguments(bundle);
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.content, homeFragment);
        ft.setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out);
        ft.commit();
    }

}
