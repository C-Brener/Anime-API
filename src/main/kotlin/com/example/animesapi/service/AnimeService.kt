package com.example.animesapi.service

import com.example.animesapi.model.Anime
import com.example.animesapi.sampledata.AnimesSampleData
import org.springframework.stereotype.Service

@Service
class AnimeService {
    fun searchByName(name: String): Anime {
        return AnimesSampleData.list.first { it.name.contains(name) }
    }

    fun listAnime(): List<Anime> {
        return AnimesSampleData.list
    }

}
