package com.androiddevs.ktornoteapp.other

object Constants {
    const val DATABASE_NAME = "notes_db"
    const val KEY_LOGGED_IN_EMAIL = "KEY_LOGGED_IN_EMAIL"
    const val NO_EMAIL = "NO_EMAIL"
    const val NO_PASSWORD = "NO_PASSWORD"
    const val DEFAULT_NOTE_COLOR = "FFA500"
    const val KEY_PASSWORD = "KEY_PASSWORD"
    const val ENCRYPTED_SHARED_PREF_NAME = "enc_shared_pref"

    //const val BASE_URL = "http://192.168.0.132:8002"
    //const val BASE_URL = "http://192.168.42.29:8002"
    const val BASE_URL = "https://ktor-practice.herokuapp.com/"
    val IGNORE_AUTH_URLS = listOf("/login", "/register")
}