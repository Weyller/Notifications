package ca.qc.lbpsb.fusion.notifications;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {

    Button btnParent, btnEmployee, btnLogin;

    EditText editEmail, editPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    btnParent = (Button)findViewById(R.id.btnParent);

    btnEmployee = (Button)findViewById(R.id.btnEmployee);

    btnLogin = (Button)findViewById(R.id.btnLogin);
    //---------------------------------------


    btnLogin.setOnClickListener(new View.OnClickListener() {


        @Override
        public void onClick(View view) {

            // check credentials

            
        }
    });


    }


}
