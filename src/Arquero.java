
public class Arquero extends Guerrero {

    public Arquero() {

        System.out.println("Arquero creado");
    }

    public Arquero(int id, String nombre, double fuerza) {
        this.id = id;
        this.nombre = nombre;
        this.fuerza = fuerza;
    }

    public double ataqueBasico() {
        double v = 0;
        if (this.armado()) {
            v = this.fuerza * this.arma.poderAtaque;
        }

        return v;
    }

    public void imprime() {
        System.out.println("ID: "+this.id+". Arquero: "+this.nombre+". Fuerza: "+this.fuerza);
        if (this.armado()) {
            System.out.print("ARMADO con: ");
            System.out.println("Arco ID: "+this.arma.id+", "+this.arma.nombre+", "+this.arma.poderAtaque);
        }
        else {
            System.out.println("DESARMADO");
        }
    }

    public boolean cargaArma(Arma arma) {
        if (arma.getClass() == Arco.class) {
            this.arma = arma;
            return true;
        }
        else {

            System.out.println("Soy Arquero y solo utilizo Arco");
            return false;
        }
    }
}
