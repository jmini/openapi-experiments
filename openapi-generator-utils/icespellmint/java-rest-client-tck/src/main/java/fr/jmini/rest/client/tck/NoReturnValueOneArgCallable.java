package fr.jmini.rest.client.tck;

@FunctionalInterface
public interface NoReturnValueOneArgCallable<V> {
    void call(V value) throws Exception;
}
