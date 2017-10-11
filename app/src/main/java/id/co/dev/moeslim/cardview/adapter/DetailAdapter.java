package id.co.dev.moeslim.cardview.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import id.co.dev.moeslim.cardview.MainActivity;
import id.co.dev.moeslim.cardview.R;
import id.co.dev.moeslim.cardview.beam.Detail;

/**
 * Created by moeslim on 11/10/17.
 */

public class DetailAdapter extends RecyclerView.Adapter<DetailAdapter.CustomViewHolder>{

    private ArrayList<Detail> arrayDetails;

    public DetailAdapter(MainActivity mainActivity, ArrayList<Detail> arrayDetails) {
        this.arrayDetails = arrayDetails;
    }

    public CustomViewHolder onCreateViewHolder(ViewGroup viewGroup, int i){
        View view = LayoutInflater .from(viewGroup.getContext()).inflate(R.layout.item_recyclerview, null);
        RecyclerView.LayoutParams lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        view.setLayoutParams(lp);
        return  new CustomViewHolder(view);
    }

    public void onBindViewHolder(final CustomViewHolder customViewHolder, int i){
        customViewHolder.tvName.setText(arrayDetails.get(i).getName());
        customViewHolder.tvEmailId.setText(arrayDetails.get(i).getEmailId());
    }

    public int getItemCount(){
        return (null != arrayDetails ? arrayDetails.size() : 0);
    }

    class CustomViewHolder extends RecyclerView.ViewHolder {

        private TextView tvName, tvEmailId;

        public CustomViewHolder(View view) {
            super(view);
            tvName = (TextView) view.findViewById(R.id.tvName);
            tvEmailId = (TextView) view.findViewById(R.id.tvEmailId);
        }
    }
}
