package com.sashakhyzhun.dotabounty.util

import org.jetbrains.annotations.NotNull
import org.jetbrains.annotations.Nullable
import timber.log.Timber

object ThreadAwareTree : Timber.DebugTree() {

    private const val tagFormat = "[%s] %s"

    override fun createStackElementTag(element: StackTraceElement): String? {
        val tag = super.createStackElementTag(element)
        return String.format(tagFormat, Thread.currentThread().name, tag)
    }

}