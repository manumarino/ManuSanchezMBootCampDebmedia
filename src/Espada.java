public class Espada extends Arma{

    public Espada() {

        System.out.println("Espada creada");
    }
    public Espada(int id, String nombre, double poderAtaque) {
        this.id = id;
        this.nombre = nombre;
        this.poderAtaque = poderAtaque;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPoderAtaque() {
        return poderAtaque;
    }

    public void setPoderAtaque(double poderAtaque) {
        this.poderAtaque = poderAtaque;
    }

    public void imprime() {
        System.out.println("Espada ID: "+this.id+", Nombre: "+this.nombre+", Fuerza: "+this.poderAtaque);
    }

}
