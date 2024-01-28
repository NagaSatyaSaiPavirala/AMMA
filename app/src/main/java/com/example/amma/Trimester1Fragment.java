
/*
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class Trimester1Fragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Trimester1Fragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static Trimester1Fragment newInstance(String param1, String param2) {
        Trimester1Fragment fragment = new Trimester1Fragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_trimester1, container, false);
    }
}
 */
/*
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class Trimester1Fragment extends Fragment {

    public Trimester1Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_trimester1, container, false);
    }
}
 */
// Trimester1Fragment.java

package com.example.amma;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class Trimester1Fragment extends Fragment {

    public Trimester1Fragment() {
        // Required empty public constructor
    }
    private String selectedLanguage;

    public Trimester1Fragment(String selectedLanguage) {
        this.selectedLanguage = selectedLanguage;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_trimester1, container, false);

        Button btnFood = view.findViewById(R.id.btnFood);
        btnFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFood1Fragment();
            }
        });
        Button btnMusic = view.findViewById(R.id.btnMusic);
        btnMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMusic1Fragment();
            }
        });
        Button btnMeditation = view.findViewById(R.id.btnMeditation);
        btnMeditation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMeditation1Fragment();
            }
        });
        Button btnYoga = view.findViewById(R.id.btnYoga);
        btnYoga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openYoga1Fragment();
            }
        });
        // Other initialization code for Trimester 1 fragment

        return view;
    }
/*
    private void openFood1Fragment() {
        Food1Fragment fragment = new Food1Fragment();
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
 */
private void openFood1Fragment() {
    Food1Fragment fragment = new Food1Fragment();
    openFragment(fragment);
}

    private void openMusic1Fragment() {
        Music1Fragment fragment = new Music1Fragment();
        openFragment(fragment);
    }
    private void openMeditation1Fragment() {
        Meditation1Fragment fragment = new Meditation1Fragment();
        openFragment(fragment);
    }
    private void openYoga1Fragment() {
        Yoga1Fragment fragment = new Yoga1Fragment();
        openFragment(fragment);
    }
    private void openFragment(Fragment fragment) {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}
