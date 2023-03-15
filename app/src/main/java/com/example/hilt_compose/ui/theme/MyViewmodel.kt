package com.example.hilt_compose.ui.theme

import androidx.lifecycle.ViewModel
import com.example.hilt_compose.data.Repository.MyRepositoryImpl
import com.example.hilt_compose.domain.Repository.MyRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MyViewmodel @Inject constructor(repository: MyRepository) : ViewModel() {

}