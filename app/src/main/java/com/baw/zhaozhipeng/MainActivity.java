package com.baw.zhaozhipeng;


import android.widget.ListView;
import android.widget.TextView;

import com.baw.zhaozhipeng.base.BaseActivity;
import com.baw.zhaozhipeng.base.BasePresenter;
import com.baw.zhaozhipeng.model.Presenter;

public class MainActivity extends BaseActivity {

    private String url = "http://172.17.8.100/small/commodity/v1/bannerShow";

    @Override
    protected void startCoding() {
        mPresenter.GETsatrt(url);
    }

    private TextView text;

    @Override
    protected void initView() {

        text = findViewById(R.id.text);

    }

    @Override
    protected BasePresenter initPresenter() {
        return new Presenter();
    }

    @Override
    protected int Layout() {
        return R.layout.activity_main;
    }

    @Override
    public void Success(String josn) {
        text.setText(josn);
    }

    @Override
    public void Filed(String error) {

    }
}
