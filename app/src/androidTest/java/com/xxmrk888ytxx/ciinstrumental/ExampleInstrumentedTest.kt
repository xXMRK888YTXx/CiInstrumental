package com.xxmrk888ytxx.ciinstrumental

import android.content.Intent
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Assert

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.xxmrk888ytxx.ciinstrumental", appContext.packageName)
    }

    @Test
    fun isNot29SDK() {
        if(Build.VERSION.SDK_INT != 29) {
            Assert.fail()
        }
    }
}