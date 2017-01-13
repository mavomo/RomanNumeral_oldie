package io.training.kata;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by Michelle on 13/01/2017.
 */
public class RomanNumerals {


    @Test
    public void should_convert_1_to_I(){
        assertThat(RomanNumeral.convertToArabic(1)).isEqualTo("I");
    }

    @Test
    public void should_convert_2_to_II()  {
        assertThat(RomanNumeral.convertToArabic(2)).isEqualTo("II");
    }

    @Test
    public void should_convert_3_to_III() {
        assertThat(RomanNumeral.convertToArabic(3)).isEqualTo("III");
    }

    @Test
    public void should_convert_5_to_V(){
        assertThat(RomanNumeral.convertToArabic(5)).isEqualTo("V");
    }

    @Test
    public void should_convert_6_to_VI() {
        assertThat(RomanNumeral.convertToArabic(6)).isEqualTo("VI");
    }

    @Test
    public void should_convert_7_to_VII() {
        assertThat(RomanNumeral.convertToArabic(7)).isEqualTo("VII");
    }

    @Test
    public void should_convert_8_to_VIII() {
        assertThat(RomanNumeral.convertToArabic(8)).isEqualTo("VIII");
    }

    @Test
    public void should_convert_10_to_X() {
        assertThat(RomanNumeral.convertToArabic(10)).isEqualTo("X");
    }

    @Test
    public void should_convert_11_to_XI() {
        assertThat(RomanNumeral.convertToArabic(11)).isEqualTo("XI");
    }

    @Test
    public void shoul_convert_12_to_XII()  {
        assertThat(RomanNumeral.convertToArabic(12)).isEqualTo("XII");
    }

    @Test
    public void should_convert_15_to_XV (){
        assertThat(RomanNumeral.convertToArabic(15)).isEqualTo("XV");
    }

    @Test
    public void should_convert_18_to_XVIII() {
        assertThat(RomanNumeral.convertToArabic(18)).isEqualTo("XVIII");
    }

    @Test
    public void should_convert_20_to_XX() {
        assertThat(RomanNumeral.convertToArabic(20)).isEqualTo("XX");
    }

    @Test
    public void should_convert_21_to_XXI(){
        assertThat(RomanNumeral.convertToArabic(21)).isEqualTo("XXI");
    }

    @Test
    public void should_convert_30_to_XXX(){
        assertThat(RomanNumeral.convertToArabic(30)).isEqualTo("XXX");
    }

    @Test
    public void should_convert_50_to_L(){
        assertThat(RomanNumeral.convertToArabic(50)).isEqualTo("L");
    }

    @Test
    public void should_convert_55_to_LV(){
        assertThat(RomanNumeral.convertToArabic(55)).isEqualTo("LV");
    }

    @Test
    public void should_convert_60_to_LX(){
        assertThat(RomanNumeral.convertToArabic(60)).isEqualTo("LX");
    }


    @Test
    public void should_convert_100_to_C(){
        assertThat(RomanNumeral.convertToArabic(100)).isEqualTo("C");
    }

    @Test
    public void should_convert_120_to_C(){
        assertThat(RomanNumeral.convertToArabic(120)).isEqualTo("CXX");
    }

    @Test
    public void should_convert_500_to_D(){
        assertThat(RomanNumeral.convertToArabic(500)).isEqualTo("D");
    }

    @Test
    public void should_convert_1000_to_M(){
        assertThat(RomanNumeral.convertToArabic(1000)).isEqualTo("M");
    }

    @Test
    public void should_convert_4_to_IV()  {
        assertThat(RomanNumeral.convertToArabic(4)).isEqualTo("IV");
    }

    @Test
    public void should_convert_24_to_XXIV()  {
        assertThat(RomanNumeral.convertToArabic(24)).isEqualTo("XXIV");
    }

    @Test
    public void should_convert_9_to_IX(){
        assertThat(RomanNumeral.convertToArabic(9)).isEqualTo("IX");
    }

    @Test
    public void should_convert_40_to_XL(){
        assertThat(RomanNumeral.convertToArabic(40)).isEqualTo("XL");
    }

    @Test
    public void should_convert_49_to_XL(){
        assertThat(RomanNumeral.convertToArabic(49)).isEqualTo("XLIX");
    }

    @Test
    public void should_return_90_to_XC()  {
        assertThat(RomanNumeral.convertToArabic(90)).isEqualTo("XC");
    }

    @Test
    public void should_return_99_to_XCIX()  {
        assertThat(RomanNumeral.convertToArabic(99)).isEqualTo("XCIX");
    }
}

