package com.example.nagaraj.smsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
private Button btn;
    EditText n;
    EditText c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button) findViewById(R.id.button);
        n=(EditText) findViewById(R.id.editText);
        c=(EditText) findViewById(R.id.editText2);
        btn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.button){
            try{
                SmsManager smsManager=SmsManager.getDefault();
                smsManager.sendTextMessage(n.getText().toString(),null,c.getText().toString(),null,null);
                Toast.makeText(getApplicationContext(),"sms sent",Toast.LENGTH_SHORT).show();
            }catch (Exception e){
                Toast.makeText(getApplicationContext(),"not sent",Toast.LENGTH_SHORT).show();
                e.printStackTrace();
            }
        }

    }
}
