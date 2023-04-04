package com.example.framehomework

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.framehomework.databinding.FragmentFinishBinding
import com.example.framehomework.databinding.FragmentRegBinding


private const val ARG_PARAM1 = "param1"



class FinishFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentFinishBinding.inflate(inflater, container, false)
        binding.user.text =  param1.toString()

        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String) =
            FinishFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                }
            }
    }
}