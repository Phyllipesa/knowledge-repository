package github.com.phyllipesa.rest.controllers.request.converters;

import github.com.phyllipesa.tratamentoDeExceptions.UnsupportedMathOperationException;

/**
 *  Se NumberConverter for apenas uma classe utilitária, mantenha os métodos static e não a injete no controlador.
 *  Se quiser maior flexibilidade e testabilidade, remova o static e injete corretamente .
 */
public class NumberConverter {

    public static Double convertToDouble(String n) throws IllegalArgumentException {

        if (n == null || n.isEmpty())
            throw new UnsupportedMathOperationException("Please set a numeric value!");

        String number = n.replace(",", ".");
        return Double.parseDouble(number);
    }

    public static boolean isNumeric(String n) {
        if (n == null || n.isEmpty())
            return false;

        String number = n.replace(",", "."); // R$ 5,00 USD 5.00
        return number.matches("[-+]?[0-9]*\\.?[0-9]+");
    }
}
