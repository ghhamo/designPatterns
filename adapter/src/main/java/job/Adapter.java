package job;

public class Adapter {
    private static final Adaptee adaptee = new Adaptee();

    public String fromClient(String input) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            int code = input.charAt(i);
            builder.append(code);
        }
        return adaptee.toClient(String.valueOf(builder));
    }

    public String toClient(String input) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            builder.append(input.charAt(i) - '0');
        }
        return String.valueOf(builder);
    }
}
