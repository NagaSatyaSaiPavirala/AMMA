package com.example.amma;
/*
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;


public class Register extends AppCompatActivity {
TextInputEditText editTextEmail,editTextPassword,editTextConfirmPassword,editTextMotherEmail,editTextHusbandEmail;
Button buttonReg;
FirebaseAuth mAuth;
ProgressBar progressBar;
TextView textView;
    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
        if(currentUser != null){
            Intent intent=new Intent(getApplicationContext(),Logout.class);
            startActivity(intent);
            finish();
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        mAuth=FirebaseAuth.getInstance();
        editTextEmail=findViewById(R.id.email);
        editTextPassword=findViewById(R.id.password);
        editTextConfirmPassword=findViewById(R.id.confirm_password);
        editTextMotherEmail=findViewById(R.id.mother_email);
        editTextHusbandEmail=findViewById(R.id.husband_email);
        buttonReg=findViewById(R.id.btn_register);
        progressBar=findViewById(R.id.progressBar);
        textView=findViewById(R.id.loginNow);
        textView.setOnClickListener(new View.OnClickListener(){
     @Override
     public void onClick(View view) {
         Intent intent = new Intent(getApplicationContext(), Login.class);
         startActivity(intent);
         finish();
     }
    });
        buttonReg.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                progressBar.setVisibility(View.VISIBLE);
                String email,password,confirmPassword,motherEmail,husbandEmail;
                email=String.valueOf(editTextEmail.getText());
                password=String.valueOf(editTextPassword.getText());
                confirmPassword=String.valueOf(editTextConfirmPassword.getText());
                motherEmail=String.valueOf(editTextMotherEmail.getText());
                husbandEmail=String.valueOf(editTextHusbandEmail.getText());
                if(TextUtils.isEmpty(email))
                {
                    Toast.makeText(Register.this,"Enter email",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(TextUtils.isEmpty(password))
                {
                    Toast.makeText(Register.this,"Enter password", Toast.LENGTH_SHORT).show();
                    return;
                }
                if(TextUtils.isEmpty(confirmPassword))
                {
                    Toast.makeText(Register.this,"Enter email",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(!password.equals(confirmPassword))
                {
                    Toast.makeText(Register.this,"Passwords not matching",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(TextUtils.isEmpty(motherEmail))
                {
                    Toast.makeText(Register.this,"Enter mother email",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(TextUtils.isEmpty(husbandEmail))
                {
                    Toast.makeText(Register.this,"Enter husband email",Toast.LENGTH_SHORT).show();
                    return;
                }
                mAuth.createUserWithEmailAndPassword(email, password)
                        .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                progressBar.setVisibility(View.GONE);
                                if (task.isSuccessful()) {
                                    Toast.makeText(Register.this, "Account created.",
                                            Toast.LENGTH_SHORT).show();
                                    Intent intent=new Intent(getApplicationContext(),Login.class);
                                    startActivity(intent);
                                    finish();
                                } else {
                                    // If sign in fails, display a message to the user.
                                    Toast.makeText(Register.this, "Authentication failed.",
                                            Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
            }
        });

    }
}
 */
/*
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.Locale;

public class Register extends AppCompatActivity {
    TextInputEditText editTextEmail, editTextPassword, editTextConfirmPassword, editTextMotherEmail, editTextHusbandEmail;
    Button buttonReg;
    FirebaseAuth mAuth;
    ProgressBar progressBar;
    TextView textView;

    @Override
    public void onStart() {
        super.onStart();
        FirebaseUser currentUser = mAuth.getCurrentUser();
        if (currentUser != null) {
            Intent intent = new Intent(getApplicationContext(), Logout.class);
            startActivity(intent);
            finish();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();
        String selectedLanguage = intent.getStringExtra("selected_language");

        updateLocale(selectedLanguage);

        setContentView(R.layout.activity_register);
        mAuth = FirebaseAuth.getInstance();
        editTextEmail = findViewById(R.id.email);
        editTextPassword = findViewById(R.id.password);
        editTextConfirmPassword = findViewById(R.id.confirm_password);
        editTextMotherEmail = findViewById(R.id.mother_email);
        editTextHusbandEmail = findViewById(R.id.husband_email);
        buttonReg = findViewById(R.id.btn_register);
        progressBar = findViewById(R.id.progressBar);
        textView = findViewById(R.id.loginNow);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Login.class);
                intent.putExtra("selected_language", selectedLanguage);
                startActivity(intent);
                finishAffinity();
            }
        });

        buttonReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressBar.setVisibility(View.VISIBLE);
                String email, password, confirmPassword, motherEmail, husbandEmail;
                email = String.valueOf(editTextEmail.getText());
                password = String.valueOf(editTextPassword.getText());
                confirmPassword = String.valueOf(editTextConfirmPassword.getText());
                motherEmail = String.valueOf(editTextMotherEmail.getText());
                husbandEmail = String.valueOf(editTextHusbandEmail.getText());

                // ... (your existing code remains unchanged)
                if(TextUtils.isEmpty(email))
                {
                    Toast.makeText(Register.this,"Enter email",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(TextUtils.isEmpty(password))
                {
                    Toast.makeText(Register.this,"Enter password", Toast.LENGTH_SHORT).show();
                    return;
                }
                if(TextUtils.isEmpty(confirmPassword))
                {
                    Toast.makeText(Register.this,"Enter email",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(!password.equals(confirmPassword))
                {
                    Toast.makeText(Register.this,"Passwords not matching",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(TextUtils.isEmpty(motherEmail))
                {
                    Toast.makeText(Register.this,"Enter mother email",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(TextUtils.isEmpty(husbandEmail))
                {
                    Toast.makeText(Register.this,"Enter husband email",Toast.LENGTH_SHORT).show();
                    return;
                }
                mAuth.createUserWithEmailAndPassword(email, password)
                        .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                progressBar.setVisibility(View.GONE);
                                if (task.isSuccessful()) {
                                    Toast.makeText(Register.this, "Account created.", Toast.LENGTH_SHORT).show();
                                    Intent intent = new Intent(getApplicationContext(), Login.class);
                                    startActivity(intent);
                                    finish();
                                } else {
                                    Toast.makeText(Register.this, "Authentication failed.", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
            }
        });
    }

    private void updateLocale(String selectedLanguage) {
        Locale locale = new Locale(selectedLanguage);
        getResources().getConfiguration().setLocale(locale);
        getResources().updateConfiguration(getResources().getConfiguration(), getResources().getDisplayMetrics());
    }
}


 */
/*
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
//import com.google.firebase.database.DatabaseReference;
//import com.google.firebase.database.FirebaseDatabase;

import java.util.Locale;

public class Register extends AppCompatActivity {
    TextInputEditText editTextEmail, editTextPassword, editTextConfirmPassword, editTextMotherEmail, editTextHusbandEmail;
    Button buttonReg;
    FirebaseAuth mAuth;
    ProgressBar progressBar;
    TextView textView;
    DatabaseReference databaseReference;

    @Override
    public void onStart() {
        super.onStart();
        FirebaseUser currentUser = mAuth.getCurrentUser();
        if (currentUser != null) {
            Intent intent = new Intent(getApplicationContext(), Logout.class);
            startActivity(intent);
            finish();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();
        String selectedLanguage = intent.getStringExtra("selected_language");

        updateLocale(selectedLanguage);

        setContentView(R.layout.activity_register);
        mAuth = FirebaseAuth.getInstance();
        databaseReference = FirebaseDatabase.getInstance().getReference("Users");

        editTextEmail = findViewById(R.id.email);
        editTextPassword = findViewById(R.id.password);
        editTextConfirmPassword = findViewById(R.id.confirm_password);
        editTextMotherEmail = findViewById(R.id.mother_email);
        editTextHusbandEmail = findViewById(R.id.husband_email);
        buttonReg = findViewById(R.id.btn_register);
        progressBar = findViewById(R.id.progressBar);
        textView = findViewById(R.id.loginNow);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Login.class);
                intent.putExtra("selected_language", selectedLanguage);
                startActivity(intent);
                finishAffinity();
            }
        });

        buttonReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressBar.setVisibility(View.VISIBLE);
                String email, password, confirmPassword, motherEmail, husbandEmail;
                email = String.valueOf(editTextEmail.getText());
                password = String.valueOf(editTextPassword.getText());
                confirmPassword = String.valueOf(editTextConfirmPassword.getText());
                motherEmail = String.valueOf(editTextMotherEmail.getText());
                husbandEmail = String.valueOf(editTextHusbandEmail.getText());

                if (TextUtils.isEmpty(email) || TextUtils.isEmpty(password) ||
                        TextUtils.isEmpty(confirmPassword) || TextUtils.isEmpty(motherEmail) ||
                        TextUtils.isEmpty(husbandEmail)) {
                    Toast.makeText(Register.this, "Fill in all the fields", Toast.LENGTH_SHORT).show();
                    progressBar.setVisibility(View.GONE);
                    return;
                }

                if (!password.equals(confirmPassword)) {
                    Toast.makeText(Register.this, "Passwords do not match", Toast.LENGTH_SHORT).show();
                    progressBar.setVisibility(View.GONE);
                    return;
                }

                mAuth.createUserWithEmailAndPassword(email, password)
                        .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                progressBar.setVisibility(View.GONE);
                                if (task.isSuccessful()) {
                                    // Registration successful, now push user data to the database
                                    String userId = mAuth.getCurrentUser().getUid();
                                    User user = new User(email, motherEmail, husbandEmail);
                                    databaseReference.child(userId).setValue(user);

                                    Toast.makeText(Register.this, "Account created.", Toast.LENGTH_SHORT).show();
                                    Intent intent = new Intent(getApplicationContext(), Login.class);
                                    startActivity(intent);
                                    finish();
                                } else {
                                    Toast.makeText(Register.this, "Authentication failed.", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
            }
        });
    }

    private void updateLocale(String selectedLanguage) {
        Locale locale = new Locale(selectedLanguage);
        getResources().getConfiguration().setLocale(locale);
        getResources().updateConfiguration(getResources().getConfiguration(), getResources().getDisplayMetrics());
    }
}
*/
import static android.content.ContentValues.TAG;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Register extends AppCompatActivity {
    TextInputEditText editTextEmail, editTextPassword, editTextConfirmPassword, editTextMotherEmail, editTextHusbandEmail;
    Button buttonReg;
    FirebaseAuth mAuth;
    FirebaseFirestore fstore;
    String userID;
    ProgressBar progressBar;
    TextView textView;

    @Override
    public void onStart() {
        super.onStart();
        FirebaseUser currentUser = mAuth.getCurrentUser();
        if (currentUser != null) {
            Intent intent = new Intent(getApplicationContext(), Fragment.class);
            startActivity(intent);
            finish();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();
        String selectedLanguage = intent.getStringExtra("selected_language");

        updateLocale(selectedLanguage);

        setContentView(R.layout.activity_register);
        mAuth = FirebaseAuth.getInstance();
        fstore=FirebaseFirestore.getInstance();
        editTextEmail = findViewById(R.id.email);
        editTextPassword = findViewById(R.id.password);
        editTextConfirmPassword = findViewById(R.id.confirm_password);
        editTextMotherEmail = findViewById(R.id.mother_email);
        editTextHusbandEmail = findViewById(R.id.husband_email);
        buttonReg = findViewById(R.id.btn_register);
        progressBar = findViewById(R.id.progressBar);
        textView = findViewById(R.id.loginNow);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Login.class);
                intent.putExtra("selected_language", selectedLanguage);
                startActivity(intent);
                finishAffinity();
            }
        });

        buttonReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressBar.setVisibility(View.VISIBLE);
                String email, password, confirmPassword, motherEmail, husbandEmail;
                email = String.valueOf(editTextEmail.getText());
                password = String.valueOf(editTextPassword.getText());
                confirmPassword = String.valueOf(editTextConfirmPassword.getText());
                motherEmail = String.valueOf(editTextMotherEmail.getText());
                husbandEmail = String.valueOf(editTextHusbandEmail.getText());

                // ... (your existing code remains unchanged)
                if(TextUtils.isEmpty(email))
                {
                    //Toast.makeText(Register.this,"Enter email",Toast.LENGTH_SHORT).show();
                    showToastInLocale(R.string.ee);
                    return;
                }
                if(TextUtils.isEmpty(password))
                {
                    //Toast.makeText(Register.this,"Enter password", Toast.LENGTH_SHORT).show();
                    showToastInLocale(R.string.ep);
                    return;
                }
                if(password.length()<6) {
                    //Toast.makeText(Register.this, "Password has to be >6 characters", Toast.LENGTH_SHORT).show();
                    showToastInLocale(R.string.pht);
                    return;
                }
                if(TextUtils.isEmpty(confirmPassword))
                {
                    //Toast.makeText(Register.this,"Enter confirm password",Toast.LENGTH_SHORT).show();
                    showToastInLocale(R.string.ecp);
                    return;
                }
                if(!password.equals(confirmPassword))
                {
                    //Toast.makeText(Register.this,"Passwords not matching",Toast.LENGTH_SHORT).show();
                    showToastInLocale(R.string.pnm);
                    return;
                }
                if(TextUtils.isEmpty(motherEmail))
                {
                    //Toast.makeText(Register.this,"Enter mother email",Toast.LENGTH_SHORT).show();
                    showToastInLocale(R.string.eme);
                    return;
                }
                if(TextUtils.isEmpty(husbandEmail))
                {
                    //Toast.makeText(Register.this,"Enter husband email",Toast.LENGTH_SHORT).show();
                    showToastInLocale(R.string.ehe);
                    return;
                }
                mAuth.createUserWithEmailAndPassword(email, password)
                        .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                progressBar.setVisibility(View.GONE);
                                if (task.isSuccessful()) {
                                    //Toast.makeText(Register.this, "Account created", Toast.LENGTH_SHORT).show();
                                    showToastInLocale(R.string.ac);
                                    userID=mAuth.getCurrentUser().getUid();
                                    DocumentReference documentReference=fstore.collection("users").document(userID);
                                    Map<String,Object> user=new HashMap<>();
                                    user.put("email",email);
                                    user.put("hemail",husbandEmail);
                                    user.put("memail",motherEmail);
                                    documentReference.set(user).addOnSuccessListener(new OnSuccessListener<Void>()
                                    {
                                        @Override
                                        public void onSuccess(Void aVoid)
                                        {
                                            Log.d(TAG,"onSuccess:user Profile is created for"+userID);
                                        }
                                    });

//                                    Intent intent = new Intent(getApplicationContext(), Login.class);
//                                    startActivity(intent);
//                                    finish();
                                    Intent intent = new Intent(getApplicationContext(), Login.class);
                                    intent.putExtra("selected_language", selectedLanguage);
                                    startActivity(intent);
                                    finishAffinity();
                                } else {
                                   // Toast.makeText(Register.this, "Authentication failed", Toast.LENGTH_SHORT).show();
                                    showToastInLocale(R.string.af);
                                }
                            }
                        });
            }
        });
    }

    private void updateLocale(String selectedLanguage) {
        Locale locale = new Locale(selectedLanguage);
        getResources().getConfiguration().setLocale(locale);
        getResources().updateConfiguration(getResources().getConfiguration(), getResources().getDisplayMetrics());
    }
    private void showToastInLocale(int stringResource) {
        Toast.makeText(Register.this, getString(stringResource), Toast.LENGTH_LONG).show();
    }
}
