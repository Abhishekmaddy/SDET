package main.abhi;

import java.util.Timer;
import java.util.TimerTask;
import java.util.Date;
import java.text.SimpleDateFormat;

public class ScheduledTaskExample {
    public static void main(String[] args) {
        Timer timer = new Timer();

        // Set the target date and time
        String targetDateTime = "7/12/2023 22:30:00";

        // Create a SimpleDateFormat object to parse the target date and time
        SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy HH:mm:ss");
        try {
            Date date = sdf.parse(targetDateTime);

            // Schedule the task to execute at the specified date and time
            timer.schedule(new TimerTask() {
                public void run() {
                    System.out.println("Hello AHD Team");
                    timer.cancel(); // Stop the timer after executing the task
                }
            }, date);
        } catch (Exception e) {
            System.out.println("Invalid date format. Please provide a date in the format 'M/d/yyyy HH:mm:ss'.");
        }
    }
}