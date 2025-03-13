package github.com.phyllipesa.rest.math;

import org.springframework.stereotype.Service;

@Service
public class SimpleMath {
    public Double sum(Double n1, Double n2) {
        return n1 + n2;
    }
}
