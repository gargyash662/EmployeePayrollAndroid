package com.yash.employeepayrollsystem;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText userid;
    private EditText password;
    private Button   Submit;
    private Button Signup;
    private CheckBox Rememberme;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        SharedPreferences mSharedPreferences = getSharedPreferences("myPref", MODE_PRIVATE);
        userid = (EditText) findViewById(R.id.userid);
        password = (EditText) findViewById(R.id.password);
        Submit = (Button) findViewById(R.id.Submit);
        Signup = (Button) findViewById(R.id.Signup);
        Rememberme = (CheckBox) findViewById(R.id.RememberMe) ;
        final SharedPreferences.Editor mEditor = mSharedPreferences.edit();


       if(mSharedPreferences.getString("UserId",null) !=null)
       {
           userid.setText(mSharedPreferences.getString("Userid" , ""));
           password.setText(mSharedPreferences.getString("password" ,""));
           Rememberme.setChecked(true);

       }
          Submit.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  String userName = userid.getText().toString();
                  String passwordu = password.getText().toString();
                  if(userName.equals("admin") && passwordu.equals("hello"))
                  {
                      if (Rememberme.isChecked())
                      {
                          mEditor.putString("userid" , userName);
                          mEditor.putString("password" , passwordu);
                      }
                      else {
                          mEditor.remove("userid");
                          mEditor.remove("password");
                      }
                      mEditor.apply();
                      Toast.makeText(getApplicationContext(),"Login Sucess" , Toast.LENGTH_LONG).show();
                      Intent mintent = new Intent(LoginActivity.this,EmployeeDetailsActivity.class);
                      mintent.putExtra("Name", "Yash Garg");
                      mintent.putExtra("Email" , "gargyash662@gmail.com");

                      startActivity(mintent);
                  }
                  else{
                      Toast.makeText(getApplicationContext(), "Invalid UserId or Password", Toast.LENGTH_SHORT).show();
                  }
              }
          });









    }
}
