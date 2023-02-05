package com.example.TranslatorSoftware;

import org.springframework.stereotype.Service;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class FileService {
    private String fileName = "data.txt";

    List<Entry> readAllFile() throws IOException{
        return Files.readAllLines(Path.of(fileName))
                .stream()
                .map(CsvEntryConverter::prese)
                .collect(Collectors.toList());
    }



    void saveEntries(List<Entry> entries) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));
        for (Entry entry : entries) {
            bufferedWriter.write(entry.toString());
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }

    private static class CsvEntryConverter{
        static Entry prese(String text){
            String[] split = text.split(";");

            return new Entry(split[0], split[1]);
        }
    }
}
