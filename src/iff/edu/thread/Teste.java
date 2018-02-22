package iff.edu.thread;
import java.util.Random;

public class Teste {

	public static void main(String[] args) {
		int vet[] = new int[4];
		Random tempo = new Random();
		for(int i=0; i<4; i++) {
			vet[i] = tempo.nextInt(20)+1;
		}
		
		int t0 = vet[0]*1000;
		int t1 = vet[1]*1000;
		int t2 = vet[2]*1000;
		int t3 = vet[3]*1000;
		
		MinhaThread thread0 = new MinhaThread("0", t0);
		MinhaThread thread1 = new MinhaThread("1", t1);
		MinhaThread thread2 = new MinhaThread("2", t2);
		MinhaThread thread3 = new MinhaThread("3", t3);
		
		thread0.setPriority(10);
		thread1.setPriority(7);
		thread2.setPriority(4);
		thread3.setPriority(1);
		
		try {
			thread0.join();
			thread1.join();
			thread2.join();
			thread3.join();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
