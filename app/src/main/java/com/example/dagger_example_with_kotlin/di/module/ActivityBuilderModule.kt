package com.example.dagger_example_with_kotlin.di.module

import com.example.dagger_example_with_kotlin.ui.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilderModule {

    @ContributesAndroidInjector
    abstract fun bindMainActivity(): MainActivity
}