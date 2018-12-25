public class Main {

    public static void main(String[] args) {
        Rational r1 = new Rational(3, 2);
        Rational r2 = new Rational(5, 4);

        System.out.println(r1.add(r2).toString());
        System.out.println(r1.mul(r2).toString());
        System.out.println(r1.sub(r2).toString());
        System.out.println(r1.div(r2).toString());
        System.out.println(r1.equals(r2));
        System.out.println(r1.compareTo(r2));
    }
}
