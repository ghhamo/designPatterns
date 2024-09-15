package job;

import java.util.Scanner;

public class Adaptee {
    private static final Adapter adapter = new Adapter();

    public String toClient(String string) {
        System.out.println(string);
        Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();
        return adapter.toClient(s);
    }
}
