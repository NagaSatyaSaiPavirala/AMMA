
/*package com.example.amma;

import static androidx.core.content.ContentProviderCompat.requireContext;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.media.MediaPlayer;
import android.provider.Settings;
import android.widget.Toast;

import java.util.Locale;

public class Reminder extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        // Open the ReminderActivity when the reminder is activated
        String selectedLanguage = intent.getStringExtra("selected_language");

        // Set the locale based on the selected language
        setLocale(context, selectedLanguage);
        Intent reminderIntent = new Intent(context, ReminderActivity.class);
        reminderIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(reminderIntent);

        // Start playing the alarm sound

        MediaPlayer mp = MediaPlayer.create(context, Settings.System.DEFAULT_ALARM_ALERT_URI);
        mp.start();
       // Toast.makeText(context, "Reminder Activated", Toast.LENGTH_LONG).show();
        showToastInLocale(requireContext(),R.string.ra);
    }
    private void setLocale(Context context, String language) {
        Locale locale = new Locale(language);
        Resources resources = context.getResources();
        Configuration configuration = resources.getConfiguration();
        configuration.setLocale(locale);
        resources.updateConfiguration(configuration, resources.getDisplayMetrics());
    }
    private void showToastInLocale(Context context,int stringResource) {
        Toast.makeText(context, context.getString(stringResource), Toast.LENGTH_LONG).show();
    }
}
 */
package com.example.amma;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.media.MediaPlayer;
import android.provider.Settings;
import android.widget.Toast;

import java.util.Locale;

public class Reminder extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        // Open the ReminderActivity when the reminder is activated
        String selectedLanguage = intent.getStringExtra("selected_language");

        // Set the locale based on the selected language
        setLocale(context, selectedLanguage);
        //Intent reminderIntent = new Intent(context, ReminderActivity.class);
        Intent reminderIntent = new Intent(context, ReminderActivity.class);
        reminderIntent.putExtra("selected_language", selectedLanguage);
        reminderIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(reminderIntent);

        // Start playing the alarm sound
        MediaPlayer mp = MediaPlayer.create(context, Settings.System.DEFAULT_ALARM_ALERT_URI);
        mp.start();

        // Show the toast message in the appropriate language
        showToastInLocale(context, R.string.ra);
    }

    private void setLocale(Context context, String language) {
        Locale locale = new Locale(language);
        Resources resources = context.getResources();
        Configuration configuration = resources.getConfiguration();
        configuration.setLocale(locale);
        resources.updateConfiguration(configuration, resources.getDisplayMetrics());
    }

    private void showToastInLocale(Context context, int stringResource) {
        Toast.makeText(context, context.getString(stringResource), Toast.LENGTH_LONG).show();
    }
}

