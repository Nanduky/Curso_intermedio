package com.nanduky.horsocappactivity.domain.model

import com.nanduky.horsocappactivity.R

sealed class HoroscopeInfo(val img: Int, name: Int) {
    object Aries : HoroscopeInfo(R.drawable.ic_cards, R.string.app_name)
}
