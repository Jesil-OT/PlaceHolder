package com.jesil.exmaple.custom.placeholder.ui

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jesil.exmaple.custom.placeholder.data.api.ApiService
import com.jesil.exmaple.custom.placeholder.data.model.User
import kotlinx.coroutines.launch


class UserViewModel @ViewModelInject constructor(
   private val api: ApiService
) : ViewModel() {
    private val userLiveData = MutableLiveData<User>()
    val user: LiveData<User> = userLiveData

    init {
        viewModelScope.launch {
            val user = api.getUsers("6065a0406f046266dcbeaa1a")
            userLiveData.value = user
        }
    }

}