package com.ds.weatherapp.control;

import com.ds.weatherapp.bean.Weather;

public interface OnWeatherListener {
	void OnSuccess(Weather weather);
	void OnError();
}
