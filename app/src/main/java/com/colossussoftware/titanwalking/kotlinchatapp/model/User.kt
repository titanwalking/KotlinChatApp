package com.colossussoftware.titanwalking.kotlinchatapp.model

data class User(val name: String,
                val bio: String,
                val profilePicturePath: String?) {
    constructor() : this("", "", null)
}