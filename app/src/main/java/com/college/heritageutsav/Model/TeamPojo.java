package com.college.heritageutsav.Model;

public class TeamPojo {

    public String name,second;
    public int imgId;

    public TeamPojo(String name, String second, int imgId) {
        this.name = name;
        this.second = second;
        this.imgId = imgId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecond() {
        return second;
    }

    public void setSecond(String second) {
        this.second = second;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }
}
