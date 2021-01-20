package subhash.app;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FoundItemHolder extends RecyclerView.ViewHolder {

    ImageView imageView;
    TextView textView1, textView2, textView3;

    public FoundItemHolder(@NonNull View itemView) {
        super(itemView);
        imageView=(ImageView)itemView.findViewById(R.id.img1);
        textView1=(TextView)itemView.findViewById(R.id.tv1);
        textView2=(TextView)itemView.findViewById(R.id.tv2);
        textView3=(TextView)itemView.findViewById(R.id.tv3);
    }
}
