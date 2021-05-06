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
        System.out.println("          |  |    |   1. A dios le pido");
        System.out.println("          |    |  |   2. Cielo");
        System.out.println("          |    |  |   3. Viva la vida");
        System.out.println("          |  |    |   4. Como camaron");
        System.out.println("          |   ()  |   5. Cuando sea grande");
        System.out.println("          |       |   6. Party up");
        System.out.println("          |    |  |   7. Ruff ryders anthem");
        System.out.println("          |    |  |   8. En algun lugar");
        System.out.println("          |    |  |   9. Friends");
        System.out.println("          |   |   |   10. Maldito duende");
        System.out.println("          |  |    |   11. La gasolina");
        System.out.println("          | |     |   12. La camisa negra");
        System.out.println("          |  |    |   13. Laura");
        System.out.println("          |  |    |   14. Me gustas tu");
        System.out.println("          |     ()|   15. Nada valgo sin tu amor");
        System.out.println("          |       |   16. Rayando el sol");
        System.out.println("          |   |   |   17. Rosas");
        System.out.println("          | ()|   |   18. Mario party");
        System.out.println("          |   |   |   19. Vino tinto");
        System.out.println("          |   |   |   20. Vivo por ella");
        System.out.println("          |     ()|   21. Dame amor");
        System.out.println("          |       |   22. Lobo hombre en paris");
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

                case 1:
                    canciones_que_quiere = canciones_que_quiere.concat("A_Dios_le_pido.mid ");
                    break;
                case 2:
                    canciones_que_quiere = canciones_que_quiere.concat("Cielo.mid ");
                    break;
                case 3:
                    canciones_que_quiere = canciones_que_quiere.concat("Viva_La_Vida.mid ");
                    break;
                case 4:
                    canciones_que_quiere = canciones_que_quiere.concat("Como_Camaron.mid ");
                    break;
                case 5:
                    canciones_que_quiere = canciones_que_quiere.concat("Cuando_Sea_Grande.mid ");
                    break;
                case 6:
                    canciones_que_quiere = canciones_que_quiere.concat("DMX_-_Party_Up.mid ");
                    break;
                case 7:
                    canciones_que_quiere = canciones_que_quiere.concat("DMX_–_Ruff_Ryders_Anthem.mid ");
                    break;
                case 8:
                    canciones_que_quiere = canciones_que_quiere.concat("En_algun_lugar.mid ");
                    break;
                case 9:
                    canciones_que_quiere = canciones_que_quiere.concat("Friends.mid ");
                    break;
                case 10:
                    canciones_que_quiere = canciones_que_quiere.concat("HEROES_DEL_SILENCIO_-_Maldito_duende.mid ");
                    break;
                case 11:
                    canciones_que_quiere = canciones_que_quiere.concat("La_Gasolina.mid ");
                    break;
                case 12:
                    canciones_que_quiere = canciones_que_quiere.concat("La_camisa_negra.mid ");
                    break;
                case 13:
                    canciones_que_quiere = canciones_que_quiere.concat("Laura.mid ");
                    break;
                case 14:
                    canciones_que_quiere = canciones_que_quiere.concat("Me_gustas_tu.mid ");
                    break;
                case 15:
                    canciones_que_quiere = canciones_que_quiere.concat("Nada_valgo_sin_tu_amor.mid ");
                    break;
                case 16:
                    canciones_que_quiere = canciones_que_quiere.concat("Rayando_el_sol.mid ");
                    break;
                case 17:
                    canciones_que_quiere = canciones_que_quiere.concat("Rosas.mid ");
                    break;
                case 18:
                    canciones_que_quiere = canciones_que_quiere.concat("Video_Game_Themes_-_Mario_Party.mid ");
                    break;
                case 19:
                    canciones_que_quiere = canciones_que_quiere.concat("Vino_Tinto.mid ");
                    break;
                case 20:
                    canciones_que_quiere = canciones_que_quiere.concat("Vivo_por_ella.mid ");
                    break;
                case 21:
                    canciones_que_quiere = canciones_que_quiere.concat("dame_amor.mid ");
                    break;
                case 22:
                    canciones_que_quiere = canciones_que_quiere.concat("lobo_hombre_en_Paris.mid ");
                    break;
                default:
                    System.out.println("Esta cancion no existe");//falta hacer que esta no cuente 
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
        String respuesta = datos.nextLine();//no está leyendo si la respuesta es si o no
        respuesta = respuesta.toLowerCase();
        if(respuesta=="si"){
            randomizar(lista);
        }
        return lista;
    }


    public static void main(String[] args){
        String[] lista = preguntar_con_randomizacion();
            for(int i=0;i<lista.length;i++){
                System.out.println(lista[i]);
            }
    }
}
