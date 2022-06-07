public abstract class Arma {
    int id;
    String nombre;
    double poderAtaque;

    public Arma(int id, String nombre, double poderAtaque) {
        this.id = id;
        this.nombre = nombre;
        this.poderAtaque = poderAtaque;
    }

    @Override
    public String toString() {
        return "Arma{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", poderAtaque=" + poderAtaque +
                '}';
    }

    public Arma() {

    }

    public void imprime() {
    }
}
