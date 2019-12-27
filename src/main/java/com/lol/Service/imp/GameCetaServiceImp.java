package com.lol.Service.imp;

import com.lol.Service.GameCetaService;
import com.lol.common.Result;
import com.lol.mapper.GameCetaMapper;
import com.lol.po.GameCeta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class GameCetaServiceImp implements GameCetaService {

    @Autowired
    GameCetaMapper gameCetaMapper;

    @Override
    public GameCeta selectByPrimaryKey(Long id) {

        GameCeta gameCeta = gameCetaMapper.selectByPrimaryKey(id);
        return gameCeta;


    }


    @Transactional
    @Override
    public Result insert(List<GameCeta> gameCetaList) {
        try {
//            List<GameCeta> listGame=new ArrayList<>();
//            GameCeta gameCeta;
//            gameCeta=new GameCeta();
//            // gameCeta.setId((long)10);
//            gameCeta.setGameId("m11");
//            gameCeta.setGameName("LOL");
//            gameCeta.setGameDesc("uzi");
//            listGame.add(gameCeta);
//
//            gameCeta=new GameCeta();
//            // gameCeta.setId((long)12);
//            gameCeta.setGameId("m12");
//            gameCeta.setGameName("和平精英");
//            gameCeta.setGameDesc("小灿");
//            listGame.add(gameCeta);
//            gameCetaList=listGame;

         int m=   gameCetaMapper.insertDepartments(gameCetaList);
         if (m>0){
             return  Result.success(m);
         }
         else
             return  Result.fail();
        } catch (Exception e)
        {
            return Result.fail(e.getLocalizedMessage());
        }



    }

    @Override
    public Result getListGame(String gameId) {
        List<GameCeta> cetaList =gameCetaMapper.getListGame(gameId);
        if (cetaList.size()>0){
            return  Result.success(cetaList);
        }
        else
            return  Result.fail();

    }

    //selectByPrimaryKey

}
