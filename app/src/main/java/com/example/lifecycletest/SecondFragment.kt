package com.example.lifecycletest

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.lifecycletest.databinding.FragmentSecondBinding

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class SecondFragment : Fragment() {

    private var _binding: FragmentSecondBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.i("Avatar","Second Fragment onCreateView")

        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i("Avatar","Second Fragment onViewCreated")

        binding.buttonSecond.setOnClickListener {
            findNavController().navigate(R.id.action_SecondFragment_to_FirstFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
        Log.i("Avatar","Second Fragment onDestroyView")

    }

    override fun onStart() {
        super.onStart()
        Log.i("Avatar","Second Fragment onStart Called")
    }
    override fun onResume() {
        super.onResume()
        Log.i("Avatar","Second Fragment onResume Called")
    }

    override fun onPause() {
        super.onPause()
        Log.i("Avatar","Second Fragment onPause Called")
    }

    override fun onStop() {
        super.onStop()
        Log.i("Avatar","Second Fragment onStop Called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("Avatar","Second Fragment onDestroy Called")
    }
}