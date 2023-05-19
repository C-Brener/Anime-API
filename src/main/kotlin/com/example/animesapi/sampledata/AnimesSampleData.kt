package com.example.animesapi.sampledata

import com.example.animesapi.model.Anime
import com.example.animesapi.model.Character

object AnimesSampleData {

    private val characters = listOf(
        Character(
            animeName = "Jujutsu Kaisen",
            name = "Yuji Itadori",
            age = 16,
            image = "https://static.wikia.nocookie.net/jujutsukaisen/images/2/27/Yuji_Itadori.png/revision/latest?cb=20210106011141&path-prefix=pt-br",
            description = "Yuji Itadori (虎杖悠仁) É o protagonista principal de Jujutsu Kaisen. Ele está no primeiro ano da Escola Secundária Jujutsu da Prefeitura de Tóquio."
        ),
        Character(
            animeName = "One Piece",
            name = "Zoro",
            age = 21,
            image = "https://static.wikia.nocookie.net/onepiece/images/5/52/Roronoa_Zoro_Anime_Post_Timeskip_Infobox.png/revision/latest?cb=20181209230036&path-prefix=pt",
            description = "Roronoa Zoro, também conhecido como \"Caçador de Piratas\" Zoro, é o combatente dos Piratas do Chapéu de Palha e um ex-caçador de recompensas."
        )
    )


    val list = listOf(
        Anime(
            name = "Jujutsu Kaisen",
            quantityEps = 25,
            author = "Gege Akutami",
            characters = characters.filter { it.animeName == "Jujutsu Kaisen" },
            imdbnote = "8.5",
            isFinished = false
        ),
        Anime(
            name = "One Piece",
            quantityEps = 1059,
            author = "Echiro Oda",
            imdbnote = "8.9",
            characters = characters.filter { it.animeName == "One Piece" },
            isFinished = false
        )
    )


}