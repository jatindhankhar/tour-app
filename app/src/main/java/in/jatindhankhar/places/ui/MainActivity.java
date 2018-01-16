package in.jatindhankhar.places.ui;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import in.jatindhankhar.places.R;
import in.jatindhankhar.places.ui.fragments.adapters.PagerAdapter;
import in.jatindhankhar.places.utils.Constants;
import in.jatindhankhar.places.utils.Utils;

import static in.jatindhankhar.places.utils.Constants.tabIcons;


public class MainActivity extends AppCompatActivity implements TabLayout.OnTabSelectedListener {

    @BindView(R.id.sliding_tabs)
    TabLayout tabLayout;
    @BindView(R.id.viewpager)
    ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        viewPager.setAdapter(new PagerAdapter(getSupportFragmentManager(), MainActivity.this));
        tabLayout.setupWithViewPager(viewPager);
        setTabIcons(tabLayout);
        tabLayout.addOnTabSelectedListener(this);
    }

    private void setTabIcons(TabLayout tabLayout) {
        for (int idx = 0; idx < tabLayout.getTabCount(); idx++) {
            if (tabLayout.getTabAt(idx) != null)
                tabLayout.getTabAt(idx).setIcon(tabIcons[idx]);
        }
    }

    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        Utils.setAmbience(this, Constants.tabColors[tab.getPosition()]);
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }

}
