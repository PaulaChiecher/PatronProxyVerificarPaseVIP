public class CreadorReal implements Creador {
    private static int contador = 0; //metodo estatico para contar personajes
    @Override
    public void crearPersonaje(String nombre) {
        contador++;
        System.out.println("Personaje " + nombre + " creado con exito. ");
    }
    public static int getTotalPersonajes() {
        return contador;
    }
}
