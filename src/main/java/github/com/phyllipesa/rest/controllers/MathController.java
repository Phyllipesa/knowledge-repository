package github.com.phyllipesa.rest.controllers;

import static github.com.phyllipesa.rest.controllers.request.converters.NumberConverter.convertToDouble;
import static github.com.phyllipesa.rest.controllers.request.converters.NumberConverter.isNumeric;

import github.com.phyllipesa.rest.math.SimpleMath;
import github.com.phyllipesa.tratamentoDeExceptions.UnsupportedMathOperationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {

    private final SimpleMath math;

    @Autowired
    public MathController(SimpleMath math) {
        this.math = math;
    }

    // http://localhost:8080/math/sum/3/5
    @GetMapping("/sum/{n1}/{n2}")
    public ResponseEntity<Double> sum(@PathVariable String n1, @PathVariable String n2) {
        if (!isNumeric(n1) || !isNumeric(n2)) {
            throw new UnsupportedMathOperationException("Please provide numeric values!");
        }

        Double result = math.sum(convertToDouble(n1), convertToDouble(n2));
        return ResponseEntity.ok(result);
    }
}
