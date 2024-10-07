public class Pair<A,B> {
    private A first;
    private B second;

    public Pair (A teamName, B winPercentage) {
        first = teamName;
        second = winPercentage;
    }

    public A getFirst() {
        return first;
    }

    public B getSecond() {
        return second;
    }
}
