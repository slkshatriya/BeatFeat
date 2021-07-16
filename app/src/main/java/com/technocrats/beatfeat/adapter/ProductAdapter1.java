package com.technocrats.beatfeat.adapter;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.technocrats.beatfeat.R;
import com.technocrats.beatfeat.activity.EightExercise;
import com.technocrats.beatfeat.activity.ElevenExercise;
import com.technocrats.beatfeat.activity.FifteenExercise;
import com.technocrats.beatfeat.activity.FirstExercise;
import com.technocrats.beatfeat.activity.FiveExercise;
import com.technocrats.beatfeat.activity.FourExercise;
import com.technocrats.beatfeat.activity.FourteenExercise;
import com.technocrats.beatfeat.activity.NineExercise;
import com.technocrats.beatfeat.activity.SecExercise;
import com.technocrats.beatfeat.activity.SevenExercise;
import com.technocrats.beatfeat.activity.SixExercise;
import com.technocrats.beatfeat.activity.TenExercise;
import com.technocrats.beatfeat.activity.ThirdExercise;
import com.technocrats.beatfeat.activity.ThirteenExercise;
import com.technocrats.beatfeat.activity.TwelveExercise;
import com.technocrats.beatfeat.model.model;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;

public class ProductAdapter1 extends RecyclerView.Adapter<ProductAdapter1.ProductViewHolder> {
    Context context;
    List<model> productsList;

    public ProductAdapter1(Context context, List<model> productsList) {
        this.context = context;
        this.productsList = productsList;
    }

    @NonNull
    @Override
    public ProductAdapter1.ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.singlerow, parent, false);
        return new ProductAdapter1.ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ProductAdapter1.ProductViewHolder holder, final int position) {

        holder.prodImage.setImageResource(productsList.get(position).getImageUrl());
        holder.prodName.setText(productsList.get(position).getProductName());
        holder.prodPrice.setText(productsList.get(position).getProductPrice());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View view) {

                if (position == 0) {
                    Intent i = new Intent(context, FirstExercise.class);
                    Pair[] pairs = new Pair[1];
                    pairs[0] = new Pair<View, String>(holder.prodImage, "image");
                    ActivityOptions activityOptions = ActivityOptions.makeSceneTransitionAnimation((Activity) context, pairs);
                    context.startActivity(i, activityOptions.toBundle());

                }

                if (position == 1) {
                    Intent i = new Intent(context, SecExercise.class);
                    Pair[] pairs = new Pair[1];
                    pairs[0] = new Pair<View, String>(holder.prodImage, "image");
                    ActivityOptions activityOptions = ActivityOptions.makeSceneTransitionAnimation((Activity) context, pairs);
                    context.startActivity(i, activityOptions.toBundle());

                }

                if (position == 2) {
                    Intent i = new Intent(context, ThirdExercise.class);
                    Pair[] pairs = new Pair[1];
                    pairs[0] = new Pair<View, String>(holder.prodImage, "image");
                    ActivityOptions activityOptions = ActivityOptions.makeSceneTransitionAnimation((Activity) context, pairs);
                    context.startActivity(i, activityOptions.toBundle());

                }

                if (position == 3) {
                    Intent i = new Intent(context, FourExercise.class);
                    Pair[] pairs = new Pair[1];
                    pairs[0] = new Pair<View, String>(holder.prodImage, "image");
                    ActivityOptions activityOptions = ActivityOptions.makeSceneTransitionAnimation((Activity) context, pairs);
                    context.startActivity(i, activityOptions.toBundle());

                }

                if (position == 4) {
                    Intent i = new Intent(context, FiveExercise.class);
                    Pair[] pairs = new Pair[1];
                    pairs[0] = new Pair<View, String>(holder.prodImage, "image");
                    ActivityOptions activityOptions = ActivityOptions.makeSceneTransitionAnimation((Activity) context, pairs);
                    context.startActivity(i, activityOptions.toBundle());

                }

                if (position == 5) {
                    Intent i = new Intent(context, SixExercise.class);
                    Pair[] pairs = new Pair[1];
                    pairs[0] = new Pair<View, String>(holder.prodImage, "image");
                    ActivityOptions activityOptions = ActivityOptions.makeSceneTransitionAnimation((Activity) context, pairs);
                    context.startActivity(i, activityOptions.toBundle());

                }

                if (position == 6) {
                    Intent i = new Intent(context, SevenExercise.class);
                    Pair[] pairs = new Pair[1];
                    pairs[0] = new Pair<View, String>(holder.prodImage, "image");
                    ActivityOptions activityOptions = ActivityOptions.makeSceneTransitionAnimation((Activity) context, pairs);
                    context.startActivity(i, activityOptions.toBundle());

                }

                if (position == 7) {
                    Intent i = new Intent(context, EightExercise.class);
                    Pair[] pairs = new Pair[1];
                    pairs[0] = new Pair<View, String>(holder.prodImage, "image");
                    ActivityOptions activityOptions = ActivityOptions.makeSceneTransitionAnimation((Activity) context, pairs);
                    context.startActivity(i, activityOptions.toBundle());

                }

                if (position == 8) {
                    Intent i = new Intent(context, NineExercise.class);
                    Pair[] pairs = new Pair[1];
                    pairs[0] = new Pair<View, String>(holder.prodImage, "image");
                    ActivityOptions activityOptions = ActivityOptions.makeSceneTransitionAnimation((Activity) context, pairs);
                    context.startActivity(i, activityOptions.toBundle());

                }

                if (position == 9) {
                    Intent i = new Intent(context, TenExercise.class);
                    Pair[] pairs = new Pair[1];
                    pairs[0] = new Pair<View, String>(holder.prodImage, "image");
                    ActivityOptions activityOptions = ActivityOptions.makeSceneTransitionAnimation((Activity) context, pairs);
                    context.startActivity(i, activityOptions.toBundle());

                }

                if (position == 10) {
                    Intent i = new Intent(context, ElevenExercise.class);
                    Pair[] pairs = new Pair[1];
                    pairs[0] = new Pair<View, String>(holder.prodImage, "image");
                    ActivityOptions activityOptions = ActivityOptions.makeSceneTransitionAnimation((Activity) context, pairs);
                    context.startActivity(i, activityOptions.toBundle());

                }

                if (position == 11) {
                    Intent i = new Intent(context, TwelveExercise.class);
                    Pair[] pairs = new Pair[1];
                    pairs[0] = new Pair<View, String>(holder.prodImage, "image");
                    ActivityOptions activityOptions = ActivityOptions.makeSceneTransitionAnimation((Activity) context, pairs);
                    context.startActivity(i, activityOptions.toBundle());

                }

                if (position == 12) {
                    Intent i = new Intent(context, ThirteenExercise.class);
                    Pair[] pairs = new Pair[1];
                    pairs[0] = new Pair<View, String>(holder.prodImage, "image");
                    ActivityOptions activityOptions = ActivityOptions.makeSceneTransitionAnimation((Activity) context, pairs);
                    context.startActivity(i, activityOptions.toBundle());

                }

                if (position == 13) {
                    Intent i = new Intent(context, FourteenExercise.class);
                    Pair[] pairs = new Pair[1];
                    pairs[0] = new Pair<View, String>(holder.prodImage, "image");
                    ActivityOptions activityOptions = ActivityOptions.makeSceneTransitionAnimation((Activity) context, pairs);
                    context.startActivity(i, activityOptions.toBundle());

                }

                if (position == 14) {
                    Intent i = new Intent(context, FifteenExercise.class);
                    Pair[] pairs = new Pair[1];
                    pairs[0] = new Pair<View, String>(holder.prodImage, "image");
                    ActivityOptions activityOptions = ActivityOptions.makeSceneTransitionAnimation((Activity) context, pairs);
                    context.startActivity(i, activityOptions.toBundle());

                }



            }
        });


    }

    @Override
    public int getItemCount() {
        return productsList.size();
    }


    public static final class ProductViewHolder extends RecyclerView.ViewHolder{

        ImageView prodImage;
        TextView prodName, prodPrice;

        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);

            prodImage = itemView.findViewById(R.id.img1);
            prodName = itemView.findViewById(R.id.nametext);
            prodPrice = itemView.findViewById(R.id.desctext);



        }
    }

}
