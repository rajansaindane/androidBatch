package lookout.melayer.com.adapterview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewActivity extends AppCompatActivity {
    Bundle bundle;
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mRecyclerView = findViewById(R.id.recyclerView);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        List<String> list=new ArrayList<>();
        list.add("C");
        list.add("Cpp");
        list.add("Java");
        list.add("Android");
        list.add("Python");
        list.add("Angular");
        list.add("C");
        list.add("Cpp");
        list.add("Java");
        list.add("Android");
        list.add("Python");
        list.add("Angular");
        list.add("C");
        list.add("Cpp");
        list.add("Java");
        list.add("Android");
        list.add("Python");
        list.add("Angular");
        list.add("Cpp");
        list.add("Java");
        list.add("Android");
        list.add("Python");
        list.add("Angular");
        list.add("C");
        list.add("Cpp");
        list.add("Java");
        list.add("Android");
        list.add("Python");
        list.add("Angular");

        TechAdapter adapter=new TechAdapter(this,list);
        mRecyclerView.setAdapter(adapter);
       /* bundle=getIntent().getExtras();
        if (bundle!=null)
        {
            Toast.makeText(this, bundle.getString("id"), Toast.LENGTH_SHORT).show();
        }*/
    }
}
