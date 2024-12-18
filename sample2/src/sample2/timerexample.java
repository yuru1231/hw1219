package sample2;

import java.util.Timer;
import java.util.TimerTask;
import java.text.SimpleDateFormat;
import java.util.Date;

public class timerexample {
    public static void main(String[] args) {
        Timer timer = new Timer();
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        
        // 建立 TimerTask
        TimerTask task = new TimerTask() {
            public void run() {
                System.out.println("當前時間：" + formatter.format(new Date()));
            }
        };
        
        // 設定每秒執行一次
        timer.scheduleAtFixedRate(task, 0, 1000);
        
        // 設置程式自動結束 (10 秒後停止)
        new Timer().schedule(new TimerTask() {
            public void run() {
                timer.cancel();
                System.out.println("計時器已停止！");
            }
        }, 10000);
    }
}
