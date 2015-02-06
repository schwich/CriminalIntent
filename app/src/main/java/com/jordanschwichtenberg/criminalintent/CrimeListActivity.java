package com.jordanschwichtenberg.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Jordan on 2/6/2015.
 */
public class CrimeListActivity extends SingleFragmentActivity implements CrimeListFragment.OnFragmentInteractionListener {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }

    public void onFragmentInteraction(String s) {

    }
}
