package com.example.xiaohan.mvpmobile.base;

import com.example.xiaohan.mvpmobile.base.MyApplication;

/**
 * Created by xiaohan on 2018/9/26.
 */

public class DensityUtil {


    /**
     *工具类构造器私有
     */
    private DensityUtil(){}

    /**
     * dp转px
     * @param dpValue
     * @return
     */
    public static int dipToPx(float dpValue){
        float scale = MyApplication.getContext().getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }

    /**
     * px转dp
     * @param pxValue
     * @return
     */
    public static int pxToDp(float pxValue){
        float scale = MyApplication.getContext().getResources().getDisplayMetrics().density;
        return (int) (pxValue / scale + 0.5f);
    }

}
