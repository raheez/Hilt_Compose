package com.example.hilt_compose.di

import android.app.Application
import android.util.Log
import com.example.hilt_compose.data.Repository.MyRepositoryImpl
import com.example.hilt_compose.data.remote.ApiService
import com.example.hilt_compose.domain.Repository.MyRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.FragmentComponent
import dagger.hilt.android.components.ViewComponent
import dagger.hilt.android.scopes.ActivityScoped
import dagger.hilt.android.scopes.FragmentScoped
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun providesMyApi(): ApiService {
        return Retrofit.Builder().baseUrl("https://test.com")
            .build()
            .create(ApiService::class.java)
    }

    @Provides
    @Singleton
    fun provideRepository(apiService: ApiService, app: Application, @Named("hello2") mstr:String):MyRepository{
        Log.d("provide","inside_provide_${mstr}")
        return MyRepositoryImpl(apiService,app)

    }

    @Provides
    @Named("hello1")
    fun getStringOne()="String1"

    @Provides
    @Named("hello2")
    fun getStringTwo()="String2"


}