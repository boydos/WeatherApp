package com.ds.weatherapp.fragment;

import com.ds.weatherapp.R;
import com.ds.weatherapp.bean.Weather;
import com.ds.weatherapp.control.IWeatherControl;
import com.ds.weatherapp.control.WeatherControlImpl;
import com.ds.weatherapp.view.IWeatherView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.webkit.WebView.FindListener;

public class WeatherFragment extends BaseFragment implements IWeatherView,OnClickListener{
	private IWeatherControl weatherControl;
	@Override
	protected void initView(LayoutInflater inflater, ViewGroup container) {
		// TODO Auto-generated method stub
		setBaseView(inflater.inflate(R.layout.leftmenu, container,false));
		weatherControl = new WeatherControlImpl(this);
	}

	@Override
	public void showLoading() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hideLoading() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showError() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setWeatherInfo(Weather weather) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}

}
