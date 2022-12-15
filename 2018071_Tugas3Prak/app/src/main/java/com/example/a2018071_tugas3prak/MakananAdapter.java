package com.example.a2018071_tugas3prak;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
public class MakananAdapter extends
        RecyclerView.Adapter<MakananAdapter.MakananViewHolder> {
    String data1[], data2[], data3[];
    int images[];
    Context context;
    public MakananAdapter(Context ct, String s1[], String s2[], String s3[], int img[]){
        context = ct;
        data1 = s1;
        data2 = s2;
        data3 = s3;
        images = img;
    }
    @NonNull
    @Override
    public MakananAdapter.MakananViewHolder
    onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater =
                LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_jam,
                parent, false);
        return new MakananViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull MakananAdapter.MakananViewHolder holder, int position) {
        holder.myText1.setText(data1[position]);
        holder.myText2.setText(data2[position]);
        holder.star.setText(data3[position]);
        holder.myImage.setImageResource(images[position]);
    }
    @Override
    public int getItemCount() {
        return images.length;
    }
    public class MakananViewHolder extends RecyclerView.ViewHolder {
        TextView myText1, myText2, star;
        ImageView myImage;
        //        ConstraintLayout mainLayout;
        public MakananViewHolder(View itemView) {
            super(itemView);
            myText1 = itemView.findViewById(R.id.item1);
            star = itemView.findViewById(R.id.star);
            myText2 = itemView.findViewById(R.id.item3);
            myImage = itemView.findViewById(R.id.imageView1);
            //         mainLayout = itemView.findViewById(R.id.drawer_layout);
        }
    }
}