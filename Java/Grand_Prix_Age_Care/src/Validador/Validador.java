package Validador;

import java.math.BigInteger;
import java.util.regex.Pattern;

public class Validador {

    public static BigInteger validarCPF(String cpf) {
        if (cpf == null || !cpf.matches("\\d{11}")) {
            throw new IllegalArgumentException("CPF inválido! Deve conter 11 dígitos numéricos.");
        }
        return new BigInteger(cpf);
    }

    public static String validarTelefone(String telefone) {
        if (telefone == null || !telefone.matches("\\(\\d{2}\\) \\d{5}-\\d{4}")) {
            throw new IllegalArgumentException("Telefone inválido! Formato esperado: (XX) XXXXX-XXXX");
        }
        return telefone;
    }

    public static String validarEmail(String email) {
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
        if (email == null || !Pattern.matches(regex, email)) {
            throw new IllegalArgumentException("E-mail inválido!");
        }
        return email;
    }
}