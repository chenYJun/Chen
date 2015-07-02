package com.chen;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;

public class pagerAdapter extends PagerAdapter {

	private ArrayList<View> views;
	
	public pagerAdapter(ArrayList<View> views){
		
		this.views = views;

	}
	@Override
	public int getCount() {
		return this.views.size();
	}

	@Override
	public boolean isViewFromObject(View arg0, Object arg1) {
		return arg0 == arg1;
	}
	
	public void destroyItem(View container, int position, Object object) {

		((ViewPager)container).removeView(views.get(position));
	}
	
	//ҳ��view
	public Object instantiateItem(View container, int position) {
		((ViewPager)container).addView(views.get(position));
		if (position == 3) {
			Log.d("positionTag", String.valueOf(position)+"+++++++++++++++++++++++++++++++++++");
		}
		return views.get(position);
	}

}
