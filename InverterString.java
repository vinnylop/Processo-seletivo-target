public class InverterString {

    public static String inverterString(String str) {
        // Converte a string para um array de caracteres
        char[] caracteres = str.toCharArray();
        // Obtém o comprimento da string
        int comprimento = caracteres.length;
        // Inicializa dois índices, um no início e outro no final da string
        int inicio = 0;
        int fim = comprimento - 1;
        // Enquanto os índices não se cruzarem
        while (inicio < fim) {
            // Troca os caracteres nas posições inicio e fim
            char temp = caracteres[inicio];
            caracteres[inicio] = caracteres[fim];
            caracteres[fim] = temp;
            // Move os índices para o próximo par de caracteres
            inicio++;
            fim--;
        }
        // Converte o array de caracteres de volta para uma string
        String stringInvertida = new String(caracteres);
        return stringInvertida;
    }

    public static void main(String[] args) {
        String stringOriginal = "Olá, mundo!";
        String stringInvertida = inverterString(stringOriginal);
        System.out.println("String original: " + stringOriginal);
        System.out.println("String invertida: " + stringInvertida);
    }
}