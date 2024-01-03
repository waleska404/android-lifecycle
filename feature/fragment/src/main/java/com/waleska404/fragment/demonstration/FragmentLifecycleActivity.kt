package com.waleska404.fragment.demonstration

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.waleska404.fragment.R

class FragmentLifecycleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment_lifecycle)
    }
}