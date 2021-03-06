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

public class SecondFragment extends Fragment
{
    static public String TAG = "SECOND_FRAGMENT";

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d("&&&&SecondFragment","&&&&SecondFragment_onAttach");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("&&&&SecondFragment","&&&&SecondFragment_onCreate");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_second,container,false);
        Log.d("&&&&SecondFragment","&&&&SecondFragment_onCreateView");
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.d("&&&&SecondFragment","&&&&SecondFragment_onViewCreated");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("&&&&SecondFragment","&&&&SecondFragment_onActivityCreated");
    }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        Log.d("&&&&SecondFragment","&&&&SecondFragment_onViewStateRestored");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("&&&&SecondFragment","&&&&SecondFragment_onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("&&&&SecondFragment","&&&&SecondFragment_onResume");
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        Log.d("&&&&SecondFragment","&&&&SecondFragment_onCreateOptionsMenu");
    }

    @Override
    public void onPrepareOptionsMenu(Menu menu) {
        super.onPrepareOptionsMenu(menu);
        Log.d("&&&&SecondFragment","&&&&SecondFragment_onPrepareOptionsMenu");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("&&&&SecondFragment","&&&&SecondFragment_onPause");
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d("&&&&SecondFragment","&&&&SecondFragment_onSaveInstanceState");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("&&&&SecondFragment","&&&&SecondFragment_onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("&&&&SecondFragment","&&&&SecondFragment_onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("&&&&SecondFragment","&&&&SecondFragment_onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("&&&&SecondFragment","&&&&SecondFragment_onDetach");
    }

}
