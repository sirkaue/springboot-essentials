package com.sirkaue.springbootessentials.repository;

import com.sirkaue.springbootessentials.domain.Anime;

import java.util.List;

public interface AnimeRepository {
    List<Anime> listAll();
}
