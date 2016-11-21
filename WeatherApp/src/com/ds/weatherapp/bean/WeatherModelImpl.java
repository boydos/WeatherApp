package com.ds.weatherapp.bean;

import java.net.URLEncoder;
import java.util.Collections;
import java.util.Map;

import org.apache.http.util.EncodingUtils;

import com.ds.utils.EncodeUtils;
import com.ds.utils.NetWorkUtils;
import com.ds.utils.StringUtils;
import com.ds.weatherapp.control.OnWeatherListener;
import com.ds.weatherapp.utils.IContants;

public class WeatherModelImpl implements IWeatherModel,IContants {

	@Override
	public void loadWeather(String cityNo, OnWeatherListener listener) {
		// TODO Auto-generated method stub
		Map<String,String> params=Collections.emptyMap();
		params.put("cityname", EncodeUtils.urlEncoder(cityNo, "UTF-8"));
		params.put("key", REQUEST_WEATHER_KEY);
		String result=NetWorkUtils.postByHttpURL(REQUEST_WEATHER_URL, params);
		if(StringUtils.isEmpty(result)) {
			listener.OnError();
		} else {
			listener.OnSuccess(new Weather(result));
		}
	}

}
