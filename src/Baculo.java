public class Baculo extends Arma{



    public Baculo(int id, String nombre, double poderAtaque) {
        super(id, nombre, poderAtaque);
    }

    public Baculo() {

    }

    public void imprime() {
        System.out.println("Un baculo "+this.id+", "+this.nombre+", "+this.poderAtaque);

    }
}
