package com.example.animesapi.controller

import com.example.animesapi.model.Anime
import com.example.animesapi.service.AnimeService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*


@RestController
@RequestMapping("/animes")
class AnimeListController(private val service: AnimeService) {

    @GetMapping
    fun listCharacters(): List<Anime> {
        return service.listAnime()
    }

    @GetMapping("/{name}")
    fun searchByName(@PathVariable name: String): Anime {
        return service.searchByName(name)
    }
}