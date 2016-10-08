package com.cqz.viewlayoutdemo;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by chenqz on 2016/10/8.
 */
public class MyView extends View {
    public MyView(Context context) {
        super(context);
    }

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        Log.d("cqz","View dispatchTouchEvent "+ViewUtils.getAction(event.getAction()));
        return super.dispatchTouchEvent(event);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d("cqz","View onTouchEvent "+ViewUtils.getAction(event.getAction()));
        return super.onTouchEvent(event);
//     return true;
    }
}
