package com.ds.weatherapp.view;

import com.ds.weatherapp.bean.Weather;

public interface IWeatherView {
	void showLoading();
	void hideLoading();
	void showError();
	void setWeatherInfo(Weather weather);
}
