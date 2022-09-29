package com.oishikenko.android.recruitment.data.di

import com.oishikenko.android.recruitment.data.repository.CookingRecordsRepository
import com.oishikenko.android.recruitment.data.repository.CookingRecordsRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import javax.inject.Singleton

@InstallIn(ViewModelComponent::class)
@Module
abstract class RepositoryModule {
    @Singleton
    @Binds
    abstract fun bindCookingRecordsRepository(impl: CookingRecordsRepositoryImpl): CookingRecordsRepository
}