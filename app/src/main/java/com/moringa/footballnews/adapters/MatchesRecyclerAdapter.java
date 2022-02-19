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
import com.moringa.footballnews.models.matches.Response;
import com.moringa.footballnews.ui.MatchesDetails;
import com.squareup.picasso.Picasso;

import java.util.List;

public class MatchesRecyclerAdapter extends RecyclerView.Adapter<MatchesRecyclerAdapter.ViewHolder> {
    List<Response> matchesList;
    Context context;
    public MatchesRecyclerAdapter(Context context,List<Response> matchesList){
        this.context = context;
        this.matchesList = matchesList;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.matches_strip_view, parent, false);
        return new ViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.textView.setText(matchesList.get(position).getTeams().getHome().getName());
        Picasso.get().load(matchesList.get(position).getTeams().getHome().getLogo()).into(holder.imageView);

        holder.textView1.setText(matchesList.get(position).getTeams().getAway().getName());
        Picasso.get().load(matchesList.get(position).getTeams().getAway().getLogo()).into(holder.imageView1);

        //setoncliclk listener to holder then open matchesDetails activity

        holder.constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, MatchesDetails.class);

                intent.putExtra("Match",matchesList.get(position));
                context.startActivity(intent);

            }
        });

    }
    @Override
    public int getItemCount() {
        return matchesList.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        ImageView imageView;
        TextView textView1;
        ImageView imageView1;
        ConstraintLayout constraintLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.home2);
            imageView = itemView.findViewById(R.id.homelogo2);
            textView1 = itemView.findViewById(R.id.away2);
            imageView1= itemView.findViewById(R.id.awaylogo2);
            constraintLayout = itemView.findViewById(R.id.constraintLayout);
        }
    }

}
