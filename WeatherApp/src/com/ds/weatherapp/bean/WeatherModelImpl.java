package com.ds.weatherapp.bean;

import com.ds.utils.NetWorkUtils;
import com.ds.utils.StringUtils;
import com.ds.weatherapp.control.OnWeatherListener;
import com.ds.weatherapp.utils.IContants;

public class WeatherModelImpl implements IWeatherModel {

	@Override
	public void loadWeather(String cityNo, OnWeatherListener listener) {
		// TODO Auto-generated method stub
		String result=NetWorkUtils.postByHttpURL(IContants.REQUEST_WEATHER_URL, null);
		if(StringUtils.isEmpty(result)) {
			listener.OnError();
		} else {
			listener.OnSuccess(new Weather(result));
		}
	}

}
