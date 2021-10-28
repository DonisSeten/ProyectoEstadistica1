/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_estadistica;

/**
 *
 * @author USUARIO
 */
public class TEOREMA1 {

	static ArrayList<String> A = new ArrayList<>();
	static int n = 0;
	
	private static BufferedReader brTeclado=new BufferedReader(new InputStreamReader(System.in));
	/** Lee un entero positivo de teclado
	* @return Entero le�da, o -1 si error en la entrada
	*/
	public static int leerEnteroDeTeclado(String texto) {
		try {
			System.out.println("Introduzca un n�mero entero. " + texto);
			String lin = brTeclado.readLine();
			if (lin==null) return -1;
			return Integer.parseInt( lin );
		} catch (Exception e) {
			return -1;
		}
	}
	
	/** Lee un String de teclado
	* @return String le�do, o -null si error en la entrada
	*/
	public static String leerStringDeTeclado(String texto) {
		try {
			System.out.println(texto);
			String lin = brTeclado.readLine();
			return lin;
		} catch (Exception e) {
			return null;
		}
	}
	
	public static void inputUsuario() {
		// conjunto A
		boolean conjuntoFinalizado = false;
		while (conjuntoFinalizado == false) {
			boolean datoValido = false;
			while (datoValido == false) {
				String elemento = leerStringDeTeclado("Introduzca un elemento para a�adirlo al conjunto,"
						+ "introduzca . para acabar: ");}