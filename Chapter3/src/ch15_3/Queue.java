package ch15_3;

public interface Queue {

	void enQueue(String title);
	String deQueue();
	
	int getSize();
}
