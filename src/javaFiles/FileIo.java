package javaFiles;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileIo {
    public static void main(String[] args) throws IOException {
        BufferedWriter writer=new BufferedWriter(new FileWriter("output.txt"));

    }
}
