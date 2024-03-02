package com.advanced.exceptions;

import java.io.FileReader;
import java.io.IOException;

public class ExceptionsDemo {
    static FileReader reader;
    public static void show() {
        try {
            reader = new FileReader("file.txt");
            var value = reader.read();
        }
        catch (IOException e) {
            System.out.println("could not read data");
        }

    }
}
