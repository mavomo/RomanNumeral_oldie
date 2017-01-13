package io.training.kata;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @see : http://literacy.kent.edu/Minigrants/Cinci/romanchart.htm
 */
public class RomanNumeral {

    public static String convertToRomanNumeral(final int number) {
        Map<Integer, String> arabicNumbers = romanNumeralsChart();
        AtomicInteger numberToConvert = new AtomicInteger(number);
        StringBuilder romanNumeralValue = new StringBuilder();
        arabicNumbers.keySet().forEach(key -> {
            int arabicNumber = key.intValue();
            while (numberToConvert.intValue() >= arabicNumber){
                romanNumeralValue.append(arabicNumbers.get(key));
                numberToConvert.set(numberToConvert.intValue() - arabicNumber);
            }
        });
      return romanNumeralValue.toString();
    }

    private static Map<Integer, String> romanNumeralsChart() {
        Map<Integer, String> arabicNumbers = new TreeMap<>(Comparator.reverseOrder());
        arabicNumbers.put(1, "I");
        arabicNumbers.put(4, "IV");
        arabicNumbers.put(5, "V");
        arabicNumbers.put(9, "IX");
        arabicNumbers.put(10, "X");
        arabicNumbers.put(40, "XL");
        arabicNumbers.put(50, "L");
        arabicNumbers.put(90, "XC");
        arabicNumbers.put(100, "C");
        arabicNumbers.put(500, "D");
        arabicNumbers.put(1000, "M");

        return arabicNumbers;
    }
}
