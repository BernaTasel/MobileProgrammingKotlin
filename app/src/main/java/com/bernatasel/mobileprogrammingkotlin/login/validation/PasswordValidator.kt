package school.cactus.succulentshop.login.validation

import com.bernatasel.mobileprogrammingkotlin.R
import com.bernatasel.mobileprogrammingkotlin.login.validation.Validator


class PasswordValidator : Validator {
    override fun validate(field: String?) = when {
        field.isNullOrBlank() -> R.string.password_is_required
        field.isEmpty() -> R.string.password_is_required
        else -> null
    }
}