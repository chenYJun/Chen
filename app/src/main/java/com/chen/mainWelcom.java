package com.chen;

/**
 * Created by yingjun on 2015/6/30.
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

import com.chen.TabMenu.MainTabActivity;

import java.util.ArrayList;
import java.util.logging.Handler;


public class mainWelcom extends Activity {

    //翻页控件
    private ViewPager mViewPager;
    private ImageView mPage0;
    private ImageView mPage1;
    private ImageView mPage2;
    private ImageView mPage3;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        //去掉标题栏全屏显示
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.main);
        mViewPager = (ViewPager)findViewById(R.id.whatsnew_viewpager);


        mViewPager.setOnPageChangeListener(new MyOnPageChangeListener());
        mPage0 = (ImageView)findViewById(R.id.page0);
        mPage1 = (ImageView)findViewById(R.id.page1);
        mPage2 = (ImageView)findViewById(R.id.page2);
        mPage3 = (ImageView)findViewById(R.id.page3);

      /*
       * 这里是每一页要显示的布局，根据应用需要和特点自由设计显示的内容
       * 以及需要显示多少页等
       */
        LayoutInflater mLi = LayoutInflater.from(this);
        View view1 = mLi.inflate(R.layout.whats_news_gallery1, null);
        View view2 = mLi.inflate(R.layout.whats_news_gallery2, null);
        View view3 = mLi.inflate(R.layout.whats_news_gallery3, null);
        View view4 = mLi.inflate(R.layout.whats_news_gallery4, null);
      	/*
      	 * 这里将每一页显示的view存放到ArrayList集合中
      	 * 可以在ViewPager适配器中顺序调用展示
      	 */
        final ArrayList<View> views = new ArrayList<View>();
        views.add(view1);
        views.add(view2);
        views.add(view3);
        views.add(view4);

        //填充ViewPager的数据适配器
        pagerAdapter mPagerAdapter = new pagerAdapter(views);
        mViewPager.setAdapter(mPagerAdapter);


    }


    public class MyOnPageChangeListener implements OnPageChangeListener {


        public void onPageSelected(int page) {

            //翻页时当前page,改变当前状态园点图片
            switch (page) {
                case 0:
                    mPage0.setImageDrawable(getResources().getDrawable(R.drawable.page_now));
                    mPage1.setImageDrawable(getResources().getDrawable(R.drawable.page));
                    break;
                case 1:
                    mPage1.setImageDrawable(getResources().getDrawable(R.drawable.page_now));
                    mPage0.setImageDrawable(getResources().getDrawable(R.drawable.page));
                    mPage2.setImageDrawable(getResources().getDrawable(R.drawable.page));
                    break;
                case 2:
                    mPage2.setImageDrawable(getResources().getDrawable(R.drawable.page_now));
                    mPage1.setImageDrawable(getResources().getDrawable(R.drawable.page));
                    mPage3.setImageDrawable(getResources().getDrawable(R.drawable.page));
                    break;
                case 3:
                    mPage3.setImageDrawable(getResources().getDrawable(R.drawable.page_now));
                    mPage2.setImageDrawable(getResources().getDrawable(R.drawable.page));
                    Button bt = (Button) findViewById(R.id.what_news_start_button);

                    bt.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            new MainTabActivity();
                            Intent mainInten = new Intent();
                            mainInten.setClass(getApplicationContext(), MainTabActivity.class);
                            startActivity(mainInten);
                            //setContentView(R.layout.maintabs);
                        }
                    });
                    break;
            }
        }

        public void onPageScrolled(int arg0, float arg1, int arg2) {
        }


        public void onPageScrollStateChanged(int arg0) {
        }
    }
}
