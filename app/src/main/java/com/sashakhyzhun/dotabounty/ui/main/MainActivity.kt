package com.sashakhyzhun.dotabounty.ui.main

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.sashakhyzhun.dotabounty.R
import com.sashakhyzhun.dotabounty.di.component.DaggerActivityComponent
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var mText: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        DaggerActivityComponent.create().inject(this)

        textView.text = "Injected '$mText'"
    }


}
