package com.boredream.herb.db;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "HERB".
 */
public class Herb {

    private String type;
    private String name;
    private String letter;
    private String href;
    private String img;

    public Herb() {
    }

    public Herb(String name) {
        this.name = name;
    }

    public Herb(String type, String name, String letter, String href, String img) {
        this.type = type;
        this.name = name;
        this.letter = letter;
        this.href = href;
        this.img = img;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

}
