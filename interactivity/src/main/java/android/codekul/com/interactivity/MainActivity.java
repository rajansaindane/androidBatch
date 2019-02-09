package android.codekul.com.interactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button;
    Bundle  bundle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        button.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.button :
                nextActivity();
                break;

        }
    }


    void nextActivity()
    {
        bundle=new Bundle();
        bundle.putString("from","first");
        Intent intent=new Intent(MainActivity.this,SecondActivityActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
