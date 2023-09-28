package finalTask;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Cat extends Animal {
    String color;

    public Cat(String name1, String color) {
        super(name1);
        this.color = color;
    }

    @Override
    public String makeVoice() {
        String voice = ("Meooooow");
        return voice;
    }

    public String makeJump() {
        String jump = ("Jump..");
        return jump;
    }

    public void action(String action) {
        System.out.println(action);
    }


    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                "" + super.toString();
    }

    public void actionsCat() {
        Map<String, String> cmnds = new HashMap<>();
        String cmnd1 = makeVoice().toString();
        cmnds.put("c1",cmnd1);
        String cmnd2 = makeJump().toString();
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
