package com.bernatasel.mobileprogrammingkotlin

import android.content.Context

fun Int.resolveAsString(context: Context) = context.getString(this)