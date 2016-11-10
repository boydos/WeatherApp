package com.ds.weatherapp.fragment;

import java.util.Arrays;
import java.util.List;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.ds.weatherapp.R;

public class MenuLeftFragment extends BaseFragment {
	private ListView mListView;
	private ListAdapter mAdapter;
	private List<String> mDatas= Arrays.asList("天气预报","快递查询","税收计算","闹钟定时","设置");
	
	protected void initView(LayoutInflater inflater,ViewGroup container) {
		setBaseView(inflater.inflate(R.layout.leftmenu, container,false));
		mListView = (ListView)getBaseView().findViewById(R.id.leftlist);
		mAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1,mDatas);
		mListView.setAdapter(mAdapter);
	}
}
