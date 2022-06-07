public class Mago extends Guerrero{

    Arma baculo = new Baculo();

    public Mago(int id, String nombre, double fuerzaPersonaje) {
        super(id, nombre, fuerzaPersonaje);
    }

    public boolean cargaArma(Arma arma) {
        if (arma.getClass() == Baculo.class) {
            this.arma = arma;
            return true;
        }
        else {

            System.out.println("Soy Mago y solo utilizo Baculo");
            return false;
        }
    }

    public void imprime() {
        System.out.println("Soy Mago "+this.id+", "+this.nombre+", "+this.fuerzaPersonaje);
        if (this.armado()) {
            System.out.println(this.baculo.nombre);
        }
        else {
            System.out.println("desarmado");
        }
    }




}
