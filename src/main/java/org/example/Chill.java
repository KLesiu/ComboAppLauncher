package org.example;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Chill {
    public void openWebsites() throws URISyntaxException, IOException {
        Paths paths = new Paths();
        Desktop desktop = Desktop.getDesktop();
        desktop.browse(new URI(paths.ytURL));
        System.out.println("YouTube opened");
        desktop.browse(new URI(paths.twitchURL));
        System.out.println("Twitch opened");
    }
}
