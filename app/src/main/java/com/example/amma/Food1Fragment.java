/*package com.example.amma;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class Food1Fragment extends Fragment {

    public Food1Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_food2, container, false);
    }
}
 */
package com.example.amma;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.google.cloud.translate.Translate;
import com.google.cloud.translate.TranslateOptions;
import com.google.cloud.translate.Translation;

import java.util.Locale;

public class Food1Fragment extends Fragment {

    private TextView textViewTranslated;
    private String key = "***************************************"; // Replace with your actual API key

    public Food1Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_food1, container, false);

        textViewTranslated = view.findViewById(R.id.eatfood1);

        String currentLocaleCode = getCurrentLocaleCode();

        String targetLang = currentLocaleCode; // for English
        String sourceLang ="en" ; // for the current locale

        String food1 = "Folate rich foods:\n" +
                "Ramdan daliya (Amarnath porridge), soya, spinach, peas (matar), whole wheat toast, papaya, chick peas (chana), semolina (suji), beetroot (chukandar), mustard greens (sarson), finger millet(ragi) roti, pomegranate (anar)\n" +
                "Iron-rich foods (To help your body make red blood cells for your growing baby):\n" +
                "Moong dal, hari moong, mixed dal (Milijhuli dal), pearl millet (bajra roti), peanuts (moong phali), black gram (urad dal), lotus stem (kamal kakri), sorghum (jowar) roti, red lentil (masoor dal), fenugreek (methi), rajma (kidney beans), horse gram (kala chana), sambhar, oats (jai)\n" +
                "Vitamin B6 rich food (may help with morning sickness):\n" +
                "Potato, Colocasia (arbi), banana\n" +
                "Common food:\n" +
                "Watermelon  , coconut water, sapodilla (chikoo), okra (bhindi), curd (dahi), rice, chapati, lemondade, raisins, buttermilk, sprouts, corn, cauliflower (gobhi), ravri, jal jeera, tomato, sauteed mushroom (khumb), carrot, mango, kadhi, apple, brinjal bharta, cottage cheese(paneer), amla juice, karela, mausambi (sweet lime), jaggery, lassi, roasted papad, pumpkin";

        new TranslateTask().execute(food1, targetLang, sourceLang);

        return view;
    }



//private class TranslateTask extends AsyncTask<String, Void, String> {
//    @Override
//    protected String doInBackground(String... strings) {
//        String textToTranslate = strings[0];
//        String targetLang = strings[1];
//        String sourceLang = strings[2];
//
//        try {
//            Translate translate = TranslateOptions.newBuilder().setApiKey(key).build().getService();
//            Translation translation = translate.translate(
//                    textToTranslate,
//                    Translate.TranslateOption.targetLanguage(targetLang),
//                    Translate.TranslateOption.sourceLanguage(sourceLang)
//            );
//            return translation.getTranslatedText();
//        } catch (Exception e) {
//            Log.e("Translation", "Error translating text", e);
//            return null;
//        }

//
//
//    @Override
//    protected void onPostExecute(String translatedText) {
//        if (translatedText != null) {
//            textViewTranslated.setText(translatedText);
//        } else {
//            Toast.makeText(getActivity(), "Error translating text", Toast.LENGTH_SHORT).show();
//        }
//    }
//}
private class TranslateTask extends AsyncTask<String, Void, String> {
    @Override
    protected String doInBackground(String... strings) {
        String textToTranslate = strings[0];
        String targetLang = strings[1];
        String sourceLang = strings[2];

        try {
            // Check if the source language is English
            if (!targetLang.equalsIgnoreCase("en")) {
                // Perform translation only if the source language is not English
                Translate translate = TranslateOptions.newBuilder().setApiKey(key).build().getService();
                Translation translation = translate.translate(
                        textToTranslate,
                        Translate.TranslateOption.targetLanguage(targetLang),
                        Translate.TranslateOption.sourceLanguage(sourceLang)
                );
                return translation.getTranslatedText();
            } else {
                // Return the original text if the source language is English
                return textToTranslate;
            }
        } catch (Exception e) {
            Log.e("Translation", "Error translating text", e);
            return null;
        }
    }

    @Override
    protected void onPostExecute(String translatedText) {
        if (translatedText != null) {
            textViewTranslated.setText(translatedText);
        } else {
            Toast.makeText(getActivity(), "Error translating text", Toast.LENGTH_SHORT).show();
        }
    }
}



    private String getCurrentLocaleCode() {
        Resources resources = getResources();
        Configuration configuration = resources.getConfiguration();
        Locale currentLocale = configuration.locale;
        return currentLocale.getLanguage(); // Returns the language code, e.g., "en" for English
    }
}
