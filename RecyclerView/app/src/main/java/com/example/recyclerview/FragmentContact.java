package com.example.recyclerview;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FragmentContact extends Fragment {
    View v;
    private RecyclerView myrecyclerview;
    private List<Contact> lstContact;

    public FragmentContact(){

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstContact = new ArrayList<>();
        lstContact.add(new Contact("Hyevin","010-1234-5678",R.drawable.ic_account_box_black_36dp));
        lstContact.add(new Contact("JO","010-1234-5678",R.drawable.ic_account_circle_black_36dp));
        lstContact.add(new Contact("Hyevin","010-1234-5678",R.drawable.ic_account_box_black_36dp));
        lstContact.add(new Contact("JO","010-1234-5678",R.drawable.ic_account_circle_black_36dp));
        lstContact.add(new Contact("Hyevin","010-1234-5678",R.drawable.ic_account_box_black_36dp));
        lstContact.add(new Contact("JO","010-1234-5678",R.drawable.ic_account_circle_black_36dp));

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.contact_fragment,container,false);
        myrecyclerview = (RecyclerView)v.findViewById(R.id.contact_recyclerview);
        RecyclerViewAdapter recyclerAdapter = new RecyclerViewAdapter(getContext(),lstContact);
        myrecyclerview.setLayoutManager((new LinearLayoutManager(getActivity())));
        myrecyclerview.setAdapter(recyclerAdapter);
        return v;
    }
}
