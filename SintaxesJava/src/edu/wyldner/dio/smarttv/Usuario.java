package edu.wyldner.dio.smarttv;

public class Usuario {
	public static void main(String[] args) {
		System.out.println("TELEVISÃO");
		
		SmarthTv tv = new SmarthTv ();
		System.out.println("Tv ligada? " + tv.ligada);
		System.out.println("qual canal? " + tv.canal);
		System.out.println("qual volume?" + tv.volume);
		
		tv.ligarDesligar();
		System.out.println("Tv ligada? " + tv.ligada);
		
	}
}
