package org.example;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
public class Play {
    final private String app;
    public Play(String app){
        this.app = app;
    }
    public void openApp() throws IOException {
        Paths paths = new Paths();
        switch(this.app){
            case "LOL"  ->{
                String pathToLOL = paths.riotPath;
                File lolExecutable = new File(pathToLOL);
                if(lolExecutable.exists() && lolExecutable.canExecute()){
                    Desktop.getDesktop().open(lolExecutable);
                    System.out.println("Riot Client running");
                }
            }
            case "CS" ->{
                String pathToCS = paths.csPath;
                File csExecutable = new File(pathToCS);
                if(csExecutable.exists() && csExecutable.canExecute()){
                    Desktop.getDesktop().open(csExecutable);
                    System.out.println("CounterStrike running");
                }
            }
            case "RL" ->{
                String pathToRL = paths.rlPath;
                File rlExecutable = new File(pathToRL);
                if(rlExecutable.canExecute() && rlExecutable.exists()){
                    Desktop.getDesktop().open(rlExecutable);
                    System.out.println("RocketLeague running");
                }
            }


        }
    }
    public void openHelpers() throws IOException, URISyntaxException {
        Paths paths = new Paths();
        Desktop desktop = Desktop.getDesktop();
        desktop.browse(new URI(paths.ytURL));
        System.out.println("YouTube opened");

    }
}
