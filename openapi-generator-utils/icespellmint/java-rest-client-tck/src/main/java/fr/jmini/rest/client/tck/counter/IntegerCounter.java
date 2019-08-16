package fr.jmini.rest.client.tck.counter;

public class IntegerCounter implements Counter<Integer> {

    private int counter;

    public IntegerCounter(int startAt) {
        this.counter = startAt - 1;
    }

    @Override
    public Integer nextValue() {
        counter = counter + 1;
        return counter;
    }

}
