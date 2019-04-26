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

public class JumpSecondFragment extends Fragment
{
    static public String TAG = "JUMP_SECOND_FRAGMENT";

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d("&&&&JumpSecondFragment","&&&&JumpSecondFragment_onAttach");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("&&&&JumpSecondFragment","&&&&JumpSecondFragment_onCreate");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_jump_second,container,false);
        Log.d("&&&&JumpSecondFragment","&&&&JumpSecondFragment_onCreateView");
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.d("&&&&JumpSecondFragment","&&&&JumpSecondFragment_onViewCreated");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("&&&&JumpSecondFragment","&&&&JumpSecondFragment_onActivityCreated");
    }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        Log.d("&&&&JumpSecondFragment","&&&&JumpSecondFragment_onViewStateRestored");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("&&&&JumpSecondFragment","&&&&JumpSecondFragment_onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("&&&&JumpSecondFragment","&&&&JumpSecondFragment_onResume");
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        Log.d("&&&&JumpSecondFragment","&&&&JumpSecondFragment_onCreateOptionsMenu");
    }

    @Override
    public void onPrepareOptionsMenu(Menu menu) {
        super.onPrepareOptionsMenu(menu);
        Log.d("&&&&JumpSecondFragment","&&&&JumpSecondFragment_onPrepareOptionsMenu");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("&&&&JumpSecondFragment","&&&&JumpSecondFragment_onPause");
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d("&&&&JumpSecondFragment","&&&&JumpSecondFragment_onSaveInstanceState");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("&&&&JumpSecondFragment","&&&&JumpSecondFragment_onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("&&&&JumpSecondFragment","&&&&JumpSecondFragment_onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("&&&&JumpSecondFragment","&&&&JumpSecondFragment_onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("&&&&JumpSecondFragment","&&&&JumpSecondFragment_onDetach");
    }

}
