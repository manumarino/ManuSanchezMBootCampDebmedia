
public abstract class Guerrero {
    public int id;
    public String nombre;
    public double fuerza;

    public Arma arma;

    public void guerrero (int id, String nombre, double fuerza) {
        this.id = id;
        this.nombre = nombre;
        this.fuerza = fuerza;
    }

    public double ataqueBasico() {
        return 0;
    }

    public void imprime() {
    }

    public boolean cargaArma(Arma arma) {
        return false;
    }

    public boolean armado() {
        return (this.arma != null);
    }
}
