package com.waleska404.myfragment.demonstration

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.ui.platform.ComposeView
import com.waleska404.ui.theme.AndroidLifecycleTheme


class Dem2Fragment : Fragment() {

    private val TAG = "MYTAG - Fragment2"

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        Log.d(TAG, "onCreateView")
        // Inflate the layout for this fragment
        return ComposeView(requireContext()).apply {
            setContent {
                AndroidLifecycleTheme {
                    Dem2FragmentScreen(
                        closeFragments = { closeFragments() }
                    )
                }
            }
        }
    }

    private fun closeFragments() {
        Log.d("MYTAG", "closeFragments executed")
        requireActivity().supportFragmentManager.beginTransaction().remove(this).commit()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d(TAG, "onViewCreated")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(TAG, "onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy")
    }
}