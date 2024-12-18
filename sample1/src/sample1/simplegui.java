package sample1;

import java.awt.*;
import java.awt.event.*;

public class simplegui{
    public static void main(String[] args) {
        // 建立主視窗
        Frame frame = new Frame("簡單的 GUI 範例");

        // 建立標籤和按鈕
        Label label = new Label("按下按鈕看看效果吧！", Label.CENTER);
        Button button = new Button("按我");

        // 設置視窗佈局
        frame.setLayout(new BorderLayout());
        frame.add(label, BorderLayout.CENTER);
        frame.add(button, BorderLayout.SOUTH);

        // 設置視窗大小並顯示
        frame.setSize(300, 150);
        frame.setVisible(true);

        // 關閉視窗的事件處理
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0); // 結束程式
            }
        });

        // 按鈕的點擊事件處理
        button.addActionListener(new ActionListener() {
            private boolean toggled = false; // 狀態切換變數

            public void actionPerformed(ActionEvent e) {
                if (!toggled) {
                    label.setText("你按了按鈕！再按一次看看！");
                } else {
                    label.setText("按鈕狀態已切換回原始狀態！");
                }
                toggled = !toggled; // 切換狀態
            }
        });
    }
}

