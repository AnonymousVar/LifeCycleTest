package com.example.lifecycletest

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.lifecycletest.databinding.FragmentFirstBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
        Log.i("Avatar","First Fragment onCreateView")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i("Avatar","First Fragment onViewCreated")
        binding.buttonFirst.setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
        Log.i("Avatar","First Fragment onDestroyView")
    }

    override fun onStart() {
        super.onStart()
        Log.i("Avatar","First Fragment onStart Called")
    }
    override fun onResume() {
        super.onResume()
        Log.i("Avatar","First Fragment onResume Called")
    }

    override fun onPause() {
        super.onPause()
        Log.i("Avatar","First Fragment onPause Called")
    }

    override fun onStop() {
        super.onStop()
        Log.i("Avatar","First Fragment onStop Called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("Avatar","First Fragment onDestroy Called")
    }

}