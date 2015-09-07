package com.theandroiddeveloper.viewholderpattern.adapter.model;

import android.graphics.drawable.Drawable;

/**
 * POJO class representing a Message.
 *
 * @author jonatan.salas
 */
public class MessageContent {
    private Drawable image;
    private String name;
    private String message;
    private String hour;

    /** Default Constructor **/
    public MessageContent() {}

    /**  Attribute setters && getters **/
    public MessageContent setImage(Drawable image) {
        this.image = image;
        return this;
    }

    public Drawable getImage() {
        return image;
    }

    public MessageContent setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }

    public MessageContent setMessage(String message) {
        this.message = message;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public MessageContent setHour(String hour) {
        this.hour = hour;
        return this;
    }

    public String getHour() {
        return hour;
    }
}
