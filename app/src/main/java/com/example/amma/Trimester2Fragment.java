/*package com.example.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class Trimester2Fragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_trimester2, container, false);
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

public class Trimester2Fragment extends Fragment {

    public Trimester2Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_trimester2, container, false);

        Button btnFood = view.findViewById(R.id.btnFood);
        btnFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFood2Fragment();
            }
        });

        // Other initialization code for Trimester 1 fragment

        return view;
    }

    private void openFood2Fragment() {
        Food2Fragment fragment = new Food2Fragment();
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

public class Trimester2Fragment extends Fragment {

    public Trimester2Fragment() {
        // Required empty public constructor
    }
    private String selectedLanguage;

    public Trimester2Fragment(String selectedLanguage) {
        this.selectedLanguage = selectedLanguage;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_trimester2, container, false);

        Button btnFood = view.findViewById(R.id.btnFood);
        btnFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFood2Fragment();
            }
        });

        Button btnMusic = view.findViewById(R.id.btnMusic);
        btnMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMusic2Fragment();
            }
        });

        Button btnMeditation = view.findViewById(R.id.btnMeditation);
        btnMeditation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMeditation2Fragment();
            }
        });

        Button btnYoga = view.findViewById(R.id.btnYoga);
        btnYoga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openYoga2Fragment();
            }
        });

        // Other initialization code for Trimester 2 fragment

        return view;
    }

    private void openFood2Fragment() {
        Food2Fragment fragment = new Food2Fragment();
        openFragment(fragment);
    }

    private void openMusic2Fragment() {
        Music2Fragment fragment = new Music2Fragment();
        openFragment(fragment);
    }

    private void openMeditation2Fragment() {
        Meditation2Fragment fragment = new Meditation2Fragment();
        openFragment(fragment);
    }

    private void openYoga2Fragment() {
        Yoga2Fragment fragment = new Yoga2Fragment();
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
