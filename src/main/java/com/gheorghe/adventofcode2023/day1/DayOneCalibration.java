package com.gheorghe.adventofcode2023.day1;

import com.gheorghe.adventofcode2023.InputFileReader;
import io.micrometer.common.util.StringUtils;
import lombok.extern.slf4j.Slf4j;

import java.io.FileNotFoundException;
import java.util.*;

@Slf4j
public class DayOneCalibration {

    final private String inputFileName;

    public DayOneCalibration(String inputFileName) {
        this.inputFileName = inputFileName;
    }

    public int calculateSumOfCalibrationValues() throws FileNotFoundException {
        List<String> inputLinesList = InputFileReader.readFile(inputFileName);

        int totalCalibrationValues = 0;

        for(String line : inputLinesList) {
            String twoDigitString = getFirstAndLastNumberInLine(line);
            totalCalibrationValues += Integer.parseInt(twoDigitString);
        }

        log.info(String.format("Total: %s",  totalCalibrationValues));
        return totalCalibrationValues;
    }

    public String getFirstAndLastNumberInLine(String inputLine) {
        // Replacing every non-digit number
        // with a space(" ")
        inputLine = inputLine.replaceAll("[^0-9]", ""); // regular expression

        return String.format("%s%s", inputLine.charAt(0), inputLine.charAt(inputLine.length() -1));
    }

    public int calculateSumOfCalibrationValuesIncludingSpelledNumbers() throws FileNotFoundException {
        List<String> inputLinesList = InputFileReader.readFile(inputFileName);

        int totalCalibrationValues = 0;

        for(String line : inputLinesList) {
            String twoDigitString = getFirstAndLastNumberInLineIncludingSpelledNumbers(line);
            totalCalibrationValues += Integer.parseInt(twoDigitString);
        }

        log.info(String.format("Total: %s",  totalCalibrationValues));
        return totalCalibrationValues;
    }


//    PART TWO
    public String getFirstAndLastNumberInLineIncludingSpelledNumbers(String inputLine) {
        Map<String, String> wordsAndNumber = buildWordsAndNumbers();

        Map<Integer, String> lineNumbersMap = new HashMap<>();

        for (Map.Entry<String, String> entry : wordsAndNumber.entrySet()) {
            if(inputLine.contains(entry.getKey())) {
                List<Integer> indexes = new ArrayList<Integer>();
                int index = 0;
                while(index != -1){
                    index = inputLine.indexOf(entry.getKey(), index);
                    if (index != -1) {
                        indexes.add(index);
                        index++;
                    }
                }
                for(Integer indx : indexes) {
                    lineNumbersMap.put(indx, entry.getValue());
                }
            }
        }

        if (StringUtils.isBlank(inputLine) || lineNumbersMap.isEmpty()) {
            return "0";
        }

        Map<Integer, String> lineNumbersMapSorted = new TreeMap<Integer, String>(lineNumbersMap);

        List<String> sortedValues = lineNumbersMapSorted.values().stream().toList();

        return String.format("%s%s", sortedValues.get(0), sortedValues.get(sortedValues.size() - 1));
    }

    private Map buildWordsAndNumbers() {
        Map<String, String> wordsNumbers = new HashMap<>();
        wordsNumbers.put("one", "1");
        wordsNumbers.put("two", "2");
        wordsNumbers.put("three", "3");
        wordsNumbers.put("four", "4");
        wordsNumbers.put("five", "5");
        wordsNumbers.put("six", "6");
        wordsNumbers.put("seven", "7");
        wordsNumbers.put("eight", "8");
        wordsNumbers.put("nine", "9");
        wordsNumbers.put("1", "1");
        wordsNumbers.put("2", "2");
        wordsNumbers.put("3", "3");
        wordsNumbers.put("4", "4");
        wordsNumbers.put("5", "5");
        wordsNumbers.put("6", "6");
        wordsNumbers.put("7", "7");
        wordsNumbers.put("8", "8");
        wordsNumbers.put("9", "9");

        return wordsNumbers;
    }


}
