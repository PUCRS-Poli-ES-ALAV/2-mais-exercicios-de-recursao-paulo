import java.util.ArrayList;
public class  exercicios {


    // 5. Verifica se uma String é um palíndromo
    public static boolean isPal(String s) {
        if (s.length() <= 1) return true;
        if (s.charAt(0) != s.charAt(s.length() - 1)) return false;
        return isPal(s.substring(1, s.length() - 1));
    }

    // 6. Converte um número inteiro para sua representação binária
    public static String convBase2(int n) {
        if (n == 0) return "0";
        if (n == 1) return "1";
        return convBase2(n / 2) + (n % 2);
    }

    // 7. Calcula o somatório dos elementos de um ArrayList
    public static int sumArrayList(ArrayList<Integer> ar, int index) {
        if (index == ar.size()) return 0;
        return ar.get(index) + sumArrayList(ar, index + 1);
    }

    // 8. Encontra o maior elemento de um ArrayList
    public static int findBiggest(ArrayList<Integer> ar, int index) {
        if (index == ar.size() - 1) return ar.get(index);
        return Math.max(ar.get(index), findBiggest(ar, index + 1));
    }

    // 9. Verifica se uma string ocorre dentro de outra
    public static boolean findSubStr(String str, String match) {
        if (str.length() < match.length()) return false;
        if (str.startsWith(match)) return true;
        return findSubStr(str.substring(1), match);
    }

    // 10. Determina o número de dígitos de um inteiro
    public static int nroDigit(int n) {
        if (n < 10) return 1;
        return 1 + nroDigit(n / 10);
    }

    public static void main(String[] args) {
        // Testes
        System.out.println(isPal("radar")); // true
        System.out.println(isPal("hello")); // false

        System.out.println(convBase2(10)); // "1010"

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); list.add(2); list.add(3); list.add(4); list.add(5);
        System.out.println(sumArrayList(list, 0)); // 15

        System.out.println(findBiggest(list, 0)); // 5

        System.out.println(findSubStr("abcdef", "cd")); // true
        System.out.println(findSubStr("abcdef", "gh")); // false

        System.out.println(nroDigit(12345)); // 5
    }
}

