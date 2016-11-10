package com.ds.weatherapp.fragment;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.ds.weatherapp.R;

public class MenuRightFragment extends BaseFragment{

	protected void initView(LayoutInflater inflater,ViewGroup container){
		setBaseView(inflater.inflate(R.layout.rightmenu, container,false));
	}

}
