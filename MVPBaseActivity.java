package com.example.xiaohan.mvpmobile.base;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.Toast;

/**
 * Created by xiaohan on 2018/9/25.
 */

public class MVPBaseActivity extends BaseActivity implements IMVPBaseView {


    private ProgressDialog appProgressBar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        appProgressBar = new ProgressDialog(MVPBaseActivity.this);
        appProgressBar.setCancelable(false);//不可以取消
        appProgressBar.setMessage("loading");
    }

    /**
     * 展示加载进度
     *
     * @param msg
     */
    @Override
    public void showLoading(String msg) {
        if (!appProgressBar.isShowing()) {
            appProgressBar.setMessage(msg);//设置信息
            appProgressBar.show();
        }
    }

    /**
     * 隐藏加载进度
     */
    @Override
    public void hideLoading() {
        if (appProgressBar.isShowing()) {
            appProgressBar.dismiss();
        }
    }

    @Override
    public void showToast(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    public Context getContext() {
        return MVPBaseActivity.this;
    }

}
