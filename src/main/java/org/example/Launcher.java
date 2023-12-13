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

}

