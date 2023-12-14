package com.gheorghe.adventofcode2023;

import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Slf4j
public class InputFileReader {
    public static List<String> readFile(String filename) throws FileNotFoundException {
        try(Scanner scanner = new Scanner(new File(filename))) {
            List<String> inputStringList = new ArrayList<>();
            while(scanner.hasNextLine()) {
                inputStringList.add(scanner.nextLine());
            }
            log.info("File successfully processed");
            return inputStringList;
        } catch (FileNotFoundException fileNotFoundException) {
            log.error("File not found: " + filename);
            throw fileNotFoundException;
        }
    }
}
