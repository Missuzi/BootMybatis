package com.lol.Service.imp;

import com.lol.Service.GameCetaService;
import com.lol.mapper.GameCetaMapper;
import com.lol.po.GameCeta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameCetaServiceImp implements GameCetaService {

    @Autowired
    GameCetaMapper gameCetaMapper;

    @Override
    public GameCeta selectByPrimaryKey(Long id) {

        return gameCetaMapper.selectByPrimaryKey(id);
    }
}
