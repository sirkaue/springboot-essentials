package com.sirkaue.springbootessentials.repository;

import com.sirkaue.springbootessentials.domain.Anime;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimeRepository extends JpaRepository<Anime, Long> {
}
