package com.theandroiddeveloper.viewholderpattern.adapter.model;

import android.graphics.drawable.Drawable;

/**
 * @author jonatan.salas
 */
public class Message {
    private Drawable image;
    private String name;
    private String message;
    private String hour;

    public Message() {}

    public Message setImage(Drawable image) {
        this.image = image;
        return this;
    }

    public Drawable getImage() {
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
