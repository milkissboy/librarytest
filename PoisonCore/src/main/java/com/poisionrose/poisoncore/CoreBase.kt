package com.poisionrose.poisoncore

import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class CoreBase {

    fun getName() : String {
        return "name!"
    }

    companion object {

        fun initialize() : String {
            Log.e("test", "initialize in core")
            Log.e("test", "it good!")
            return "ok!"
        }
    }
}

fun AppCompatActivity.getCategory() : String {
    return this.localClassName
}