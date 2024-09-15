package job;

import java.util.Scanner;

public class AdapterMain {

    public static void main(String[] args) {
        Adapter adapter = new Adapter();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(adapter.fromClient(scanner.nextLine()));
        }
    }
}
