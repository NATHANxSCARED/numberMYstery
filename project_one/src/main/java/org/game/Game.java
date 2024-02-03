package org.game;

public class Game {
    private String _hostName;

    public Game ( String hostName){
        this._hostName=hostName;
    };

    public String getHostName(){
        return _hostName;
    }
    public String setHostName(String value){
        this._hostName = value;
        return _hostName;
    }



}
