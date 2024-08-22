package edu.wyldner.dio.smarttv;

public class SmarthTv {
	boolean ligada = false;
	int canal = 1;
	int volume = 25;

	public void ligarDesligar() {
		ligada = !ligada;
	}

	public void mudarCanal(int novoCanal) {
		canal = novoCanal;
	}
	public void aumentarCanal() {
		volume++;
	}
	
	public void diminuirCanal() {
		volume--;
	}

	public void aumentarVolume() {
		canal++;
	}

	public void diminuirVolume() {
		canal--;
	}
}
