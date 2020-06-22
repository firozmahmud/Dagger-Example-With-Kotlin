package com.example.dagger_example_with_kotlin.di

import com.example.dagger_example_with_kotlin.App
import com.example.dagger_example_with_kotlin.di.module.ActivityBuilderModule
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule

@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        ActivityBuilderModule::class
    ]
)
interface AppComponent : AndroidInjector<App>