package com.example.windows81.mynamecard.yok;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.example.windows81.mynamecard.R;
import com.example.windows81.mynamecard.databinding.YokActBindingImpl;

public class YokActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        YokActBindingImpl binding = DataBindingUtil.setContentView(  this,R.layout.yok_act);
        YokModel viewModel = new YokModel(
                "Chayanan  Chaowanapoonpol  570611040",
                "47/1 SOI4 Samamkeelatedsaban Road Chiang Mai 50300",
                "0882695213","it_sariya_pon@hotmail.com","27 October 1995"

        );
        binding.setViewmodel(viewModel);
        binding.setPresenter(new YokPresenter(this));
    }
}
