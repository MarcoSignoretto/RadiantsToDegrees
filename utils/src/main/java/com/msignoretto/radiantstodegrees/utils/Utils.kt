package com.msignoretto.radiantstodegrees.utils

object Utils {
    init {
        System.loadLibrary("radiantstodegrees")
    }
    external fun toDegree(radiants: Double): Double
}