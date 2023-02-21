package bigDecimal;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        BigDecimal bd1 = new BigDecimal("-205");
        BigDecimal bd2 = new BigDecimal("205");
        BigDecimal bd3 = new BigDecimal("2.5");
        BigDecimal bd4 = new BigDecimal("205");

        System.out.println(bd1.abs());
        System.out.println(bd1.add(bd2));
        System.out.println(bd3.intValue());
        System.out.println(bd1.compareTo(bd2)); // return 1 if the caller is bigger than the called otherwise -1
        System.out.println(bd2.divide(bd3)); // divide the caller by the called big decimal
        System.out.println(bd2.equals(bd4)); // check equality of the two big decimals
        System.out.println(bd4.movePointLeft(2)); // move the decimal point 2 position to the left or divide by 100
        System.out.println(bd3.precision()); // number of digits in mantissa or unscaled value
        System.out.println(bd3.scale()); // return the exponent value or number of digits to the right of decimal point
    }

}
