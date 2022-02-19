package com.moringa.footballnews.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.moringa.footballnews.R;
import com.moringa.footballnews.models.leagues.Response;
import com.moringa.footballnews.ui.LeaguesDetails;
import com.moringa.footballnews.ui.MatchesDetails;
import com.squareup.picasso.Picasso;

import java.util.List;


public class LeaguesRecylerViewAdapter extends RecyclerView.Adapter<LeaguesRecylerViewAdapter.ViewHolder> {
    List<Response> leaguesList;
     Context context;

    public LeaguesRecylerViewAdapter(Context context, List<Response> leaguesList){
        this.context = context;
        this.leaguesList = leaguesList;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.leagues_strip_view, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.textView1.setText(leaguesList.get(position).getLeague().getName());
//        TODO use picaso to load images
        Picasso.get().load(leaguesList.get(position).getLeague().getLogo()).into(holder.imageView);

        holder.constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, LeaguesDetails.class);

                intent.putExtra("Details",leaguesList.get(position));
                context.startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return leaguesList.size();
    }

     class ViewHolder extends RecyclerView.ViewHolder {

        TextView textView1;
        ImageView imageView;
        ConstraintLayout constraintLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView1 = itemView.findViewById(R.id.leaguesName);
            imageView = itemView.findViewById(R.id.logo);
            constraintLayout = itemView.findViewById(R.id.constraintLayout);

        }
    }
}
