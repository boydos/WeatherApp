package com.ds.weatherapp.adapter;

import java.util.ArrayList;
import java.util.List;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;

public class MyFragmentPagerAdapter extends FragmentStatePagerAdapter {
	private List<Fragment> mFragments = new ArrayList<Fragment>();
	public MyFragmentPagerAdapter(FragmentManager fm,List<Fragment> fragments) {
		super(fm);
		// TODO Auto-generated constructor stub
		setFragments(fragments);
	}
	public void setFragments(List<Fragment> fragments) {
		if(fragments!=null&& fragments.size()>0) {
			mFragments=fragments;
		}
	}

	@Override
	public Fragment getItem(int position) {
		// TODO Auto-generated method stub
		return mFragments.get(position);
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return mFragments.size();
	}
	@Override
	public int getItemPosition(Object object) {
		// TODO Auto-generated method stub
		return PagerAdapter.POSITION_NONE;
	}
	
	
}
