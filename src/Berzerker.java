public class Berzerker extends Guerrero{

    Arma espada = new Espada();

    public Berzerker(int id, String nombre, double fuerzaPersonaje) {
        super(id, nombre, fuerzaPersonaje);
    }



    public void imprime() {
        System.out.println("Soy Berzerker "+this.id+", "+this.nombre+", "+this.fuerzaPersonaje);
        if (this.armado()) {
            System.out.println(this.espada.nombre);
        }
        else {
            System.out.println("desarmado");
        }
    }

    public boolean cargaArma(Arma arma) {
        if (arma.getClass() == Espada.class) {
            this.arma = arma;
            System.out.println("LE METI EL ARMA" + arma.nombre);
            return true;
        }
        else {

            System.out.println("Soy Berzerker y solo utilizo Espada");
            return false;
        }

    }
}
