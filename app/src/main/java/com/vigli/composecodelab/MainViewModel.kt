package com.vigli.composecodelab

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    private val _messages: MutableLiveData<List<Message>> = MutableLiveData()
    val messages: LiveData<List<Message>> = _messages

    init {
        val tempMessages = mutableListOf<Message>()
        for (idx in 1..50) tempMessages.add(Message("Android$idx", "Jetpack Compose\nHello\n$idx"))

        _messages.value = tempMessages
    }
}