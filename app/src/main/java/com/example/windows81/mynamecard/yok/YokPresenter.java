package com.example.windows81.mynamecard.yok;

import android.app.Activity;
import android.content.Intent;

import com.example.windows81.mynamecard.kim.KimActivity;

public class YokPresenter {

    private Activity activity;

    public YokPresenter(Activity activity){
        this.activity = activity;
    }

    public void navigateToKimActivity(){
        Intent i = new Intent(activity , KimActivity.class);
        activity.startActivity(i);
    }

}
