package com.oishikenko.android.recruitment.data.di

import com.oishikenko.android.recruitment.data.BuildConfig
import com.oishikenko.android.recruitment.data.network.CookingRecordsNetworkApi
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object NetworkModule {
    @Singleton
    @Provides
    fun provideRetrofit(): Retrofit {
        val okhttpClient = OkHttpClient.Builder()
            .readTimeout(60, TimeUnit.SECONDS)
            .build()

        return Retrofit.Builder()
            .addConverterFactory(
                MoshiConverterFactory.create(
                    Moshi.Builder()
                        .add(KotlinJsonAdapterFactory())
                        .build()
                )
            )
            .baseUrl(BuildConfig.NETWORK_BASE_URL)
            .client(okhttpClient)
            .build()
    }

    @Singleton
    @Provides
    fun provideCookingRecordsNetworkApi(retrofit: Retrofit): CookingRecordsNetworkApi {
        return retrofit.create(CookingRecordsNetworkApi::class.java)
    }
}