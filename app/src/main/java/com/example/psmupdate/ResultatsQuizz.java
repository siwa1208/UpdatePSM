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
    private Button btnQuit, btnInscription, btnSite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultats_quizz);

        res = (TextView)findViewById(R.id.resultat);

        Intent intent = getIntent();
        String str = intent.getStringExtra("USERNAME");

        if(Questions.nbCorrect >= 0 && Questions.nbCorrect <= 10){
            res.setText("Bravo " + str + " ton score est de : "+Questions.nbCorrect+"/"+Questions.cmpt + " \uD83D\uDE42 \n " +
                    " L'équipe PSM Update te remercie d'avoir participé," +
                    " en espérant que ça t'ai plu et que tu as appris des choses concernant le Master de PSM !" +
                    "\n Si tu souhaites avoir plus d'informations sur la formation ou Candidater clique sur l'un des boutons ci dessous. À bientôt \uD83D\uDE01 !");
        } else {
            res.setText("Félicitation " + str + " ton score est de : " + Questions.nbCorrect +"/"+ Questions.cmpt + " \uD83C\uDF89\uD83C\uDF89 \n" +
                            "L'équipe PSM Update te remercie d'avoir participé," +
                            " en espérant que ça t'ai plu et que tu as appris des choses concernant le Master de PSM !" +
                            "Si tu souhaites avoir plus d'informations sur la formation ou Candidater clique sur l'un des boutons ci dessous. À bientôt \uD83D\uDE01 !");
        }

        btnQuit = (Button)findViewById(R.id.quitButton);
        btnQuit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ResultatsQuizz.this, MainActivity.class);
                finish();
                //startActivity(intent);
            }
        });

        btnInscription = (Button)findViewById(R.id.inscription);
        btnInscription.setOnClickListener(new Button.OnClickListener(){
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