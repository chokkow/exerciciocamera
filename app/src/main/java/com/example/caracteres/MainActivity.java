package com.example.caracteres;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;




public class MainActivity extends AppCompatActivity {

    EditText pa1, pa2, pa3;
    TextView pma, pme, pvo;
    Button btnver, btnt3;
    String p1, p2, p3,  V1, V2;
    double M1,M2, M3, mai,min;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pa1 = (EditText) findViewById (R.id.p1);
        pa2 = (EditText) findViewById (R.id.p2);
        pa3 = (EditText) findViewById (R.id.p3);
        btnver = (Button)findViewById(R.id.ver);
        pma = (TextView)findViewById(R.id.V1);
        pme = (TextView)findViewById(R.id.V2);
        btnt3 = (Button)findViewById(R.id.t3);
    }
    public void Contar(View view){


        p1 = (pa1.getText().toString());
        p2 = (pa2.getText().toString());
        p3 = (pa3.getText().toString());
        M1 = p1.length();
        M2 = p2.length();
        M3 = p3.length();
        if(M1>= M2 && M1>=M3) {
            mai = M1;
        }
        if(M2>= M1 && M2>=M3){
            mai = M2;
        }
        if(M3>= M1 && M3>=M2){
            mai = M3;
        }
        if(M1<= M2 && M1<=M3){
            min = M1;
        }
        if(M2<= M1 && M2<=M3){
            min = M2;
        }
        if(M3<= M1 && M3<=M2){
            min = M3;
        }
        if(mai==M1){
            pma.setText(p1);
        }

        if(mai==M2){
        pma.setText(p2);
    }
        if(mai==M3){
        pma.setText(p3);
    }
        if(min==M1){
            pme.setText(p1);
        }
        if(min==M2){
            pme.setText(p2);
        }
        if(min==M3){
            pme.setText(p3);
        }

        btnver.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, tela2.class);
                startActivity(it);
                it.putExtra("PARAM_ACTIVITY1", pma
                        .getText().toString());
                startActivityForResult(it, 1);

                it.putExtra("PARAM2_ACTIVITY1", pme
                        .getText().toString());
                startActivityForResult(it, 1);
            }
        });
   }

        public void Mudar(View view) {
            btnt3.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent it = new Intent(MainActivity.this, tela3.class);
                    startActivity(it);
                }
            });
    }
}
