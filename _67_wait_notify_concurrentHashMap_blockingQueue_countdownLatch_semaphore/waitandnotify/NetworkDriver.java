package _67_wait_notify_concurrentHashMap_blockingQueue_countdownLatch_semaphore.waitandnotify;

public class NetworkDriver {
	
	public static void main(String[] args) {
		
		Data data = new Data();
		Thread sender = new Thread(new Sender(data));
		Thread receiver = new Thread(new Receiver(data));

		sender.start();
		receiver.start();
		
	}
	
}