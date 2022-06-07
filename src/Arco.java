public class Arco extends Arma{
    public Arco(int id, String nombre, double poderAtaque) {
        super(id, nombre, poderAtaque);
    }

    public Arco() {
        super();
    }

    public void imprime() {
        System.out.println("Un Arco "+this.id+", "+this.nombre+", "+this.poderAtaque);

    }
}
