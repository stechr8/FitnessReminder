package com.example.fitnessreminder;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;

public class ReminderBroadcast extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        NotificationCompat.Builder vitaminBuilder = new NotificationCompat.Builder(context, "notifyVitamins")
                .setSmallIcon(R.drawable.ic_access_alarm_black_24dp)
                .setContentTitle("Stay Healthy")
                .setContentText("Take Vitamins")
                .setPriority(NotificationCompat.PRIORITY_DEFAULT);

        NotificationCompat.Builder waterBuilder = new NotificationCompat.Builder(context, "notifyWater")
                .setSmallIcon(R.drawable.ic_access_alarm_black_24dp)
                .setContentTitle("Stay Healthy")
                .setContentText("Drink Water")
                .setPriority(NotificationCompat.PRIORITY_DEFAULT);

        NotificationCompat.Builder workoutBuilder = new NotificationCompat.Builder(context, "notifyWorkout")
                .setSmallIcon(R.drawable.ic_access_alarm_black_24dp)
                .setContentTitle("Stay Healthy")
                .setContentText("Time to Workout")
                .setPriority(NotificationCompat.PRIORITY_DEFAULT);

        NotificationManagerCompat notificationManager = NotificationManagerCompat.from(context);

        String id = intent.getStringExtra("id");

        switch(id){
            case "notifyVitamins":
                notificationManager.notify(100, vitaminBuilder.build());
                break;
            case "notifyWater":
                notificationManager.notify(200, waterBuilder.build());
                break;
            case "notifyWorkout":
                notificationManager.notify(300, workoutBuilder.build());
        }

    }
}
