package com.example.lislis.mesexercices;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lislis on 01/08/2017.
 */

public class UserAdapter extends ArrayAdapter<User> {
    public UserAdapter(Context ctx, List<User> user)
    {
        super(ctx,0,user);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View conteneur=convertView;
        User pos=getItem(position);
        if(conteneur==null)
        {
            conteneur= LayoutInflater.from(getContext()).inflate(R.layout.user,parent,false);
        }
        ImageView photo=(ImageView)conteneur.findViewById(R.id.photo);
        photo.setImageResource(pos.getPhoto());

        TextView nom=(TextView)conteneur.findViewById(R.id.nom);
        nom.setText(pos.getNom());

        TextView prenom=(TextView)conteneur.findViewById(R.id.prenom);
        prenom.setText(pos.getPrenom());

        TextView metier=(TextView)conteneur.findViewById(R.id.metier);
        metier.setText(pos.getMetier());
        return conteneur;
    }
}
