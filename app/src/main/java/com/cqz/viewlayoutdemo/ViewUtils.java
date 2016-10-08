package com.cqz.viewlayoutdemo;

import android.view.MotionEvent;

/**
 * Created by chenqz on 2016/10/8.
 */
public class ViewUtils {
    public static String getAction(int action){
        switch (action){
            case MotionEvent.ACTION_DOWN:
                return "ACTION_DOWN";
            case MotionEvent.ACTION_MOVE:
                return "ACTION_MOVE";
            case MotionEvent.ACTION_UP:
                return "ACTION_UP";
            default:
                return "";
        }
    }
}
