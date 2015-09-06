package com.theandroiddeveloper.viewholderpattern.helper;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;

import com.theandroiddeveloper.viewholderpattern.R;
import com.theandroiddeveloper.viewholderpattern.adapter.model.Message;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author jonatan.salas
 */
public class MessageHelper {
    private Drawable mDrawable;

    public MessageHelper(@NonNull final Context context) {
        int teal = ContextCompat.getColor(context, R.color.teal);
        final Drawable image = ContextCompat.getDrawable(context, R.drawable.ic_account_circle_black_36dp);
        image.setColorFilter(teal, PorterDuff.Mode.SRC_ATOP);
        this.mDrawable = image;
    }

    public List getActualMessages() {
        List<Message> messageList = new ArrayList<>();
        Message[] messages = new Message[] {
                new Message()
                        .setImage(mDrawable)
                        .setName("John Doe")
                        .setMessage("Hey, How are you?")
                        .setHour("22:20"),
                new Message()
                        .setImage(mDrawable)
                        .setName("John Doe")
                        .setMessage("Hey, How are you?")
                        .setHour("22:20"),
                new Message()
                        .setImage(mDrawable)
                        .setName("John Doe")
                        .setMessage("Hey, How are you?")
                        .setHour("22:20"),
                new Message()
                        .setImage(mDrawable)
                        .setName("John Doe")
                        .setMessage("Hey, How are you?")
                        .setHour("22:20"),
                new Message()
                        .setImage(mDrawable)
                        .setName("John Doe")
                        .setMessage("Hey, How are you?")
                        .setHour("22:20"),
                new Message()
                        .setImage(mDrawable)
                        .setName("John Doe")
                        .setMessage("Hey, How are you?")
                        .setHour("22:20"),
                new Message()
                        .setImage(mDrawable)
                        .setName("John Doe")
                        .setMessage("Hey, How are you?")
                        .setHour("22:20"),
                new Message()
                        .setImage(mDrawable)
                        .setName("John Doe")
                        .setMessage("Hey, How are you?")
                        .setHour("22:20"),
                new Message()
                        .setImage(mDrawable)
                        .setName("John Doe")
                        .setMessage("Hey, How are you?")
                        .setHour("22:20"),
                new Message()
                        .setImage(mDrawable)
                        .setName("John Doe")
                        .setMessage("Hey, How are you?")
                        .setHour("22:20"),
                new Message()
                        .setImage(mDrawable)
                        .setName("John Doe")
                        .setMessage("Hey, How are you?")
                        .setHour("22:20"),
                new Message()
                        .setImage(mDrawable)
                        .setName("John Doe")
                        .setMessage("Hey, How are you?")
                        .setHour("22:20"),
                new Message()
                        .setImage(mDrawable)
                        .setName("John Doe")
                        .setMessage("Hey, How are you?")
                        .setHour("22:20"),
                new Message()
                        .setImage(mDrawable)
                        .setName("John Doe")
                        .setMessage("Hey, How are you?")
                        .setHour("22:20"),
                new Message()
                        .setImage(mDrawable)
                        .setName("John Doe")
                        .setMessage("Hey, How are you?")
                        .setHour("22:20"),
                new Message()
                        .setImage(mDrawable)
                        .setName("John Doe")
                        .setMessage("Hey, How are you?")
                        .setHour("22:20"),
                new Message()
                        .setImage(mDrawable)
                        .setName("John Doe")
                        .setMessage("Hey, How are you?")
                        .setHour("22:20")
        };

        messageList.addAll(Arrays.asList(messages));

        return messageList;
    }

}
