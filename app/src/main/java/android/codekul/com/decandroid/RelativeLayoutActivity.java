package android.codekul.com.decandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RelativeLayoutActivity extends AppCompatActivity {

    Button click;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_layout);

    click=findViewById(R.id.click);
    click.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent=new Intent();
            intent.putExtra("msg","hello");
            setResult(2,intent);
            finish();
        }
    });
    }
}
