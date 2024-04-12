package com.sirkaue.springbootessentials.controller;

import com.sirkaue.springbootessentials.domain.Anime;
import com.sirkaue.springbootessentials.util.DateUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("anime")
public class AnimeController {
    private static final Logger log = LogManager.getLogger(AnimeController.class);

    private DateUtil dateUtil;

    // Injeção de Dependência via método construtor
    public AnimeController(DateUtil dateUtil) {
        this.dateUtil = dateUtil;
    }

    @GetMapping(path = "list")
    public List<Anime> list() {
        log.info(dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
        return List.of(new Anime("DBZ"), new Anime("Beserker"));
    }
}
