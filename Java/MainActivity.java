//
// Carson Miller @4rsons
// WebView Fragment Tabs
// Thursday, June 29th, 2017
//

package android.polksheriff.org;

import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    // The android.support.v4.view.PagerAdapter} that will provide
    // fragments for each of the sections. We use a FragmentPagerAdapter
    // derivative, which will keep every loaded fragment in memory. If
    // this becomes too memory intensive, it may be best to switch to a
    // android.support.v4.app.FragmentStatePagerAdapter}.

    private SectionsPagerAdapter mSectionsPagerAdapter;

    // The ViewPager that will host the section contents.

    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    // A placeholder fragment containing a simple view.
    public static class PlaceholderFragment extends Fragment {

       // The fragment argument representing the section number for this fragment.
        private static final String ARG_SECTION_NUMBER = "section_number";

        public PlaceholderFragment() {}

        // Returns a new instance of this fragment for the given section number.
        public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            TextView textView = (TextView) rootView.findViewById(R.id.section_label);
            textView.setText(getString(R.string.section_format, getArguments().getInt(ARG_SECTION_NUMBER)));
            return rootView;
        }
    }

    // A FragmentPagerAdapter that returns a fragment corresponding to one of the sections/tabs/pages.
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    Tab1 tab1 = new Tab1();
                    return tab1;
                case 1:
                    Tab2 tab2 = new Tab2();
                    return tab2;
                case 2:
                    Tab3 tab3 = new Tab3();
                    return tab3;
                case 3:
                    Tab4 tab4 = new Tab4();
                    return tab4;
                case 4:
                    Tab5 tab5 = new Tab5();
                    return tab5;
                case 5:
                    Tab6 tab6 = new Tab6();
                    return tab6;
                case 6:
                    Tab7 tab7 = new Tab7();
                    return tab7;
                case 7:
                    Tab8 tab8 = new Tab8();
                    return tab8;

            }
            return null;
        }

        @Override
        public int getCount() {

            // Show 8 total tabs.
            return 8;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "carson.gg";
                case 1:
                    return "Google.com";
                case 2:
                    return "Reddit.com";
                case 3:
                    return "YouTube.com";
                case 4:
                    return "Tab 5";
                case 5:
                    return "Tab 6";
                case 6:
                    return "Tab 7";
                case 7:
                    return "Tab 8";
            }
            return null;
        }
    }
}
