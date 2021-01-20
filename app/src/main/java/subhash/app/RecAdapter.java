package subhash.app;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecAdapter extends RecyclerView.Adapter<LostItemHolder> {

    ArrayList<DataModel> Data;

    public RecAdapter(ArrayList<DataModel> data) {
        Data = data;
    }

    @NonNull
    @Override
    public LostItemHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.lost_item_row, parent, false);
        return new LostItemHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull LostItemHolder holder, int position) {

        holder.textView1.setText(Data.get(position).getHeader());
        holder.textView2.setText(Data.get(position).getDesc1());
        holder.textView3.setText(Data.get(position).getDesc2());
        holder.imageView.setImageResource(Data.get(position).getImgName());



    }

    @Override
    public int getItemCount() {
        return Data.size();
    }
}
