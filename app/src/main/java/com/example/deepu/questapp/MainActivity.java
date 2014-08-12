package com.example.deepu.questapp;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends Activity {
    EditText txt_userName;
    EditText txt_password;
    Button btn_login;
    public String username = null;
    public String password = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt_userName=(EditText)findViewById(R.id.editText_login);
        txt_password= (EditText) findViewById(R.id.editText_password);
        username=txt_userName.getText().toString();
        password=txt_password.getText().toString();
        btn_login=(Button)findViewById(R.id.buttonLogin);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_userName.setError(null);
                txt_password.setError(null);
                View focusView=null;
                boolean cancel=false;
                if(TextUtils.isEmpty(txt_userName.getText().toString())){
                    Log.d("IN USERNAME", "TESTING");
                    txt_userName.setError("Username is required!");
                    focusView=txt_userName;
                    cancel=true;

                }
                else if(TextUtils.isEmpty(txt_password.getText().toString())){
                    Log.d("IN PASSWORD","TESTING");
                    txt_password.setError("Password is required");
                    focusView=txt_password;
                    cancel=true;


                }
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
