public class Arquero extends Guerrero{

    Arma arco = new Arco();

    public boolean cargaArma(Arma arma) {
        if (arma.getClass() == Arco.class) {
            this.arma = arma;
            return true;
        }
        else {
            // ac� lanzar excep o devolver false ...
            System.out.println("Soy Arquero y solo utilizo Arco");
            return false;
        }
    }

    public Arquero(int id, String nombre, double fuerzaPersonaje) {

        super(id, nombre, fuerzaPersonaje);
    }


    public void imprime() {
        System.out.println("Soy Arquero "+this.id+", "+this.nombre+", "+this.fuerzaPersonaje);
        if (this.armado()) {
            System.out.println(this.arco.nombre);
        }
        else {
            System.out.println("desarmado");
        }
    }



    }




