public class Main {
    public static void main(String[] args) {
        String a = new String("Wow");
        String b = "Wow";
        String c = a;
        String d = c;

        boolean b1 = a == b;
        boolean b2 = b.equals(b + "!");
        boolean b3 = !c.equals(a);

        if (b1 && b2 && b3) {
            System.out.println("Success!");
        }
    }
}