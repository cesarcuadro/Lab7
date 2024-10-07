public class Triple<A, B, C> {
    private A first;
    private B second;
    private C third;

    public Triple(A teamName, B win, C loss) {
        first = teamName;
        second = win;
        third = loss;
    }

    public A getFirst() {
        return first;
    }

    public B getSecond() {
        return second;
    }

    public C getThird() {
        return third;
    }
}
