import java.io.IOException;

public class Solution {
	
	/* Gary � um �vido caminhante. Ele rastreia suas caminhadas meticulosamente, prestando muita aten��o a pequenos detalhes, como topografia. Durante sua �ltima caminhada,
	 *     ele deu exatamente "n" passos.
	 * Para cada passo que dava, ele notava se era uma subida "U", ou uma descida "D".
	 * As caminhadas de Gary come�am e terminam no n�vel do mar e cada degrau para cima ou para baixo representa uma mudan�a de 1 unidade na altitude.
	 * 
	 * Definimos os seguintes termos:
	 * - Uma montanha � uma sequ�ncia de etapas consecutivas acima do n�vel do mar, come�ando com uma etapa acima do n�vel do mar e terminando com uma etapa abaixo do n�vel do mar.
	 * -Um vale � uma sequ�ncia de etapas consecutivas abaixo do n�vel do mar, come�ando com uma etapa abaixo do n�vel do mar e terminando com uma etapa acima do n�vel do mar.
	 * 
	 * Dada a sequ�ncia de degraus para cima e para baixo de Gary durante sua �ltima caminhada, encontre e imprima o n�mero de vales pelos quais ele atravessou.
	 * 
	 * Por exemplo, se o caminho de Gary for s = [DDUUUUDD], ele primeiro entra em um vale com 2 unidades de profundidade. Ent�o ele sobe uma montanha com 2 unidades de altura.
	 * Finalmente, ele volta ao n�vel do mar e termina sua caminhada.
	 */
	
	/* Descri��o da Fun��o
	 * 
	 * Complete a fun��o countingValleys no editor abaixo. Ele deve retornar um n�mero inteiro que denota o n�mero de vales que Gary atravessou.
	 * 
	 * countingValleys possui os seguintes par�metros:
	 * - n: o n�mero de etapas que Gary executa
	 * - s: uma string descrevendo seu caminho
	 */
	
	/* Formato do Input
	 * 
	 * A primeira linha cont�m um n�mero inteiro "n", o n�mero de etapas na caminhada de Gary.
	 * A segunda linha cont�m uma �nica string "s", de "n" caracteres que descrevem seu caminho.
	 */
	
	/* Formato do Output
	 * 
	 * Imprima um �nico n�mero inteiro que denota o n�mero de vales pelos quais Gary percorreu durante sua caminhada.
	 */
	
	public static void main(String[] args) throws IOException {
        int n = 8;

        String s = "UDDUDDUU";

        int result = countingValleys(n, s);

        System.out.println("O resultado �: " + result);
	}
	
	// Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
    	int passouNoVale = 0;
    	boolean estaNoVale = false;
    	int nivel = 0;
    	
    	for (int i = 0; i < n; i++) {
    		String step = s.substring(i, i+1);
        	
        	if (step.equals("U")) {
        		nivel++;
        	} else if (step.equals("D")) {
        		nivel--;
        	}
        	
        	if (estaNoVale == true && nivel >= 0) {
        		estaNoVale = false;
        	}
        	
        	if (estaNoVale == false && nivel < 0) {
        		passouNoVale++;
        		estaNoVale = true;
        	}
    	}

    	return passouNoVale;
    }

}