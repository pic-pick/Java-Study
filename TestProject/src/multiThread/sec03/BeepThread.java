package multiThread.sec03;

import java.awt.Toolkit;

public class BeepThread extends Thread {
    @Override
    public void run() {
        Toolkit toolkit = Toolkit.getDefaultToolkit(); // 시스템 툴킷 가져오기

        // 비프음 출력 - 작업 1
        for (int i = 0; i < 5; i++) {
            toolkit.beep(); // 비프음 발생
            try {
                Thread.sleep(500); // 0.5초 지연
            } catch (Exception e) {
                // 예외 무시
            }
        }
    }
}