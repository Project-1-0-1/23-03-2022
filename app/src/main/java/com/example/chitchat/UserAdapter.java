package com.example.chitchat;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder>  {
    Context context;
    ArrayList<User>users;
    public  UserAdapter(Context context,ArrayList<User>users){
       this.context=context;
       this.users=users;
    }

    @NonNull
    @Override

    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.row_conversation,parent,false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
         User user=users.get(position);
         holder.name.setText(user.getName());
        Glide.with(context).load(user.getProfileImage())
                .placeholder(R.drawable.user)
                .into(holder.profile);

    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    public class UserViewHolder extends RecyclerView.ViewHolder{
        public TextView time;
        public TextView name;
        public TextView lastmsg;
        public ImageView profile;
        public UserViewHolder(@NonNull View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.username);
            time=itemView.findViewById(R.id.msgtime);
            lastmsg=itemView.findViewById(R.id.lastmsg);
            profile=itemView.findViewById(R.id.profileimage);
        }
    }
}
