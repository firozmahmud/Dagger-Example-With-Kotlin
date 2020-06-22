package com.example.dagger_example_with_kotlin.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dagger_example_with_kotlin.R
import com.example.dagger_example_with_kotlin.model.BangladeshCricketTeam
import com.example.dagger_example_with_kotlin.model.Players
import dagger.android.AndroidInjection
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject


class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var bangladeshCricketTeam: BangladeshCricketTeam

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      /*  val players = Players()
        val bangladeshCricketTeam = BangladeshCricketTeam(players)*/

        getPlayersBtn.setOnClickListener {
            playersNameId.text = bangladeshCricketTeam.getMyBestEleven()
        }
    }

}