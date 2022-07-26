package com.vigli.composecodelab

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    private val _messages: MutableLiveData<List<Message>> = MutableLiveData()
    val messages: LiveData<List<Message>> = _messages

    private var idx = 1

    private val _message: MutableLiveData<Message> = MutableLiveData(Message("Android", "Jetpack Compose\nHello\n"))
    val message: LiveData<Message> = _message

    init {
        val tempMessages = mutableListOf<Message>()
        for (idx in 1..50) tempMessages.add(Message("Android$idx", "Jetpack Compose\nHello\n$idx"))

        _messages.value = tempMessages
    }

    fun onRefreshClick() {
        _message.value = Message("Android${++idx}", "Jetpack Compose\nHello\n$idx")
    }
}