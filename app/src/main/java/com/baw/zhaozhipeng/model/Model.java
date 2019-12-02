package com.baw.zhaozhipeng.model;

import com.baw.zhaozhipeng.Contract;
import com.baw.zhaozhipeng.NetUtil;

/**
 * Copyright (C)
 * <p>
 * FileName: Model
 * <p>
 * Author: zhaozhipeng
 * <p>
 * Date: 2019/12/2 8:47
 */
public class Model implements Contract.ModelInter {
    @Override
    public void doGET(String url, final Contract.ModelShared modelShared) {
        NetUtil.getInstance().doGET(url, new NetUtil.Shared() {
            @Override
            public void Success(String josn) {
                modelShared.Success(josn);
            }

            @Override
            public void Filed(String error) {
                modelShared.Filed(error);
            }
        });
    }
}
