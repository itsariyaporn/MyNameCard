package com.example.windows81.mynamecard.kim;


import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

import com.example.windows81.mynamecard.R;
import com.example.windows81.mynamecard.databinding.KimActBindingImpl;

public class KimActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        KimActBindingImpl binding = DataBindingUtil.setContentView(  this,R.layout.kim_act);
        KimModel viewModel = new KimModel(
                "Woarakamon Nokkaew",
                "560611024",
                "96/17 M.10 T.suthep Mung ChiangMai 50200",
                "083-7253742",
                "worakamonnk@gmail.com"
        );
        binding.setViewmodel(viewModel);
        binding.setPresenter(new KimPresenter(this));
    }
}
