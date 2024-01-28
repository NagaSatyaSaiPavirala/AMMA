/*
package com.example.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class Food3Fragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Food3Fragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static Food3Fragment newInstance(String param1, String param2) {
        Food3Fragment fragment = new Food3Fragment();
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
        return inflater.inflate(R.layout.fragment_food4, container, false);
    }
}

 */
/*package com.example.amma;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class Food3Fragment extends Fragment {

    public Food3Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_food3, container, false);
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

public class Food3Fragment extends Fragment {

    private TextView textViewTranslated;
    private String key = "***************************************"; // Replace with your actual API key

    public Food3Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_food3, container, false);

        textViewTranslated = view.findViewById(R.id.eatfood3);

        String currentLocaleCode = getCurrentLocaleCode();

        String targetLang = currentLocaleCode; // for English
        String sourceLang ="en" ; // for the current locale

        String food3 = "You require plenty of energy in the third trimester.\n" +
                "Energy boosting food:\n" +
                "Aloo (potato) and pyaaz (onion) paratha, honey, chapati, rice, paneer, khajoor (dates), sabudana (sago), moongphali (peanuts), bhutta (roasted corn), suji (semolina), aam(mango), murmura (puffed rice), pulao, methi paratha, shakarkandi (sweet potato), kela (banana), mixed nuts\n" +
                "Vitamin K (helps your blood to clot, which is important after childbirth):\n" +
                "Soya, bhindi (okra), gajar (carrot), beans, angoor (grapes), matar (peas), palak (spinach), anjeer (dried figs), anaar (pomegranate), bathua (lamb’s quarter), hari gobhi (steamed broccoli)\n" +
                "Iron-rich foods: (to help your body make red blood cells for your growing baby)\n" +
                "Sattu drink, poha, Moong dal, hari moong, mixed dal (Milijhuli dal), pearl millet (bajra roti), peanuts (moong phali), black gram (urad dal), lotus stem (kamal kakri), sorghum (jowar) roti, red lentil (masoor dal), fenugreek (methi), rajma (kidney beans), horse gram (kala chana), sambhar, oats (jai), almonds\n" +
                "Tip: You need between 200 and 300 extra calories in the third trimester, so make sure you have morning and afternoon snacks!\n" +
                "Throughout pregnancy, you need to limit your caffeine intake";
        new TranslateTask().execute(food3, targetLang, sourceLang);

        return view;
    }


    //    private class TranslateTask extends AsyncTask<String, Void, String> {
//        @Override
//        protected String doInBackground(String... strings) {
//            String textToTranslate = strings[0];
//            String targetLang = strings[1];
//            String sourceLang = strings[2];
//            Translate translate = TranslateOptions.newBuilder().setApiKey(key).build().getService();
//            try {
//                Translation translation = translate.translate(
//                        textToTranslate,
//                        Translate.TranslateOption.targetLanguage(targetLang),
//                        Translate.TranslateOption.sourceLanguage(sourceLang)
//                );
//                return translation.getTranslatedText();
//            } catch (Exception e) {
//                Log.e("Translation", "Error translating text", e);
//                return null;
//            }
//        }
//
//        @Override
//        protected void onPostExecute(String translatedText) {
//            if (translatedText != null) {
//                textViewTranslated.setText(translatedText);
//            } else {
//                Toast.makeText(getActivity(), "Error translating text", Toast.LENGTH_SHORT).show();
//            }
//        }
//    }
    private class TranslateTask extends AsyncTask<String, Void, String> {
        @Override
        protected String doInBackground(String... strings) {
            String textToTranslate = strings[0];
            String targetLang = strings[1];
            String sourceLang = strings[2];

            try {
                Translate translate = TranslateOptions.newBuilder().setApiKey(key).build().getService();
                Translation translation = translate.translate(
                        textToTranslate,
                        Translate.TranslateOption.targetLanguage(targetLang),
                        Translate.TranslateOption.sourceLanguage(sourceLang)
                );
                return translation.getTranslatedText();
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