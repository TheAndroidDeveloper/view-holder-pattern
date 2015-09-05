package com.theandroiddeveloper.viewholderpattern.helper;

import android.content.Context;
import android.support.annotation.NonNull;

import com.theandroiddeveloper.viewholderpattern.adapter.model.Message;

import java.util.ArrayList;
import java.util.List;

public class MessageHelper {
    private Context mContext;

    public MessageHelper(@NonNull final Context context) {
        this.mContext = context;
    }

    public List getActualMessages() {
        List<Message> messageList = new ArrayList<>();

        return messageList;
    }

}
