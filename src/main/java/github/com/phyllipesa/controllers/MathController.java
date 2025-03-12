package github.com.phyllipesa.controllers;

import github.com.phyllipesa.tratamentoDeExceptions.UnsupportedMathOperationException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {

    // http://localhost:8080/math/sum/3/5
    @RequestMapping("/sum/{n1}/{n2}")
    public Double sum(
            @PathVariable("n1") String n1,
            @PathVariable("n2") String n2
    ) throws Exception {

        if (!isNumeric(n1) || !isNumeric(n2))
            throw new UnsupportedMathOperationException("Please set a numeric value!");
        return convertToDouble(n1) + convertToDouble(n2);
    }

    private Double convertToDouble(String n) throws IllegalArgumentException {

        if (n == null || n.isEmpty())
            throw new UnsupportedMathOperationException("Please set a numeric value!");

        String number = n.replace(",", ".");
        return Double.parseDouble(number);
    }

    private boolean isNumeric(String n) {
        if (n == null || n.isEmpty())
            return false;

        String number = n.replace(",", "."); // R$ 5,00 USD 5.00
        return number.matches("[-+]?[0-9]*\\.?[0-9]+");
    }
}
