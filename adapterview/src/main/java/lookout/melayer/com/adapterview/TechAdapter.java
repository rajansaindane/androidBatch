package lookout.melayer.com.adapterview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class TechAdapter extends RecyclerView.Adapter<TechAdapter.ViewHolder> {
    private Context context;
    private List<String> technologies;

    public TechAdapter(Context context, List<String> technologies) {
        this.context = context;
        this.technologies = technologies;
    }

    @NonNull
    @Override
    public TechAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.single_technology, viewGroup, false);
        return new TechAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TechAdapter.ViewHolder holder, final int position) {
            holder.getTech().setText(technologies.get(position));
            holder.getTech().setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(context, technologies.get(position), Toast.LENGTH_SHORT).show();
                }
            });

    }

    @Override
    public int getItemCount() {
        return technologies.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }

        TextView  getTech()
        {
            return itemView.findViewById(R.id.txtSingleTech);
        }
    }
}