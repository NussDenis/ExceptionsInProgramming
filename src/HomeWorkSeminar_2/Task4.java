package HomeWorkSeminar_2;

import java.net.Socket;
import java.util.Scanner;

import javax.sound.midi.Soundbank;


public class Task4 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Ввод: ");
        String input = iScanner.nextLine();
        
        if (input.isEmpty()) {
            throw new RuntimeException("Нельзя вводить пустые строки");
        }

        System.out.println(input);
    }
}