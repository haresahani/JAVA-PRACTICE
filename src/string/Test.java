package string;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Harekrishna";
        s.branch = "Information Technology";
        s.year = 2;

//        System.out.println(s.name);

        String x = "Hare";
        String a = new String("Hare");
        String b = new String("Hare");
        String c = new String(x);

//        System.out.println(c == a);

    }
}
