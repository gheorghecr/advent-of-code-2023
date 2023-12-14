package com.gheorghe.adventofcode2023;

import com.gheorghe.adventofcode2023.day1.DayOneCalibration;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileNotFoundException;

@Slf4j
@SpringBootApplication
public class AdventOfCode2023Application {

	public static void main(String[] args) throws FileNotFoundException {
		SpringApplication.run(AdventOfCode2023Application.class, args);

//		Day 1 - Part 1
		DayOneCalibration dayOneCalibration = new DayOneCalibration("src/main/resources/inputs/day1.txt");
		dayOneCalibration.calculateSumOfCalibrationValues();

//		Day 1 - Part 2
		dayOneCalibration.calculateSumOfCalibrationValuesIncludingSpelledNumbers();

	}

}
