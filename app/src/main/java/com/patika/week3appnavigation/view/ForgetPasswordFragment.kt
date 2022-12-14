package com.patika.week3appnavigation.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.patika.week3appnavigation.R
import com.patika.week3appnavigation.databinding.FragmentForgetPasswordBinding


class ForgetPasswordFragment : Fragment() {

    private lateinit var fragmentForgetPasswordBinding: FragmentForgetPasswordBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentForgetPasswordBinding = FragmentForgetPasswordBinding.inflate(inflater)
        return fragmentForgetPasswordBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        fragmentForgetPasswordBinding.apply {
            btnSignUp.setOnClickListener {
                findNavController().navigate(R.id.action_forgetPasswordFragment_to_dialogScreen)
            }
        }
    }
}