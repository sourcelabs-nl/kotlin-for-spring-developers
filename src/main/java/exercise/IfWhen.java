package exercise;

public class IfWhen {

    public static boolean isString(Object o) {
        return o instanceof String ? true : false;
    }

    public static boolean yesNoToBoolean(String s) {
        if ("yes".equals(s))  return true;
        else if ("no".equals(s)) return false;
        else throw new RuntimeException("Unsupported value: " + s);
    }

    public static void main(String[] args) {
        System.out.println(isString(Integer.MAX_VALUE));
        System.out.println(yesNoToBoolean("yes"));
    }
}
