package com.yash.employeepayrollsystem;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    private EditText userid;
    private EditText password;
    private Button   Submit;
    private Button Signup;
    private CheckBox Rememberme;
    SharedPreferences mSharedPreferences;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        userid = (EditText) findViewById(R.id.userid);
        password = (EditText) findViewById(R.id.password);
        Submit = (Button) findViewById(R.id.Submit);
        Signup = (Button) findViewById(R.id.Signup);
        Rememberme = (CheckBox) findViewById(R.id.RememberMe) ;

         mSharedPreferences = getSharedPreferences("myPref", MODE_PRIVATE);
       if(mSharedPreferences.getString("UserId",null) !=null)
       {
           userid.setText(mSharedPreferences.getString("Userid" , ""));
           password.setText(mSharedPreferences.getString("password" ,""));
           Rememberme.setChecked(true);

       }


    }
}
