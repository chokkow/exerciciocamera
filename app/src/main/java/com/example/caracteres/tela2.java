package com.example.caracteres;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;





public class tela2 extends AppCompatActivity {
    TextView pma, pme;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        pma = (TextView) findViewById(R.id.V1);
        Bundle extras = getIntent().getExtras();
        String paramRecebidoPelaActivity1 = extras.getString("PARAM_ACTIVITY1");
        pma.setText(paramRecebidoPelaActivity1);

        pme = (TextView) findViewById(R.id.V2);
        Bundle extras1 = getIntent().getExtras();
        String paramRecebidoPelaActivity1i = extras.getString("PARAM2_ACTIVITY1");
        pme.setText(paramRecebidoPelaActivity1i);

    }
}
