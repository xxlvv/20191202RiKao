package com.baw.zhaozhipeng;

/**
 * Copyright (C)
 * <p>
 * FileName: Contract
 * <p>
 * Author: zhaozhipeng
 * <p>
 * Date: 2019/12/2 8:45
 */
public interface Contract {
    interface ModelInter {
        void doGET(String url, ModelShared modelShared);
    }

    interface ModelShared {
        void Success(String josn);

        void Filed(String error);
    }

    interface IPresenter {
        void GETsatrt(String url);
    }

    interface IView {
        void Success(String josn);

        void Filed(String error);
    }
}
