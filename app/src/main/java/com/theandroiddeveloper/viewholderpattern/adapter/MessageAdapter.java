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
import com.theandroiddeveloper.viewholderpattern.adapter.model.MessageContent;

import java.util.List;

/**
 * Custom adapter class
 *
 * @author jonatan.salas
 */
public class MessageAdapter extends BaseAdapter {
    private Context mContext;
    private List mItems;

    /**
     * Constructor with parameters
     *
     * @param context - the context where the adapter is going to be used.
     * @param items - the list of items that the adapter must represent.
     */
    public MessageAdapter(@NonNull final Context context,
                          @NonNull final List items) {
        this.mContext = context;
        this.mItems = items;
    }

    public void setItems(List items) {
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

        onBindViews(viewHolder, position);

        return convertView;
    }

    /**
     * Method that bind views with the data to be shown.
     *
     * @param viewHolder - the viewHolder used to set the data.
     * @param position - the position where of the data to get.
     */
    private void onBindViews(@NonNull final ViewHolder viewHolder, final int position) {
        final MessageContent content = (MessageContent) getItem(position);

        viewHolder.profile.setImageDrawable(content.getImage());
        viewHolder.name.setText(content.getName());
        viewHolder.message.setText(content.getMessage());
        viewHolder.hour.setText(content.getHour());
    }

    /**
     * ViewHolder class used for caching the views needed by our adapter.
     *
     * @author jonatan.salas
     */
    protected static class ViewHolder {
        private ImageView profile;
        private TextView  name;
        private TextView message;
        private TextView hour;

        /**
         * Constructor with parameters.
         *
         * @param view - The root view that contains all the views needed.
         */
        public ViewHolder(@NonNull final View view) {
            profile = (ImageView) view.findViewById(R.id.profile_picture);
            name = (TextView) view.findViewById(R.id.contact_name);
            message = (TextView) view.findViewById(R.id.message);
            hour = (TextView) view.findViewById(R.id.message_hour);
        }
    }
}
