import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Principal {



    public static List<Guerrero> cargarEjercito(){
        // (con opcion a continuar cargando)
        // seleccionar QUE clase quiero cargar y generar un ejercito

        Scanner teclado = new Scanner(System.in);
        System.out.println("Seleccione (1) para ingresar un Berzerker, (2) para un Arquero y (3) para un Mago o seleccione (0) para terminar la carga de guerreros: ");
        //System.out.println("Seleccione (0) para terminar la carga de guerreros.");
        int idGuerrero = 0;
        String nombreGuerrero = "";
        double fuerzaAtaqueGuerrero = 0;
        List<Guerrero> guerreros = new ArrayList<Guerrero>();

        try {
            int ingreso = teclado.nextInt();
            while (ingreso != 0) {
                // System.out.println("se ingreso "+ingreso);
                switch (ingreso) {
                    case 1:
                        System.out.println("Ingrese nombre Berzerker: ");
                        nombreGuerrero = teclado.next();
                        System.out.println("Ingrese fuerza Berzerker: ");
                        fuerzaAtaqueGuerrero = teclado.nextDouble();
                        Berzerker berzerker = new Berzerker(idGuerrero, nombreGuerrero, fuerzaAtaqueGuerrero);
                        guerreros.add(berzerker);
                        idGuerrero++;
                        break;
                    case 2:
                        System.out.println("Ingrese nombre Arquero");
                        nombreGuerrero = teclado.next();
                        System.out.println("Ingrese fuerza Arquero: ");
                        fuerzaAtaqueGuerrero = teclado.nextDouble();
                        Arquero arquero = new Arquero(idGuerrero, nombreGuerrero, fuerzaAtaqueGuerrero);
                        guerreros.add(arquero);
                        idGuerrero++;
                        break;
                    case 3:
                        System.out.println("Ingrese nombre Mago: ");
                        nombreGuerrero = teclado.next();
                        System.out.println("Ingrese fuerza Mago: ");
                        fuerzaAtaqueGuerrero = teclado.nextDouble();
                        Mago mago = new Mago(idGuerrero, nombreGuerrero, fuerzaAtaqueGuerrero);
                        guerreros.add(mago);
                        idGuerrero++;
                        break;
                    default: System.out.println(ingreso + "no es opcion valida. Intente nuevamente: ");
                }
                ingreso = teclado.nextInt();
            }
        }
        catch (Exception e) {
            System.out.println("Solamente es valido ingresar 0, 1, 2 o 3");
            System.out.println("Vuelva a intentar!: ");
        }


        System.out.println("No se cargan mas guerreros. El ejercito quedo compuesto de: ");
        for (int i=0;i<guerreros.size();i++) {
            guerreros.get(i).imprime();
        }
        System.out.println(""); // separador

        return guerreros;

    }


    public static List<Arma> cargarArmeria(){
        // (con opcion a continuar cargando)
        // seleccionar que clase de arma quieren cargar y generar una armeria

        Scanner teclado = new Scanner(System.in);
        System.out.print("Seleccione (1) para ingresar un Espada, (2) para un Arco y (3) para un Baculo o seleccione (0) para terminar la carga de armas: ");
        //System.out.println("Seleccione (0) para terminar la carga de armas.");
        int idArma = 0;
        String nombreArma = "";
        double poderAtaqueArma = 0;
        List<Arma> armas = new ArrayList<Arma>();

        try {
            int ingreso = teclado.nextInt();
            while (ingreso != 0) {
                // System.out.println("Se ingreso "+ingreso);
                switch (ingreso) {
                    case 1:
                        //System.out.println("Espada");
                        System.out.print("Ingrese nombre Espada: ");
                        nombreArma = teclado.next();
                        System.out.print("Ingrese poder Espada: ");
                        poderAtaqueArma = teclado.nextDouble();
                        Espada espada = new Espada(idArma, nombreArma, poderAtaqueArma);
                        armas.add(espada);
                        idArma++;
                        break;
                    case 2:
                        //System.out.println("Arco");
                        System.out.print("Ingrese nombre Arco: ");
                        nombreArma = teclado.next();
                        System.out.print("Ingrese poder Arco: ");
                        poderAtaqueArma = teclado.nextDouble();
                        Arco arco = new Arco(idArma, nombreArma, poderAtaqueArma);
                        armas.add(arco);
                        idArma++;
                        break;
                    case 3:
                        //System.out.println("Baculo");
                        System.out.println("ingrese nombre Baculo");
                        nombreArma = teclado.next();
                        System.out.println("ingrese poder Baculo");
                        poderAtaqueArma = teclado.nextDouble();
                        Baculo baculo = new Baculo(idArma, nombreArma, poderAtaqueArma);
                        armas.add(baculo);
                        idArma++;
                        break;
                    default: System.out.print(ingreso + "no es opcion valida. Intente nuevamente: ");
                }
                ingreso = teclado.nextInt();
            }
        }
        catch (Exception e) {
            System.out.println("Solamente es valido ingresar 0, 1, 2 o 3");
            System.out.print("Vuelva a intentar!: ");
        }

        System.out.println("No se cargan mas armas. La armeria quedo compuesta de: ");
        for (int i=0;i<armas.size();i++) {
            armas.get(i).imprime();
        }
        System.out.println(""); // y esto?

        return armas;

    }

    public static void equiparEjercito(List<Guerrero> guerreros,List<Arma> armas) {
        Arma currentArma = null;
        int iG = 0;
        boolean pudeEntregar = false;
        for (int iA=0; iA < armas.size(); iA++) {
            currentArma = armas.get(iA);
            iG=0;
            while ( iG < guerreros.size() && !pudeEntregar ) {
                if (guerreros.get(iG).armado()) {
                    iG++;
                }
                else {
                    //pudeEntregar = guerreros.get(iG).cargaArma(currentArma);
                    pudeEntregar = guerreros.get(iG).cargaArma(currentArma);
                    if (pudeEntregar) {
                        armas.remove(iA);
                    }
                }
                iG++;
            }
        }
    }






/*
    public void cargarArma(Guerrero g, Arma a){
        // restriccion (Berzerker-Espada, Arquero-Arco, Mago-Vaculo)
        // de ser incorecto, arrojar por consola 'soy nombreClase y solo uso nombreArma'


        ///////GETCLASS TOMA LA CLASE QUE HEREDA O LA OTRA??? QUIZA NO FUNCIONA ESTO:

        if (g.getClass() == Berzerker.class) {

            if (a.getClass() == Espada.class){
                //seter de berzerker para espada

                //meter el par guerrero/arma en el hashmap
                ejercitoEquipado.put(g, a);

                //sacar el guerrero y el arma de sus respectivas listas
                guerreros.remove()//aca no se como llamar al elemento, el indice
            }else {
                System.out.println("Soy un BERZERKER no puedo portar un/a " + a.getClass());
            }

        } else if (g.getClass() == Arquero.class) {

            if (a.getClass() == Arco.class){
                //seter de arquero para espada
            }else {
                System.out.println("Soy un ARQUERO no puedo portar un/a " + a.getClass());
            }

        } else {
            if (a.getClass() == Baculo.class){
                //seter de mago para espada
            }else {
                System.out.println("Soy un MAGO no puedo portar un/a " + a.getClass());
            }

        }
    }

    public void equiparEjercito(List<Guerrero> guerreros, List<Arma> armas){
        //equipar cada Guerrero con un Arma correspondiente

        Guerrero g = null;
        Arma a = null;
        for (int i=0; i<guerreros.size(); i++){
            g = guerreros.get(i);
            for (int j=0; j<armas.size(); j++){
                a = armas.get(j);
                cargarArma(g, a);
            }

        }



    }
*/

    public static void main(String[] args) {


        List<Guerrero> guerreros = cargarEjercito();
        List<Arma> armas = cargarArmeria();
        equiparEjercito(guerreros, armas);

        System.out.println("Asi quedo el ejercito:");
        for (int iG=0; iG < guerreros.size(); iG++) {
            guerreros.get(iG).imprime();
        }
        System.out.println(" ");

        System.out.println("Estas armas quedaron:");
        for (int iA=0; iA < armas.size(); iA++) {
            armas.get(iA).imprime();
        }
        /*
        System.out.println(" ");
        double vidaEnemigo = 34.77;
        // pruebo con el primero
        for (int iG=0; iG < guerreros.size(); iG++) {
            boolean bb = matarEnemigo(guerreros.get(iG),vidaEnemigo);
        }
*/


        

        ///////////////////////////


/*
        public void matarEnemigo(Guerrero, Enemigo){
            //comprueba si Guerero puede matar a Enemigo
            // si es Berzerker o Arquero debera hacerse
            // vidaEnemigo - resultado de ataqueBasico()
            // si da 0 o un numero negativo, mata al Enemigo
        }

        public void resultadoDeArmeria(){
            //imprimir CUANTAS armas quedaron sin equipar
            //imprimir CUANTOS guerreros quedaron sin armar
        }


pedir por consola los parametros del arma y eso
entrar en un switch que asigna segun corresponda, con un constructor adentro
(dentro del switch pedir los datos del arma que todas tienen lo mismo??)

 */




    }
}
/*
se carga tod el ejercito y luego todas las armas
podria ordenarse pero mejor no
con solo preguntar que clase es puedo despues asignarselo al guerero o no, para CARGAR ejercito
se recorre primero la lista de guerrero, parandose en el primero, y se recorre la lista de armas. si no hay
ningun arma que le corresponda, se queda sin arma


matarEnemigo(Guerrero, Enemigo) es un metodo del main porque recibe un guerrero y un enemigo


MAGO si ataca, la implementacion del metodo ataqueBasico() devuelve un cero o dice NO implemento este metodo
pero si implementa el metodo ataqueMagico()


EJERCITO Y ARMERIA son listas de armas y guerreros
si hacemos clases abtractas no hacemos interfaces y viceversa.

TODOS LOS PUNTOS DEL 1 AL 6 ESTAN ORIENTADOS AL MAIN SALVO LAS LISTAS


videos: clase 14 y clase 13

 */