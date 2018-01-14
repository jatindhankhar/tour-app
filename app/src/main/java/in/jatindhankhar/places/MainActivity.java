package in.jatindhankhar.places;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import butterknife.BindArray;
import butterknife.BindDrawable;
import butterknife.BindView;
import butterknife.ButterKnife;
import in.jatindhankhar.places.ui.fragments.adapters.PagerAdapter;


public class MainActivity extends AppCompatActivity {

    @BindView(R.id.sliding_tabs) TabLayout tabLayout;
    @BindView(R.id.viewpager) ViewPager viewPager;
    private int[] tabIcons = {
            R.drawable.explore,
            R.drawable.eat,
            R.drawable.shop,
            R.drawable.hotel
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        viewPager.setAdapter(new PagerAdapter(getSupportFragmentManager(),MainActivity.this));
        tabLayout.setupWithViewPager(viewPager);
        setTabIcons(tabLayout);
        Log.d("DEBUG","Tab count is " + tabLayout.getTabCount());

    }

    private void setTabIcons(TabLayout tabLayout)
    {
        for(int idx=0; idx<tabLayout.getTabCount(); idx++)
        {   if(tabLayout.getTabAt(idx) != null)
            tabLayout.getTabAt(idx).setIcon(tabIcons[idx]);
        }
    }
}
