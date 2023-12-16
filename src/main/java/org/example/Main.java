package org.example;


import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Objects;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws IOException, URISyntaxException {
        Scanner scanner = new Scanner(System.in);
        Launcher launcher = new Launcher();
        while(true){
            System.out.println("What do you want to do?");

            String choice = scanner.nextLine();
            if(Objects.equals(choice, "code")){
                launcher.startCode();
                break;
            }
            else if(Objects.equals(choice,"chill")){
                launcher.startChill();
                break;
            }
            else if(Objects.equals(choice,"play")){
                launcher.startPlay();
                break;
            }
            else if(Objects.equals(choice,"study")){
                launcher.startStudy();
                break;
            }else{
                System.out.println("I dont understand!");
            }

        }
        scanner.close();


    }

}