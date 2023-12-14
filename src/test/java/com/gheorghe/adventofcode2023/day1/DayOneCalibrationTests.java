package com.gheorghe.adventofcode2023.day1;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DayOneCalibrationTests {

    @Test
    public void gerFirstAndLastNumberInLine_returns_expectedResult() {
        String input = "gdsd1dfsf3fdsds4ds";
        String expectedResult = "14";

        DayOneCalibration dayOneCalibration = new DayOneCalibration("src/test/resources/inputs/day1.txt");

        String inputNumberOnly = dayOneCalibration.getFirstAndLastNumberInLine(input);

        assertEquals(expectedResult, inputNumberOnly);
    }

    @Test
    public void calculateSumOfCalibrationValues_returns_expectedResult() throws FileNotFoundException {
        int expectedResult = 266;

        DayOneCalibration dayOneCalibration = new DayOneCalibration("src/test/resources/inputs/day1.txt");

        int sumOfCalibrationValues = dayOneCalibration.calculateSumOfCalibrationValues();

        assertEquals(expectedResult, sumOfCalibrationValues);
    }

    @Test
    public void calculateSumOfCalibrationValuesWithAdventOfCodeValues_returns_expectedResult() throws FileNotFoundException {
        int expectedResult = 53080;

        DayOneCalibration dayOneCalibration = new DayOneCalibration("src/main/resources/inputs/day1.txt");

        int sumOfCalibrationValues = dayOneCalibration.calculateSumOfCalibrationValues();

        assertEquals(expectedResult, sumOfCalibrationValues);
    }

    @Test
    public void getFirstAndLastNumberInLineIncludingSpelledNumbers_returns_expectedResultWithInputOne() {
        String input = "four9sixqjbpxfgc68zcjffmjone";
        String expectedResult = "41";

        DayOneCalibration dayOneCalibration = new DayOneCalibration("src/test/resources/inputs/day1.txt");

        String inputNumberOnly = dayOneCalibration.getFirstAndLastNumberInLineIncludingSpelledNumbers(input);

        assertEquals(expectedResult, inputNumberOnly);
    }

    @Test
    public void getFirstAndLastNumberInLineIncludingSpelledNumbers_returns_expectedResultWithInputTwo() {
        String input = "9sixqjbpxfgc68zcjffmjone";
        String expectedResult = "91";

        DayOneCalibration dayOneCalibration = new DayOneCalibration("src/test/resources/inputs/day1.txt");

        String inputNumberOnly = dayOneCalibration.getFirstAndLastNumberInLineIncludingSpelledNumbers(input);

        assertEquals(expectedResult, inputNumberOnly);
    }

    @Test
    public void getFirstAndLastNumberInLineIncludingSpelledNumbers_returns_expectedResultWithInputThree() {
        String input = "sixqjbpxfgc68zcjffmjone2";
        String expectedResult = "62";

        DayOneCalibration dayOneCalibration = new DayOneCalibration("src/test/resources/inputs/day1.txt");

        String inputNumberOnly = dayOneCalibration.getFirstAndLastNumberInLineIncludingSpelledNumbers(input);

        assertEquals(expectedResult, inputNumberOnly);
    }

    @Test
    public void getFirstAndLastNumberInLineIncludingSpelledNumbers_returns_expectedResultWithInputFour() {
        String input = "three656";
        String expectedResult = "36";

        DayOneCalibration dayOneCalibration = new DayOneCalibration("src/test/resources/inputs/day1.txt");

        String inputNumberOnly = dayOneCalibration.getFirstAndLastNumberInLineIncludingSpelledNumbers(input);

        assertEquals(expectedResult, inputNumberOnly);
    }
}
