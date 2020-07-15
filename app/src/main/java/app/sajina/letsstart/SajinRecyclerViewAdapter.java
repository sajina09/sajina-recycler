package app.sajina.letsstart;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class SajinRecyclerViewAdapter extends RecyclerView.Adapter<SajinRecyclerViewAdapter.ViewHolder> {

    ArrayList<CountryModel> data = new ArrayList<>();
    Context context;

    public SajinRecyclerViewAdapter(ArrayList<CountryModel> data, Context context) {
        this.data = data;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycleer_item_sajina, parent, false);
       return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        holder.name.setText(data.get(position).name);
        Glide.with(context).load(data.get(position).flag).into(holder.flag);
        holder.layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, data.get(position).name, Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        //defines a single recycler item and its components

        CircleImageView flag;
        TextView name;
        ConstraintLayout layout;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            flag = itemView.findViewById(R.id.img_flag);
            name = itemView.findViewById(R.id.name);
            layout = itemView.findViewById(R.id.layout);
        }
    }
}
