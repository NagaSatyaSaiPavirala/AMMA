/*package com.example.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class MentalHealthFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_mental_health, container, false);
    }
}
 */
/*
// Modify your MentalHealthFragment.java class to handle button clicks and navigate to the next fragment.
package com.example.fragment;
// MentalHealthFragment.java


import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.Navigation;

public class MentalHealthFragment extends Fragment {

    public MentalHealthFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_mental_health, container, false);

        Button btnFirstTrimester = view.findViewById(R.id.btnFirstTrimester);
        btnFirstTrimester.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to FirstTrimesterFragment
              //  Navigation.findNavController(v).navigate(R.id.action_mentalHealthFragment_to_firstTrimesterFragment);
            }
        });

        // Add other button click listeners or views as needed

        return view;
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
/*
public class MentalHealthFragment extends Fragment {

    public MentalHealthFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_mental_health, container, false);

        Button btnFirstTrimester = view.findViewById(R.id.btnFirstTrimester);
        btnFirstTrimester.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTrimester1Fragment();
            }
        });

        return view;
    }

    private void openTrimester1Fragment() {
        Trimester1Fragment fragment = new Trimester1Fragment();
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}
 */
public class MentalHealthFragment extends Fragment {

    private String selectedLanguage;

    public MentalHealthFragment(String selectedLanguage) {
        this.selectedLanguage = selectedLanguage;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_mental_health, container, false);

        Button btnFirstTrimester = view.findViewById(R.id.btnFirstTrimester);
        Button btnSecondTrimester = view.findViewById(R.id.btnSecondTrimester);
        Button btnThirdTrimester = view.findViewById(R.id.btnThirdTrimester);

        btnFirstTrimester.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTrimesterFragment(1);
            }
        });

        btnSecondTrimester.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTrimesterFragment(2);
            }
        });

        btnThirdTrimester.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTrimesterFragment(3);
            }
        });

        return view;
    }

    private void openTrimesterFragment(int trimester) {
        Fragment fragment;
        switch (trimester) {
            case 1:
                fragment = new Trimester1Fragment(selectedLanguage);
                break;
            case 2:
                fragment = new Trimester2Fragment(selectedLanguage); // Replace with your 2nd trimester fragment
                break;
            case 3:
                fragment = new Trimester3Fragment(selectedLanguage); // Replace with your 3rd trimester fragment
                break;
            default:
                fragment = new Trimester1Fragment();
        }

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}

