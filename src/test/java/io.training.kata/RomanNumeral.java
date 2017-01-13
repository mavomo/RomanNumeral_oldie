package io.training.kata;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Michelle on 13/01/2017.
 *
 * @see : http://literacy.kent.edu/Minigrants/Cinci/romanchart.htm
 */
public class RomanNumeral {

    public static String convertToArabic(final int number) {
        Map<Integer, String> arabicNumbers = romanNumeralsChart();


        AtomicInteger numberToConvert = new AtomicInteger(number);
        StringBuilder arabicValue = new StringBuilder();
        arabicNumbers.keySet().forEach(key -> {
            while (numberToConvert.intValue() >= key.intValue()){
                arabicValue.append(arabicNumbers.get(key));
                numberToConvert.set(numberToConvert.intValue() - key.intValue());
            }
        });
      return arabicValue.toString();
    }

    private static Map<Integer, String> romanNumeralsChart() {
        Map<Integer, String> arabicNumbers = new TreeMap<>(Comparator.reverseOrder());
        arabicNumbers.put(1000, "M");
        arabicNumbers.put(500, "D");
        arabicNumbers.put(100, "C");
        arabicNumbers.put(90, "XC");
        arabicNumbers.put(50, "L");
        arabicNumbers.put(40, "XL");
        arabicNumbers.put(10, "X");
        arabicNumbers.put(9, "IX");
        arabicNumbers.put(5, "V");
        arabicNumbers.put(4, "IV");
        arabicNumbers.put(1, "I");
        return arabicNumbers;
    }
}
