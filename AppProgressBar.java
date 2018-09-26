package com.example.xiaohan.mvpmobile.base;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;

import com.example.xiaohan.mvpmobile.R;

/**
 * Created by xiaohan on 2018/9/25.
 */

public class AppProgressBar extends Dialog{

   /* <style name="DialogBackgroundNull" parent="@android:style/Theme.Dialog">
       <item name="android:windowFrame">@null</item> <!--无边框-->
            <item name="android:windowIsFloating">true</item><!--悬浮在父界面之上-->
            <item name="android:windowIsTranslucent">true</item><!--允许呈现半透明状态-->
            <item name="android:windowNoTitle">true</item><!--无标题-->
            <item name="android:windowBackground">@color/trans_color</item> <!--透明背景-->
            <item name="android:backgroundDimEnabled">true</item> <!-- 允许周围模糊 -->
            <item name="android:backgroundDimAmount">0.6</item><!--设置模糊灰度-->
    </style>*/

    private String hintStr;
    private TextView hintText;//提醒文本

    public AppProgressBar(Context context, String hintStr) {
        super(context, R.style.DialogBackgroundNull);
        this.hintStr = hintStr;//提醒文本
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.app_progress);

    /*    Window window = getWindow();
        WindowManager.LayoutParams layoutParams = window.getAttributes();

        window.setLayout(DenityUtil.dipToPx(130),
                WindowManager.LayoutParams.WRAP_CONTENT);

        layoutParams.x = 0;
        layoutParams.y =  - DenityUtil.dipToPx(20);*/

        hintText = findViewById(R.id.hintText);
        hintText.setText(hintStr);
        setCancelable(false);//不能取消

    }


    /**
     * 设置提醒文本
     */
    public void setHintText(String hint){
        hintText.setText(hint);
    }

}
