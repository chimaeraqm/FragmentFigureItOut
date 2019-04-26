package com.crazydwarf.chimaeraqm.fragmentfigureitout;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity
{
    private FirstFragment mFirstFra;
    private SecondFragment mSecondFra;
    private ThirdFragment mThirdFra;

    private JumpFirstFragment mJumpFirstFra;
    private JumpSecondFragment mJumpSecondFra;

    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            fragmentTransaction = fragmentManager.beginTransaction();
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    fragmentTransaction.hide(mFirstFra).commit();
                    return true;
                case R.id.navigation_dashboard:
                    fragmentTransaction.show(mSecondFra).commit();
                    return true;
                case R.id.navigation_notifications:
                    fragmentTransaction.show(mThirdFra).commit();
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        Log.d("&&&&MainActivity","&&&&MainActivity_onCreate");
        setContentView(R.layout.activity_main);
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        initFragments(savedInstanceState);

        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    void initFragments(Bundle savedInstanceState)
    {
        if(savedInstanceState != null)
        {
            mFirstFra = (FirstFragment) fragmentManager.findFragmentByTag(FirstFragment.TAG);
        }
        else
        {
            fragmentTransaction = fragmentManager.beginTransaction();

            mFirstFra = new FirstFragment();
            fragmentTransaction.add(R.id.view_fragments,mFirstFra,FirstFragment.TAG).show(mFirstFra);

            mSecondFra = new SecondFragment();
            fragmentTransaction.add(R.id.view_fragments,mSecondFra,SecondFragment.TAG).hide(mSecondFra);

            mThirdFra = new ThirdFragment();
            fragmentTransaction.add(R.id.view_fragments,mThirdFra,ThirdFragment.TAG).hide(mThirdFra);

            mJumpFirstFra = new JumpFirstFragment();
            fragmentTransaction.add(R.id.view_fragments,mJumpFirstFra,JumpFirstFragment.TAG).hide(mJumpFirstFra);

            mJumpSecondFra = new JumpSecondFragment();
            fragmentTransaction.add(R.id.view_fragments,mJumpSecondFra,JumpSecondFragment.TAG).hide(mJumpSecondFra);

            fragmentTransaction.commit();
        }
    }

    private void switchFragment(Fragment fragment)
    {
        fragmentTransaction.hide(fragment);
        fragmentTransaction.commitAllowingStateLoss();
    }

    @Override
    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
        Log.d("&&&&MainActivity","&&&&MainActivity_onAttachFragment");
    }

    @Override
    public void onContentChanged() {
        super.onContentChanged();
        Log.d("&&&&MainActivity","&&&&MainActivity_onContentChanged");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("&&&&MainActivity","&&&&MainActivity_onStart");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d("&&&&MainActivity","&&&&MainActivity_onRestoreInstanceState");
    }

    @Override
    public void onPostCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onPostCreate(savedInstanceState, persistentState);
        Log.d("&&&&MainActivity","&&&&MainActivity_onPostCreate");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("&&&&MainActivity","&&&&MainActivity_onResume");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d("&&&&MainActivity","&&&&MainActivity_onPostResume");
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Log.d("&&&&MainActivity","&&&&MainActivity_onAttachedToWindow");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        Log.d("&&&&MainActivity","&&&&MainActivity_onCreateOptionsMenu");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        Log.d("&&&&MainActivity","&&&&MainActivity_onPrepareOptionsMenu");
        return super.onPrepareOptionsMenu(menu);
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("&&&&MainActivity","&&&&MainActivity_onPause");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d("&&&&MainActivity","&&&&MainActivity_onSaveInstanceState");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("&&&&MainActivity","&&&&MainActivity_onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("&&&&MainActivity","&&&&MainActivity_onDestroy");
    }
}
