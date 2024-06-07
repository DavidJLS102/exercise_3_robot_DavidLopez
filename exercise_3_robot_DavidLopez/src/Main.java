public class Main {
    public static void main(String[] args) {

        int[] pasosRobot = {10, 5, -2};

        int xInicial = 0;
        int yInicial = 0;

        int direccionInicial = 0;

        for (int paso : pasosRobot) {
            switch (direccionInicial) {
                case 0:
                    yInicial += paso;
                    break;
                case 1:
                    xInicial -= paso;
                    break;
                case 2:
                    yInicial -= paso;
                    break;
                case 3:
                    xInicial += paso;
                    break;
            }
            direccionInicial = (direccionInicial + 1) % 4;
        }
        System.out.println("Calcula dónde estará un robot (sus coordenadas finales)");
        System.out.println("que se encuentra en una cuadrícula representada por los ejes x,y");
        System.out.println("El robot comienza en la coordenada (0, 0).");

        System.out.println("Coordenadas finales: (" + xInicial + ", " + yInicial + ")");
    }
}

