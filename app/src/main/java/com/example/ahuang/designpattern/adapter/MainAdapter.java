package com.example.ahuang.designpattern.adapter;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.ahuang.designpattern.R;

import java.util.List;

/*
 * MainAdapter  2018-12-03
 * Copyright (c) 2018 HYB Co.Ltd. All right reserved.
 *
 */
/*
 * class description here
 * @author Jackson
 * @version 1.0.0
 * since 2018 12 03
 */
public class MainAdapter extends BaseQuickAdapter<String,BaseViewHolder> {

    public MainAdapter(int layoutResId, @Nullable List<String> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, String item) {
        helper.setText(R.id.tv_show,item);
    }
}