package com.example.nz.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText name, password;
    Button login;
    TextView textView;
    int number = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = (EditText) findViewById(R.id.userNameText);
        password = (EditText) findViewById(R.id.passwordText);
        login = (Button) findViewById(R.id.login);
        textView = (TextView) findViewById(R.id.textView);
        textView.setText("You have "+number+" chance");

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName = name.getText().toString();
                String userPassword = name.getText().toString();
               if(userName.equals("Admin") && userPassword.equals("123")){
                    Toast.makeText(MainActivity.this,"Your Log in complete",Toast.LENGTH_SHORT).show();
                }
                /*else {
                    number--;
                    textView.setText("You have "+number+" chance");
                    if(number == 0){
                        textView.setText("You have no chance to login please try again after close the app");
                        login.setEnabled(false);


                }
                 }*/
            }
        });




    }
}
