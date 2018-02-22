package iff.edu.thread;

public class MinhaThread extends Thread{
	private String nome;
	private int tempo;
	
	public MinhaThread(String nome, int tempo) {
		this.nome = nome;
		this.tempo = tempo;
		start();
	}

	public void run() {
		try {
				System.out.println("Eu sou a Thread "+nome+" e vou dormir por "+tempo/1000+" segundos!\r\n");
				MinhaThread.sleep(tempo);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Eu sou a Thread "+nome+". Já se passaram "+tempo/1000+" segundos e eu serei finalizada!\r\n");
	}

}


