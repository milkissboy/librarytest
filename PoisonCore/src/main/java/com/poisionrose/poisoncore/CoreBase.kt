package com.poisionrose.poisoncore

import android.util.Log

open class CoreBase {

    companion object {

        fun initialize() : String {
            Log.e("test", "initialize in core")
            Log.e("test", "3th !! ")
            return "ok!"
        }
    }
}