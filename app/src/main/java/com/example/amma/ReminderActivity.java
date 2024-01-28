// ReminderActivity.java
/*
package com.example.reminder;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ReminderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reminder);

        Button okButton = findViewById(R.id.okButton);
        Button dismissButton = findViewById(R.id.dismissButton);

        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Add code to handle "Ok" button click
                Toast.makeText(ReminderActivity.this, "You responded to the reminder", Toast.LENGTH_LONG).show();
                finish();
                System.exit(0);
            }
        });

        dismissButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Add code to handle "Dismiss" button click
                Toast.makeText(ReminderActivity.this, "You dismissed the reminder", Toast.LENGTH_LONG).show();

sendEmails();
                finish();
                System.exit(0);
            }
        });
    }
    // Method to send emails
    private void sendEmails() {
        Mail mail = new Mail();
        mail.buttonSendEmail(findViewById(android.R.id.content)); // Pass any valid view reference
    }

}
*/
/*
package com.example.reminder;

import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class ReminderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reminder);

        Button okButton = findViewById(R.id.okButton);
        Button dismissButton = findViewById(R.id.dismissButton);

        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Add code to handle "Ok" button click
                Toast.makeText(ReminderActivity.this, "You responded to the reminder", Toast.LENGTH_LONG).show();
                finish();
                System.exit(0);
            }
        });

        dismissButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Add code to handle "Dismiss" button click
                Toast.makeText(ReminderActivity.this, "You dismissed the reminder", Toast.LENGTH_LONG).show();
                try {
                    String stringSenderEmail = "p.nagasatyasai.pnss@gmail.com";
                    String[] stringReceiverEmails = {"nagasatyasaipavirala@gmail.com", "p.nagasatyasai.123@gmail.com"};
                    String stringPasswordSenderEmail = "abc";

                    String stringHost = "smtp.gmail.com";

                    Properties properties = System.getProperties();

                    properties.put("mail.smtp.host", stringHost);
                    properties.put("mail.smtp.port", "465");
                    properties.put("mail.smtp.ssl.enable", "true");
                    properties.put("mail.smtp.auth", "true");

                    Session session = Session.getInstance(properties, new Authenticator() {
                        @Override
                        protected PasswordAuthentication getPasswordAuthentication() {
                            return new PasswordAuthentication(stringSenderEmail, stringPasswordSenderEmail);
                        }
                    });

                    MimeMessage mimeMessage = new MimeMessage(session);

                    for (String stringReceiverEmail : stringReceiverEmails) {
                        mimeMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(stringReceiverEmail));
                    }

                    mimeMessage.setSubject("Subject: Message from AMMA");
                    mimeMessage.setText("Hello User, \n\nPregnant woman dismissed the reminder  \n Please do follow her!\n\nRegards,\nsupport@amma.com");

                    Transport.send(mimeMessage);

                } catch (AddressException e) {
                    e.printStackTrace();
                    Log.e("Mail", "AddressException: " + e.getMessage());
                } catch (MessagingException e) {
                    e.printStackTrace();
                    Log.e("Mail", "MessagingException: " + e.getMessage());
                }
                finish();
                System.exit(0);
            }
        });
    }

}
*/
/*
package com.example.amma;

import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class ReminderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reminder);

        Button okButton = findViewById(R.id.okButton);
        Button dismissButton = findViewById(R.id.dismissButton);

        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Add code to handle "Ok" button click
                Toast.makeText(ReminderActivity.this, "You responded to the reminder", Toast.LENGTH_LONG).show();
                finish();
                System.exit(0);
            }
        });

        dismissButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Add code to handle "Dismiss" button click
                Toast.makeText(ReminderActivity.this, "You dismissed the reminder", Toast.LENGTH_LONG).show();

                // Use AsyncTask to send email in the background
                new MailAsyncTask().execute();

              //  finish();
             //  System.exit(0);
            }
        });
    }
// AsyncTask to send emails in the background
private class MailAsyncTask extends AsyncTask<Void, Void, Void> {
    @Override
    protected Void doInBackground(Void... params) {
        try {
            // Your email sending code goes here
            // ...
            String stringSenderEmail = "p.nagasatyasai.pnss@gmail.com";
            String[] stringReceiverEmails = {"nagasatyasaipavirala@gmail.com", "p.nagasatyasai.123@gmail.com"};
            String stringPasswordSenderEmail = "wmiloovwjibzxbhb";

            String stringHost = "smtp.gmail.com";

            Properties properties = System.getProperties();

            properties.put("mail.smtp.host", stringHost);
            properties.put("mail.smtp.port", "465");
            properties.put("mail.smtp.ssl.enable", "true");
            properties.put("mail.smtp.auth", "true");

            Session session = Session.getInstance(properties, new Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(stringSenderEmail, stringPasswordSenderEmail);
                }
            });

            MimeMessage mimeMessage = new MimeMessage(session);

            for (String stringReceiverEmail : stringReceiverEmails) {
                mimeMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(stringReceiverEmail));
            }

            mimeMessage.setSubject("Subject: Message from AMMA");
            mimeMessage.setText("Hello User, \n\nPregnant woman dismissed the reminder  \n Please do follow her!\n\nRegards,\nsupport@amma.com");

            Transport.send(mimeMessage);

        } catch (AddressException e) {
            e.printStackTrace();
            Log.e("Mail", "AddressException: " + e.getMessage());
        } catch (MessagingException e) {
            e.printStackTrace();
            Log.e("Mail", "MessagingException: " + e.getMessage());
        }
        System.exit(0);
        return null;
    }
}
}
*/
/*
package com.example.amma;

import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class ReminderActivity extends AppCompatActivity {
    FirebaseAuth auth;
    FirebaseFirestore fStore;
    FirebaseUser user;
    String userId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reminder);
        auth = FirebaseAuth.getInstance();
        fStore = FirebaseFirestore.getInstance();
        user = auth.getCurrentUser();
        userId = auth.getCurrentUser().getUid();

        Button okButton = findViewById(R.id.okButton);
        Button dismissButton = findViewById(R.id.dismissButton);

        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Add code to handle "Ok" button click
                Toast.makeText(ReminderActivity.this, "You responded to the reminder", Toast.LENGTH_LONG).show();
                finish();
                System.exit(0);
            }
        });

        dismissButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Add code to handle "Dismiss" button click
                Toast.makeText(ReminderActivity.this, "You dismissed the reminder", Toast.LENGTH_LONG).show();

                // Use AsyncTask to send email in the background
                new MailAsyncTask().execute();

                //  finish();
                //  System.exit(0);
            }
        });
    }
    // AsyncTask to send emails in the background
    private class MailAsyncTask extends AsyncTask<Void, Void, Void> {
        @Override
        protected Void doInBackground(Void... params) {
            try {
                // Your email sending code goes here
                // ...
                DocumentReference documentReference = fStore.collection("users").document(userId);
                documentReference.addSnapshotListener(new EventListener<DocumentSnapshot>() {
                    @Override
                    public void onEvent(@Nullable DocumentSnapshot documentSnapshot, @Nullable FirebaseFirestoreException e) {
                        if (documentSnapshot != null) {
                            //hView.setText(documentSnapshot.getString("hemail"));
                            //mView.setText(documentSnapshot.getString("memail"));
                            String[] stringReceiverEmails = {documentSnapshot.getString("hemail"), documentSnapshot.getString("memail")};
                        }
                    }
                });
                String stringSenderEmail = "p.nagasatyasai.pnss@gmail.com";
               // String[] stringReceiverEmails = {"nagasatyasaipavirala@gmail.com", "p.nagasatyasai.123@gmail.com"};
                String stringPasswordSenderEmail = "abc";

                String stringHost = "smtp.gmail.com";

                Properties properties = System.getProperties();

                properties.put("mail.smtp.host", stringHost);
                properties.put("mail.smtp.port", "465");
                properties.put("mail.smtp.ssl.enable", "true");
                properties.put("mail.smtp.auth", "true");

                Session session = Session.getInstance(properties, new Authenticator() {
                    @Override
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(stringSenderEmail, stringPasswordSenderEmail);
                    }
                });

                MimeMessage mimeMessage = new MimeMessage(session);

                for (String stringReceiverEmail : stringReceiverEmails) {
                    mimeMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(stringReceiverEmail));
                }

                mimeMessage.setSubject("Subject: Message from AMMA");
                mimeMessage.setText("Hello User, \n\nPregnant woman dismissed the reminder  \n Please do follow her!\n\nRegards,\nsupport@amma.com");

                Transport.send(mimeMessage);

            } catch (AddressException e) {
                e.printStackTrace();
                Log.e("Mail", "AddressException: " + e.getMessage());
            } catch (MessagingException e) {
                e.printStackTrace();
                Log.e("Mail", "MessagingException: " + e.getMessage());
            }
            System.exit(0);
            return null;
        }
    }
}


 */
/*
package com.example.amma;

import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class ReminderActivity extends AppCompatActivity {
    private FirebaseAuth auth;
    private FirebaseFirestore fStore;
    private FirebaseUser user;
    private String userId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reminder);
        auth = FirebaseAuth.getInstance();
        fStore = FirebaseFirestore.getInstance();
        user = auth.getCurrentUser();
        userId = auth.getCurrentUser().getUid();

        Button okButton = findViewById(R.id.okButton);
        Button dismissButton = findViewById(R.id.dismissButton);

        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Add code to handle "Ok" button click
                Toast.makeText(ReminderActivity.this, "You responded to the reminder", Toast.LENGTH_LONG).show();
                finish();
                System.exit(0);
            }
        });

        dismissButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Add code to handle "Dismiss" button click
                Toast.makeText(ReminderActivity.this, "You dismissed the reminder", Toast.LENGTH_LONG).show();

                // Use AsyncTask to send email in the background
                new MailAsyncTask().execute();
            }
        });
    }

    // AsyncTask to send emails in the background
    private class MailAsyncTask extends AsyncTask<Void, Void, Void> {
        private String hEmail, mEmail;

        @Override
        protected Void doInBackground(Void... params) {
            try {
                // Fetch emails from Firestore in the background
                DocumentReference documentReference = fStore.collection("users").document(userId);
                documentReference.addSnapshotListener(new EventListener<DocumentSnapshot>() {
                    @Override
                    public void onEvent(@Nullable DocumentSnapshot documentSnapshot, @Nullable FirebaseFirestoreException e) {
                        if (documentSnapshot != null) {
                            hEmail = documentSnapshot.getString("hemail");
                            mEmail = documentSnapshot.getString("memail");

                            // Once you have the emails, proceed to send emails
                            sendEmails();
                        }
                    }
                });

            } catch (Exception e) {
                e.printStackTrace();
                Log.e("MailAsyncTask", "Exception: " + e.getMessage());
            }
            return null;
        }

        private void sendEmails() {
            try {
                // Your email sending code goes here
                String stringSenderEmail = "p.nagasatyasai.pnss@gmail.com";
                String[] stringReceiverEmails = {hEmail, mEmail};
                String stringPasswordSenderEmail = "wmiloovwjibzxbhb";

                String stringHost = "smtp.gmail.com";

                Properties properties = System.getProperties();

                properties.put("mail.smtp.host", stringHost);
                properties.put("mail.smtp.port", "465");
                properties.put("mail.smtp.ssl.enable", "true");
                properties.put("mail.smtp.auth", "true");

                Session session = Session.getInstance(properties, new Authenticator() {
                    @Override
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(stringSenderEmail, stringPasswordSenderEmail);
                    }
                });

                MimeMessage mimeMessage = new MimeMessage(session);

                for (String stringReceiverEmail : stringReceiverEmails) {
                    mimeMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(stringReceiverEmail));
                }

                mimeMessage.setSubject("Subject: Message from AMMA");
                mimeMessage.setText("Hello User, \n\nPregnant woman dismissed the reminder  \n Please do follow her!\n\nRegards,\nsupport@amma.com");

                Transport.send(mimeMessage);

            } catch (Exception e) {
                e.printStackTrace();
                Log.e("Mail", "Exception: " + e.getMessage());
            }
        }
    }
}
*/
/*
package com.example.amma;

import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class ReminderActivity extends AppCompatActivity {
    FirebaseAuth auth;
    FirebaseFirestore fStore;
    FirebaseUser user;
    String userId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reminder);
        auth = FirebaseAuth.getInstance();
        fStore = FirebaseFirestore.getInstance();
        user = auth.getCurrentUser();
        userId = auth.getCurrentUser().getUid();

        Button okButton = findViewById(R.id.okButton);
        Button dismissButton = findViewById(R.id.dismissButton);

        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Add code to handle "Ok" button click
                Toast.makeText(ReminderActivity.this, "You responded to the reminder", Toast.LENGTH_LONG).show();
                finish();
            }
        });

        dismissButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Add code to handle "Dismiss" button click
                Toast.makeText(ReminderActivity.this, "You dismissed the reminder", Toast.LENGTH_LONG).show();

                // Use AsyncTask to send email in the background
                new MailAsyncTask().execute();
            }
        });
    }

    // AsyncTask to send emails in the background
    private class MailAsyncTask extends AsyncTask<Void, Void, Void> {
        private String hEma;il, mEmail

        @Override
        protected Void doInBackground(Void... params) {
            try {
                // Fetch emails from Firestore in the background
                DocumentReference documentReference = fStore.collection("users").document(userId);
                documentReference.addSnapshotListener(new EventListener<DocumentSnapshot>() {
                    @Override
                    public void onEvent(@Nullable DocumentSnapshot documentSnapshot, @Nullable FirebaseFirestoreException e) {
                        if (documentSnapshot != null) {
                            hEmail = documentSnapshot.getString("hemail");
                            mEmail = documentSnapshot.getString("memail");

                            // Once you have the emails, proceed to send emails
                            sendEmails();
                        }
                    }
                });

            } catch (Exception e) {
                e.printStackTrace();
                Log.e("MailAsyncTask", "Exception: " + e.getMessage());
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            // This method is called when doInBackground completes
            // You can add any code here that needs to run after sending emails
            finish();
        }

        private void sendEmails() {
            try {
                // Your email sending code goes here
                String stringSenderEmail = "p.nagasatyasai.pnss@gmail.com";
                String[] stringReceiverEmails = {hEmail, mEmail};
                String stringPasswordSenderEmail = "wmiloovwjibzxbhb";

                String stringHost = "smtp.gmail.com";

                Properties properties = System.getProperties();

                properties.put("mail.smtp.host", stringHost);
                properties.put("mail.smtp.port", "465");
                properties.put("mail.smtp.ssl.enable", "true");
                properties.put("mail.smtp.auth", "true");

                Session session = Session.getInstance(properties, new Authenticator() {
                    @Override
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(stringSenderEmail, stringPasswordSenderEmail);
                    }
                });

                MimeMessage mimeMessage = new MimeMessage(session);

                for (String stringReceiverEmail : stringReceiverEmails) {
                    mimeMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(stringReceiverEmail));
                }

                mimeMessage.setSubject("Subject: Message from AMMA");
                mimeMessage.setText("Hello User, \n\nPregnant woman dismissed the reminder  \n Please do follow her!\n\nRegards,\nsupport@amma.com");

                Transport.send(mimeMessage);

            } catch (Exception e) {
                e.printStackTrace();
                Log.e("Mail", "Exception: " + e.getMessage());
            }
            System.exit(0);
           //
            // return null;
        }
    }
}
*/
/*
package com.example.amma;

import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;


import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class ReminderActivity extends AppCompatActivity {
    FirebaseAuth auth;
    FirebaseFirestore fStore;
    FirebaseUser user;
    String userId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reminder);
        auth = FirebaseAuth.getInstance();
        fStore = FirebaseFirestore.getInstance();
        user = auth.getCurrentUser();
        userId = auth.getCurrentUser().getUid();
        Button okButton = findViewById(R.id.okButton);
        Button dismissButton = findViewById(R.id.dismissButton);

        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Add code to handle "Ok" button click
                Toast.makeText(ReminderActivity.this, "You responded to the reminder", Toast.LENGTH_LONG).show();
                finish();
                System.exit(0);
            }
        });

        dismissButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Add code to handle "Dismiss" button click
                Toast.makeText(ReminderActivity.this, "You dismissed the reminder", Toast.LENGTH_LONG).show();

                // Use AsyncTask to send email in the background
                new MailAsyncTask().execute();

                //  finish();
                //  System.exit(0);
            }
        });
    }
    // AsyncTask to send emails in the background

    private class MailAsyncTask extends AsyncTask<Void, Void, Void> {
        String husEmail, motEmail;

        @Override
        protected Void doInBackground(Void... params) {
            DocumentReference documentReference = fStore.collection("users").document(userId);
            documentReference.addSnapshotListener(new EventListener<DocumentSnapshot>() {
                @Override
                public void onEvent(@Nullable DocumentSnapshot documentSnapshot, @Nullable FirebaseFirestoreException e) {
                    if (documentSnapshot != null) {
                        husEmail = documentSnapshot.getString("hemail");
                        motEmail = documentSnapshot.getString("memail");
                        try {
                            // Your email sending code goes here
                            // ...
                            String stringSenderEmail = "p.nagasatyasai.pnss@gmail.com";
                            String[] stringReceiverEmails = {husEmail, motEmail};
                            String stringPasswordSenderEmail = "wmiloovwjibzxbhb";

                            String stringHost = "smtp.gmail.com";

                            Properties properties = System.getProperties();

                            properties.put("mail.smtp.host", stringHost);
                            properties.put("mail.smtp.port", "465");
                            properties.put("mail.smtp.ssl.enable", "true");
                            properties.put("mail.smtp.auth", "true");

                            Session session = Session.getInstance(properties, new Authenticator() {
                                @Override
                                protected PasswordAuthentication getPasswordAuthentication() {
                                    return new PasswordAuthentication(stringSenderEmail, stringPasswordSenderEmail);
                                }
                            });

                            MimeMessage mimeMessage = new MimeMessage(session);

                            for (String stringReceiverEmail : stringReceiverEmails) {
                                mimeMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(stringReceiverEmail));
                            }

                            mimeMessage.setSubject("Subject: Message from AMMA");
                            mimeMessage.setText("Hello User, \n\nPregnant woman dismissed the reminder  \n Please do follow her!\n\nRegards,\nsupport@amma.com");

                            Transport.send(mimeMessage);
                        } catch (AddressException ex) {
                            ex.printStackTrace();
                            Log.e("Mail", "AddressException: " + ex.getMessage());
                        } catch (MessagingException ex) {
                            ex.printStackTrace();
                            Log.e("Mail", "MessagingException: " + ex.getMessage());
                        }
                    }
                }
            });

            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            Log.d("Mail", "Email sent successfully");
        }
    }

}
 */
/*
package com.example.amma;

import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class ReminderActivity extends AppCompatActivity {
    FirebaseAuth auth;
    FirebaseFirestore fStore;
    FirebaseUser user;
    String userId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reminder);
        auth = FirebaseAuth.getInstance();
        fStore = FirebaseFirestore.getInstance();
        user = auth.getCurrentUser();
        userId = auth.getCurrentUser().getUid();

        Button okButton = findViewById(R.id.okButton);
        Button dismissButton = findViewById(R.id.dismissButton);

        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Add code to handle "Ok" button click
                Toast.makeText(ReminderActivity.this, "You responded to the reminder", Toast.LENGTH_LONG).show();
                finish();
                System.exit(0);
            }
        });

        dismissButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Add code to handle "Dismiss" button click
                Toast.makeText(ReminderActivity.this, "You dismissed the reminder", Toast.LENGTH_LONG).show();

                // Use AsyncTask to send email in the background
                new MailAsyncTask().execute();
            }
        });
    }

    // AsyncTask to send emails in the background
    private class MailAsyncTask extends AsyncTask<Void, Void, Void> {
        String husEmail, motEmail;

        @Override
        protected Void doInBackground(Void... params) {
            DocumentReference documentReference = fStore.collection("users").document(userId);
            documentReference.addSnapshotListener(new EventListener<DocumentSnapshot>() {
                @Override
                public void onEvent(@Nullable DocumentSnapshot documentSnapshot, @Nullable FirebaseFirestoreException e) {
                    if (documentSnapshot != null) {
                        husEmail = documentSnapshot.getString("hemail");
                        motEmail = documentSnapshot.getString("memail");
                    }
                }
            });

            try {
                // Your email sending code goes here
                // ...
                String stringSenderEmail = "p.nagasatyasai.pnss@gmail.com";
                String[] stringReceiverEmails = {husEmail, motEmail};
                String stringPasswordSenderEmail = "wmiloovwjibzxbhb";

                String stringHost = "smtp.gmail.com";

                Properties properties = System.getProperties();

                properties.put("mail.smtp.host", stringHost);
                properties.put("mail.smtp.port", "465");
                properties.put("mail.smtp.ssl.enable", "true");
                properties.put("mail.smtp.auth", "true");

                Session session = Session.getInstance(properties, new Authenticator() {
                    @Override
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(stringSenderEmail, stringPasswordSenderEmail);
                    }
                });

                MimeMessage mimeMessage = new MimeMessage(session);

                for (String stringReceiverEmail : stringReceiverEmails) {
                    mimeMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(stringReceiverEmail));
                }

                mimeMessage.setSubject("Subject: Message from AMMA");
                mimeMessage.setText("Hello User, \n\nPregnant woman dismissed the reminder  \n Please do follow her!\n\nRegards,\nsupport@amma.com");

                Transport.send(mimeMessage);

            } catch (AddressException ex) {
                ex.printStackTrace();
                Log.e("Mail", "AddressException: " + ex.getMessage());
            } catch (MessagingException ex) {
                ex.printStackTrace();
                Log.e("Mail", "MessagingException: " + ex.getMessage());
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void result) {
            // You can perform UI updates, if needed, after the email sending is complete
            // ...
        }
    }
}
*/
/*
package com.example.amma;

import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;


public class ReminderActivity extends AppCompatActivity {
    FirebaseAuth auth;
    FirebaseFirestore fStore;
    FirebaseUser user;
    String userId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reminder);
        auth = FirebaseAuth.getInstance();
        fStore = FirebaseFirestore.getInstance();
        user = auth.getCurrentUser();
        userId = auth.getCurrentUser().getUid();

        Button okButton = findViewById(R.id.okButton);
        Button dismissButton = findViewById(R.id.dismissButton);

        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Add code to handle "Ok" button click
                Toast.makeText(ReminderActivity.this, "You responded to the reminder", Toast.LENGTH_LONG).show();
                finish();
                System.exit(0);
            }
        });

        dismissButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Add code to handle "Dismiss" button click
                Toast.makeText(ReminderActivity.this, "You dismissed the reminder", Toast.LENGTH_LONG).show();

                // Use AsyncTask to send email in the background
                new MailAsyncTask().execute();
            }
        });
    }

    // AsyncTask to send emails in the background
    // AsyncTask to send emails in the background

    // AsyncTask to send emails in the background
    // AsyncTask to send emails in the background
    private class MailAsyncTask extends AsyncTask<Void, Void, Void> {
        String husEmail, motEmail;

        @Override
        protected Void doInBackground(Void... params) {
            DocumentReference documentReference = fStore.collection("users").document(userId);

            documentReference.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
                @Override
                public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                    if (task.isSuccessful()) {
                        DocumentSnapshot documentSnapshot = task.getResult();
                        if (documentSnapshot != null && documentSnapshot.exists()) {
                            husEmail = documentSnapshot.getString("hemail");
                            motEmail = documentSnapshot.getString("memail");

                            try {
                                // Your email sending code goes here
                                // ...

                                String stringSenderEmail = "p.nagasatyasai.pnss@gmail.com";
                                String[] stringReceiverEmails = {husEmail, motEmail};
                                String stringPasswordSenderEmail = "abc";

                                String stringHost = "smtp.gmail.com";

                                Properties properties = System.getProperties();

                                properties.put("mail.smtp.host", stringHost);
                                properties.put("mail.smtp.port", "465");
                                properties.put("mail.smtp.ssl.enable", "true");
                                properties.put("mail.smtp.auth", "true");

                                Session session = Session.getInstance(properties, new Authenticator() {
                                    @Override
                                    protected PasswordAuthentication getPasswordAuthentication() {
                                        return new PasswordAuthentication(stringSenderEmail, stringPasswordSenderEmail);
                                    }
                                });

                                MimeMessage mimeMessage = new MimeMessage(session);

                                for (String stringReceiverEmail : stringReceiverEmails) {
                                    mimeMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(stringReceiverEmail));
                                }

                                mimeMessage.setSubject("Subject: Message from AMMA");
                                mimeMessage.setText("Hello User, \n\nPregnant woman dismissed the reminder  \n Please do follow her!\n\nRegards,\nsupport@amma.com");

                                Transport.send(mimeMessage);

                            } catch (AddressException addressException) {
                                addressException.printStackTrace();
                                Log.e("Mail", "AddressException: " + addressException.getMessage());
                            } catch (MessagingException messagingException) {
                                messagingException.printStackTrace();
                                Log.e("Mail", "MessagingException: " + messagingException.getMessage());
                            } catch (Exception exception) {
                                exception.printStackTrace();
                                Log.e("Mail", "Exception: " + exception.getMessage());
                            }
                        }
                    } else {
                        Log.e("Firestore", "Error getting document: ", task.getException());
                    }
                }
            });

            return null;
        }
    }




}
*/
package com.example.amma;

import static androidx.core.content.ContentProviderCompat.requireContext;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;

import java.util.Locale;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class ReminderActivity extends AppCompatActivity {
    FirebaseAuth auth;
    FirebaseFirestore fStore;
    FirebaseUser user;
    String userId,husEmail,motEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reminder);
        Intent intent = getIntent();
        String selectedLanguage = intent.getStringExtra("selected_language");
        setLocale(selectedLanguage);
        auth = FirebaseAuth.getInstance();
        fStore = FirebaseFirestore.getInstance();
        user = auth.getCurrentUser();
        userId = auth.getCurrentUser().getUid();
        Button okButton = findViewById(R.id.okButton);
        Button dismissButton = findViewById(R.id.dismissButton);
        okButton.setText(getString(R.string.ok_button_text));
        dismissButton.setText(getString(R.string.dismiss_button_text));
        DocumentReference documentReference = fStore.collection("users").document(userId);
        documentReference.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot documentSnapshot, @Nullable FirebaseFirestoreException e) {
                if (documentSnapshot != null) {
                   husEmail=documentSnapshot.getString("hemail");
                    motEmail=documentSnapshot.getString("memail");
                }
            }
        });
        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Add code to handle "Ok" button click
                //Toast.makeText(ReminderActivity.this, "You responded to the reminder", Toast.LENGTH_LONG).show();
                showToastInLocale(R.string.yrtr);
                finish();
                System.exit(0);
            }
        });

        dismissButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Add code to handle "Dismiss" button click
                //Toast.makeText(ReminderActivity.this, "You dismissed the reminder", Toast.LENGTH_LONG).show();
                showToastInLocale(R.string.ydtr);

                // Use AsyncTask to send email in the background
                new MailAsyncTask().execute();

                //  finish();
                //  System.exit(0);
            }
        });
    }

// AsyncTask to send emails in the background
    private class MailAsyncTask extends AsyncTask<Void, Void, Void> {
        @Override
        protected Void doInBackground(Void... params) {
            try {
                // Your email sending code goes here
                // ...
                String stringSenderEmail = "p.nagasatyasai.pnss@gmail.com";
                String[] stringReceiverEmails = {husEmail,motEmail};
                String stringPasswordSenderEmail = "****************";

                String stringHost = "smtp.gmail.com";

                Properties properties = System.getProperties();

                properties.put("mail.smtp.host", stringHost);
                properties.put("mail.smtp.port", "465");
                properties.put("mail.smtp.ssl.enable", "true");
                properties.put("mail.smtp.auth", "true");

                Session session = Session.getInstance(properties, new Authenticator() {
                    @Override
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(stringSenderEmail, stringPasswordSenderEmail);
                    }
                });

                MimeMessage mimeMessage = new MimeMessage(session);

                for (String stringReceiverEmail : stringReceiverEmails) {
                    mimeMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(stringReceiverEmail));
                }

                mimeMessage.setSubject("Subject: Message from AMMA");
                mimeMessage.setText("Hello User, \n\nPregnant woman dismissed the reminder  \nPlease do follow her!\n\nRegards,\nsupport@amma.com");

                Transport.send(mimeMessage);

            } catch (AddressException e) {
                e.printStackTrace();
                Log.e("Mail", "AddressException: " + e.getMessage());
            } catch (MessagingException e) {
                e.printStackTrace();
                Log.e("Mail", "MessagingException: " + e.getMessage());
            }
            System.exit(0);
            return null;
        }
    }
    private void showToastInLocale(int stringResource) {
        Toast.makeText(this, getString(stringResource), Toast.LENGTH_LONG).show();
    }
    private void setLocale(String language) {
        Locale locale = new Locale(language);
        Resources resources = getResources();
        Configuration configuration = resources.getConfiguration();
        configuration.setLocale(locale);
        resources.updateConfiguration(configuration, resources.getDisplayMetrics());
    }
}
