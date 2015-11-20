package com.example.com.livescore2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Resultat> LiveScore = new ArrayList<Resultat>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        populateResultatList();
        populateListView();
        registerClickCallback();
    }


    private void populateResultatList() {
        LiveScore.add(new Resultat(R.drawable.club,"Club","0","Espérence",R.drawable.est,"1","Ligue I"));
        LiveScore.add(new Resultat(R.drawable.est,"Espérence","1","Club",R.drawable.club,"0","Ligue II"));
        LiveScore.add(new Resultat(R.drawable.club,"Club","0","Espérence",R.drawable.est,"1","Ligue I"));
        LiveScore.add(new Resultat(R.drawable.est,"Espérence","1","Club",R.drawable.club,"0","Ligue II"));
        LiveScore.add(new Resultat(R.drawable.club, "Club", "0", "Espérence", R.drawable.est, "1","Ligue I"));
        LiveScore.add(new Resultat(R.drawable.est,"Espérence","1","Club",R.drawable.club,"0","Ligue II"));
        LiveScore.add(new Resultat(R.drawable.club,"Club","0","Espérence",R.drawable.est,"1","Ligue I"));
        LiveScore.add(new Resultat(R.drawable.est,"Espérence","1","Club",R.drawable.club,"0","Ligue II"));
        LiveScore.add(new Resultat(R.drawable.club,"Club","0","Espérence",R.drawable.est,"1","Ligue I"));
        LiveScore.add(new Resultat(R.drawable.est,"Espérence","1","Club",R.drawable.club,"0","Ligue II"));

        LiveScore.add(new Resultat(R.drawable.est,"Espérence","1","Club",R.drawable.club,"0","Ligue I"));
        LiveScore.add(new Resultat(R.drawable.club,"Club","0","Espérence",R.drawable.est,"1","Ligue II"));
        LiveScore.add(new Resultat(R.drawable.est,"Espérence","1","Club",R.drawable.club,"0","Ligue I"));
        LiveScore.add(new Resultat(R.drawable.club,"Club","0","Espérence",R.drawable.est,"1","Ligue II"));
        LiveScore.add(new Resultat(R.drawable.est,"Espérence","1","Club",R.drawable.club,"0","Ligue I"));
        LiveScore.add(new Resultat(R.drawable.est,"Espérence","1","Club",R.drawable.club,"0","Ligue II"));
        LiveScore.add(new Resultat(R.drawable.club,"Club","0","Espérence",R.drawable.est,"1","Ligue I"));
        LiveScore.add(new Resultat(R.drawable.est,"Espérence","1","Club",R.drawable.club,"0","Ligue II"));
        LiveScore.add(new Resultat(R.drawable.club,"Club","0","Espérence",R.drawable.est,"1","Ligue I"));
        LiveScore.add(new Resultat(R.drawable.est,"Espérence","1","Club",R.drawable.club,"0","Ligue II"));
        LiveScore.add(new Resultat(R.drawable.est,"Espérence","1","Club",R.drawable.club,"0","Ligue I"));
        LiveScore.add(new Resultat(R.drawable.club,"Club","0","Espérence",R.drawable.est,"1","Ligue II"));
        LiveScore.add(new Resultat(R.drawable.est,"Espérence","1","Club",R.drawable.club,"0","Ligue I"));
        LiveScore.add(new Resultat(R.drawable.club,"Club","0","Espérence",R.drawable.est,"1","Ligue II"));
        LiveScore.add(new Resultat(R.drawable.est,"Espérence","1","Club",R.drawable.club,"0","Ligue I"));
        LiveScore.add(new Resultat(R.drawable.est,"Espérence","1","Club",R.drawable.club,"0","Ligue II"));
        LiveScore.add(new Resultat(R.drawable.club,"Club","0","Espérence",R.drawable.est,"1","Ligue I"));
        LiveScore.add(new Resultat(R.drawable.est,"Espérence","1","Club",R.drawable.club,"0","Ligue II"));
        LiveScore.add(new Resultat(R.drawable.club,"Club","0","Espérence",R.drawable.est,"1","Ligue I"));
        LiveScore.add(new Resultat(R.drawable.est,"Espérence","1","Club",R.drawable.club,"0","Ligue II"));
    }

    private void populateListView() {
        ArrayAdapter<Resultat> adapter = new MyListAdapter();
        ListView list = (ListView) findViewById(R.id.ResultatListeView);
        list.setAdapter(adapter);
    }


    private void registerClickCallback() {
        ListView list = (ListView) findViewById(R.id.ResultatListeView);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View viewClicked,
                                    int position, long id) {

                Resultat clickedCar = LiveScore.get(position);
                /*String message = "les Détaille de Match" ;
                Toast.makeText(MainActivity.this, message, Toast.LENGTH_LONG).show();*/

                Intent i=new Intent(MainActivity.this,Main2Activity.class);

                i.putExtra("tof","Welcome dans une Autre Page pour gerer les Détaille de la Match !!!!" ) ;
                startActivity(i);


            }
        });
    }

    private class MyListAdapter extends ArrayAdapter<Resultat> {
        public MyListAdapter() {
            super(MainActivity.this, R.layout.item_view,LiveScore);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            // Make sure we have a view to work with (may have been given null)
            View itemView = convertView;
            if (itemView == null) {
                itemView = getLayoutInflater().inflate(R.layout.item_view, parent, false);
            }

            // Find the LiveScoreto work with.
            Resultat currentCar = LiveScore.get(position);

            // Fill get Image
            ImageView imageView = (ImageView)itemView.findViewById(R.id.item_img1);
            imageView.setImageResource(currentCar.getIcon1());

            // GET NOM EQUIPE:
            TextView makeText = (TextView) itemView.findViewById(R.id.item_equipe1);
            makeText.setText(currentCar.getEquipe1());

            // GET RESULTAT
            TextView yearText = (TextView) itemView.findViewById(R.id.item_res1);
            yearText.setText("" + currentCar.getResultat1()+" - "+currentCar.getResultat2());



            // GET NOM EQUIPE 2
            TextView condionText1 = (TextView) itemView.findViewById(R.id.item_equipe2);
            condionText1.setText(currentCar.getEquipe2());

            // GET IMAGE 2
            ImageView imageView1 = (ImageView)itemView.findViewById(R.id.item_img2);
            imageView1.setImageResource(currentCar.getIcon2());

            TextView Statut1 = (TextView) itemView.findViewById(R.id.Statu);
            Statut1.setText(currentCar.getStatut());

            return itemView;
        }
    }


















}
