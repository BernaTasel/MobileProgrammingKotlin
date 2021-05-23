package school.cactus.succulentshop.login.validation

import com.bernatasel.mobileprogrammingkotlin.R
import com.bernatasel.mobileprogrammingkotlin.login.validation.Validator


class EmailValidator : Validator {
    override fun validate(field: String?) = when {
        field.isNullOrBlank() -> R.string.email_is_required
        field.isEmpty() -> R.string.email_is_required
        !field.contains("@") -> R.string.email_is_invalid
        !field.contains(".") -> R.string.email_is_invalid
        field.substringBefore('@').length < 5 -> R.string.email_is_invalid
        field.substringBefore('@').length >= 50 -> R.string.email_is_invalid
        else -> null
    }
}