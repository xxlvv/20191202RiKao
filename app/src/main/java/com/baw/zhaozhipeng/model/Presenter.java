package com.baw.zhaozhipeng.model;

import com.baw.zhaozhipeng.Contract;
import com.baw.zhaozhipeng.base.BasePresenter;

/**
 * Copyright (C)
 * <p>
 * FileName: Presenter
 * <p>
 * Author: zhaozhipeng
 * <p>
 * Date: 2019/12/2 8:49
 */
public class Presenter extends BasePresenter {

    private Model model;

    @Override
    protected void initModel() {
        model = new Model();
    }

    @Override
    public void GETsatrt(String url) {
        model.doGET(url, new Contract.ModelShared() {
            @Override
            public void Success(String josn) {
                getView().Success(josn);
            }

            @Override
            public void Filed(String error) {
                getView().Filed(error);
            }
        });
    }
}
