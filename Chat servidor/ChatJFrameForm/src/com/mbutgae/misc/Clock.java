
package com.mbutgae.misc;


import java.util.Calendar;
import javax.swing.JLabel;

public class Clock implements Runnable {

    JLabel jb;


    public Clock(JLabel jb) {
        this.jb = jb;
    }

    public void run() {
        while (true) {
            try {
                
                jb.setText(timeNow());
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }
    }


    public String timeNow() {
        Calendar now = Calendar.getInstance();
        int hrs = now.get(Calendar.HOUR_OF_DAY);
        int min = now.get(Calendar.MINUTE);
        int sec = now.get(Calendar.SECOND);
        
        int dayOfWeek = now.get(Calendar.DAY_OF_WEEK);
        String dayOfWeekStr = String.valueOf(dayOfWeek);
        
        int dayOfMonth = now.get(Calendar.DAY_OF_MONTH);
        String dayOfMonthStr = String.valueOf(dayOfMonth);
        
        int month = now.get(Calendar.MONTH);
        int year = now.get(Calendar.YEAR);
        
        
        
        String time = dayOfMonthStr +"-"+month+"-"+year+ " | "+zero(hrs) + ":" + zero(min) + ":" + zero(sec);
        return time;
    }

    
    public String zero(int num) {
        String number = (num < 10) ? ("0" + num) : ("" + num);
        return number;
    }

    public void clock(JLabel jb) {
        Clock c1 = new Clock(jb);
        Thread t1 = new Thread(c1);
        t1.start();
    }
}
