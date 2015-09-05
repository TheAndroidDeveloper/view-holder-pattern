package com.theandroiddeveloper.viewholderpattern.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.theandroiddeveloper.viewholderpattern.R;
import com.theandroiddeveloper.viewholderpattern.adapter.model.Message;

import java.util.List;

/**
 * @author jonatan.salas
 */
public class MessageAdapter extends BaseAdapter {
    private Context mContext;
    private List mItems;

    /**
     *
     * @param context
     * @param items
     */
    public MessageAdapter(@NonNull final Context context,
                          @NonNull final List items) {
        this.mContext = context;
        this.mItems = items;
    }

    @Override
    public int getCount() {
        return mItems.size();
    }

    @Override
    public Object getItem(int position) {
        return mItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final Message message = (Message) getItem(position);
        final ViewHolder viewHolder;

        if(null != convertView) {
            viewHolder = (ViewHolder) convertView.getTag();
        } else {
            convertView = LayoutInflater
                    .from(mContext)
                    .inflate(R.layout.message_item, parent, false);

            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        }

        viewHolder.profile.setImageResource(message.getImage());
        viewHolder.name.setText(message.getName());
        viewHolder.message.setText(message.getMessage());
        viewHolder.hour.setText(message.getHour());

        return convertView;
    }

    /**
     * @author jonatan.salas
     */
    protected static class ViewHolder {
        private ImageView profile;
        private TextView  name;
        private TextView message;
        private TextView hour;

        /**
         *
         * @param view
         */
        public ViewHolder(@NonNull final View view) {
            profile = (ImageView) view.findViewById(R.id.profile_picture);
            name = (TextView) view.findViewById(R.id.contact_name);
            message = (TextView) view.findViewById(R.id.message);
            hour = (TextView) view.findViewById(R.id.message_hour);
        }
    }
}
