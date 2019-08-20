package fr.jmini.rest.client.tck;

@FunctionalInterface
public interface NoReturnValueCallable {
    void call() throws Exception;
}
