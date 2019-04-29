package com.crazydwarf.chimaeraqm.fragmentfigureitout;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import me.yokeyword.fragmentation.SupportFragment;

public class JumpFirstFragment extends SupportFragment
{
    static public String TAG = "JUMP_FIRST_FRAGMENT";


    public static JumpFirstFragment newInstance()
    {
        Bundle args = new Bundle();

        JumpFirstFragment fragment = new JumpFirstFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d("&&&&JumpFirstFragment","&&&&JumpFirstFragment_onAttach");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("&&&&JumpFirstFragment","&&&&JumpFirstFragment_onCreate");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_jump_first,container,false);
        Log.d("&&&&JumpFirstFragment","&&&&JumpFirstFragment_onCreateView");
        Button bn_tosecond = view.findViewById(R.id.button);
        bn_tosecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                start(JumpSecondFragment.newInstance());
            }
        });
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.d("&&&&JumpFirstFragment","&&&&JumpFirstFragment_onViewCreated");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("&&&&JumpFirstFragment","&&&&JumpFirstFragment_onActivityCreated");
    }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        Log.d("&&&&JumpFirstFragment","&&&&JumpFirstFragment_onViewStateRestored");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("&&&&JumpFirstFragment","&&&&JumpFirstFragment_onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("&&&&JumpFirstFragment","&&&&JumpFirstFragment_onResume");
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        Log.d("&&&&JumpFirstFragment","&&&&JumpFirstFragment_onCreateOptionsMenu");
    }

    @Override
    public void onPrepareOptionsMenu(Menu menu) {
        super.onPrepareOptionsMenu(menu);
        Log.d("&&&&JumpFirstFragment","&&&&JumpFirstFragment_onPrepareOptionsMenu");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("&&&&JumpFirstFragment","&&&&JumpFirstFragment_onPause");
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d("&&&&JumpFirstFragment","&&&&JumpFirstFragment_onSaveInstanceState");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("&&&&JumpFirstFragment","&&&&JumpFirstFragment_onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("&&&&JumpFirstFragment","&&&&JumpFirstFragment_onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("&&&&JumpFirstFragment","&&&&JumpFirstFragment_onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("&&&&JumpFirstFragment","&&&&JumpFirstFragment_onDetach");
    }

}
