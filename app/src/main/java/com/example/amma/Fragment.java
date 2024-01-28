/*package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Fragment extends AppCompatActivity {
BottomNavigationView bottomNavigationView;
ReminderFragment reminderFragment=new ReminderFragment();
MentalHealthFragment mentalHealthFragment=new MentalHealthFragment();
CommunityFragment communityFragment=new CommunityFragment();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
        bottomNavigationView=findViewById(R.id.bottom_navigation);
        getSupportFragmentManager().beginTransaction().replace(R.id.container,reminderFragment).commit();
        bottomNavigationView.setOnItemSelected(new NavigationBarView.OnItemSelectedListener()){
        {
            @Override
            public boolean onNavigationItemSelected(MenuItem item)
            {
                switch (item.getItemId()) {
                    case R.id.reminder:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, reminderFragment).commit();
                        return true;
                    case R.id.mental_health:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, mentalHealthFragment).commit();
                        return true;
                    case R.id.community:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, communityFragment).commit();
                        return true;
                    case R.id.profile:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, profileFragment).commit();
                        return true;

                }
                return false;
            }
        }
    }
}
 */
package com.example.amma;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import java.util.Locale;

public class Fragment extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    ReminderFragment reminderFragment = new ReminderFragment();
    //MentalHealthFragment mentalHealthFragment = new MentalHealthFragment();
   // CommunityFragment communityFragment = new CommunityFragment();
    //ProfileFragment profileFragment = new ProfileFragment(); // Assuming you have a ProfileFragment

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        String selectedLanguage = intent.getStringExtra("selected_language");

        updateLocale(selectedLanguage);
        setContentView(R.layout.activity_fragment);
        bottomNavigationView = findViewById(R.id.bottom_navigation);
        MentalHealthFragment mentalHealthFragment = new MentalHealthFragment(selectedLanguage);
        ProfileFragment profileFragment = new ProfileFragment(selectedLanguage); // Assuming you have a ProfileFragment
        getSupportFragmentManager().beginTransaction().replace(R.id.container,new ReminderFragment(selectedLanguage)).commit();

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                if (item.getItemId() == R.id.reminder) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.container,new ReminderFragment(selectedLanguage)).commit();
                    return true;
                } else if (item.getItemId() == R.id.mental_health) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.container,mentalHealthFragment).commit();
                    return true;
                } //else if (item.getItemId() == R.id.community) {
                   // getSupportFragmentManager().beginTransaction().replace(R.id.container, communityFragment).commit();
                    //return true;
                //}
                else if (item.getItemId() == R.id.profile) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, profileFragment).commit();
                    return true;
                }
                return false;
            }
        });
    }
    private void updateLocale(String selectedLanguage) {
        Locale locale = new Locale(selectedLanguage);
        getResources().getConfiguration().setLocale(locale);
        getResources().updateConfiguration(getResources().getConfiguration(), getResources().getDisplayMetrics());
    }
}
