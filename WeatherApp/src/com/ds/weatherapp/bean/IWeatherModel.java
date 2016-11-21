package com.ds.weatherapp.bean;

import com.ds.weatherapp.control.OnWeatherListener;

public interface IWeatherModel {
	void loadWeather(String cityNo,OnWeatherListener listener);
}
