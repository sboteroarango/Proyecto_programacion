import java.util.Scanner;
    public class ListaReproduccion{
    public static void menu(){
        System.out.println("          | o     |");
        System.out.println("          |       |");
        System.out.println("      _   | |  () |");
        System.out.println("     ( ')=| |     |     ___            _ _         _     _     _  ");
        System.out.println("     /  ( |     | |    / _ \\          | (_)       | |   (_)   | |");
        System.out.println("    / / |/|   |   |   / /_\\ \\_   _  __| |_  ___   | |    _ ___| |_      ");
        System.out.println("    |/\\ |/|       |   |  _  | | | |/ _` | |/ _ \\  | |   | / __| __|");
        System.out.println("       \\\\ | ()    |   | | | | |_| | (_| | | (_) | | |___| \\__ \\ |_ ");
        System.out.println("        \\\\|    |  |   \\_| |_/\\__,_|\\__,_|_|\\___/  \\_____/_|___/\\__(_)");
        System.out.println("          |    |  |");
        System.out.println("          |       |");
        System.out.println("          |  |    |");          
        System.out.println("          |  |    |   1. Rosas");
        System.out.println("          |    |  |   2. Me gustas tu");
        System.out.println("          |    |  |   3. Rayando el sol");
        System.out.println("          |  |    |   4. A Dios le pido");
        System.out.println("          |   ()  |   5. La camisa negra");
        System.out.println("          |       |   6. Vivo por ella");
        System.out.println("          |    |  |   7. Maldito duende");
        System.out.println("          |    |  |   8. En algun lugar");
        System.out.println("          |    |  |   9. Como camaron");
        System.out.println("          |   |   |   10. Gasolina");
        System.out.println("          |  |    |   11. Dame amor");
        System.out.println("          | |     |   12. Laura");
        System.out.println("          |  |    |   13. Nada valgo sin tu amor");
        System.out.println("          |  |    |   14. Vinotinto");
        System.out.println("          |     ()|   15. Cuando sea grande");
        System.out.println("          |       |   16. Cielo");
        System.out.println("          |       |   17. La raja de tu falda");
        /*System.out.println("          |   |   |   17. Rosas");
        System.out.println("          | ()|   |   18. Vivalavida");
        System.out.println("          |   |   |   19. Vino tinto");
        System.out.println("          |   |   |   20. Vivo por ella");
        System.out.println("          |     ()|   21. Dame amor");
        System.out.println("          |       |   22. Lobo hombre en paris");*/
    }

    public static int peticiondecanciones(){
        Scanner datos = new Scanner(System.in);
        System.out.print("Ingrese el numero de la cancion: ");
        int numero_de_cancion = datos.nextInt();
        return numero_de_cancion;
	}

	public static int numero_canciones(){
		Scanner datos = new Scanner(System.in);
		System.out.print("Cuantas canciones desea en su lista de reproduccion: ");
		int numero_canciones_lista = datos.nextInt();
		return numero_canciones_lista;
	}

    public static String preguntar_segun_canciones_que_quiere(){
        String canciones_que_quiere = "";
        menu();
        int numero_canciones_lista = numero_canciones();
        for(int i=0;i<numero_canciones_lista;i++){
            int numero_de_cancion = peticiondecanciones();
            switch (numero_de_cancion) {
//colocar el indice de canción
                case 1:
                    canciones_que_quiere = canciones_que_quiere.concat("0 ");
                    break;
                case 2:
                    canciones_que_quiere = canciones_que_quiere.concat("1 ");
                    break;
                case 3:
                    canciones_que_quiere = canciones_que_quiere.concat("2 ");
                    break;
                case 4:
                    canciones_que_quiere = canciones_que_quiere.concat("3 ");
                    break;
                case 5:
                    canciones_que_quiere = canciones_que_quiere.concat("4 ");
                    break;
                case 6:
                    canciones_que_quiere = canciones_que_quiere.concat("5 ");
                    break;
                case 7:
                    canciones_que_quiere = canciones_que_quiere.concat("6 ");
                    break;
                case 8:
                    canciones_que_quiere = canciones_que_quiere.concat("7 ");
                    break;
                case 9:
                    canciones_que_quiere = canciones_que_quiere.concat("8 ");
                    break;
                case 10:
                    canciones_que_quiere = canciones_que_quiere.concat("9 ");
                    break;
                case 11:
                    canciones_que_quiere = canciones_que_quiere.concat("10 ");
                    break;
                case 12:
                    canciones_que_quiere = canciones_que_quiere.concat("11 ");
                    break;
                case 13:
                    canciones_que_quiere = canciones_que_quiere.concat("12 ");
                    break;
                case 14:
                    canciones_que_quiere = canciones_que_quiere.concat("13 ");
                    break;
                case 15:
                    canciones_que_quiere = canciones_que_quiere.concat("14 ");
                    break;
                case 16:
                    canciones_que_quiere = canciones_que_quiere.concat("15 ");
                    break;
                case 17:
                    canciones_que_quiere = canciones_que_quiere.concat("16 ");
                    break;
                
                /*case 3:
                    canciones_que_quiere = canciones_que_quiere.concat("Viva_La_Vida.mid ");
                    break; */
               
               // case 22:
                 //   canciones_que_quiere = canciones_que_quiere.concat("lobo_hombre_en_Paris.mid ");
                   // break; 

                   //Falta agregar "Raja de tu falda-16" al menu y quitar las canciones que no se van a utilizar del menu
                default:
                    System.out.println("Esta cancion no existe");//falta hacer que esta no cuente 
                    i--;
                    break;
            }
        }
        return canciones_que_quiere;
    }

    public static String[] lista_canciones(){
        String lista = preguntar_segun_canciones_que_quiere();
        String[] lista_de_canciones = lista.split(" ",0);
        return lista_de_canciones;
    }

    public static void randomizar(String[] lista){
        int numero_de_elementos = lista.length;
        for(int i=0;i<numero_de_elementos;++i){
            int numero_random = i+(int)(Math.random() * (numero_de_elementos-i));
            String temporal = lista[numero_random];
            lista[numero_random] = lista[i];
            lista[i] = temporal;
        }
    }

    public static String[] preguntar_con_randomizacion(){
        String[] lista=lista_canciones();
        Scanner datos = new Scanner(System.in);
        System.out.print("Desea el modo shuffle(si/no): ");
        String respuesta = datos.nextLine();
        respuesta = respuesta.toLowerCase();
        if(respuesta.equals("si")){
            randomizar(lista);
        }
        return lista;

    }

    public static int[] convertir_lista_a_int(String[] lista){
        int[] listaint = new int[lista.length];
        for(int i=0;i<lista.length;i++){
            listaint[i] = Integer.parseInt(lista[i]);
        }
        return listaint;
    }

    public static void reproducir_lista(){
        String[] lista= preguntar_con_randomizacion();
        Audio audio = new Audio();
        for(int i=0;i<lista.length;i++){
            //reproducir lista[i](rutas)
            audio.seleccionarCancion(info_canciones[indice_cancion][ConsoleData.RUTA_CANCION]);
		audio.reproducir();

        }


    }


    public static void main(String[] args){
        


    }
}
