public class Main {
    public static void main(String[] args) {
        Creador jugadorNormal = new ProxyVIP(false);
        Creador jugadorVIP = new ProxyVIP(true);
        jugadorNormal.crearPersonaje("MapacheFurioso");
        jugadorVIP.crearPersonaje("MapacheLoquito");
        //probamos la sobrecarga
        ((ProxyVIP) jugadorVIP).crearPersonaje();
        //solo mostramos aqui
        System.out.println("Los personajes Creados son: " + CreadorReal.getTotalPersonajes());
    }
}
