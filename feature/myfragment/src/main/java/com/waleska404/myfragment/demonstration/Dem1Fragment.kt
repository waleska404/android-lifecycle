package com.waleska404.myfragment.demonstration

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.ui.platform.ComposeView
import com.waleska404.ui.theme.AndroidLifecycleTheme


class Dem1Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        Log.d("MYTAG", "onCreateView")
        // Inflate the layout for this fragment
        return ComposeView(requireContext()).apply {
            setContent {
                AndroidLifecycleTheme {
                    Dem1FragmentScreen()
                }
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("MYTAG", "onCreate")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("MYTAG", "onViewCreated")
    }

    override fun onStart() {
        super.onStart()
        Log.d("MYTAG", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MYTAG", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MYTAG", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MYTAG", "onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("MYTAG", "onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MYTAG", "onDestroy")
    }

}