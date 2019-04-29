package com.crazydwarf.chimaeraqm.fragmentfigureitout;

import android.os.Bundle;
import android.support.annotation.Nullable;

import me.yokeyword.fragmentation.SupportActivity;
import me.yokeyword.fragmentation.SupportFragment;
import me.yokeyword.fragmentation.anim.DefaultHorizontalAnimator;
import me.yokeyword.fragmentation.anim.FragmentAnimator;

public class SecondActivity extends SupportActivity
{
    public static final int FIRST = 0;
    public static final int SECOND = 1;
    public static final int THIRD = 2;

    private SupportFragment[] mFragments = new SupportFragment[3];

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_new);

        /*if(findFragment(JumpFirstFragment.class) == null)
        {
            loadRootFragment(R.id.fragment_container,JumpFirstFragment.newInstance());
        }*/
    }

    @Override
    protected void onStart() {
        super.onStart();
        SupportFragment firstFragment = findFragment(JumpFirstFragment.class);
        if(firstFragment == null)
        {
            mFragments[FIRST] = JumpFirstFragment.newInstance();
            mFragments[SECOND] = JumpSecondFragment.newInstance();
            mFragments[THIRD] = JumpThirdFragment.newInstance();
            loadMultipleRootFragment(R.id.fragment_container,FIRST,mFragments[FIRST],mFragments[SECOND],mFragments[THIRD]);
        }
        else
        {
            mFragments[FIRST] = firstFragment;
            mFragments[SECOND] = findFragment(JumpSecondFragment.class);
            mFragments[THIRD] = findFragment(JumpThirdFragment.class);
        }
    }

    @Override
    public void onBackPressedSupport() {
        super.onBackPressedSupport();
    }

    @Override
    public FragmentAnimator onCreateFragmentAnimator() {
        return new DefaultHorizontalAnimator();
    }
}
