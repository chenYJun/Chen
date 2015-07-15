package com.chen.weixin6_0_tab;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.chen.R;

public class TabFragment extends Fragment
{
	private String mTitle = "Default";

	public static final String TITLE = "title";

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState)
	{
		if (getArguments() != null)
		{
			mTitle = getArguments().getString(TITLE);
		}
		if ("First Fragment !".equals(mTitle)) {
			View vx1 = new View(getActivity());
			return null;
		} else {
			TextView tv = new TextView(getActivity());
			Log.d("viewPosition", "inflater----->" + inflater + ";container---->" + container + ";saveInstanceState---->" + savedInstanceState);
			tv.setTextSize(20);
			tv.setBackgroundColor(Color.parseColor("#ffffffff"));
			tv.setText(mTitle);
			tv.setGravity(Gravity.CENTER);
			return tv;
		}

	}
}
