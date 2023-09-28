package finalTask;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dog extends Animal {
    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                "" + super.toString();
    }

    String breed;

    public Dog(String name1, String breed) {
        super(name1);
        this.breed = breed;
    }

    @Override
    public String makeVoice() {
        String voice = ("Mooooooon");

        return voice;
    }
    public String makeBark() {
        String bark = ("Bark Bark ..");
        return bark;
    }
    public void actionsDog() {
        Map<String, String> cmnds = new HashMap<>();
        String cmnd1 = makeVoice().toString();
        cmnds.put("d1",cmnd1);
        String cmnd2 = makeBark().toString();
        cmnds.put("d2",cmnd2);
        cmnds.put("d3","No command is here ");
        System.out.println("Choose a commands you like to see");
        System.out.println("Press 'd1' ,'d2' or 'd3' to see commands, press 'nc' to create a new command which is saved under the number 'c3'.");
        System.out.println("Press 'all' to see whole commands , press 'q' to quit out.");
        boolean flag = true;
        while (flag) {
            Scanner scanner = new Scanner(System.in);
            String choose1 = scanner.next();
            switch (choose1) {
                case "d1":
                    System.out.println(cmnds.get("d1"));
                    break;
                case "d2":
                    System.out.println(cmnds.get("d2"));
                    break;
                case "nc":
                    System.out.println("Describe your command");
                    Scanner scannerc = new Scanner(System.in);
                    String nwcmd = scannerc.next();
                    cmnds.put("d3",nwcmd);
                    break;
                case "d3":
                    System.out.println(cmnds.get("d3").toString());
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
