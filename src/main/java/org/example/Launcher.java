package org.example;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Scanner;

public class Launcher {
    public void startCode() throws IOException, URISyntaxException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which app? (VSC,VS,II)");
        String appName = scanner.nextLine();
        Code code = new Code(appName);
        code.openApp();
        code.openHelpers();
        scanner.close();
    }
    public void startChill() throws URISyntaxException, IOException {
        System.out.println("Have fun!");
        Chill chill = new Chill();
        chill.openWebsites();
    }
    public void startPlay() throws IOException, URISyntaxException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want to play? (LOL,CS,RL");
        String appName = scanner.nextLine();
        Play play = new Play(appName);
        System.out.println("Have fun BOSS!");
        play.openApp();
        play.openHelpers();

        scanner.close();
    }
    public void startStudy() throws IOException, URISyntaxException {
        Study study = new Study();
        study.openApp();
        study.openWebsites();
    }

}

