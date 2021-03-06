package com.ds.weatherapp.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public abstract class BaseFragment  extends Fragment{
	private View mView;
	@Override
	public View onCreateView(LayoutInflater inflater,
			@Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		if(mView ==null) {
			initView(inflater, container);
		}
		return mView;
	}
	public void setBaseView(View view) {
		this.mView = view;
	}
	public View getBaseView() {
		return mView;
	}
	public Context getBaseContext() {
		return this.getActivity().getBaseContext();
	}
	
	@Override
	public void onDestroyView() {
		// TODO Auto-generated method stub
		super.onDestroyView();
		if(mView!=null) {
			((ViewGroup)mView.getParent()).removeView(mView);
		}
	}
	protected abstract void initView(LayoutInflater inflater,ViewGroup container);
}
