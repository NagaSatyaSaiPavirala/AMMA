/*
package com.example.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class Food2Fragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Food2Fragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static Food2Fragment newInstance(String param1, String param2) {
        Food2Fragment fragment = new Food2Fragment();
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
        return inflater.inflate(R.layout.fragment_food2, container, false);
    }
}
 */
/*
package com.example.amma;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class Food2Fragment extends Fragment {

    public Food2Fragment() {
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

public class Food2Fragment extends Fragment {

    private TextView textViewTranslated;
    private String key = "***************************************"; // Replace with your actual API key

    public Food2Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_food2, container, false);

        textViewTranslated = view.findViewById(R.id.eatfood2);

        String currentLocaleCode = getCurrentLocaleCode();

        String targetLang = currentLocaleCode; // for English
        String sourceLang ="en" ; // for the current locale

        String food2 = "Omega 3 fatty acid foods: (helps in baby’s brain development)\n" +
                "Mung bean(moong) dal, beans sabzi, masoor (red lentil), akrot (walnut), pigeon peas (arhar) dal, lobhia (black eyed peas)\n" +
                "Calcium rich foods:\n" +
                "Til (sesame), curd, raita, chhaach (butter milk), milk, paneer, almond milk\n" +
                "Betacarotene rich Foods: (Important for healthy skin and blood)\n" +
                "Mango, mint(pudina), gajar(carrot), santara (orange), papita (ripe papaya), palak (spinach), kaddu (pumpkin), hair pyaaz(spring onion)\n" +
                "Your baby heartbeat\n" +
                "Your baby heart starts beating around this week and you are likely to hear it when you go for your first scan.\n" +
                "Eat plenty of iron-rich foods\n" +
                "Anaemia (low haemoglobin) is common among women in India. Make sure you eat plenty of foods rich in iron to help keep your haemoglobin (Hb) in a healthy range. This is important during pregnancy as haemoglobin (Hb) is the protein in our blood that carries oxygen to all the parts of our body, including to your baby.\n" +
                "Don’t drink trea or coffee with iron rich food – tannins in them make it harder for your body to absorb iron.\n" +
                "Iron-rich foods:\n" +
                "Sattu drink, poha, Moong dal, hari moong, mixed dal (Milijhuli dal), pearl millet (bajra roti), peanuts (moong phali), black gram (urad dal), lotus stem (kamal kakri), sorghum (jowar) roti, red lentil (masoor dal), fenugreek (methi), rajma (kidney beans), horse gram (kala chana), sambhar, oats (jai), almonds\n" +
                "Other food items:\n" +
                "Grapes, aloo(potato), nimbu pani (lemonade), makka (corn), mixed vegetable khichdi, roasted papad, seb(apple), tori sabzi, anaar, nariyal pani, tinda (round gourd) sabzi, mooli gajar (radish and carrot) salad, kishmish(raisins), chikoo(sapodilla), okra (bhindi), curd (dahi), rice, chapati, sprouts, corn, cauliflower (gobhi), ravri, jal jeera, tomato, sauteed mushroom (khumb), mango, kadhi, brinjal bharta, amla juice, karela, mausambi (sweet lime), jaggery, lassi.";
        new TranslateTask().execute(food2, targetLang, sourceLang);

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