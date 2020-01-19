package test.com.assign_1;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn1,btn2,btn3,btn4,btn5;
    AutoFitEditText ret;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);
         ret = findViewById(R.id.rET);
         btn1 = findViewById(R.id.btn1);
         btn2 = findViewById(R.id.btn2);
         btn3 = findViewById(R.id.btn3);
         btn4 = findViewById(R.id.btn4);
         btn5 = findViewById(R.id.btn5);
         btn1.setOnClickListener(this);
         btn2.setOnClickListener(this);
         btn3.setOnClickListener(this);
         btn4.setOnClickListener(this);
         btn5.setOnClickListener(this);

    }

    @SuppressLint("ResourceAsColor")
    @Override
    public void onClick(View view) {
       switch(view.getId()){
           case R.id.btn1:
               ret.setBackgroundColor(getResources().getColor(R.color.btn1));
               break;
           case R.id.btn2:
               ret.setBackgroundColor(getResources().getColor(R.color.btn2));
               break;
           case R.id.btn3:
               ret.setBackgroundColor(getResources().getColor(R.color.btn3));
               break;
           case R.id.btn4:
               ret.setBackgroundColor(getResources().getColor(R.color.btn4));
               break;
           case R.id.btn5:
               ret.setBackgroundColor(getResources().getColor(R.color.btn5));
               break;


       }
    }
}
