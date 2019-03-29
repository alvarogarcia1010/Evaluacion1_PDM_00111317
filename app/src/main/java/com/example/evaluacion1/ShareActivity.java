package com.example.evaluacion1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.evaluacion1.utilities.AppConstants;

public class ShareActivity extends AppCompatActivity {

    private Button mBtnShare;
    private TextView mUsername, mEmail, mTotal;

    private TextView mCount1;
    private TextView mCount2;
    private TextView mCount3;
    private TextView mCount4;
    private TextView mCount5;
    private TextView mCount6;
    private TextView mCount7;
    private TextView mCount8;
    private TextView mCount9;

    private String info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);

        BindComponents();

        Intent mIntent = getIntent();
        if (mIntent!=null) {
            this.info = mIntent.getStringExtra(AppConstants.TEXT_KEY);
            String [] information = this.info.split(",");

            this.mCount1.setText(information[0]);
            this.mCount2.setText(information[1]);
            this.mCount3.setText(information[2]);
            this.mCount4.setText(information[3]);
            this.mCount5.setText(information[4]);
            this.mCount6.setText(information[5]);
            this.mCount7.setText(information[6]);
            this.mCount8.setText(information[7]);
            this.mCount9.setText(information[8]);
            this.mUsername.setText("Usuario: " +information[9]);
            this.mEmail.setText("Correo electronico: " +information[10]);
            this.mTotal.setText("Total de productos: " + information[11]);
        }

        mBtnShare.setOnClickListener(v->{
            setInfo();
            Intent mIntentShare = new Intent();
            mIntentShare.setAction(Intent.ACTION_SEND);
            mIntentShare.setType("text/plain");
            mIntentShare.putExtra(Intent.EXTRA_TEXT, this.info);
            startActivity(mIntentShare);
        });
    }

    private void BindComponents()
    {

        this.mCount1 = findViewById(R.id.count_1);
        this.mCount2 = findViewById(R.id.count_2);
        this.mCount3 = findViewById(R.id.count_3);
        this.mCount4 = findViewById(R.id.count_4);
        this.mCount5 = findViewById(R.id.count_5);
        this.mCount6 = findViewById(R.id.count_6);
        this.mCount7 = findViewById(R.id.count_7);
        this.mCount8 = findViewById(R.id.count_8);
        this.mCount9 = findViewById(R.id.count_9);


        this.mTotal = findViewById(R.id.total);
        this.mUsername = findViewById(R.id.username);
        this.mEmail = findViewById(R.id.email);
        this.mBtnShare = findViewById(R.id.share);
    }

    public void setInfo()
    {
        this.info = "";


        this.info += "Producto 1: " + this.mCount1.getText() + ",";
        this.info += "Producto 2: " + this.mCount2.getText() + ",";
        this.info += "Producto 3: " + this.mCount3.getText() + ",";
        this.info += "Producto 4: " + this.mCount4.getText() + ",";
        this.info += "Producto 5: " + this.mCount5.getText() + ",";
        this.info += "Producto 6: " + this.mCount6.getText() + ",";
        this.info += "Producto 7: " + this.mCount7.getText() + ",";
        this.info += "Producto 8: " + this.mCount8.getText() + ",";
        this.info += "Producto 9: " + this.mCount9.getText() + ",";
        this.info += this.mUsername.getText() + ",";
        this.info += this.mEmail.getText() + ",";
        this.info += this.mTotal.getText() + ",";
    }
}
