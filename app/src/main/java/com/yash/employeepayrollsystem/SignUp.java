package com.yash.employeepayrollsystem;

import android.app.ProgressDialog;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

public class SignUp extends AppCompatActivity {

    private static final String TAG = SignUp.class.getName();
    private EditText Name;
    private EditText Password;
    private EditText Email;
    private Button Signup;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up2);

        Name =(EditText) findViewById(R.id.userid);
        Email= (EditText) findViewById(R.id.Email);
        Password = (EditText) findViewById(R.id.password);
        Signup =(Button) findViewById(R.id.Signup);

        Signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                signup();
            }
        });

        public void signup()
        {
            Log.d(TAG, "Signup");

            if(!validate())
            {
               onSignupFailed();
               return;;
            }

            signup.setEnabled(False);
            final ProgressDialog progressDialog =new ProgressDialog(SignUp.this , R.style.AppTheme );
            progressDialog.setIndeterminate(true);
            progressDialog.setMessage("Creating Please Wait .......");
            progressDialog.show();

            final String name = Name.getText().toString();
            final String email = Email.getText().toString();
            final String password = Password.getText().toString();

            new android.os.Handler().postDelayed(
                    new Runnable()
                    {
                        public void run()
                        {
                            onSignUpSuccess(name, email, password);
                            progressDialog.dismiss();
                        }
                    }, 3000);




        }



    }

    private void onSignUpSuccess(String name, String email, String password) {

        final  User nuser = new User();
    }
}
