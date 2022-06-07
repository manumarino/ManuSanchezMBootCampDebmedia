public class Berzerker extends Guerrero{

    Arma espada = new Espada();

    public Berzerker(int id, String nombre, double fuerzaPersonaje) {
        super(id, nombre, fuerzaPersonaje);
    }



    public void imprime() {
        System.out.println("Soy Berzerker "+this.id+", "+this.nombre+", "+this.fuerzaPersonaje);
        if (this.armado()) {
            System.out.println(this.espada.nombre);
        }
        else {
            System.out.println("desarmado");
        }
    }
    int numeroCualquiera = 0;
 //BORRE cargarArma()

    }
}
