import java.io.IOException;

public class Solution {
	
	/* Gary é um ávido caminhante. Ele rastreia suas caminhadas meticulosamente, prestando muita atenção a pequenos detalhes, como topografia. Durante sua última caminhada,
	 *     ele deu exatamente "n" passos.
	 * Para cada passo que dava, ele notava se era uma subida "U", ou uma descida "D".
	 * As caminhadas de Gary começam e terminam no nível do mar e cada degrau para cima ou para baixo representa uma mudança de 1 unidade na altitude.
	 * 
	 * Definimos os seguintes termos:
	 * - Uma montanha é uma sequência de etapas consecutivas acima do nível do mar, começando com uma etapa acima do nível do mar e terminando com uma etapa abaixo do nível do mar.
	 * -Um vale é uma sequência de etapas consecutivas abaixo do nível do mar, começando com uma etapa abaixo do nível do mar e terminando com uma etapa acima do nível do mar.
	 * 
	 * Dada a sequência de degraus para cima e para baixo de Gary durante sua última caminhada, encontre e imprima o número de vales pelos quais ele atravessou.
	 * 
	 * Por exemplo, se o caminho de Gary for s = [DDUUUUDD], ele primeiro entra em um vale com 2 unidades de profundidade. Então ele sobe uma montanha com 2 unidades de altura.
	 * Finalmente, ele volta ao nível do mar e termina sua caminhada.
	 */
	
	/* Descrição da Função
	 * 
	 * Complete a função countingValleys no editor abaixo. Ele deve retornar um número inteiro que denota o número de vales que Gary atravessou.
	 * 
	 * countingValleys possui os seguintes parâmetros:
	 * - n: o número de etapas que Gary executa
	 * - s: uma string descrevendo seu caminho
	 */
	
	/* Formato do Input
	 * 
	 * A primeira linha contém um número inteiro "n", o número de etapas na caminhada de Gary.
	 * A segunda linha contém uma única string "s", de "n" caracteres que descrevem seu caminho.
	 */
	
	/* Formato do Output
	 * 
	 * Imprima um único número inteiro que denota o número de vales pelos quais Gary percorreu durante sua caminhada.
	 */
	
	public static void main(String[] args) throws IOException {
        int n = 8;

        String s = "UDDUDDUU";

        int result = countingValleys(n, s);

        System.out.println("O resultado é: " + result);
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