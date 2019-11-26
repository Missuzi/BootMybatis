package com.lol.Service.imp;

import com.lol.Service.GameCetaService;
import com.lol.mapper.GameCetaMapper;
import com.lol.po.GameCeta;
import org.springframework.beans.factory.annotation.Autowired;

public class GameCetaServiceImp implements GameCetaService {

    @Autowired
    GameCetaMapper gameCetaMapper;

    @Override
    public GameCeta selectByPrimaryKey(Long id) {

        return gameCetaMapper.selectByPrimaryKey(id);
    }
}
