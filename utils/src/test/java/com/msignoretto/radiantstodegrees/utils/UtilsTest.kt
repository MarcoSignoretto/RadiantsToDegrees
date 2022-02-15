package com.msignoretto.radiantstodegrees.utils

import junit.framework.TestCase.assertEquals
import org.junit.Test

class UtilsTest {
    @Test
    fun givenOneRadiantWhenConvertedThenFiftySevenAndSoDegrees(){
        assertEquals(57.29, Utils.toDegree(1.0), 0.01)
    }
}