package JavaConcepts;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadFromConfigFile {
    public  Properties prop;

    public ReadFromConfigFile() {
        File src = new File("C:\\Users\\skalra\\IdeaProjects\\CcumberTraining\\cucumbertraining\\CucumberBDD\\ConfigData\\config.properties");
        try {
            FileInputStream fis = new FileInputStream(src);
            prop = new Properties();
            prop.load(fis);
        } catch (Exception e) {
            System.out.println("Exception is " + e.getMessage());
        }

    }

    public static void main(String[] args){
        ReadFromConfigFile obj=new ReadFromConfigFile();
        String url=obj.prop.getProperty("ApplicationURL");
        System.out.println("URL is:" + url);
        System.out.println("Browser name is::" + obj.getChromePath());
//        System.out.println("Chrome driver path:" + prop.getProperty("chromeDriverPath"));
    }

    public  String getChromePath() {
        String chromeDriverPath = prop.getProperty("chromeDriverPath");
        return chromeDriverPath;
    }


}





