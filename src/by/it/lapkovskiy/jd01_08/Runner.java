package by.it.lapkovskiy.jd01_08;

public class Runner {
    public static void main(String[] args) {
        Var s = new Scalar(3.0);
        Var v = new Vector(new double[]{1,2,3});
        Var m = new Matrix("{{1,2,3},{4,5,6},{7,8,9}}");
        System.out.println(s.add(s));
    }

}
