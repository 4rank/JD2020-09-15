package by.it.kolesnikov.jd01_08;

abstract class Var implements Operation{

    @Override
    public Var add(Var other) {
        //TODO create exception
        System.out.printf("Operation%s+%s not work\n", this, other);
        return null;
    }

    @Override
    public Var sub(Var other) {
        System.out.printf("Operation%s-%s not work\n", this, other);
        return null;
    }

    @Override
    public Var mul(Var other) {
        System.out.printf("Operation%s*%s not work\n", this, other);
        return null;
    }

    @Override
    public Var div(Var other) {
        System.out.printf("Operation%s/%s not work\n", this, other);
        return null;
    }

    @Override
    public String toString() {
        return "abstract Var";
    }
}
