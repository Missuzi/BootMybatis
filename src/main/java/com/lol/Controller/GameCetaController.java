package com.lol.Controller;

import com.lol.Service.GameCetaService;
import com.lol.po.GameCeta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/game")
public class GameCetaController {
    @Autowired
    GameCetaService gameCetaService;

    @RequestMapping("/GetGameCetaById")
    public GameCeta GetGameCetaById(Long id) {
        return gameCetaService.selectByPrimaryKey(id);

    }
}
