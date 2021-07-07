package com.example.unigo.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.unigo.Models.University
import com.example.unigo.UniRepository.UniRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class UniViewModel:ViewModel() {

    val unidata: LiveData<List<University>> = MutableLiveData()

    init {
        viewModelScope.launch {
            unidata as MutableLiveData

            unidata.value = getUsersData()
        }

    }
}

    private suspend fun getUsersData(): List<University> {
        return withContext(Dispatchers.IO) {
            UniRepository().getUni().body()?.uni!!
        }
    }
