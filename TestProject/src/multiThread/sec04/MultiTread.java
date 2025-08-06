package multiThread.sec04;

public class MultiTread {
	int id;

	public void MultiThread(int id) {
		this.id = id;
		
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.printf("thread(%d), i:%d%n", id, i);
		}
	}
}
