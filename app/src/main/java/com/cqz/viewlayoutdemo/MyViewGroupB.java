package com.cqz.viewlayoutdemo;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;

/**
 * Created by chenqz on 2016/10/8.
 */
public class MyViewGroupB extends LinearLayout {
    public MyViewGroupB(Context context) {
        super(context);
    }

    public MyViewGroupB(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.d("cqz","ViewGroupB dispatchTouchEvent "+ViewUtils.getAction(ev.getAction()));
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.d("cqz","ViewGroupB onInterceptTouchEvent "+ViewUtils.getAction(ev.getAction()));
        return super.onInterceptTouchEvent(ev);
//        return true;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d("cqz","ViewGroupB onTouchEvent "+ViewUtils.getAction(event.getAction()));
        return super.onTouchEvent(event);
//    return true;
    }
}
