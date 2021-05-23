package com.bernatasel.mobileprogrammingkotlin.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import com.bernatasel.mobileprogrammingkotlin.R
import com.bernatasel.mobileprogrammingkotlin.databinding.FragmentLoginBinding
import com.bernatasel.mobileprogrammingkotlin.infra.BaseFragment

class LoginFragment: BaseFragment() {

    private var _binding: FragmentLoginBinding? = null

    private val binding get() = _binding!!

    override val viewModel: LoginViewModel by viewModels{
        LoginViewModelFactory()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        binding.lifecycleOwner = viewLifecycleOwner
        binding.viewModel = viewModel

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        requireActivity().title = getString(R.string.log_in)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}