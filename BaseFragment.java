package com.example.xiaohan.mvpmobile.base;

import android.app.Fragment;

/**
 * mvp设计模式下的BaseFragment
 * Created by xiaohan on 2018/9/26.
 */

public class BaseFragment  extends Fragment implements IMVPBaseView{


    @Override
    public void showLoading(String msg) {
        if (getActivity() != null)
            ((MVPBaseActivity) getContext()).showLoading(msg);
    }

    /**
     * 隐藏加载进度条
     */
    @Override
    public void hideLoading() {
        if (getActivity() != null)
            ((MVPBaseActivity) getContext()).hideLoading();
    }

    /**
     * 弹出信息
     * @param msg
     */
    @Override
    public void showToast(String msg) {
        if (getActivity() != null)
            ((MVPBaseActivity) getContext()).showToast(msg);
    }

    /**
     * activity是否被销毁
     * @return
     */
    protected boolean isAttachedContext(){
        return getActivity() != null;
    }

}
