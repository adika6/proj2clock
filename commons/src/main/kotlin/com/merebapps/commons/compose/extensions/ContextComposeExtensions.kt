package com.merebapps.commons.compose.extensions

import android.app.Activity
import android.content.Context
import com.merebapps.commons.R
import com.merebapps.commons.extensions.baseConfig
import com.merebapps.commons.extensions.redirectToRateUs
import com.merebapps.commons.extensions.toast
import com.merebapps.commons.helpers.BaseConfig

val Context.config: BaseConfig get() = BaseConfig.newInstance(applicationContext)

fun Activity.rateStarsRedirectAndThankYou(stars: Int) {
    if (stars == 5) {
        redirectToRateUs()
    }
    toast(R.string.thank_you)
    baseConfig.wasAppRated = true
}
