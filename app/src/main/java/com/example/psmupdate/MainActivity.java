package com.example.psmupdate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import static android.content.ContentValues.TAG;

public class MainActivity extends AppCompatActivity {
    //Elements de la UI
    private TextView txtAccueil;
    private Button startBtn;
    private EditText editName;
    private ImageView logoImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*logoImg = (ImageView)findViewById(R.id.logoImg);
        Animation rotateImg = AnimationUtils.loadAnimation(getApplicationContext()), R.animation.rotate);
        logoImg.startAnimation(rotateImg);*/

        txtAccueil = (TextView)findViewById(R.id.txtHome);
        txtAccueil.setText("Bienvenue au Quizz PSM Update ! Testez et découvrez les informations sur la formation de PSM." +
                "Cette formation est faite de méandres et de secrets obscurs, mais aussi d’une force intérieure qui irradie sur la France entière. " +
                "Vous pouvez la défier en cherchant à relevant et révélant au monde entier ce qui compose son cœur. " +
                "Vous sentez vous prêt à relever ce défi ?");

        editName = (EditText)findViewById(R.id.name_id);

        startBtn = (Button)findViewById(R.id.btnStart);
        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name =  editName.getText().toString();
                if(name.isEmpty()){
                    Toast.makeText(MainActivity.this, "Veuillez entrer votre nom s'il vous plaît", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(MainActivity.this, Questions.class);
                    intent.putExtra("NAME", name);
                    startActivity(intent);
                    finish();
                }
            }
        });
    }
}