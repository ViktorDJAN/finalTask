package finalTask;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Camel extends Animal {
    String resistanceOftemperature;

    public Camel(String name1, String resistanceOftemperature) {
        super(name1);
        this.resistanceOftemperature = resistanceOftemperature;
    }

    @Override
    public String makeVoice() {
        String voice  = ("aou oua");
        return voice;
    }
    public String makeSpit() {
        String spit = ("Spit..");
        return spit;
    }

    @Override
    public String toString() {
        return "Camel{" +
                "resistanceOftemperature='" + resistanceOftemperature + '\'' +
                " " + super.toString();
    }

    public void actions() {
        Map<String, String> cmnds = new HashMap<>();
        String cmnd1 = makeVoice().toString();
        cmnds.put("c1",cmnd1);
        String cmnd2 = makeSpit().toString();
        cmnds.put("c2",cmnd2);
        cmnds.put("c3","No command is here ");
        System.out.println("Choose a commands you like to see");
        System.out.println("Press 'c1' ,'c2' or 'c3' to see commands, press 'nc' to create a new command which is saved under the number 'c3'.");
        System.out.println("Press 'all' to see whole commands , press 'q' to quit out.");
        boolean flag = true;
        while (flag) {
            Scanner scanner = new Scanner(System.in);
            String choose1 = scanner.next();
            switch (choose1) {
                case "c1":
                    System.out.println(cmnds.get("c1"));
                    break;
                case "c2":
                    System.out.println(cmnds.get("c2"));
                    break;
                case "nc":
                    System.out.println("Describe your command");
                    Scanner scannerc = new Scanner(System.in);
                    String nwcmd = scannerc.next();
                    cmnds.put("c3",nwcmd);
                    break;
                case "c3":
                    System.out.println(cmnds.get("c3").toString());
                    break;
                case "all":
                    System.out.println(cmnds);
                    break;
                case "q":
                    System.out.println("Goodbye");
                    flag = false;
                    break;
            }
        }
    }
}
