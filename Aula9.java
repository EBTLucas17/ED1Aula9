import java.util.Stack;

public class Aula9 {
     public static String invertePalavras(String texto) {
        String[] palavras = texto.split(" ");
        Stack<Character> pilha = new Stack<Character>();
        StringBuilder resultado = new StringBuilder();
        // Armazena caracteres especificados pela sua capacidade, caso ela seja excedida, é aumentada para acomodar os caracteres adicionais;
        for (String palavra : palavras) {
            for (int i = 0; i < palavra.length(); i++) {
                pilha.push(palavra.charAt(i));
            }
            
            while (!pilha.empty()) {
                resultado.append(pilha.pop());
            }
            
            resultado.append(" ");
        }
        
        return resultado.toString().trim();
    }

    public static void main(String[] args) {
        String texto = "UM CIENTISTA DA COMPUTACAO DEVE RESOLVER OS PROBLEMAS LOGICAMENTE";
        String resultado = invertePalavras(texto);
        System.out.println(resultado); 

        texto = "ESARF ATERCES ODALERAHCAB ME AICNEIC AD OACATUPMOC FI ONAIOG SUPMAC SOHNIRROM HE MU SOD SEROHLEM SOSRUC ED OACATUPMOC OD ODATSE ED SAIOG";
        resultado = invertePalavras(texto);
        System.out.println(resultado); 
    }

}