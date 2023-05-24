package com.example.project_assignment_b22jonan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class PokemonAdapter extends RecyclerView.Adapter<PokemonAdapter.MyViewHolder> {

    private List<Pokemon> pokemonList;
    private Context context;


    public PokemonAdapter(Context context, List<Pokemon> pokemonList) {
        this.context = context;
        this.pokemonList = pokemonList;
    }

    @NonNull
    @Override
    public PokemonAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View itemView = inflater.inflate(R.layout.pokemon_item, parent, false);
        return new PokemonAdapter.MyViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(@NonNull PokemonAdapter.MyViewHolder holder, int position) {
        holder.ID.setText(pokemonList.get(position).getID());
        holder.name.setText(pokemonList.get(position).getName());
        holder.generation.setText(pokemonList.get(position).getGeneration());
        Glide.with(context).load(pokemonList.get(position).getImage()).into(holder.image);
        String[] types = pokemonList.get(position).getTypes();
        if (types.length == 1){
            Glide.with(context).load(pokemonList.get(position).getImage()).into(holder.types[0]);
            holder.types[1].setVisibility(View.GONE);
            holder.types[2].setVisibility(View.GONE);
        } else if (types.length == 2){
            Glide.with(context).load(pokemonList.get(position).getImage()).into(holder.types[0]);
            Glide.with(context).load(pokemonList.get(position).getImage()).into(holder.types[1]);
            holder.types[2].setVisibility(View.GONE);
        } else {
            Glide.with(context).load(pokemonList.get(position).getImage()).into(holder.types[0]);
            Glide.with(context).load(pokemonList.get(position).getImage()).into(holder.types[1]);
            Glide.with(context).load(pokemonList.get(position).getImage()).into(holder.types[2]);
        }
    }

    @Override
    public int getItemCount() {
        return pokemonList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView ID;
        TextView name;
        TextView generation;
        ImageView image;
        ImageView[] types = new ImageView[3];


        public MyViewHolder(View itemView) {
            super(itemView);
            ID = itemView.findViewById(R.id.ID);
            name = itemView.findViewById(R.id.Name);
            generation = itemView.findViewById(R.id.generation);
            image = itemView.findViewById(R.id.image);
            types[0] = itemView.findViewById(R.id.type1);
            types[1] = itemView.findViewById(R.id.type2);
            types[2] = itemView.findViewById(R.id.type3);
        }
    }
}
