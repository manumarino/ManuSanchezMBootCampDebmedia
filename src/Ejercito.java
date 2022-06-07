import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;



public class Ejercito {


    public static void main(String[] args) {


        System.out.println("Comienza la carga del ejercito...");

        List<Arma> armas = new ArrayList<Arma>();
        List<Guerrero> guerreros = new ArrayList<Guerrero>();

        guerreros = cargarEjercito();
        armas = cargarArmas();
        equiparEjercito(guerreros, armas);

        System.out.println("Asi quedo el ejercito: ");
        for (int iG=0; iG < guerreros.size(); iG++) {
            guerreros.get(iG).imprime();
        }
        System.out.println(" ");

        System.out.println("Armas sin asignar: ");
        for (int iA=0; iA < armas.size(); iA++) {
            armas.get(iA).imprime();
        }
        System.out.println(" ");

        batalla(guerreros);

    }

    private static void batalla(List<Guerrero> guerreros) {
        double vidaEnemigo = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Comienza la batalla... Ingrese la vida del ENEMIGO: ");
        vidaEnemigo = teclado.nextDouble();

        for (int iG = 0; iG < guerreros.size(); iG++) {//////////////////
            boolean bb = matarEnemigo(guerreros.get(iG),vidaEnemigo);
        }
    }

    public static List<Guerrero> cargarEjercito() {
        Scanner teclado = new Scanner(System.in);
        int idGuerrero = 0;
        String nGuerrero = "";
        double fGuerrero = 0;
        List<Guerrero> guerreros = new ArrayList<Guerrero>();
        System.out.print("Seleccione (1) para ingresar un Berzerker, (2) para un Arquero y (3) para un Mago o seleccione (0) para terminar la carga de guerreros: ");


        boolean loopCargaDeGuerrero = true;
        do{

            try {
                loopCargaDeGuerrero = false;
                int ingreso = teclado.nextInt();
                while (ingreso != 0) {

                    switch (ingreso) {
                        case 1:
                            System.out.print("Ingrese el nombre del Berzeker: ");
                            nGuerrero = teclado.next();

                            boolean fuerzaB = true;
                            do{
                                try{
                                    fuerzaB = false;
                                    System.out.print("Ingrese la fuerza del Berzeker: ");
                                    fGuerrero = teclado.nextDouble();
                                }
                                catch (InputMismatchException f){
                                    fuerzaB = true;
                                    System.out.println("ERROR. La fuerza debe ser un numero.");
                                    teclado.nextLine();
                                }

                            } while (fuerzaB);

                            Berzeker berzeker = new Berzeker(idGuerrero, nGuerrero, fGuerrero);
                            guerreros.add(berzeker);
                            idGuerrero++;
                            break;
                        case 2:
                            System.out.print("Ingrese el nombre del Arquero: ");
                            nGuerrero = teclado.next();

                            boolean fuerzaA = true;
                            do{
                                try{
                                    fuerzaA = false;
                                    System.out.print("Ingrese la fuerza del Arquero: ");
                                    fGuerrero = teclado.nextDouble();
                                }
                                catch (InputMismatchException f){
                                    fuerzaA = true;
                                    System.out.println("ERROR. La fuerza debe ser un numero.");
                                    teclado.nextLine();
                                }

                            } while (fuerzaA);

                            Arquero arquero = new Arquero(idGuerrero, nGuerrero, fGuerrero);
                            guerreros.add(arquero);
                            idGuerrero++;
                            break;
                        case 3:
                            System.out.print("Ingrese el nombre del Mago: ");
                            nGuerrero = teclado.next();

                            boolean fuerzaM = true;
                            do{
                                try{
                                    fuerzaM = false;
                                    System.out.print("Ingrese la fuerza del Mago: ");
                                    fGuerrero = teclado.nextDouble();
                                }
                                catch (InputMismatchException f){
                                    fuerzaM = true;
                                    System.out.println("ERROR. La fuerza debe ser un numero.");
                                    teclado.nextLine();
                                }

                            } while (fuerzaM);
                            Mago mago = new Mago(idGuerrero, nGuerrero, fGuerrero);
                            guerreros.add(mago);
                            idGuerrero++;
                            break;
                        default: System.out.println(ingreso + " no es una opcion valida.");
                    }
                    System.out.print("Seleccione (1) para ingresar un Berzerker, (2) para un Arquero y (3) para un Mago o seleccione (0) para terminar la carga de guerreros: ");
                    ingreso = teclado.nextInt();
                }
            }
            catch (InputMismatchException e) {
                loopCargaDeGuerrero = true;
                System.out.println("Solamente es valido ingresar 0, 1, 2 o 3");
                System.out.print("Vuelva a intentar!: ");
                teclado.nextLine();
            }

        } while (loopCargaDeGuerrero);

        System.out.println("No se cargan mas Guerreros.");
        return guerreros;

    }

    public static List<Arma> cargarArmas() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Seleccione (1) para ingresar un Espada, (2) para un Arco y (3) para un Baculo o seleccione (0) para terminar la carga de armas: ");

        int idArma = 0;
        String nArma = "";
        double pArma = 0;
        List<Arma> armas = new ArrayList<Arma>();

        boolean loopCargaDeArma = true;
        do{
            try {
                loopCargaDeArma = false;
                int ingreso = teclado.nextInt();
                while (ingreso != 0) {

                    switch (ingreso) {
                        case 1:
                            System.out.println("Selecciono Espada. ");
                            System.out.print("Ingrese el nombre de la Espada: ");
                            nArma = teclado.next();

                            boolean poderE = true;
                            do{
                                try{
                                    poderE = false;
                                    System.out.print("Ingrese el poder de la Espada: ");
                                    pArma = teclado.nextDouble();
                                }
                                catch (InputMismatchException f){
                                    poderE = true;
                                    System.out.println("ERROR. El poder debe ser un numero.");
                                    teclado.nextLine();
                                }

                            } while (poderE);
                            Espada espada = new Espada(idArma, nArma, pArma);
                            armas.add(espada);
                            idArma++;
                            break;
                        case 2:
                            System.out.println("Selecciono Arco. ");
                            System.out.print("Ingrese el nombre del Arco: ");
                            nArma = teclado.next();

                            boolean poderA = true;
                            do{
                                try{
                                    poderA = false;
                                    System.out.print("Ingrese el poder del Arco: ");
                                    pArma = teclado.nextDouble();
                                }
                                catch (InputMismatchException f){
                                    poderA = true;
                                    System.out.println("ERROR. El poder debe ser un numero.");
                                    teclado.nextLine();
                                }

                            } while (poderA);

                            Arco arco = new Arco(idArma, nArma, pArma);
                            armas.add(arco);
                            idArma++;
                            break;
                        case 3:
                            System.out.println("Selecciono Baculo. ");
                            System.out.print("Ingrese el nombre del Baculo: ");
                            nArma = teclado.next();

                            boolean poderB = true;
                            do{
                                try{
                                    poderB = false;
                                    System.out.print("Ingrese el poder del Baculo: ");
                                    pArma = teclado.nextDouble();
                                }
                                catch (InputMismatchException f){
                                    poderB = true;
                                    System.out.println("ERROR. El poder debe ser un numero.");
                                    teclado.nextLine();
                                }

                            } while (poderB);

                            Baculo baculo = new Baculo(idArma, nArma, pArma);
                            armas.add(baculo);
                            idArma++;

                            break;
                        default: System.out.println(ingreso + " no es opcion valida. Intente nuevamente. ");
                    }
                    System.out.print("Seleccione (1) para ingresar un Espada, (2) para un Arco y (3) para un Baculo o seleccione (0) para terminar la carga de armas: ");
                    ingreso = teclado.nextInt();
                }
            }
            catch (InputMismatchException e) {
                loopCargaDeArma = true;
                System.out.println("Solamente es valido ingresar 0, 1, 2 o 3");
                System.out.print("Vuelva a intentar!: ");
                teclado.nextLine();
            }

        } while (loopCargaDeArma);


        System.out.println("No se cargan mas armas. La armeria quedo compuesta de: ");
        for (int i=0;i<armas.size();i++) {
            armas.get(i).imprime();
        }
        System.out.println("");
        return armas;

    }


    public static boolean matarEnemigo(Guerrero g, double vEnemigo) {
        double resultado = 0;
        if(g.getClass() == Mago.class){
            resultado = vEnemigo - ((Mago) g).ataqueMagico();
        }else{
            resultado = vEnemigo - g.ataqueBasico();
        }
        if (resultado <= 0) {
            System.out.println(g.getClass() + ", Nombre: " + g.nombre + ", MATA al enemigo, con resultado " + resultado);
            return true;
        }
        else {
            System.out.println(g.getClass() + " " + g.nombre + " NO mata al enemigo, con resultado " + resultado);
            return false;
        }
    }

    public static void equiparEjercito(List<Guerrero> guerreros,List<Arma> armas) {
        Arma currentArma = null;
        int iG = 0;
        int iA = 0;
        boolean pudeEntregar = false;
        //Recorrer Armas
        while (iA < armas.size() ) {
            currentArma = armas.get(iA);
            iG=0;
            pudeEntregar=false;
            //Recorrer Guerreros
            while (iG < guerreros.size() && !pudeEntregar) {
                if (!(guerreros.get(iG).armado())) {
                    pudeEntregar = guerreros.get(iG).cargaArma(currentArma);
                    if (pudeEntregar) {
                        armas.remove(iA);
                    }
                }
                iG++;
            }
            if (!pudeEntregar) {iA++;} //Solo aumenta el indice si no pudo entregar el arma (no se modifico el size del array)
        }
    }

}
