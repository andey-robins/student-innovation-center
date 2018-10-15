package com.sic.android.sic;

import android.app.ListActivity;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Toast;

public class ExploreActivity extends ListActivity {

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_explore:

                    Toast.makeText(ExploreActivity.this, "Already on tab Explore", Toast.LENGTH_LONG).show();

                    return true;
                case R.id.navigation_training:
                    Toast.makeText(ExploreActivity.this, "Training coming soon!", Toast.LENGTH_LONG).show();
                    return true;
                case R.id.navigation_about:
                    Toast.makeText(ExploreActivity.this, "About coming soon!", Toast.LENGTH_LONG).show();
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore);

        String[] itemName = {
                getString(R.string.techName0),
                getString(R.string.techName1)
        };

        int[] itemPics = {
            R.drawable.ic_home_black_24dp,
            R.drawable.ic_dashboard_black_24dp,
        };

        this.setListAdapter(new ArrayAdapter<String>(this, R.layout.my_list, R.id.Itemname, itemName));
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }
}
