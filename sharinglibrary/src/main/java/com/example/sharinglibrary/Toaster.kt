package com.example.sharinglibrary

import android.content.Context
import android.widget.Toast

object Toaster {

    fun execute(context: Context, text: String) {
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show()
    }
}