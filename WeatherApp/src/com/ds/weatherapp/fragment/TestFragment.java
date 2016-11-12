package com.ds.weatherapp.fragment;

import com.ds.weatherapp.R;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

public class TestFragment extends BaseFragment{
	private String content ="default";
	public TestFragment(String content) {
		this.content = content;
	}
	@Override
	protected void initView(LayoutInflater inflater, ViewGroup container) {
		setBaseView(inflater.inflate(R.layout.test, container,false));
		TextView test = (TextView)getBaseView().findViewById(R.id.test);
		test.setText(content);
	}

}
