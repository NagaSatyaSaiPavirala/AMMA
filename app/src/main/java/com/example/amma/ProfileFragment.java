/*package com.example.amma;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;


public class ProfileFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false);
    }
}

 */
/*
package com.example.amma;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;

public class ProfileFragment extends Fragment {
    FirebaseAuth auth;
    FirebaseFirestore fStore;
    TextView textView,hView,mView;
    FirebaseUser user;
    private Button logoutButton;
    String userId;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        auth=FirebaseAuth.getInstance();
        fStore=FirebaseFirestore.getInstance();
        user=auth.getCurrentUser();
        userId=auth.getCurrentUser().getUid();

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        // Find the logout button
        logoutButton = view.findViewById(R.id.logout);
        textView=view.findViewById(R.id.user_details);
        hView=view.findViewById(R.id.hemail_details);
        mView=view.findViewById(R.id.memail_details);
         if(user!=null){
            textView.setText(user.getEmail());
        }
        DocumentReference documentReference=fStore.collection("users").document(userId);
        documentReference.addSnapshotListener(this,new EventListener<DocumentSnapshot>()){
            @Override
            public void onEvent(@Nullable DocumentSnapshot document Snapshot,@Nullable FirebaseFirestoreException e)
            {
                hView.setText(documentsnapshot.getString("hemail"));
                hView.setText(documentsnapshot.getString("memail"));
            }
        }
        // Set click listener for the logout button
        logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle logout
                FirebaseAuth.getInstance().signOut();
                // Navigate to the login screen
                getActivity().finish(); // Finish the current activity (ProfileFragment)
            }
        });

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
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;

public class ProfileFragment extends Fragment {
    FirebaseAuth auth;
    FirebaseFirestore fStore;
    TextView textView, hView, mView;
    FirebaseUser user;
    private Button logoutButton;
    String userId;
    private String selectedLanguage;

    public ProfileFragment(String selectedLanguage) {
        this.selectedLanguage = selectedLanguage;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        auth = FirebaseAuth.getInstance();
        fStore = FirebaseFirestore.getInstance();
        user = auth.getCurrentUser();
        userId = auth.getCurrentUser().getUid();

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        // Find the logout button
        logoutButton = view.findViewById(R.id.logout);
        textView = view.findViewById(R.id.user_details);
        hView = view.findViewById(R.id.hemail_details);
        mView = view.findViewById(R.id.memail_details);
        if (user != null) {
            textView.setText(user.getEmail());
        }
        DocumentReference documentReference = fStore.collection("users").document(userId);
        documentReference.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot documentSnapshot, @Nullable FirebaseFirestoreException e) {
                if (documentSnapshot != null) {
                    hView.setText(documentSnapshot.getString("hemail"));
                    mView.setText(documentSnapshot.getString("memail"));
                }
            }
        });

        // Set click listener for the logout button
        logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle logout
                FirebaseAuth.getInstance().signOut();
                // Navigate to the login screen
                getActivity().finish(); // Finish the current activity (ProfileFragment)
            }
        });

        return view;
    }
}
