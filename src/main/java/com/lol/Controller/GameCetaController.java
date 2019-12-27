package com.lol.Controller;

import com.lol.Service.GameCetaService;
import com.lol.common.Result;
import com.lol.po.GameCeta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/game")
public class GameCetaController {
    @Autowired
    GameCetaService gameCetaService;

    @RequestMapping("/GetGameCetaById")
    public Result<GameCeta> GetGameCetaById(Long id) {

        try {
            GameCeta gameCeta = gameCetaService.selectByPrimaryKey(id);
            if (gameCeta != null) {
                return Result.success(gameCeta);
            } else {
                return Result.fail("查不到数据！");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return Result.fail("查询异常，请重新请求");
        }


    }

    @RequestMapping("/insertGameCeta")
    public Result insertGameCeta(@RequestBody List<GameCeta> lists) {



       return  gameCetaService.insert(lists);


    }
    @RequestMapping("/getListGame")
    public  Result getListGame(String gameId)
    {
        return  gameCetaService.getListGame(gameId);

    }


}
