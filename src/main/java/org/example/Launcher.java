package org.example;

import java.io.IOException;
import java.util.Scanner;

public class Launcher {
    public void startCode() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which app? (VSC,VS,II)");
        String appName = scanner.nextLine();
        Code code = new Code(appName);
        code.openApp();
    }

}

