public abstract class Guerrero {
    int id;
    String nombre;
    double fuerzaPersonaje;
    Arma arma = null;

    public Guerrero(int id, String nombre, double fuerzaPersonaje) {
        this.id = id;
        this.nombre = nombre;
        this.fuerzaPersonaje = fuerzaPersonaje;
    }



    @Override
    public String toString() {
        return "Guerrero{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", fuerzaPersonaje=" + fuerzaPersonaje +
                '}';
    }

    public void imprime() {
    }

    public boolean armado() {
        return (this.arma != null);
    }

    public boolean cargaArma(Arma arma) {
        return false;
    }
}



