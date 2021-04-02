package com.poisionrose.poisoncore

import android.util.Log

class CoreBase {

    companion object {

        fun initialize() : String {
            Log.e("test", "initialize in core")
            return "ok!"
        }
    }
}