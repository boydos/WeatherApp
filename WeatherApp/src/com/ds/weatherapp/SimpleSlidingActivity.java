package com.ds.weatherapp;

import android.os.Bundle;

import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import com.jeremyfeinstein.slidingmenu.lib.app.SlidingActivity;

public class SimpleSlidingActivity extends SlidingActivity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		setBehindContentView(R.layout.leftmenu);
		SlidingMenu menu = getSlidingMenu();
		
		menu.setMode(SlidingMenu.LEFT);
		menu.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);
		menu.setShadowWidth(R.dimen.shadow_with);
		menu.setShadowDrawable(R.drawable.shadow);

		menu.setBehindOffsetRes(R.dimen.slidingmenu_offset);
		menu.setFadeDegree(0.35f);
		
		/*	menu.attachToActivity(this, SlidingMenu.SLIDING_CONTENT);
		
		menu.setMenu(R.layout.leftmenu);*/
		
	}
}
