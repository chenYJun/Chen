package com.chen.weixin6_0_tab;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by chen on 15-7-9.
 */
public class VxPager_1 extends View{
    public VxPager_1(Context context) {
        super(context);
    }

    public VxPager_1(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public VxPager_1(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public VxPager_1(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }
}
