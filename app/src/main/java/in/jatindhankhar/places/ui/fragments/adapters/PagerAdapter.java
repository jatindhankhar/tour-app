package in.jatindhankhar.places.ui.fragments.adapters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import in.jatindhankhar.places.ui.fragments.PageFragment;

/**
 * Created by jatin on 1/13/18.
 */

// Thanks https://guides.codepath.com/android/google-play-style-tabs-using-tablayout
public class PagerAdapter extends FragmentPagerAdapter {
    private String tabTitles[] = new String[] { "Explore", "Eat", "Shop","Stay" };
    private Context context;

    public PagerAdapter(FragmentManager fm,Context ctx) {
        super(fm);
        this.context = ctx;
    }

    @Override
    public Fragment getItem(int position) {
        return PageFragment.newInstance(position+1);
    }

    @Override
    public int getCount() {
        return tabTitles.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}
