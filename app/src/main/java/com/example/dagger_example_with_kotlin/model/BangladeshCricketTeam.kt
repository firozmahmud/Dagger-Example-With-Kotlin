package com.example.dagger_example_with_kotlin.model

import javax.inject.Inject

class BangladeshCricketTeam @Inject constructor(val players: Players) {

    fun getMyBestEleven(): String {
        return players.getPlayersName()
    }
}