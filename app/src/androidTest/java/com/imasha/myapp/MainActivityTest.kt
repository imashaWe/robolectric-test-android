package com.imasha.myapp

import android.R
import android.view.View
import android.widget.TextView
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner


@RunWith(RobolectricTestRunner::class)
class MainActivityTest {
    val textShouldPresent = "Hello World"
    private lateinit var activity: MainActivity

    @Before
    fun setup() {
        activity = Robolectric.setupActivity(MainActivity::class.java)
    }
    @Test
    fun is_hello_world_text_present() {

        val textView = activity.findViewById(R.id.textview_first) as TextView
        assertTrue("MyRestaurants" == appNameTextView.text.toString())
    }
}
