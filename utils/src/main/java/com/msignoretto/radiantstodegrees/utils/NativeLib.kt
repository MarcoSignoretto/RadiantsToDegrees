package com.msignoretto.radiantstodegrees

class NativeLib {

    /**
     * A native method that is implemented by the 'radiantstodegrees' native library,
     * which is packaged with this application.
     */
    external fun stringFromJNI(): String

    companion object {
        // Used to load the 'radiantstodegrees' library on application startup.
        init {
            System.loadLibrary("radiantstodegrees")
        }
    }
}