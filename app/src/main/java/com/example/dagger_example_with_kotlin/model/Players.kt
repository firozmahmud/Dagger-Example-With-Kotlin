package com.example.dagger_example_with_kotlin.model

import javax.inject.Inject

class Players @Inject constructor() {

    fun getPlayersName(): String {
        return "Tamim, Sakib, Mushfiq, Mahmudullah, Musaddek, Mostafiz, Mashrafee, Rubel, Taskin, Miraz, Soumaya"
    }

}