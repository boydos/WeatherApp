package com.ds.weatherapp;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;

import com.ds.weatherapp.fragment.MenuLeftFragment;
import com.ds.weatherapp.fragment.MenuRightFragment;
import com.ds.weatherapp.fragment.TestFragment;
import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import com.jeremyfeinstein.slidingmenu.lib.app.SlidingFragmentActivity;

public class MainActivity extends SlidingFragmentActivity {
	private ViewPager mViewPager;
	private FragmentPagerAdapter mAdapter;
	private List<Fragment> mFragments = new ArrayList<Fragment>();
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.main);
		initSlidingMenu();
		initViewPager();
	}
	
	private void initViewPager() {
		mViewPager = (ViewPager)findViewById(R.id.pageviewer);
		mFragments.add(new TestFragment("this is first fragment"));
		mFragments.add(new TestFragment("this is second fragment"));
		mFragments.add(new TestFragment("this is third fargment"));
		
		mAdapter = new FragmentPagerAdapter(getSupportFragmentManager()) {
			
			@Override
			public int getCount() {
				// TODO Auto-generated method stub
				return mFragments.size();
			}
			
			@Override
			public Fragment getItem(int positon) {
				// TODO Auto-generated method stub
				return mFragments.get(positon);
			}
		};
		mViewPager.setAdapter(mAdapter);
	}
	
	private void initSlidingMenu() {
		Fragment leftMenu = new MenuLeftFragment();
		setBehindContentView(R.layout.leftmenu_frame);
		replaceFrame(R.id.leftmenu_frame, leftMenu);
		
		SlidingMenu menu = getSlidingMenu();
		menu.setMode(SlidingMenu.LEFT_RIGHT);
		
		menu.setTouchModeAbove(SlidingMenu.TOUCHMODE_MARGIN);
		menu.setShadowWidthRes(R.dimen.shadow_with);
		menu.setShadowDrawable(R.drawable.shadow);
		menu.setBehindOffsetRes(R.dimen.slidingmenu_offset);
		menu.setFadeDegree(0.35f);
		menu.setSecondaryShadowDrawable(R.drawable.shadow);
		menu.setSecondaryMenu(R.layout.rightmenu_frame);
		
		Fragment rightMenu = new MenuRightFragment();
		replaceFrame(R.id.rightmenu_frame, rightMenu);
		
	}
	private void showLeftMenu() {
		getSlidingMenu().showMenu();
	}
	
	private void showRightMenu() {
		getSlidingMenu().showSecondaryMenu();
	}
	private void replaceFrame(int resId,Fragment frame) {
		getSupportFragmentManager().beginTransaction().replace(resId, frame).commit();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
