public class Espada extends Arma{
    public Espada(int id, String nombre, double poderAtaque) {
        super(id, nombre, poderAtaque);
    }

    public Espada() {

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
        System.out.println("Una Espada "+this.id+", "+this.nombre+", "+this.poderAtaque);

    }
}
