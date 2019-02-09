package android.codekul.com.decandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText userName,password;
    Button btnLogin;
    TextView txtMessage;
    ImageView  image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       userName=findViewById(R.id.edtUserName);
       password=findViewById(R.id.edtPassword);
       btnLogin=findViewById(R.id.btnLogin);
       txtMessage=findViewById(R.id.txtMessage);
       image=findViewById(R.id.imgCar);

       image.setImageResource(R.drawable.car1);

       btnLogin.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
            /*   if (userName.getText().toString().isEmpty())
               {

               }
               else if(password.getText().toString().isEmpty())
               {

               }
               else {
                   txtMessage.setText(userName.getText() + " " + password.getText());
               }*/
               Intent intent=new Intent(MainActivity.this,RelativeLayoutActivity.class);
               startActivityForResult(intent,2);
               }
       });

        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode==2)
        {
            Toast.makeText(this, data.getStringExtra("msg"), Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show();

    }
}
