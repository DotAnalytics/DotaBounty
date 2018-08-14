package com.sashakhyzhun.dotabounty.di.module

import dagger.Module
import dagger.Provides
import javax.inject.Inject

/**
 * @author SashaKhyzhun
 * Created on 8/14/18.
 */
@Module
class ActivityModule @Inject constructor() {

    @Provides
    fun provideSomething(): String = "Hello, Dagger2"

}