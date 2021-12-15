package com.firstapp.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private RecyclerView revUser;
    private UserAdapter userAdapter;

    private RecyclerView revUser2;
    private UserAdapter userAdapter2;

    private RecyclerView revUser3;
    private UserAdapter userAdapter3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        revUser = findViewById(R.id.rev_user);
        userAdapter = new UserAdapter(this);

        revUser2 = findViewById(R.id.rev_user2);
        userAdapter2 = new UserAdapter(this);

        revUser3 = findViewById(R.id.rev_user3);
        userAdapter3 = new UserAdapter(this);

        //
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        revUser.setLayoutManager(linearLayoutManager);

        LinearLayoutManager linearLayoutManager1 = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        revUser2.setLayoutManager(linearLayoutManager1);

        LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        revUser3.setLayoutManager(linearLayoutManager2);


        userAdapter.setData(getListUser());
        revUser.setAdapter(userAdapter);

        userAdapter2.setData(getListUser2());
        revUser2.setAdapter(userAdapter2);

        userAdapter3.setData(getListUser2());
        revUser3.setAdapter(userAdapter3);
    }

    private List<User> getListUser()
    {
        List<User> list = new ArrayList<>();

        list.add(new User(R.drawable.ava,"User1"));
        list.add(new User(R.drawable.ava, "User2"));

        list.add(new User(R.drawable.ava,"User3"));
        return list;
    }

    private List<User> getListUser2()
    {
        List<User> list = new ArrayList<>();

        list.add(new User(R.drawable.ava2,"User1"));
        list.add(new User(R.drawable.ava2, "User2"));
        return list;
    }
}