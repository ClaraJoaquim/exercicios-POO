public class VerificadorPalindromo {
    public boolean verificarPalavra(String palavra) {
        for (int i = 0, j = palavra.length() - 1; i < j; i++, j--) {
            if (Character.toLowerCase(palavra.charAt(i)) != Character.toLowerCase(palavra.charAt(j)))
                return false;
        }
        return true;
    }
}
