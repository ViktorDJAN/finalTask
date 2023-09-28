package finalTask;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hamster extends finalTask.Animal {
    String nutsQuantity;

    public Hamster(String name1, String nutsQuantity) {
        super(name1);
        this.nutsQuantity = nutsQuantity;
    }

    @Override
    public String makeVoice() {
        String voice = ("hashkhash");
        return voice;
    }
    public String makeTremble() {
        String tremble = ("Tremble..");
        return tremble;
    }
    public void actions() {
        Map<String, String> cmnds = new HashMap<>();
        String cmnd1 = makeVoice().toString();
        cmnds.put("c1",cmnd1);
        String cmnd2 = makeTremble().toString();
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

    @Override
    public String toString() {
        return "Hamster{" +
                "nutsQuantity='" + nutsQuantity + '\'' +
                " " + super.toString();
    }


}
