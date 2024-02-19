package tresRaya;

public class TresRaya {

	private char[][] tablero;
	private char J1;
	private char J2;
	private boolean turno;

	public TresRaya() {
		this.tablero = new char[3][3];
		this.J1 = 'X';
		this.J2 = 'O';
		this.turno = false;
	}

	public void inicializarTablero() {

		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				System.out.print("-");
			}
			System.out.println();
		}
	}

	public void insertarEn(int fila, int columna) {
		if (turno) {
			this.tablero[fila][columna] = J1;
		} else {
			this.tablero[fila][columna] = J2;
		}
	}

	public void mostrarTablero() {

		for (int i = 0; i < this.tablero.length; i++) {
			for (int j = 0; j < this.tablero[0].length; j++) {
				System.out.print(this.tablero[i][j] + " ");
			}
			System.out.println("");
		}

	}
	
	public char comprobarLinea() {
		
		boolean coincidencia = false;
		
		for(int i = 0; i < tablero.length; i++) {
			for(int j = 0; j<tablero[i].length; i++) {
				
			}
		}
	}
}
