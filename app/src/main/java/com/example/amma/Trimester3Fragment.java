/*
package com.example.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class Trimester3Fragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_trimester3, container, false);
    }
}
 */
/*
package com.example.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class Trimester3Fragment extends Fragment {

    public Trimester3Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_trimester3, container, false);

        Button btnFood = view.findViewById(R.id.btnFood);
        btnFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFood3Fragment();
            }
        });

        // Other initialization code for Trimester 1 fragment

        return view;
    }

    private void openFood3Fragment() {
        Food3Fragment fragment = new Food3Fragment();
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}


 */
package com.example.amma;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class Trimester3Fragment extends Fragment {

    public Trimester3Fragment() {
        // Required empty public constructor
    }
    private String selectedLanguage;

    public Trimester3Fragment(String selectedLanguage) {
        this.selectedLanguage = selectedLanguage;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_trimester3, container, false);

        Button btnFood = view.findViewById(R.id.btnFood);
        btnFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFood3Fragment();
            }
        });

        Button btnMusic = view.findViewById(R.id.btnMusic);
        btnMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMusic3Fragment();
            }
        });

        Button btnMeditation = view.findViewById(R.id.btnMeditation);
        btnMeditation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMeditation3Fragment();
            }
        });

        Button btnYoga = view.findViewById(R.id.btnYoga);
        btnYoga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openYoga3Fragment();
            }
        });

        // Other initialization code for Trimester 3 fragment

        return view;
    }

    private void openFood3Fragment() {
        Food3Fragment fragment = new Food3Fragment();
        openFragment(fragment);
    }

    private void openMusic3Fragment() {
        Music3Fragment fragment = new Music3Fragment();
        openFragment(fragment);
    }

    private void openMeditation3Fragment() {
        Meditation3Fragment fragment = new Meditation3Fragment();
        openFragment(fragment);
    }

    private void openYoga3Fragment() {
        Yoga3Fragment fragment = new Yoga3Fragment();
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
