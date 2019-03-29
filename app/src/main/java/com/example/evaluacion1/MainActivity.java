package com.example.evaluacion1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.evaluacion1.utilities.AppConstants;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private LinearLayout mArticle1;
    private LinearLayout mArticle2;
    private LinearLayout mArticle3;
    private LinearLayout mArticle4;
    private LinearLayout mArticle5;
    private LinearLayout mArticle6;
    private LinearLayout mArticle7;
    private LinearLayout mArticle8;
    private LinearLayout mArticle9;

    private TextView mCount1;
    private TextView mCount2;
    private TextView mCount3;
    private TextView mCount4;
    private TextView mCount5;
    private TextView mCount6;
    private TextView mCount7;
    private TextView mCount8;
    private TextView mCount9;

    private EditText mUsername, mEmail;

    private Button mButton;

    private String info;

    private Integer count1, count2, count3, count4, count5, count6, count7, count8, count9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BindComponents();

        mButton.setOnClickListener(v->{
            setInfo();
            Intent mIntent = new Intent(MainActivity.this, ShareActivity.class);
            mIntent.putExtra(AppConstants.TEXT_KEY, this.info);
            startActivity(mIntent);
        });
    }

    @Override
    public void onClick(View v) {
        int viewId = v.getId();
        Log.i("id", viewId+"" );
        switch(viewId)
        {
            case R.id.article_1:
                this.count1++;
                this.mCount1.setText(count1.toString());
                break;
            case R.id.article_2:
                this.count2++;
                this.mCount2.setText(count2.toString());
                break;
            case R.id.article_3:
                this.count3++;
                this.mCount3.setText(count3.toString());
                break;
            case R.id.article_4:
                this.count4++;
                this.mCount4.setText(count4.toString());
                break;
            case R.id.article_5:
                this.count5++;
                this.mCount5.setText(count5.toString());
                break;
            case R.id.article_6:
                this.count6++;
                this.mCount6.setText(count6.toString());
                break;
            case R.id.article_7:
                this.count7++;
                this.mCount7.setText(count7.toString());
                break;
            case R.id.article_8:
                this.count8++;
                this.mCount8.setText(count8.toString());
                break;
            case R.id.article_9:
                this.count9++;
                this.mCount9.setText(count9.toString());
                break;

        }

    }

    private void BindComponents()
    {
        count1 = count2 = count3 = count4 = count5 = count6 = count7 = count8 = count9 = 0;

        this.mArticle1 = findViewById(R.id.article_1);
        this.mArticle2 = findViewById(R.id.article_2);
        this.mArticle3 = findViewById(R.id.article_3);
        this.mArticle4 = findViewById(R.id.article_4);
        this.mArticle5 = findViewById(R.id.article_5);
        this.mArticle6 = findViewById(R.id.article_6);
        this.mArticle7 = findViewById(R.id.article_7);
        this.mArticle8 = findViewById(R.id.article_8);
        this.mArticle9 = findViewById(R.id.article_9);

        this.mCount1 = findViewById(R.id.count_1);
        this.mCount2 = findViewById(R.id.count_2);
        this.mCount3 = findViewById(R.id.count_3);
        this.mCount4 = findViewById(R.id.count_4);
        this.mCount5 = findViewById(R.id.count_5);
        this.mCount6 = findViewById(R.id.count_6);
        this.mCount7 = findViewById(R.id.count_7);
        this.mCount8 = findViewById(R.id.count_8);
        this.mCount9 = findViewById(R.id.count_9);

        this.mArticle1.setOnClickListener(this);
        this.mArticle2.setOnClickListener(this);
        this.mArticle3.setOnClickListener(this);
        this.mArticle4.setOnClickListener(this);
        this.mArticle5.setOnClickListener(this);
        this.mArticle6.setOnClickListener(this);
        this.mArticle7.setOnClickListener(this);
        this.mArticle8.setOnClickListener(this);
        this.mArticle9.setOnClickListener(this);


        this.mUsername = findViewById(R.id.username);
        this.mEmail = findViewById(R.id.password);

        this.mButton = findViewById(R.id.send);
    }

    public void setInfo()
    {
        this.info = "";

        int total = count1 + count2 + count3 + count4+ count5+ count6+ count7+ count8+ count9;
        this.info += this.count1.toString() + ",";
        this.info += this.count2.toString() + ",";
        this.info += this.count3.toString() + ",";
        this.info += this.count4.toString() + ",";
        this.info += this.count5.toString() + ",";
        this.info += this.count6.toString() + ",";
        this.info += this.count7.toString() + ",";
        this.info += this.count8.toString() + ",";
        this.info += this.count9.toString() + ",";
        this.info += this.mUsername.getText() + ",";
        this.info += this.mEmail.getText() + ",";
        this.info += total;

    }
}
