
public class RationalMatrix<Rational extends Number> extends GenericMatrix<Rational> {
    @Override
    protected Rational add(Rational o1, Rational o2) {
        return r1.add(r2);
    }

    @Override
    protected Rational multiply(Rational o1, Rational o2) {
        return r1.multiply(r2);
    }

    @Override
    protected Rational zero() {
        return new Rational(0, 1);
    }
}
