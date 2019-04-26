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

public class ThirdFragment extends Fragment
{
    static public String TAG = "THIRD_FRAGMENT";

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d("&&&&ThirdFragment","&&&&ThirdFragment_onAttach");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("&&&&ThirdFragment","&&&&ThirdFragment_onCreate");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_third,container,false);
        Log.d("&&&&ThirdFragment","&&&&ThirdFragment_onCreateView");
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.d("&&&&ThirdFragment","&&&&ThirdFragment_onViewCreated");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("&&&&ThirdFragment","&&&&ThirdFragment_onActivityCreated");
    }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        Log.d("&&&&ThirdFragment","&&&&ThirdFragment_onViewStateRestored");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("&&&&ThirdFragment","&&&&ThirdFragment_onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("&&&&ThirdFragment","&&&&ThirdFragment_onResume");
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        Log.d("&&&&ThirdFragment","&&&&ThirdFragment_onCreateOptionsMenu");
    }

    @Override
    public void onPrepareOptionsMenu(Menu menu) {
        super.onPrepareOptionsMenu(menu);
        Log.d("&&&&ThirdFragment","&&&&ThirdFragment_onPrepareOptionsMenu");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("&&&&ThirdFragment","&&&&ThirdFragment_onPause");
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d("&&&&ThirdFragment","&&&&ThirdFragment_onSaveInstanceState");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("&&&&ThirdFragment","&&&&ThirdFragment_onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("&&&&ThirdFragment","&&&&ThirdFragment_onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("&&&&ThirdFragment","&&&&ThirdFragment_onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("&&&&ThirdFragment","&&&&ThirdFragment_onDetach");
    }

}
