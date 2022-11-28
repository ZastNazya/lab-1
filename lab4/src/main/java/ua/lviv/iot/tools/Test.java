package ua.lviv.iot.tools;

public class Test {

    private int a;
    private int b;
    public static String c = "blabla";
    public static String d = new String("blabla");
    public String f;

    public Test(int a, int b, String f) {
        this.a = a;
        this.b = b;
        this.f = f;
    }

    public Test(int a, int b) {
        this(a,b,"ertyu");
    }

    {
        System.out.println(c == d );
        System.out.println(c.equals(d));
    }

}
