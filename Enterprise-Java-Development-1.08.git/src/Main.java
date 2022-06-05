import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Main {

    // EJERCICIO 1
    public static double regDec(BigDecimal num){
        return num.round(new MathContext(3)).doubleValue();
    }

    // EJERCICIO 2
    public static BigDecimal reverse(BigDecimal num){
        return num.setScale(1, RoundingMode.FLOOR).negate();
    }

    public static void main(String[] args) {
        //EJERCICIO 1
        System.out.println(regDec(new BigDecimal("4.2545")));
        //EJERCICIO 2
        System.out.println(reverse(new BigDecimal("1.2345")));
        System.out.println(reverse(new BigDecimal("-45.67")));
    }
}