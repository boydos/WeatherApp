package com.ds.weatherapp.bean;

import com.ds.json.JsonModel;

public class Weather {
	private JsonModel data=null;
	public Weather(String json) {
		data =new JsonModel(json);
	}
}
