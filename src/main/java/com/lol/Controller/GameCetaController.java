package com.lol.Controller;

import com.lol.Service.GameCetaService;
import com.lol.common.Result;
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
    public Result<GameCeta> GetGameCetaById(Long id) {


        GameCeta gameCeta= gameCetaService.selectByPrimaryKey(id);
        if (gameCeta!=null) {
            return Result.success(gameCeta);
        }
        else
        {
            return  Result.fail("查不到数据！");
        }




    }
}
