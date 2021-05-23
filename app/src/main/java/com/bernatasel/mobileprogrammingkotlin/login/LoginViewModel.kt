package com.bernatasel.mobileprogrammingkotlin.login

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.bernatasel.mobileprogrammingkotlin.infra.BaseViewModel
import com.google.android.material.snackbar.BaseTransientBottomBar
import com.google.android.material.snackbar.Snackbar
import school.cactus.succulentshop.login.validation.EmailValidator
import school.cactus.succulentshop.login.validation.PasswordValidator

class LoginViewModel: BaseViewModel() {

    private val emailValidator = EmailValidator()
    private val passwordValidator = PasswordValidator()

    val email = MutableLiveData<String>()
    val password = MutableLiveData<String>()

    private val _emailErrorMessage = MutableLiveData<Int>()
    private val _passwordErrorMessage = MutableLiveData<Int>()

    val emailErrorMessage: LiveData<Int> = _emailErrorMessage
    val passwordErrorMessage: LiveData<Int> = _passwordErrorMessage

    fun onLoginButtonClick() {
        if (isEmailValid() and isPasswordValid()) {
            //TODO: Navigate other fragment
            Log.d("LoginViewModel", "Navigate to login")
        }
    }
    private fun isEmailValid(): Boolean {
        _emailErrorMessage.value = emailValidator.validate(email.value)
        return _emailErrorMessage.value == null
    }

    private fun isPasswordValid(): Boolean {
        _passwordErrorMessage.value = passwordValidator.validate(password.value)
        return _passwordErrorMessage.value == null
    }
}