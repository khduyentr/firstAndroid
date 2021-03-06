package com.firstapp.myapplication;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder>{

    private Context mContext;
    private List<User> mListUser;

    public UserAdapter(Context mContext) {
        this.mContext = mContext;
    }

    public void setData(List<User> list)
    {
        this.mListUser = list;

        // important
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_user, parent, false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        User user = mListUser.get(position);
        if (user == null)
            return;

        holder.avaUser.setImageResource(user.getResourceId());
        holder.txtName.setText(user.getName());
    }

    @Override
    public int getItemCount() {
        if (mListUser != null)
        {
            return mListUser.size();
        }

        return 0;
    }

    public class UserViewHolder extends RecyclerView.ViewHolder
    {
        private ImageView avaUser;
        private TextView txtName;

        public UserViewHolder(@NonNull View itemView) {
            super(itemView);

            avaUser = itemView.findViewById(R.id.ava_img);
            txtName = itemView.findViewById(R.id.txtName);
        }
    }
}
