package io.training.kata;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by Michelle on 13/01/2017.
 */
public class RomanNumerals {


    @Test
    public void should_convert_1_to_I(){
        assertThat(RomanNumeral.convertToRomanNumeral(1)).isEqualTo("I");
    }

    @Test
    public void should_convert_2_to_II()  {
        assertThat(RomanNumeral.convertToRomanNumeral(2)).isEqualTo("II");
    }

    @Test
    public void should_convert_3_to_III() {
        assertThat(RomanNumeral.convertToRomanNumeral(3)).isEqualTo("III");
    }

    @Test
    public void should_convert_5_to_V(){
        assertThat(RomanNumeral.convertToRomanNumeral(5)).isEqualTo("V");
    }

    @Test
    public void should_convert_6_to_VI() {
        assertThat(RomanNumeral.convertToRomanNumeral(6)).isEqualTo("VI");
    }

    @Test
    public void should_convert_7_to_VII() {
        assertThat(RomanNumeral.convertToRomanNumeral(7)).isEqualTo("VII");
    }

    @Test
    public void should_convert_8_to_VIII() {
        assertThat(RomanNumeral.convertToRomanNumeral(8)).isEqualTo("VIII");
    }

    @Test
    public void should_convert_10_to_X() {
        assertThat(RomanNumeral.convertToRomanNumeral(10)).isEqualTo("X");
    }

    @Test
    public void should_convert_11_to_XI() {
        assertThat(RomanNumeral.convertToRomanNumeral(11)).isEqualTo("XI");
    }

    @Test
    public void shoul_convert_12_to_XII()  {
        assertThat(RomanNumeral.convertToRomanNumeral(12)).isEqualTo("XII");
    }

    @Test
    public void should_convert_15_to_XV (){
        assertThat(RomanNumeral.convertToRomanNumeral(15)).isEqualTo("XV");
    }

    @Test
    public void should_convert_18_to_XVIII() {
        assertThat(RomanNumeral.convertToRomanNumeral(18)).isEqualTo("XVIII");
    }

    @Test
    public void should_convert_20_to_XX() {
        assertThat(RomanNumeral.convertToRomanNumeral(20)).isEqualTo("XX");
    }

    @Test
    public void should_convert_21_to_XXI(){
        assertThat(RomanNumeral.convertToRomanNumeral(21)).isEqualTo("XXI");
    }

    @Test
    public void should_convert_30_to_XXX(){
        assertThat(RomanNumeral.convertToRomanNumeral(30)).isEqualTo("XXX");
    }

    @Test
    public void should_convert_50_to_L(){
        assertThat(RomanNumeral.convertToRomanNumeral(50)).isEqualTo("L");
    }

    @Test
    public void should_convert_55_to_LV(){
        assertThat(RomanNumeral.convertToRomanNumeral(55)).isEqualTo("LV");
    }

    @Test
    public void should_convert_60_to_LX(){
        assertThat(RomanNumeral.convertToRomanNumeral(60)).isEqualTo("LX");
    }


    @Test
    public void should_convert_100_to_C(){
        assertThat(RomanNumeral.convertToRomanNumeral(100)).isEqualTo("C");
    }

    @Test
    public void should_convert_120_to_C(){
        assertThat(RomanNumeral.convertToRomanNumeral(120)).isEqualTo("CXX");
    }

    @Test
    public void should_convert_500_to_D(){
        assertThat(RomanNumeral.convertToRomanNumeral(500)).isEqualTo("D");
    }

    @Test
    public void should_convert_1000_to_M(){
        assertThat(RomanNumeral.convertToRomanNumeral(1000)).isEqualTo("M");
    }

    @Test
    public void should_convert_4_to_IV()  {
        assertThat(RomanNumeral.convertToRomanNumeral(4)).isEqualTo("IV");
    }

    @Test
    public void should_convert_24_to_XXIV()  {
        assertThat(RomanNumeral.convertToRomanNumeral(24)).isEqualTo("XXIV");
    }

    @Test
    public void should_convert_9_to_IX(){
        assertThat(RomanNumeral.convertToRomanNumeral(9)).isEqualTo("IX");
    }

    @Test
    public void should_convert_40_to_XL(){
        assertThat(RomanNumeral.convertToRomanNumeral(40)).isEqualTo("XL");
    }

    @Test
    public void should_convert_49_to_XL(){
        assertThat(RomanNumeral.convertToRomanNumeral(49)).isEqualTo("XLIX");
    }

    @Test
    public void should_return_90_to_XC()  {
        assertThat(RomanNumeral.convertToRomanNumeral(90)).isEqualTo("XC");
    }

    @Test
    public void should_return_99_to_XCIX()  {
        assertThat(RomanNumeral.convertToRomanNumeral(99)).isEqualTo("XCIX");
    }
}

