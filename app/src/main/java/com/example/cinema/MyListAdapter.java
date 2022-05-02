package com.example.cinema;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class MyListAdapter extends ArrayAdapter<Films>  {
    List<Films> listOfFilms;

    Context context;

    int resource;

    public MyListAdapter(Context context, int resource, List<Films> listOfFilms) {
        super(context, resource, listOfFilms);
        this.context = context;
        this.listOfFilms = listOfFilms;
        this.resource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(resource, null, false);
        ImageView imageView = view.findViewById(R.id.imageView);
        TextView textViewName = view.findViewById(R.id.textViewName);
        TextView textViewCategory = view.findViewById(R.id.textViewCategory);
        TextView textViewDescription = view.findViewById(R.id.textViewDescription);
        Button button = view.findViewById(R.id.button);
        Button button2 = view.findViewById(R.id.button2);

        Films film = listOfFilms.get(position);

        imageView.setImageDrawable(context.getResources().getDrawable(film.getImage()));
        textViewName.setText(film.getName());
        textViewCategory.setText(film.getCategory());
        textViewDescription.setText(film.getDescription());

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                remove(position);
            }
        });
        return view;
    }

    private void remove(final int position) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle("Вы уверены?");

        builder.setPositiveButton("Да", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                listOfFilms.remove(position);

                //reloading the list
                notifyDataSetChanged();
            }
        });

        builder.setNegativeButton("Нет", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });

        AlertDialog alertDialog = builder.create();
        alertDialog.show();

    }

}
