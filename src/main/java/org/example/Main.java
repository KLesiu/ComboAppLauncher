package org.example;


import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Objects;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws IOException, URISyntaxException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want to do?");
        String choice = scanner.nextLine();
        Launcher launcher = new Launcher();
        if(Objects.equals(choice, "code")){
            launcher.startCode();
        }
        else if(Objects.equals(choice,"chill")){
            launcher.startChill();
        }
        else if(Objects.equals(choice,"play")){
            launcher.startPlay();
        }
        else if(Objects.equals(choice,"study")){
            launcher.startStudy();
        }
        scanner.close();
    }

}