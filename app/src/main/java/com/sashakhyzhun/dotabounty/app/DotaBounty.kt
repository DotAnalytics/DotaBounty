package com.sashakhyzhun.dotabounty.app

import com.crashlytics.android.Crashlytics;
import io.fabric.sdk.android.Fabric;
import android.app.Application
import com.sashakhyzhun.dotabounty.util.ThreadAwareTree
import io.fabric.sdk.android.BuildConfig
import timber.log.Timber

class DotaBounty : Application() {

    override fun onCreate() {
        super.onCreate()

        //Fabric.with(this, Crashlytics())

        if (BuildConfig.DEBUG) {
            Timber.plant(ThreadAwareTree)
        }
    }

}