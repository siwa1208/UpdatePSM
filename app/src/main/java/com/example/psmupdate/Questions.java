package com.example.psmupdate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Questions extends AppCompatActivity {

    //Tableau des questions à poser
    String questions[] = {
            "Que signifie PSM ?",
            "Dans quelle université se trouve la formations PSM ?",
            "Depuis combien de temps la formations existe-t-elle ?",
            "Qui est la personne chargée de la formation ?\n (Attention, il y a deux responsables)",
            "D'où vient le nom Rhizome ?",
            "En quelle année a eu le premier projet Rhizome ?",
            "Quel a été le thème du projet Rhizome de l'année 2020-2021 ?",
            "Quel a été des projets Rhizome de l'année 2007 ?",
            "Quel est le thème de l’année 2013 ?",
            "Quel est le thème de l’année 2009 ?",
            "Parmi ses 4 propositions, laquelle n’est pas une option de 2ème année du master PSM ?",
            "À quelle année le nom Rhizome pour les projets a-t-il été trouvé ?",
            "De quel UFR le master PSM dépend-t-il ?",
            "Combien de départements comporte l’UFR Sciences, techniques et gestion de l’industrie (STGI) ?",
            "Dans quel département se situe le master PSM ?",
            "Sur quel laboratoire de recherche s’appuie la formation en Master PSM ?",
            "Comment s’appelle l’association des anciens étudiants du master PSM de Montbéliard ?",
            "Comment Monsieur Ioan Roxin appelle-t-il la formation pour plaisanter ?",
            "Lors des 15 ans du Master PSM, combien d’étudiants avaient déjà réussi brillamment la formation ?",
            "En moyenne, quelle est la part des étudiants dans le master PSM hors recrutement local et international ?",
            "Lors de la création du master PSM, quelle version  de Mac a été mise en vente ?",
            "Lors de la création du master PSM, quel support de stockage de données était le plus utilisé ?"
    };

    //Tableau des réponses correctes
    String bonneReponses[] = {
            "Produits et Services Multimédia",
            "Université de Franche-Comté",
            "20 ans",
            "Federico Tajariol",
            "D’une plante",
            "2001",
            "Les 20 ans de PSM",
            "Empreintes du mouvement",
            "Quel est votre objet",
            "Mobilité et développement durable",
            "Etude Numérique",
            "2004",
            "UFR Sciences, techniques et gestion de l’industrie",
            "5",
            "Multimédia",
            "Équipe OUN (Laboratoire ELLIADD) et département DISC (Institut Femto ST)",
            "Alumni PSM",
            "Passionnés et Super Motivés",
            "Plus de 500",
            "50%",
            "Mac OS X",
            "La disquette 3 pouces 1/2",

    };

    String choixReponses[] = {
            "Production de Service Multimédia", "Produits et Services Multimédia", "Plasturgie et Service Métallurgie", "Produit et Service de Mode",
            "Université de Paris", "Université Clermont Auvergne", "Université de Nantes", "Université de Franche-Comté",
            "5 ans", "15 ans", "20 ans", "30 ans",
            "Federico Tajariol", "Ioan Roxin", "Ahmed Mostefaoui", "Xavier Senente",
            "D’un événement", "D’une personnalité", "D’une plante", "D’un minerai",
            "2001", "2002", "2003", "2005",
            "Emoti’COM", "Hier, aujourd’hui et demain avec les médias numériques", "Les 20 ans de PSM", "Mémoire des lieux & des objets",
            "Les 5 ans de PSM", "Empreintes du mouvement", "Le patrimoine de Montbéliard", "Mémoire des lieux & des objets",
            "Quel est votre objet ?", "Les 15 ans de PSM", "Ces objets qui nous nourrissent !", "Hier, aujourd’hui et demain avec les médias numériques",
            "La tête dans les étoiles", "Le patrimoine de Montbéliard", "Quel est votre objet ?", "Mobilité et développement durable",
            "Design Sonore", "Intégration Numérique", "Etude Numérique", "Création Numérique",
            "2002", "2003", "2004", "2005",
            "UFR Sciences et santé", "UFR Sciences, techniques et gestion de l’industrie", "UFR Sciences juridiques", "économiques, politiques et de gestion, UFR Sports",
            "2", "3", "4", "5",
            "AES, droit, management", "Sciences de la vie et de l’environnement", "Multimédia", "Sciences et énergies",
            "Équipe OUN (Laboratoire ELLIADD) et département DISC (Institut Femto ST)", "Département Energie", "Centre de Recherches Juridique de Franche Comté", "Laboratoire Chrono Environnement",
            "Pristini PSM", "Schüler PSM", "Older PSM", "Alumni PSM",
            "Poste de Sécurité Microbiologique", "Passionnés et Super Motivés", "Projet Stratégique Montbéliardais", "Petite et Super Moche",
            "Moins de 100", "Entre 100 et 299", "Entre 300 et 500", "Plus de 500",
            "10%", "30%", "50%", "70%",
            "Mac OS", "Mac OS X", "Mac OS X 10.8 « Mountain Lion »", "System 0.0",
            "Le cloud", "La carte perforée", "La disquette « floppy »", "La disquette 3 pouces 1/2",
    };

    String explication[] = {
            "Le nom complet de la formation est Design Produit et Service Multimédia. La formation propose d’apprendre et de concevoir des produits multimédia (site web, application mobile), ainsi qu’à chercher et à imaginer de nouvelles façons de concevoir les services multimédias.",
            "La formation se trouve à Montbéliard, qui est un site délocalisé de l’Université de Franche-Comté de Besançon.",
            "Cette formation a été créée en 2001 et fête, en cette année 2021, ses 20 ans d'existence.",
            "Federico Tajariol est le directeur de la formation et aussi enseignant-chercheur dans la formation. Ses domaines d’excellence sont la communication et le design.",
            "Le nom de Rhizome provient de la racine de certaines plantes vivaces. Sa caractéristique réside dans les réserves qu’elle contient pour continuer à nourrir la plante qui lui est rattachée même si les conditions environnementales viennent à se dégrader.",
            "Officieusement, le premier Rhizome a commencé en 2001, mais il n’avait pas encore le nom de Rhizome. C’est plus tard que le nom de Rhizome a été adopté pour ce type de projet.",
            "Le thème pour l’année 2020-2021 est bien « Les 20 ans de PSM ». « Emoti’COM » a été le thème des projets proposés en 2010. « Hier, aujourd’hui et demain avec les médias numériques » a été le thème des projets proposés en 2015. « Mémoire des lieux & des objets » a été le thème des projets proposés en 2015 et 2016.",
            "Le thème pour l’année 2007 est bien « Empreintes du mouvement ». « Le patrimoine de Montbéliard » est un thème de projet qui a été proposé en 2010. « Mémoire des lieux & des objets » est un thème de projet qui a été proposé en 2016 et 2017. « Les 5 ans de PSM » n’a jamais été un thème proposé.",
            "Le thème pour l’année 2013 est bien « Quel est votre objet ? ». « Ces objets qui nous nourrissent ! » est un thème de projet qui a été proposé en 2011 et 2012. « Hier, aujourd’hui et demain avec les médias numériques » est un thème de projet qui a été proposé en 2015. « Les 15 ans de PSM » n’est pas un thème proposé.",
            "Le thème pour l’année 2009 est bien « Mobilité et développement durable ». « Quel est votre objet ? » est un thème de projet qui a été proposé en 2013. « Le patrimoine de Montbéliard » est un thème de projet qui a été proposé en 2014. « La tête dans les étoiles » n’est pas un thème proposé.",
            "L’étude numérique n’est pas une option qui est proposée par la formation en 2ème année de Master.",
            "C’est en 2004 que le nom de Rhizome a été trouvé pour les projets conduits en première année de Master PSM.",
            "Le master PSM dépend de l’UFR (unité de formation et de recherche) Sciences, techniques et gestion de l’industrie, plus communément appelée STGI.",
            "L’UFR STGI comporte 5 départements : AES, droit, management – Langues étrangères appliquées – Sciences et énergies – Sciences de la vie et de l’environnement - Multimédia.",
            "C’est le département Multimédia qui est celui où le master PSM est implanté. D’ailleurs, le M de PSM signifie multimédia.",
            "Ce sont les travaux des enseignants-chercheurs de l’Équipe OUN (Laboratoire ELLIADD) et du département DISC (Institut Femto ST) qui irriguent les cours du Master PSM",
            "Les anciens étudiants ont créé l’Alumni PSM. Alumnus, en latin, signifie élève et alumni signifie diplômé d’une université. Le nom prend donc tout son sens, puisqu’il s’agit des anciens diplômés du master PSM",
            "Citation du professeur Ioan Roxin dans le journal local de Montbéliard en 2016, lors du projet Rhizome « La mémoire des lieux et des objets ».",
            "Selon un article diffusé par France 3 Bourgogne Franche-Comté, ce sont pas moins de 537 Masters qui ont été délivrés (publication du 26/11/2016).",
            "Selon Ioan Roxin (interview France 3, relayé par PlaSMa SLIC PSM), la part des étudiants qui sont issus de l’international se situe à 10 - 15 %, la part des étudiants hors Franche-Comté, 50 %, et donc localement, entre 35 et 40 %.",
            "En 1984, le System 0.0 est apparu. En 1997, c’est le tour du Mac OS. Le Mac OS X 10.8 « Mountain Lion » est présenté en 2012. C’est donc bien le Mac OS X qui est présenté en 2001, l’année de création du master PSM.",
            "Le plus ancien des supports présentés est la carte perforée (brevetée en 1928). La disquette « floppy » ou 5 pouces ¼ date, elle, de 1976. Dans les années 1990-2000, la disquette 3 pouces ½ était le moyen de stockage le plus utilisé. Le cloud, même s’il date des années 1990, n’est devenu un lieu de stockage des données grand public qu’à compter des années 2005-2010."
    };

    public static int
            nbScore = 0,
            nbCorrect = 0,
            nbFalse = 0,
            cmpt = 0;

    //ajouter les variables à utiliser lié à la UI
    RadioGroup rgroup;
    RadioButton btn1, btn2, btn3, btn4;
    private TextView txtResp, txtQuest, score, txtBar;
    private Button btnNext;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);

        //On récupère le nom de l'utilisateur
        String name = getIntent().getStringExtra("NAME");

        progressBar = (ProgressBar)findViewById(R.id.quizzProgressBar);
        txtBar = (TextView)findViewById(R.id.tv_progress);

        score = (TextView) findViewById(R.id.score);

        txtQuest = (TextView)findViewById(R.id.txtQuest);
        txtResp = (TextView)findViewById(R.id.textView);

        //Texte pour chaque option
        btn1 = (RadioButton)findViewById(R.id.radioButton1);
        btn2 = (RadioButton)findViewById(R.id.radioButton2);
        btn3 = (RadioButton)findViewById(R.id.radioButton3);
        btn4 = (RadioButton)findViewById(R.id.radioButton4);

        //Texte pour les questions
        txtQuest.setText(questions[cmpt]);

        //Texte pour chaque option
        btn1.setText(choixReponses[0]);
        btn2.setText(choixReponses[1]);
        btn3.setText(choixReponses[2]);
        btn4.setText(choixReponses[3]);

        btnNext = (Button) findViewById(R.id.btnTest);
        rgroup = (RadioGroup) findViewById(R.id.radioGroup); //radioGroup wrapper de tous les radios btn

        //cmpt+=1;//màj la progress bar



        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Si le user n'a rien sélectionné
                if (rgroup.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getApplicationContext(), "Please select one choice", Toast.LENGTH_SHORT).show();
                    return;
                }

                //Récup l'id du btn sélectionné
                RadioButton uniqueans = (RadioButton)findViewById(rgroup.getCheckedRadioButtonId());
                String ansText = uniqueans.getText().toString();

                if(ansText.equals(bonneReponses[cmpt])) {
                    nbCorrect++;
                    txtResp.setText(explication[cmpt]);
                    //Toast.makeText(getApplicationContext(), "Bonne réponse", Toast.LENGTH_SHORT).show();
                    /*Toast toast = Toast.makeText(getApplicationContext(), explication[cmpt], Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.TOP | Gravity.CENTER, 50, 50);
                    toast.show();*/
                } else {
                    nbFalse++;
                    txtResp.setText(explication[cmpt]);
                    //Toast.makeText(getApplicationContext(), "Mauvaise réponse", Toast.LENGTH_SHORT).show();
                    /*Toast toast = Toast.makeText(getApplicationContext(), explication[cmpt], Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.TOP | Gravity.CENTER, 50, 50);
                    toast.show();*/
                }
                //Passe aux questions suivantes
                cmpt++;

                //Si le score n'est pas null lui attribuer le nb de réponses correctes
                if (score != null) {
                    score.setText("Score : " + nbCorrect);
                    //Si l'index des questions est inférieur à la taille réelle du nb de questions
                    //Alors MàJ les questions et les réponses jusqu'au nb total de questions
                    //Sinon passer à la seconde Activity
                    if (cmpt < questions.length) {
                        txtQuest.setText(questions[cmpt]);
                        btn1.setText(choixReponses[cmpt * 4]);
                        btn2.setText(choixReponses[cmpt * 4 + 1]);
                        btn3.setText(choixReponses[cmpt * 4 + 2]);
                        btn4.setText(choixReponses[cmpt * 4 + 3]);
                        progressBar.setProgress(cmpt);
                        txtResp.setText(explication[cmpt]);
                    } else {
                        nbScore = nbCorrect;
                        Intent in = new Intent(getApplicationContext(), ResultatsQuizz.class);
                        in.putExtra("USERNAME", name);
                        startActivity(in);
                    }
                    txtBar.setText(cmpt + "/" + progressBar.getMax());
                }
                rgroup.clearCheck();
            }
        });
    }
}