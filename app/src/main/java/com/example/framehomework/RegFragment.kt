package com.example.framehomework

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.framehomework.databinding.FragmentRegBinding


private const val ARG_PARAM1 = "param1"

class RegFragment : Fragment() {
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
        val binding = FragmentRegBinding.inflate(inflater, container, false)

        binding.ok.setOnClickListener {
            val name = binding.et.text.toString()
            parentFragmentManager.beginTransaction()
                .replace(R.id.container, FinishFragment.newInstance(name))
                .commit()
        }

            return binding.root

    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String) =
            RegFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)

                }
            }
    }
}