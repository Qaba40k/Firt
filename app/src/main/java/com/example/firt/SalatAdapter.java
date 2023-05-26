package com.example.firt;

import static androidx.core.content.ContextCompat.startActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SalatAdapter extends RecyclerView.Adapter<SalatAdapter.ViewHolder>{

    private final LayoutInflater inflater;
    private final List<Salats> salats;

    public Context context;

    public Activity activity;

    public SalatAdapter(Context context, List<Salats> salats){
        this.inflater = LayoutInflater.from(context);
        this.salats = salats;
        this.activity = activity;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_layout,parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(SalatAdapter.ViewHolder holder, int position) {
        Salats salat = salats.get(position);
        holder.nameView.setText(salat.getName());
        holder.salatDescript.setText(salat.getDescript());
        holder.SalatView.setImageResource(salat.getSalat());




    }

    @Override
    public int getItemCount() {
        return salats.size();
    }



    public class ViewHolder extends RecyclerView.ViewHolder {


        final ImageView SalatView;
        final TextView nameView, salatDescript;




        ViewHolder(View view) {
            super(view);
            SalatView = view.findViewById(R.id.imageSalat);
            nameView = view.findViewById(R.id.salatsName);
            salatDescript = view.findViewById(R.id.salatO);



            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int positionIndex = getAdapterPosition();
                    Intent intent = new Intent(context, RezeptActivity.class);
                    intent.putExtra("rez", salats.get(positionIndex).getRez());
                    intent.putExtra("riz", salats.get(positionIndex).getSalat());
                    view.getContext().startActivity(intent);
                }

            });
            


        }




    }

}
