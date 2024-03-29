package org.example;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;


public class Code {
    final private String app;
    public Code(String app){
        this.app=app;
    }
    public void openApp() throws IOException {
        Paths paths = new Paths();
        switch (this.app) {
            case "VSC" -> {
                String pathToVSCode = paths.vscPath;
                File vsCodeExecutable = new File(pathToVSCode);
                if (vsCodeExecutable.exists() && vsCodeExecutable.canExecute()) {
                    Desktop.getDesktop().open(vsCodeExecutable);
                    System.out.println("VisualStudioCode running");
                }
            }
            case "VS" -> {
                String pathToVStudio = paths.vsPath;
                File vStudioExecutable = new File(pathToVStudio);
                if (vStudioExecutable.exists() && vStudioExecutable.canExecute()) {
                    Desktop.getDesktop().open(vStudioExecutable);
                    System.out.println("VisualStudio running");
                }
            }
            case "II" -> {
                String pathToIntelliJIDEA = paths.iiPath;
                File vIntelliJIDEAExecutable = new File(pathToIntelliJIDEA);
                if (vIntelliJIDEAExecutable.exists() && vIntelliJIDEAExecutable.canExecute()) {
                    Desktop.getDesktop().open(vIntelliJIDEAExecutable);
                    System.out.println("IntelliJIDEA running");

                }
            }
        }
    }
    public void openHelpers() throws IOException, URISyntaxException {
        Paths paths = new Paths();
        Desktop desktop = Desktop.getDesktop();
        desktop.browse(new URI(paths.chatGPTURL));
        System.out.println("ChatGPT opened");
        desktop.browse(new URI(paths.ghURL));
        System.out.println("GitHub opened");
        desktop.browse(new URI(paths.ytURL));
        System.out.println("YouTube opened");
    }
}

