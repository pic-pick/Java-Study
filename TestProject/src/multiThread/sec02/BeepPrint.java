package multiThread.sec02;

import java.awt.Toolkit;

public class BeepPrint {

	public static void main(String[] args) {
		// 기본 쓰레드
		Runnable beepTask = new BeepTask();	//쓰레드가 진행할 작업 객체
		//두번째 쓰레드 구성 - 작업 task 전달
		Thread thread = new Thread();//작업객ㅊ체를 포함한 스레드 생성
		
		thread.start();//멀티쓰레드(main, beepTask 쓰레드)
		
	}

}
