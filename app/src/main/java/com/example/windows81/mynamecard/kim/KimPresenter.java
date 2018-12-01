package com.example.windows81.mynamecard.kim;

import android.app.Activity;
import android.content.Intent;

public class KimPresenter {

    private Activity activity;

    public KimPresenter(Activity activity){
        this.activity = activity;
    }

    public void finishKimActivity(){
        activity.finish();
    }

}
