package com.lol.mapper;


import com.lol.po.GameCeta;

public interface GameCetaMapper {
    int deleteByPrimaryKey(Long id);

    int insert(GameCeta record);

    int insertSelective(GameCeta record);

    GameCeta selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(GameCeta record);

    int updateByPrimaryKey(GameCeta record);
}