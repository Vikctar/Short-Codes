package com.vikcandroid.datawallet.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.vikcandroid.datawallet.R;
import com.vikcandroid.datawallet.model.Service;

import java.util.List;

/**
 * Created by android-dev on 4/24/17.
 */

public class SafAdapter extends RecyclerView.Adapter<SafAdapter.ViewHolder> {

    private List<Service> services;

    public SafAdapter(List<Service> services) {
        this.services = services;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.saf_card, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Service service = services.get(position);
        holder.nameText.setText(service.getServiceName());
        holder.thumbnail.setBackgroundColor(service.getThumbnailColor());
    }

    @Override
    public int getItemCount() {
        return services.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView nameText;
        private ImageView thumbnail;
        private View mView;

        public ViewHolder(View itemView) {
            super(itemView);
            mView = itemView;
            nameText = (TextView) itemView.findViewById(R.id.service_name);
            thumbnail = (ImageView) itemView.findViewById(R.id.saf_thumbnail);
        }
    }
}
