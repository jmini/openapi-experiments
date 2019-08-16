package fr.jmini.rest.client.tck.counter;

public class StringCounter implements Counter<String> {

    private String prefix;
    private IntegerCounter counter;

    public StringCounter(String prefix, int startAt) {
        this.prefix = prefix;
        this.counter = new IntegerCounter(startAt);
    }

    @Override
    public String nextValue() {
        return prefix + counter.nextValue();
    }
}
