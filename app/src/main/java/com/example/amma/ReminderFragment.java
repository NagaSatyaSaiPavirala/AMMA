/*package com.example.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ReminderFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_reminder, container, false);
    }
}
 */
package com.example.amma;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TimePicker;
import android.widget.Toast;

import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;

import java.util.Calendar;
import java.util.Locale;

public class ReminderFragment extends Fragment implements View.OnClickListener {
    private TimePicker tp;
    private Button btnSetReminder;
    private String selectedLanguage;

    public ReminderFragment() {
        // Required empty public constructor
    }

    public ReminderFragment(String selectedLanguage) {
        this.selectedLanguage = selectedLanguage;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_reminder, container, false);

        btnSetReminder = view.findViewById(R.id.set_reminder);
        tp = view.findViewById(R.id.time);
        btnSetReminder.setOnClickListener(this);

        return view;
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public void onClick(View view) {
        Calendar cal = Calendar.getInstance();
        cal.set(cal.get(Calendar.YEAR),
                cal.get(Calendar.MONTH),
                cal.get(Calendar.DAY_OF_MONTH),
                tp.getHour(),
                tp.getMinute(), 0);
        alarmSet(cal.getTimeInMillis());
    }

    private void alarmSet(long timeInMillis) {
        AlarmManager alarmManager = (AlarmManager) requireContext().getSystemService(Context.ALARM_SERVICE);
        Intent intent = new Intent(requireContext(), Reminder.class);
       // PendingIntent pendingIntent = PendingIntent.getBroadcast(requireContext(), 0, intent, PendingIntent.FLAG_IMMUTABLE);
        intent.putExtra("selected_language", selectedLanguage); // Pass the selected language
        PendingIntent pendingIntent = PendingIntent.getBroadcast(requireContext(), 0, intent, PendingIntent.FLAG_IMMUTABLE);
        alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, timeInMillis, AlarmManager.INTERVAL_DAY, pendingIntent);
        //Toast.makeText(requireContext(), "Your Reminder is Set", Toast.LENGTH_LONG).show();
        showToastInLocale(R.string.yris);
    }
    private void showToastInLocale(int stringResource) {
        Toast.makeText(requireContext(), stringResource, Toast.LENGTH_LONG).show();
    }


}
