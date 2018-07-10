package com.bigbang.common

sealed class BooleanExt

object Otherwise : BooleanExt()
class WithData : BooleanExt()

//inline fun Boolean.yes(block: () -> Unit): BooleanExt {
//    when {
//        this -> {
//            block()
//        }
//        else -> {
//            Otherwise
//        }
//    }
//}