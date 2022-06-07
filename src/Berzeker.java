public class Berzeker extends Guerrero {

    public Berzeker() {
        System.out.println("Berzeker creado");
    }

    public Berzeker(int id, String nombre, double fuerza) {
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
        System.out.println("ID: "+this.id+". Berzeker: "+this.nombre+". Fuerza: "+this.fuerza);
        if (this.armado()) {
            System.out.print("ARMADO con: ");
            System.out.println("Espada ID: "+this.arma.id+", "+this.arma.nombre+", "+this.arma.poderAtaque);
        }
        else {
            System.out.println("DESARMADO");
        }
    }

    public boolean cargaArma(Arma arma) {
        if (arma.getClass() == Espada.class) {
            this.arma = arma;
            return true;
        }
        else {

            System.out.println("Soy Berzeker y solo utilizo Espada");
            return false;
        }

    }
}