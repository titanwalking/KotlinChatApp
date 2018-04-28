package com.colossussoftware.titanwalking.kotlinchatapp.model

data class ChatChannel(val userIds: MutableList<String>) {
    constructor() : this(mutableListOf())
}