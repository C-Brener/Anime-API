package com.example.animesapi.controller

import com.example.animesapi.model.Anime
import com.example.animesapi.model.Character
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.ArrayList
import java.util.Arrays


@RestController
@RequestMapping("/persons")
class AnimeListController {

    @GetMapping
    fun listCharacters(): List<Anime> {
        val anime = Anime(
            name = "Jujutsu Kaizen",
            author = "Gege Akutami",
            quantityEps = 25,
            imdbnote = "5",
            isFinished = false,
            characters = listOf(
                Character(
                    name = "Itadori",
                    age = 16,
                    image = "https://static.wikia.nocookie.net/jujutsukaisen/images/2/27/Yuji_Itadori.png/revision/latest?cb=20210106011141&path-prefix=pt-br",
                    description = "Yuji Itadori (虎杖悠仁) É o protagonista principal de Jujutsu Kaisen. Ele está no primeiro ano da Escola Secundária Jujutsu da Prefeitura de Tóquio."
                )
            )
        )

        return Arrays.asList(anime, anime, anime)
    }
}