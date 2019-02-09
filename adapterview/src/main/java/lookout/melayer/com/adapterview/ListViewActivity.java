package lookout.melayer.com.adapterview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class ListViewActivity extends AppCompatActivity {

    ListView listView;
    TextView textView;
    String[]  technologies;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.listView);
        technologies=getResources().getStringArray(R.array.technologies);
        final ArrayAdapter<String>  adapter=new ArrayAdapter<>(this,R.layout.single_technology,
                R.id.txtSingleTech,technologies);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Bundle bundle=new Bundle();
                bundle.putString("id",adapter.getItem(position));
                startActivity(new Intent(ListViewActivity.this,RecyclerViewActivity.class)
                .putExtras(bundle));
                //Toast.makeText(ListViewActivity.this, adapter.getItem(position), Toast.LENGTH_SHORT).show();

            }
        });
    }
}
