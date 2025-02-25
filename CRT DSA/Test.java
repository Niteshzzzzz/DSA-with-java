class A {
    double principal, rate, time;

    A(double p, double r, double t) {
        this.principal = p;
        this.rate = r;
        this.time = t;
    }

    double calculateSimpleInterest() {
        return (principal * rate * time) / 100;
    }
}

class B extends A {
    B(double p, double r, double t) {
        super(p, r, t);
    }

    double calculateCompoundInterest() {
        return principal * Math.pow((1 + rate / 100), time) - principal;
    }
}

class C extends B {
    C(double p, double r, double t) {
        super(p, r, t);
    }

    void display() {
        double si = calculateSimpleInterest();
        double ci = calculateCompoundInterest();
        System.out.println("Simple Interest: " + si);
        System.out.println("Compound Interest: " + ci);
    }
}

public class Test {

    public static void main(String[] args) {
        C obj = new C(10000, 5, 2); // Example: Principal=10000, Rate=5%, Time=2 years
        obj.display();
    }
}
