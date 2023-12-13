package org.example;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
public class Code {
    final private String app;
    public Code(String app){
        this.app=app;
    }
    public void openApp() throws IOException {
        if(this.app.equals("VSC")){
            String pathToVSCode = "D:/Microsoft VS Code/Code.exe";
            File vsCodeExecutable = new File(pathToVSCode);
            if(vsCodeExecutable.exists() && vsCodeExecutable.canExecute()){

                Desktop.getDesktop().open(vsCodeExecutable);
                System.out.println("VSC running");
            }
        }
    }
}
