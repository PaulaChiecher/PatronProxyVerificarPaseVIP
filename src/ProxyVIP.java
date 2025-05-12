public class ProxyVIP implements Creador {
    private CreadorReal creadorReal1;
    private boolean esVIP;

    public ProxyVIP(boolean esVIP){
        this.creadorReal1 = new CreadorReal();
        this.esVIP = esVIP;
    }
    public boolean getEsVIP() {
        return esVIP;
    }

    public void setEsVIP(boolean esVIP) {
        this.esVIP = esVIP;
    }
    //Sobrecarga del metodo creacion
    public void crearPersonaje() {
        crearPersonaje("Personaje anónimo");
    }

    @Override
    public void crearPersonaje(String nombre) {
        if (esVIP){
            creadorReal1.crearPersonaje(nombre);
        } else {
            System.out.println("No tienes permisos para crear un personaje. Para eso se requiere ser VIP");
        }
    }
}
