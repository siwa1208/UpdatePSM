package com.example.psmupdate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultatsQuizz extends AppCompatActivity {
    private TextView res;
    private Button btnrestart, btnInscription, btnSite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultats_quizz);

        res = (TextView)findViewById(R.id.resultat);

        Intent intent = getIntent();
        String str = intent.getStringExtra("USERNAME");

        if(Questions.nbCorrect >= 0 && Questions.nbCorrect <= 5){
            res.setText("Hello " + str + " ton score est de : "+Questions.nbCorrect+"/"+Questions.cmpt + " \uD83D\uDE10 Tu peux recommencer si tu le veux \uD83D\uDE01 On espère que ça t'as quand même plu !" +
                    "\n Si tu souhaites avoir plus d'informations sur la formation ou Candidater clique sur l'un des boutons ci dessous. J'espère que tu as beaucoup appris sur la" +
                    "formation grâce à ce petit Quizz surprise \uD83D\uDE01");
        } else if (Questions.nbCorrect >= 5 && Questions.nbCorrect <= 15){
            res.setText("Ouah bravo "+ str +" ton score est de : " + Questions.nbCorrect +"/"+ Questions.cmpt + "\uD83C\uDF89 si tu veux améliorer ton score rien ne t'empêche de recommencer pour mieux connaître la formation \uD83D\uDE01" +
                    "\n Si tu souhaites avoir plus d'informations sur la formation ou Candidater clique sur l'un des boutons ci dessous. J'espère que tu as beaucoup appris sur la" +
                    " formation grâce à ce petit Quizz surprise \uD83D\uDE01");
        } else if (Questions.nbCorrect > 15 && Questions.nbCorrect <= Questions.cmpt){
            res.setText("Félicitation " + str + " ton score est de : " + Questions.nbCorrect +"/"+ Questions.cmpt + " \uD83C\uDF89\uD83C\uDF89 \n" +
                    "Si tu souhaites avoir plus d'informations sur la formation ou Candidater clique sur l'un des boutons ci dessous. \n J'espère que tu as beaucoup appris sur la " +
                    " formation grâce à ce petit Quizz surprise \uD83D\uDE01");
        }

        btnrestart = (Button)findViewById(R.id.restartButton);
        btnrestart.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ResultatsQuizz.this, MainActivity.class);
                startActivity(intent);
            }
        });

        btnInscription = (Button)findViewById(R.id.inscription);
        btnInscription.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("http://formation.univ-fcomte.fr/master/design-produits-et-services-multimedia"));
                startActivity(viewIntent);
            }
        });

        btnSite = (Button)findViewById(R.id.retourSite);
        btnSite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


    }
}