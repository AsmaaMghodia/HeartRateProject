package com.example.testalarm;

import android.app.Activity;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.telephony.SmsManager;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import java.util.concurrent.atomic.AtomicInteger;

import static com.example.testalarm.MyBroadcastReceiver.ACTION_SNOOZE;
import static com.example.testalarm.MyBroadcastReceiver.EXTRA_NOTIFICATION_ID;

public class MainActivity extends AppCompatActivity {


    private static final String CHANNEL_ID = "CHANNEL_ID";
    private static final String TAG = "main";
    private AtomicInteger notificationId = new AtomicInteger(0);
    String array []= showTips.countryList;





    TextView tware2;
    TextView paper ;
    TextView history;
    TextView editprofile;
    Button alarm;
    Button tips;
    Button about ;
    int i;
    public  static  String Hb="";



    Button info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        final Activity activity = this;

     

        setContentView(R.layout.activity_main);
        Log.e(TAG, "onCreate");
         tware2 = findViewById(R.id.text_tware2);
         paper = findViewById(R.id.papaer);
         editprofile = findViewById(R.id.addinfo);
         history = findViewById(R.id.btn_history);
         alarm = findViewById(R.id.btn_alarm);
         tips = findViewById(R.id.tips);
         info = findViewById(R.id.info);
         TextView hb = findViewById(R.id.hb);
         about = findViewById(R.id.btn_about);
         MonitoringScreen monitoringScreen = new MonitoringScreen();

        //show heartBEAT/*
        // Hb = monitoringScreen.hb_read;

            final Handler handler = new Handler();
            handler.post(new Runnable() {
                @Override
                public void run() {
                    if(Hb.isEmpty()){
                        hb.setText("0");
                    }
                    else {
                    hb.setText(Hb);

                    int hb_int = Integer.parseInt(Hb);

                    if (hb_int >= 70) {

                        NotificationCompat.Builder builder = new NotificationCompat.Builder(MainActivity.this, CHANNEL_ID)
                                .setSmallIcon(R.drawable.ic_launcher_background)
                                .setContentTitle("ارتفاع النبض عن 70")
                                .setContentText("يجب عليك أخد قسط من الراحه وأخذ الدواء المناسب")
                                .setPriority(NotificationCompat.PRIORITY_HIGH)
                                .setAutoCancel(false);


                        NotificationManagerCompat notificationManager = NotificationManagerCompat.from(MainActivity.this);
                        notificationManager.notify(1, builder.build());

                    }
                    if (hb_int >= 90) {
                        String number = "01003414098";  // The number on which you want to send SMS
                        Toast.makeText(MainActivity.this,
                                String.valueOf(hb_int) , Toast.LENGTH_SHORT).show();
                        sendEmail();
                        SmsManager smsManager = SmsManager.getDefault();
                        smsManager.sendTextMessage(number, null, "ارتفع النبض عند المريض عن 90 أرجو المساعده", null, null);

                    }


                }}
            });





       createNotificationChannel();
        show_notification();


        tware2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, help.class);
                startActivity(intent);
            }
        });
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, About.class);
                startActivity(intent);
            }
        });

        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, bluetooth.class);
                startActivity(intent);
            }
        });


        paper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CameraActivity.class);
                startActivity(intent);
            }
        });

         alarm.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this, alarm.class);
            startActivity(intent);
        }
    });

        editprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Editprofile.class);
                startActivity(intent);
            }
        });

        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, Profile.class);

                intent.putExtra("enable","main");
                startActivity(intent);
            }
        });

}



    public void follow_hb(View view){
        Intent intent = new Intent(this,history.class);
        startActivity(intent);


    }


    public void tips_method(View view){
        Intent intent = new Intent(this,showTips.class);
        startActivity(intent);
    }


    public void show_notification(){

        final Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                String title =array[i];
             //   for ( title: array) {}
                    try {
                        //sleep(6000);
                        handler.postDelayed(this, 90000);

                        sendNotification(title, notificationId.incrementAndGet());
                        i++;

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                handler.postDelayed(this, 900000);}

        });

    }
    private void createNotificationChannel() {
        // Create the NotificationChannel, but only on API 26+ because
        // the NotificationChannel class is new and not in the support library
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            CharSequence name = getString(R.string.channel_name);
            String description = getString(R.string.channel_description);
            int importance = NotificationManager.IMPORTANCE_DEFAULT;
            NotificationChannel channel = new NotificationChannel(CHANNEL_ID, name, importance);
            channel.setDescription(description);
            // Register the channel with the system; you can't change the importance
            // or other notification behaviors after this
            NotificationManager notificationManager = getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(channel);
        }
    }





    void sendNotification(String line , int notificationId)  {


        Intent snoozeIntent = new Intent(MainActivity.this , MyBroadcastReceiver.class);
        snoozeIntent.setAction(ACTION_SNOOZE);
        snoozeIntent.putExtra(EXTRA_NOTIFICATION_ID, notificationId);

        Log.e(TAG, snoozeIntent.getExtras().toString());

        Log.e(TAG, "snoozeIntent id: " + snoozeIntent.getIntExtra(EXTRA_NOTIFICATION_ID, -1));

        PendingIntent snoozePendingIntent =
                PendingIntent.getBroadcast(this, notificationId, snoozeIntent, 0);

        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, CHANNEL_ID)
                .setSmallIcon(R.drawable.ic_launcher_background)
                .setContentTitle("Tips")
                .setContentText(line)
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setAutoCancel(false)
                // Add the action button
                .addAction(R.drawable.ic_launcher_foreground, this.getString(R.string.snooze),
                        snoozePendingIntent);

        NotificationManagerCompat notificationManager = NotificationManagerCompat.from(this);

        // notificationId is a unique int for each notification that you must define
        notificationManager.notify(notificationId, builder.build());

    }


    protected void sendEmail() {
        Log.i("Send email", "");
        String[] TO = {""};
        String[] CC = {""};
        Intent emailIntent = new Intent(Intent.ACTION_SEND);

        emailIntent.setData(Uri.parse("mailto:"));
        emailIntent.setType("text/plain");
        emailIntent.putExtra(Intent.EXTRA_EMAIL, TO);
        emailIntent.putExtra(Intent.EXTRA_CC, CC);
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Your subject");
        emailIntent.putExtra(Intent.EXTRA_TEXT, "Email message goes here");

        try {
            startActivity(Intent.createChooser(emailIntent, "Send mail..."));
            finish();
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(MainActivity.this, "There is no email client installed.", Toast.LENGTH_SHORT).show();
        }
    }

}
