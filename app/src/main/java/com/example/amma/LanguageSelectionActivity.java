package com.example.amma;
/*
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Toast;
import android.os.Build;
import android.os.LocaleList;
//import androidx.core.os.LocaleCompat;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;

public class LanguageSelectionActivity extends AppCompatActivity {

    private String[] languages = {
            "অসমীয়া", "বাংলা",  "डोगरी","English", "ગુજરાતી", "हिंदी", "कश्मीरी",
            "ಕನ್ನಡ", "ಕೊಂಕಣಿ", "मैथिली", "മലയാളം", "ꯃꯅꯤꯄꯨꯔꯤꯗꯥ ꯂꯩꯕꯥ꯫", "मराठी",
            "नेपाली", "उडिया", "ਪੰਜਾਬੀ", "தமிழ்", "తెలుగు", "சந்தாலி", "سنڌي", "اردو"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language_selection);

        Button btnSelectLanguage = findViewById(R.id.btnSelectLanguage);
        btnSelectLanguage.setOnClickListener(v -> showLanguageButtons());
    }

    private void showLanguageButtons() {
        // Hide the "Select Language" button
        Button btnSelectLanguage = findViewById(R.id.btnSelectLanguage);
        btnSelectLanguage.setVisibility(View.GONE);

        ScrollView scrollView = findViewById(R.id.languageButtonsScrollView);
        scrollView.setVisibility(View.VISIBLE);

        LinearLayout languageButtonsLayout = findViewById(R.id.languageButtonsLayout);

        // Clear existing buttons if any
        languageButtonsLayout.removeAllViews();

        // Add buttons for each language with some gap between them
        for (String language : languages) {
            Button languageButton = new Button(this);
            languageButton.setLayoutParams(new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
            ));
            languageButton.setText(language);
            languageButton.setBackgroundResource(R.drawable.language_button_background); // Set a background drawable for styling
            languageButton.setTextColor(getResources().getColor(android.R.color.white)); // Set text color
            languageButton.setTextSize(16); // Set text size

            // Add top margin for gap between buttons
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) languageButton.getLayoutParams();
            layoutParams.setMargins(0, 0, 0, 16); // Add margin (adjust as needed)

            languageButton.setOnClickListener(v -> onLanguageButtonClick(language));
            languageButtonsLayout.addView(languageButton);
        }
    }

    public void onLanguageButtonClick(String language) {


        String localeCode;
        switch (language) {

            case "অসমীয়া":
                localeCode = "as";
                break;
            case "বাংলা":
                localeCode = "bn";
                break;

            case "डोगरी":
                localeCode = "doi";
                break;

            case "ગુજરાતી":
                localeCode = "gu";
                break;
            case "हिंदी":
                localeCode = "hi";
                break;
            case "कश्मीरी":
                localeCode = "ks";
                break;
            case "ಕನ್ನಡ":
                localeCode = "kn";
                break;
            case "ಕೊಂಕಣಿ":
                localeCode = "kok";
                break;
            case "मैथिली":
                localeCode = "mai";
                break;
            case "മലയാളം":
                localeCode = "ml";
                break;
            case "ꯃꯅꯤꯄꯨꯔꯤꯗꯥ ꯂꯩꯕꯥ꯫":
                localeCode = "mni";
                break;
            case "मराठी":
                localeCode = "mr";
                break;
            case "नेपाली":
                localeCode = "ne";
                break;
            case "उडिया":
                localeCode = "or";
                break;
            case "ਪੰਜਾਬੀ":
                localeCode = "pa";
                break;
            case "தமிழ்":
                localeCode = "ta";
                break;
            case "తెలుగు":
                localeCode = "te";
                break;
            case "சந்தாலி":
                localeCode = "sat";
                break;
            case "سنڌي":
                localeCode = "sd";
                break;
            case "اردو":
                localeCode = "ur";
                break;
            default:
                localeCode = "en"; // Default to English if the language code is not recognized
                break;
        }

        Locale locale = new Locale(localeCode);

        Configuration config = new Configuration();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            LocaleList localeList = new LocaleList(locale);
            LocaleList.setDefault(localeList);
            config.setLocales(localeList);

            // Update configuration for API level 24 and higher
            getApplicationContext().createConfigurationContext(config);
        } else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            config.setLocale(locale);
            getBaseContext().getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());
        } else {
            Locale.setDefault(locale);
            config.locale = locale;
            getBaseContext().getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());
        }

        // Display a toast message with the selected language
        Toast.makeText(this, "Selected Language: " + language, Toast.LENGTH_SHORT).show();

        // Example: Open the sign-in page in the selected language
        Intent intent = new Intent(this, Login.class);//working
        //Intent intent = new Intent(this, Login.class);
        intent.putExtra("selected_language", localeCode); // Pass the locale code
        startActivity(intent);

        // Clear the back stack to avoid navigating back to LanguageSelectionActivity
        finishAffinity();
        recreate();

    }
}
*/
/*
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;

public class LanguageSelectionActivity extends AppCompatActivity {

    private String[] languages = {
            "অসমীয়া", "বাংলা", "डोगरी", "English", "ગુજરાતી", "हिंदी", "कश्मीरी",
            "ಕನ್ನಡ", "ಕೊಂಕಣಿ", "मैथिली", "മലയാളം", "ꯃꯅꯤꯄꯨꯔꯤꯗꯥ ꯂꯩꯕꯥ꯫", "मराठी",
            "नेपाली", "उडिया", "ਪੰਜਾਬੀ", "தமிழ்", "తెలుగు", "சந்தாலி", "سنڌي", "اردو"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language_selection);

        Button btnSelectLanguage = findViewById(R.id.btnSelectLanguage);
        btnSelectLanguage.setOnClickListener(v -> showLanguageButtons());
    }

    private void showLanguageButtons() {
        Button btnSelectLanguage = findViewById(R.id.btnSelectLanguage);
        btnSelectLanguage.setVisibility(View.GONE);

        ScrollView scrollView = findViewById(R.id.languageButtonsScrollView);
        scrollView.setVisibility(View.VISIBLE);

        LinearLayout languageButtonsLayout = findViewById(R.id.languageButtonsLayout);

        languageButtonsLayout.removeAllViews();

        for (String language : languages) {
            Button languageButton = new Button(this);
            languageButton.setLayoutParams(new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
            ));
            languageButton.setText(language);
            languageButton.setBackgroundResource(R.drawable.language_button_background);
            languageButton.setTextColor(getResources().getColor(android.R.color.white));
            languageButton.setTextSize(16);

            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) languageButton.getLayoutParams();
            layoutParams.setMargins(0, 0, 0, 16);

            languageButton.setOnClickListener(v -> onLanguageButtonClick(language));
            languageButtonsLayout.addView(languageButton);
        }
    }

    public void onLanguageButtonClick(String language) {
        String localeCode;
        switch (language) {
            case "অসমীয়া":
                localeCode = "as";
                break;
            case "বাংলা":
                localeCode = "bn";
                break;
            case "डोगरी":
                localeCode = "doi";
                break;
            case "ગુજરાતી":
                localeCode = "gu";
                break;
            case "हिंदी":
                localeCode = "hi";
                break;
            case "कश्मीरी":
                localeCode = "ks";
                break;
            case "ಕನ್ನಡ":
                localeCode = "kn";
                break;
            case "ಕೊಂಕಣಿ":
                localeCode = "kok";
                break;
            case "मैथिली":
                localeCode = "mai";
                break;
            case "മലയാളം":
                localeCode = "ml";
                break;
            case "ꯃꯅꯤꯄꯨꯔꯤꯗꯥ ꯂꯩꯕꯥ꯫":
                localeCode = "mni";
                break;
            case "मराठी":
                localeCode = "mr";
                break;
            case "नेपाली":
                localeCode = "ne";
                break;
            case "उडिया":
                localeCode = "or";
                break;
            case "ਪੰਜਾਬੀ":
                localeCode = "pa";
                break;
            case "தமிழ்":
                localeCode = "ta";
                break;
            case "తెలుగు":
                localeCode = "te";
                break;
            case "சந்தாலி":
                localeCode = "sat";
                break;
            case "سنڌي":
                localeCode = "sd";
                break;
            case "اردو":
                localeCode = "ur";
                break;
            default:
                localeCode = "en";
                break;
        }
        setLocale(localeCode);
        Toast.makeText(this, "Selected Language: " + language, Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Login.class);
        intent.putExtra("selected_language", localeCode);
        startActivity(intent);

        finishAffinity();
        recreate();
    }
    private void setLocale(String languageCode) {
        Locale locale = new Locale(languageCode);
        Locale.setDefault(locale);

        Configuration configuration = getResources().getConfiguration();
        configuration.setLocale(locale);
        getResources().updateConfiguration(configuration, getResources().getDisplayMetrics());
    }
}
*/
/*
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LanguageSelectionActivity extends AppCompatActivity {

    private String[] languages = {
            "অসমীয়া", "বাংলা", "डोगरी", "English", "ગુજરાતી", "हिंदी", "कश्मीरी",
            "ಕನ್ನಡ", "ಕೊಂಕಣಿ", "मैथिली", "മലയാളം", "ꯃꯅꯤꯄꯨꯔꯤꯗꯥ ꯂꯩꯕꯥ꯫", "मराठी",
            "नेपाली", "उडिया", "ਪੰਜਾਬੀ", "தமிழ்", "తెలుగు", "சந்தாலி", "سنڌي", "اردو"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language_selection);

        Button btnSelectLanguage = findViewById(R.id.btnSelectLanguage);
        btnSelectLanguage.setOnClickListener(v -> showLanguageButtons());
    }

    private void showLanguageButtons() {
        Button btnSelectLanguage = findViewById(R.id.btnSelectLanguage);
        btnSelectLanguage.setVisibility(View.GONE);

        ScrollView scrollView = findViewById(R.id.languageButtonsScrollView);
        scrollView.setVisibility(View.VISIBLE);

        LinearLayout languageButtonsLayout = findViewById(R.id.languageButtonsLayout);

        languageButtonsLayout.removeAllViews();

        for (String language : languages) {
            Button languageButton = new Button(this);
            languageButton.setLayoutParams(new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
            ));
            languageButton.setText(language);
            languageButton.setBackgroundResource(R.drawable.language_button_background);
            languageButton.setTextColor(getResources().getColor(android.R.color.white));
            languageButton.setTextSize(16);

            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) languageButton.getLayoutParams();
            layoutParams.setMargins(0, 0, 0, 16);

            languageButton.setOnClickListener(v -> onLanguageButtonClick(language));
            languageButtonsLayout.addView(languageButton);
        }
    }

    public void onLanguageButtonClick(String language) {
        String localeCode;
        switch (language) {
            case "অসমীয়া":
                localeCode = "as";
                break;
            case "বাংলা":
                localeCode = "bn";
                break;
            case "डोगरी":
                localeCode = "doi";
                break;
            case "ગુજરાતી":
                localeCode = "gu";
                break;
            case "हिंदी":
                localeCode = "hi";
                break;
            case "कश्मीरी":
                localeCode = "ks";
                break;
            case "ಕನ್ನಡ":
                localeCode = "kn";
                break;
            case "ಕೊಂಕಣಿ":
                localeCode = "kok";
                break;
            case "मैथिली":
                localeCode = "mai";
                break;
            case "മലയാളം":
                localeCode = "ml";
                break;
            case "ꯃꯅꯤꯄꯨꯔꯤꯗꯥ ꯂꯩꯕꯥ꯫":
                localeCode = "mni";
                break;
            case "मराठी":
                localeCode = "mr";
                break;
            case "नेपाली":
                localeCode = "ne";
                break;
            case "उडिया":
                localeCode = "or";
                break;
            case "ਪੰਜਾਬੀ":
                localeCode = "pa";
                break;
            case "தமிழ்":
                localeCode = "ta";
                break;
            case "తెలుగు":
                localeCode = "te";
                break;
            case "சந்தாலி":
                localeCode = "sat";
                break;
            case "سنڌي":
                localeCode = "sd";
                break;
            case "اردو":
                localeCode = "ur";
                break;
            default:
                localeCode = "en";
                break;
        }

        // Display a toast message
        Toast.makeText(this, "Selected Language: " + language, Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(this, Login.class);
        intent.putExtra("selected_language", localeCode);
        startActivity(intent);
        finishAffinity();
    }
}
*/
/*
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LanguageSelectionActivity extends AppCompatActivity {

    private String[] languages = {
            "অসমীয়া", "বাংলা", "डोगरी", "English", "ગુજરાતી", "हिंदी", "कश्मीरी",
            "ಕನ್ನಡ", "ಕೊಂಕಣಿ", "मैथिली", "മലയാളം", "ꯃꯅꯤꯄꯨꯔꯤꯗꯥ ꯂꯩꯕꯥ꯫", "मराठी",
            "नेपाली", "उडिया", "ਪੰਜਾਬੀ", "தமிழ்", "తెలుగు", "சந்தாலி", "سنڌي", "اردو"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language_selection);

        Button btnSelectLanguage = findViewById(R.id.btnSelectLanguage);
        btnSelectLanguage.setOnClickListener(v -> showLanguageButtons());
    }

    private void showLanguageButtons() {
        // ... (your existing code)
        Button btnSelectLanguage = findViewById(R.id.btnSelectLanguage);
        btnSelectLanguage.setVisibility(View.GONE);

        ScrollView scrollView = findViewById(R.id.languageButtonsScrollView);
        scrollView.setVisibility(View.VISIBLE);

        LinearLayout languageButtonsLayout = findViewById(R.id.languageButtonsLayout);

        languageButtonsLayout.removeAllViews();

        for (String language : languages) {
            // ... (your existing code)
            Button btnSelectLanguage = findViewById(R.id.btnSelectLanguage);
            btnSelectLanguage.setVisibility(View.GONE);

            ScrollView scrollView = findViewById(R.id.languageButtonsScrollView);
            scrollView.setVisibility(View.VISIBLE);

            LinearLayout languageButtonsLayout = findViewById(R.id.languageButtonsLayout);

            languageButtonsLayout.removeAllViews();

            for (String language : languages) {
                Button languageButton = new Button(this);
                languageButton.setLayoutParams(new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT
                ));
                languageButton.setText(language);
                languageButton.setBackgroundResource(R.drawable.language_button_background);
                languageButton.setTextColor(getResources().getColor(android.R.color.white));
                languageButton.setTextSize(16);

                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) languageButton.getLayoutParams();
                layoutParams.setMargins(0, 0, 0, 16);
            languageButton.setOnClickListener(v -> onLanguageButtonClick(language));
            languageButtonsLayout.addView(languageButton);
        }
    }

    private void onLanguageButtonClick(String language) {
        // Save the selected language in SharedPreferences
        SharedPreferences preferences = getSharedPreferences("MyPrefs", MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("selected_language", language);
        editor.apply();

        // Display a toast message
        String toastMessage = getString(R.string.language_selected_toast, language);
        Toast.makeText(this, toastMessage, Toast.LENGTH_SHORT).show();

        // Start the Login activity
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);

        finishAffinity();
    }
}


 */
/*
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LanguageSelectionActivity extends AppCompatActivity {

    private String[] languages = {
            "অসমীয়া", "বাংলা", "डोगरी", "English", "ગુજરાતી", "हिंदी", "कश्मीरी",
            "ಕನ್ನಡ", "ಕೊಂಕಣಿ", "मैथिली", "മലയാളം", "ꯃꯅꯤꯄꯨꯔꯤꯗꯥ ꯂꯩꯕꯥ꯫", "मराठी",
            "नेपाली", "उडिया", "ਪੰਜਾਬੀ", "தமிழ்", "తెలుగు", "சந்தாலி", "سنڌي", "اردو"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language_selection);

        Button btnSelectLanguage = findViewById(R.id.btnSelectLanguage);
        btnSelectLanguage.setOnClickListener(v -> showLanguageButtons());
    }

    private void showLanguageButtons() {
        LinearLayout languageButtonsLayout = findViewById(R.id.languageButtonsLayout);
        languageButtonsLayout.removeAllViews();

        for (String language : languages) {
            Button languageButton = new Button(this);
            languageButton.setLayoutParams(new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
            ));
            languageButton.setText(language);
            languageButton.setBackgroundResource(R.drawable.language_button_background);
            languageButton.setTextColor(getResources().getColor(android.R.color.white));
            languageButton.setTextSize(16);

            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) languageButton.getLayoutParams();
            layoutParams.setMargins(0, 0, 0, 16);

            languageButton.setOnClickListener(v -> onLanguageButtonClick(language));
            languageButtonsLayout.addView(languageButton);
        }
    }

private void onLanguageButtonClick(String language) {
    // Save the selected language in SharedPreferences
    SharedPreferences preferences = getSharedPreferences("MyPrefs", MODE_PRIVATE);
    SharedPreferences.Editor editor = preferences.edit();
    String localeCode = getLocaleCode(language);
    editor.putString("selected_language", localeCode);
    editor.apply();

    // Display a toast message
    Toast.makeText(this, "Selected Language: " + language, Toast.LENGTH_SHORT).show();

    // Broadcast intent to notify other activities about the language change
    sendBroadcast(new Intent("LocaleUpdated"));

    // Finish the activity
    finish();
}

    private String getLocaleCode(String language) {
    String localeCode;
        // Implement your logic to map language to locale code here
        // Example: if language is "English", return "en"
        // You can use a switch or if-else statements for this
        switch (language) {
            case "অসমীয়া":
                localeCode = "as";
                break;
            case "বাংলা":
                localeCode = "bn";
                break;
            case "डोगरी":
                localeCode = "doi";
                break;
            case "ગુજરાતી":
                localeCode = "gu";
                break;
            case "हिंदी":
                localeCode = "hi";
                break;
            case "कश्मीरी":
                localeCode = "ks";
                break;
            case "ಕನ್ನಡ":
                localeCode = "kn";
                break;
            case "ಕೊಂಕಣಿ":
                localeCode = "kok";
                break;
            case "मैथिली":
                localeCode = "mai";
                break;
            case "മലയാളം":
                localeCode = "ml";
                break;
            case "ꯃꯅꯤꯄꯨꯔꯤꯗꯥ ꯂꯩꯕꯥ꯫":
                localeCode = "mni";
                break;
            case "मराठी":
                localeCode = "mr";
                break;
            case "नेपाली":
                localeCode = "ne";
                break;
            case "उडिया":
                localeCode = "or";
                break;
            case "ਪੰਜਾਬੀ":
                localeCode = "pa";
                break;
            case "தமிழ்":
                localeCode = "ta";
                break;
            case "తెలుగు":
                localeCode = "te";
                break;
            case "சந்தாலி":
                localeCode = "sat";
                break;
            case "سنڌي":
                localeCode = "sd";
                break;
            case "اردو":
                localeCode = "ur";
                break;
            default:
                localeCode = "en";
                break;
        }
        return localeCode;
    }

}
*/
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LanguageSelectionActivity extends AppCompatActivity {

    private String[] languages = {
            "অসমীয়া", "বাংলা", "डोगरी", "English", "ગુજરાતી", "हिंदी", "कश्मीरी",
            "ಕನ್ನಡ", "ಕೊಂಕಣಿ", "मैथिली", "മലയാളം", "ꯃꯅꯤꯄꯨꯔꯤꯗꯥ ꯂꯩꯕꯥ꯫", "मराठी",
            "नेपाली", "उडिया", "ਪੰਜਾਬੀ", "தமிழ்", "తెలుగు", "சந்தாலி", "سنڌي", "اردو"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language_selection);

        Button btnSelectLanguage = findViewById(R.id.btnSelectLanguage);
        btnSelectLanguage.setOnClickListener(v -> showLanguageButtons());
    }

    private void showLanguageButtons() {
        Button btnSelectLanguage = findViewById(R.id.btnSelectLanguage);
        btnSelectLanguage.setVisibility(View.GONE);

        ScrollView scrollView = findViewById(R.id.languageButtonsScrollView);
        scrollView.setVisibility(View.VISIBLE);

        LinearLayout languageButtonsLayout = findViewById(R.id.languageButtonsLayout);

        languageButtonsLayout.removeAllViews();

        for (String language : languages) {
            Button languageButton = new Button(this);
            languageButton.setLayoutParams(new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
            ));
            languageButton.setText(language);
            languageButton.setBackgroundResource(R.drawable.language_button_background);
            languageButton.setTextColor(getResources().getColor(android.R.color.white));
            languageButton.setTextSize(16);

            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) languageButton.getLayoutParams();
            layoutParams.setMargins(0, 0, 0, 16);

            languageButton.setOnClickListener(v -> onLanguageButtonClick(language));
            languageButtonsLayout.addView(languageButton);
        }
    }

    public void onLanguageButtonClick(String language) {
        String localeCode;
        switch (language) {
            // ... (your existing code remains unchanged)
            case "অসমীয়া":
                localeCode = "as";
                break;
            case "বাংলা":
                localeCode = "bn";
                break;
            case "डोगरी":
                localeCode = "doi";
                break;
            case "ગુજરાતી":
                localeCode = "gu";
                break;
            case "हिंदी":
                localeCode = "hi";
                break;
            case "कश्मीरी":
                localeCode = "ks";
                break;
            case "ಕನ್ನಡ":
                localeCode = "kn";
                break;
            case "ಕೊಂಕಣಿ":
                localeCode = "kok";
                break;
            case "मैथिली":
                localeCode = "mai";
                break;
            case "മലയാളം":
                localeCode = "ml";
                break;
            case "ꯃꯅꯤꯄꯨꯔꯤꯗꯥ ꯂꯩꯕꯥ꯫":
                localeCode = "mni";
                break;
            case "मराठी":
                localeCode = "mr";
                break;
            case "नेपाली":
                localeCode = "ne";
                break;
            case "उडिया":
                localeCode = "or";
                break;
            case "ਪੰਜਾਬੀ":
                localeCode = "pa";
                break;
            case "தமிழ்":
                localeCode = "ta";
                break;
            case "తెలుగు":
                localeCode = "te";
                break;
            case "சந்தாலி":
                localeCode = "sat";
                break;
            case "سنڌي":
                localeCode = "sd";
                break;
            case "اردو":
                localeCode = "ur";
                break;
            default:
                localeCode = "en";
                break;
        }

        // Display a toast message
        Toast.makeText(this, "Selected Language: " + language, Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(this, Login.class);
        intent.putExtra("selected_language", localeCode);
        startActivity(intent);
        finishAffinity();
    }
}
