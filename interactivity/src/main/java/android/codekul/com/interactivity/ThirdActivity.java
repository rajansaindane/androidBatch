package android.codekul.com.interactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ThirdActivity extends AppCompatActivity {
    Button button;
    Bundle bundle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        button=findViewById(R.id.btnThird);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bundle=new Bundle();
                bundle.putString("from","third");
                Intent intent=new Intent(ThirdActivity.this,SecondActivityActivity.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

    }
}
