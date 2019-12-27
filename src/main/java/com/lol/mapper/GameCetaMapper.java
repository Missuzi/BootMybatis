package com.lol.mapper;

import com.lol.po.GameCeta;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GameCetaMapper {
    int deleteByPrimaryKey(Long id);

    int insert(GameCeta record);

    int insertSelective(GameCeta record);

    GameCeta selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(GameCeta record);

    int updateByPrimaryKey(GameCeta record);

    int insertDepartments(List<GameCeta> list);

    List<GameCeta> getListGame(@Param("gameId") String gameId);
}