package com.example.sandi.bahasacoba;

import android.app.Application;
import android.content.Context;

import com.example.sandi.bahasacoba.Helper.LocaleHelper;

/**
 * Created by Sandi on 12/24/2018.
 */

public class MainAplication extends Application {

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(LocaleHelper.OnAttach(base,"en"));
    }
}
