public class Board {
    public static final int SIZE = 10;
    public static char[][] tablero;
    public static final char EMPTY = '~';
    public static final char SHIP = 'S';

    public static void inicializarTablero() {
        tablero = new char[SIZE][SIZE];

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                tablero[i][j] = EMPTY; // Agua
            }
        }
    }

    public static void placeShip(int x, int y, int length, boolean horizontal) {
        System.out.println("colocando barco en el tablero...");

        if (horizontal) {
            for (int i = 0; i < length; i++) {
                tablero[x][y + i] = SHIP;
            }
        } else {
            for (int i = 0; i < length; i++) {
                tablero[x + i][y] = SHIP;
            }
        }
    }
}
