package monki;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Puntaje {

	private int posicionX;
	private int posicionY;
	private Font font;
	private Color color;
	private int puntaje;

	public Puntaje(int posicionX, int posicionY, Font font, Color color) {
		this.posicionX = posicionX;
		this.posicionY = posicionY;
		this.font = font;
		this.color = color;
		this.puntaje = 0;
	}

	public void dibujarse(Graphics g) {
		g.setColor(color);
		g.setFont(font);
		g.drawString("Bananas: " + String.valueOf(puntaje), posicionX, posicionY);
	}

	public void restarPunto() {
		puntaje--;
	}

	public void sumarPunto() {
		puntaje=puntaje+1;
	}

	public int getPuntaje() {
		return puntaje;	
	}
}