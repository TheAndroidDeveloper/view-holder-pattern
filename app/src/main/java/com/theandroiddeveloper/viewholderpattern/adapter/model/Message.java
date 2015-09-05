package com.theandroiddeveloper.viewholderpattern.adapter.model;

public class Message {
    private int image;
    private String name;
    private String message;
    private String hour;

    public Message() {}

    public Message setImage(int image) {
        this.image = image;
        return this;
    }

    public int getImage() {
        return image;
    }

    public Message setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }

    public Message setMessage(String message) {
        this.message = message;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public Message setHour(String hour) {
        this.hour = hour;
        return this;
    }

    public String getHour() {
        return hour;
    }
}
