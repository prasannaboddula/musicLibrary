package com.example.song;

public class Song{
    private int songId;
    private String songName;
    private String lyricist;
    private String singer;
    private String musicDirector;

    public Song(int songId, String songName, String lyricist, String singer, String musicDirector){
        this.songId = songId;
        this.songName = songName;
        this.lyricist = lyricist;
        this.singer = singer;
        this.musicDirector = musicDirector;
    }

    public int getsongId(){
        return songId;
    }

    public void setsongId(int songId){
        this.songId = songId;
    }

    public String getsongName(){
        return songName;
    }
    public void setsongName(String songName){
        this.songName = songName;
    }
    public String getlyricistName(){
        return lyricist;
    }
    public void setlyricistName(String lyricist){
        this.lyricist = lyricist;
    }
    public String getsingerName(){
        return singer;
    }
    public void setsingerName(String singer){
        this.singer = singer;
    }
    public String getmusicDirectorName(){
        return musicDirector;
    }
    public void setmusicDirectorName(String musicDirector){
        this.musicDirector = musicDirector;
    }
}