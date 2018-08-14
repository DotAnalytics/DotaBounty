package com.sashakhyzhun.dotabounty.di.component

import com.sashakhyzhun.dotabounty.di.module.ActivityModule
import com.sashakhyzhun.dotabounty.ui.main.MainActivity
import dagger.Component

/**
 * @author SashaKhyzhun
 * Created on 8/14/18.
 */
@Component(modules = [ActivityModule::class])
interface ActivityComponent {

    fun inject(mainActivity: MainActivity)

}