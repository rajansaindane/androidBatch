package android.codekul.com.interactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SecondActivityActivity extends AppCompatActivity {

    Button buttonNext,buttonPrevious;
    Bundle bundle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_activity);
        bundle=getIntent().getExtras();
        if (bundle!=null)
        {
            Log.i("@SecondActivity","bundle data=====>"+bundle.getString("from"));
            Toast.makeText(this, bundle.getString("from"), Toast.LENGTH_SHORT).show();
        }
        buttonNext=findViewById(R.id.btnSecondCallThird);
        buttonPrevious=findViewById(R.id.btnSecondCallFirst);
        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SecondActivityActivity.this,ThirdActivity.class);
                startActivity(intent);
            }
        });
        buttonPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SecondActivityActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
