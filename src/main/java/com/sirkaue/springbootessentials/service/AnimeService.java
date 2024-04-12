package com.sirkaue.springbootessentials.service;

import com.sirkaue.springbootessentials.domain.Anime;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimeService {
    //private final AnimeRepository animeRepository;
    public List<Anime> listAll() {
        return List.of(new Anime(1L, "DBZ"), new Anime(2L, "Beserker"));
    }
}
