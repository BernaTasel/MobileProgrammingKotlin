package com.bernatasel.mobileprogrammingkotlin.login

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.bernatasel.mobileprogrammingkotlin.infra.BaseViewModel
import school.cactus.succulentshop.login.validation.EmailValidator
import school.cactus.succulentshop.login.validation.PasswordValidator

class LoginViewModel: BaseViewModel() {

    private val emailValidator = EmailValidator()
    private val passwordValidator = PasswordValidator()

    val email = MutableLiveData<String>()
    val password = MutableLiveData<String>()

    val _emailErrorMessage = MutableLiveData<Int>()
    val _passwordErrorMessage = MutableLiveData<Int>()

    val emailErrorMessage: LiveData<Int> = _emailErrorMessage
    val passwordErrorMessage: LiveData<Int> = _passwordErrorMessage

    fun onLoginButtonClick() {
        if (isIdentifierValid() and isPasswordValid()) {

        }
    }

    private fun isIdentifierValid(): Boolean {
        _emailErrorMessage.value = emailValidator.validate(email.value!!)
        return emailErrorMessage.value == null
    }

    private fun isPasswordValid(): Boolean {
        _passwordErrorMessage.value = passwordValidator.validate(password.value!!)
        return passwordErrorMessage.value == null
    }
}