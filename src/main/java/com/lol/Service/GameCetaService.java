package com.lol.Service;

import com.lol.common.Result;
import com.lol.po.GameCeta;

import java.util.List;

public interface GameCetaService {

    GameCeta selectByPrimaryKey(Long id);

    Result insert(List<GameCeta> gameCetaList);

    Result getListGame(String gameId);

}
