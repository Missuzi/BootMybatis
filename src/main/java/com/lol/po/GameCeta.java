package com.lol.po;

public class GameCeta {
    private Long id;

    private String gameid;

    private String gamename;

    private String gamedesc;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGameid() {
        return gameid;
    }

    public void setGameid(String gameid) {
        this.gameid = gameid == null ? null : gameid.trim();
    }

    public String getGamename() {
        return gamename;
    }

    public void setGamename(String gamename) {
        this.gamename = gamename == null ? null : gamename.trim();
    }

    public String getGamedesc() {
        return gamedesc;
    }

    public void setGamedesc(String gamedesc) {
        this.gamedesc = gamedesc == null ? null : gamedesc.trim();
    }
}