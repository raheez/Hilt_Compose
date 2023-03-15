package com.example.hilt_compose.data.Repository

import android.app.Application
import android.util.Log
import com.example.hilt_compose.R
import com.example.hilt_compose.data.remote.ApiService
import com.example.hilt_compose.domain.Repository.MyRepository
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

class MyRepositoryImpl
@Inject
constructor(
    private val api: ApiService,
    val context: Application
) : MyRepository {

    init {
        val name = context.getString(R.string.app_name);
        Log.d("my_repo", "inside_app_name_${name}")
    }

    override suspend fun doNetworkCall() {

    }
}