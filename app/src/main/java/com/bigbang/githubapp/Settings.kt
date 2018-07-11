package com.bigbang.githubapp

import com.bigbang.common.Preference

/**
 * @author Ting
 * @date 2018/7/11
 */
object Settings {
    var email: String by Preference(AppContext, "email", "")
    var password: String by Preference(AppContext, "password", "")
}