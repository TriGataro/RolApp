package com.example.calcdmg;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.Random;

public class RandomActivity extends AppCompatActivity {

    private TextView txtType,txtStat,txtQty,txtCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random);
        txtType= findViewById(R.id.txvType);
        txtStat= findViewById(R.id.txvStat);
        txtQty= findViewById(R.id.txvQty);
        txtCard= findViewById(R.id.txvCard);
        startRamdom();
    }

    private void startRamdom()
    {
        String [] arrayTypes ={"Piedra","Papel","Tijera"};
        String [] arrayStats ={"PS","Ataque","Defensa","Velocidad"};
        String [] arrayCards ={"Comodín","Hechizo","Herramienta","Habilidad","Héroe"};
        int [] arrayInt ={-5,-4,-3,-2,-1,0,1,2,3,4,5};

        Random r = new Random();
        int rand1 = r.nextInt(4 - 1) + 1;
        int rand2 = r.nextInt(5 - 1) + 1;
        int rand3 = r.nextInt(12 - 1) + 1;
        int rand4= r.nextInt(6 - 1) + 1;

        txtType.setText("Tipo: "+arrayTypes[--rand1]);
        txtStat.setText("Stat: "+arrayStats[--rand2]);
        txtQty.setText("Valor: "+arrayInt[--rand3]);
        txtCard.setText("Tarjeta: "+arrayCards[--rand4]);
    }
    public void setRamdomValues(View v)
    {
        startRamdom();
    }
    public void backHome(View v)
    {
        Intent i= new Intent(this,MainActivity.class);
        startActivity(i);
    }
}
