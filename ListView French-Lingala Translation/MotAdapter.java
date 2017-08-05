package com.example.lislis.mesexercices;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by lislis on 31/07/2017.
 */

public class MotAdapter extends ArrayAdapter<Mot>
{
    public MotAdapter(Context ctx, List<Mot> mot)
    {
        super(ctx,0,mot);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        Mot motCurrent=getItem(position);
        View contenu=convertView;

        if(contenu==null)
        {
            contenu=LayoutInflater.from(getContext()).inflate(R.layout.mot_traduction,parent,false);
        }

        TextView motFr=(TextView)contenu.findViewById(R.id.motFr);
        motFr.setText(motCurrent.getMotFr());
        TextView motLn=(TextView)contenu.findViewById(R.id.motLn);
        motLn.setText(motCurrent.getMotLn());
        return contenu;
    }
}
