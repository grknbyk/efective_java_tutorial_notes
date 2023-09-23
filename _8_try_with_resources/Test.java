package _8_try_with_resources;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.Buffer;

public class Test {

    public static void main(String[] args) {

        try (BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\mert\\Desktop\\test.txt"));
                BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\mert\\Desktop\\test2.txt"))) {

        } catch (Exception e) {

        }
    }
}
