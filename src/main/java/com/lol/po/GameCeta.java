package com.lol.po;

import com.lol.annotition.DateParse;

import java.util.Date;

public class GameCeta {
    private Long id;

    private String gameId;

    private String gameName;

    private String gameDesc;

    @DateParse
    private Date createDate;

    @DateParse
    private Date updateDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGameId() {
        return gameId;
    }

    public void setGameId(String gameId) {
        this.gameId = gameId;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getGameDesc() {
        return gameDesc;
    }

    public void setGameDesc(String gameDesc) {
        this.gameDesc = gameDesc;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public String toString() {
        return "GameCeta{" +
                "id=" + id +
                ", gameId='" + gameId + '\'' +
                ", gameName='" + gameName + '\'' +
                ", gameDesc='" + gameDesc + '\'' +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                '}';
    }
}