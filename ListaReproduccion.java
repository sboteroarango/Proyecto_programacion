import java.util.Scanner;
    public class ListaReproduccion{
    public static void menu(){
        System.out.println("1. A dios le pido");
        System.out.println("2. Cielo");
        System.out.println("3. Viva la vida");
        System.out.println("4. Como camaron");
        System.out.println("5. Cuando sea grande");
        System.out.println("6. Party up");
        System.out.println("7. Ruff ryders anthem");
        System.out.println("8. En algun lugar");
        System.out.println("9. Friends");
        System.out.println("10. Maldito duende");
        System.out.println("11. La gasolina");
        System.out.println("12. La camisa negra");
        System.out.println("13. Laura");
        System.out.println("14. Me gustas tu");
        System.out.println("15. Nada valgo sin tu amor");
        System.out.println("16. Rayando el sol");
        System.out.println("17. Rosas");
        System.out.println("18. Mario party");
        System.out.println("19. Vino tinto");
        System.out.println("20. Vivo por ella");
        System.out.println("21. Dame amor");
        System.out.println("22. Lobo hombre en paris");
   
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

    public static void main(String[] args){
        menu();
        int numero_canciones_lista = numero_canciones();

        for(int i=0;i<numero_canciones_lista;i++){
            peticiondecanciones();
        }


    }
}