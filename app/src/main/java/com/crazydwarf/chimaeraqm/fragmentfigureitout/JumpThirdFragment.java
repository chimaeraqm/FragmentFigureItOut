package com.crazydwarf.chimaeraqm.fragmentfigureitout;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import me.yokeyword.fragmentation.SupportFragment;

public class JumpThirdFragment extends SupportFragment
{
    public static JumpThirdFragment newInstance()
    {
        Bundle args = new Bundle();

        JumpThirdFragment fragment = new JumpThirdFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("&&&&JumpThirdFragment","&&&&JumpThirdFragment_onCreate");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_jump_third,container,false);
        Log.d("&&&&JumpThirdFragment","&&&&JumpThirdFragment_onCreateView");
        return view;
    }
}
