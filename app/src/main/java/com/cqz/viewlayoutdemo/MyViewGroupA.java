package com.cqz.viewlayoutdemo;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/**
 * Created by chenqz on 2016/10/8.
 */
public class MyViewGroupA extends LinearLayout {
    public MyViewGroupA(Context context) {
        this(context,null);
    }

    public MyViewGroupA(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.d("cqz","ViewGroupA dispatchTouchEvent "+ViewUtils.getAction(ev.getAction()));
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.d("cqz","ViewGroupA onInterceptTouchEvent "+ViewUtils.getAction(ev.getAction()));
        return super.onInterceptTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d("cqz","ViewGroupA onTouchEvent "+ ViewUtils.getAction(event.getAction()));
        return super.onTouchEvent(event);
    }
}
