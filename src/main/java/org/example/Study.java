package org.example;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
public class Study {
    public void openApp() throws IOException {
        Paths paths = new Paths();
        String pathToVSCode = paths.vscPath;
        File vsCodeExecutable = new File(pathToVSCode);
        if (vsCodeExecutable.exists() && vsCodeExecutable.canExecute()) {
            Desktop.getDesktop().open(vsCodeExecutable);
            System.out.println("VisualStudioCode running");
        }
    }
    public void openWebsites() throws URISyntaxException, IOException {
        Paths paths = new Paths();
        Desktop desktop = Desktop.getDesktop();
        desktop.browse(new URI(paths.chatGPTURL));
        System.out.println("ChatGPT opened");
        desktop.browse(new URI(paths.outLURL));
        System.out.println("Outlook opened");
        desktop.browse(new URI(paths.teamsURL));
        System.out.println("Teams opened");
        desktop.browse(new URI(paths.planURL));
        System.out.println("School plan opened");
    }

}
