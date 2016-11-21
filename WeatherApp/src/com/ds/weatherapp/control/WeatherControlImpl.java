package com.ds.weatherapp.control;

import com.ds.weatherapp.bean.IWeatherModel;
import com.ds.weatherapp.bean.Weather;
import com.ds.weatherapp.bean.WeatherModelImpl;
import com.ds.weatherapp.view.IWeatherView;

public class WeatherControlImpl implements IWeatherControl,OnWeatherListener {
	private IWeatherView weatherView;
	private IWeatherModel weatherModel;
	public WeatherControlImpl(IWeatherView weatherView) {
		this.weatherView = weatherView;
		this.weatherModel = new WeatherModelImpl();
		
	}
	@Override
	public void OnSuccess(Weather weather) {
		// TODO Auto-generated method stub
		weatherView.hideLoading();
		weatherView.setWeatherInfo(weather);
	}

	@Override
	public void OnError() {
		// TODO Auto-generated method stub
		weatherView.hideLoading();
		weatherView.showError();
	}

	@Override
	public void getWeather(String cityNo) {
		// TODO Auto-generated method stub
		weatherView.showLoading();
		weatherModel.loadWeather(cityNo, this);
	}

}
