package android.codekul.com.imagedemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ListActivity extends AppCompatActivity {
    ListView listView;
    TextView textView;
    String[] listItem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        listView=findViewById(R.id.listView);
        textView=findViewById(R.id.txtTech);
        listItem=getResources().getStringArray(R.array.array_technology);
        final ArrayAdapter<String> adapter=new ArrayAdapter<>(this,R.layout.single_list,R.id.txtTech,listItem);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                startActivity(new Intent(ListActivity.this,NotificationsActivity.class));
                Toast.makeText(ListActivity.this,adapter.getItem(position), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
