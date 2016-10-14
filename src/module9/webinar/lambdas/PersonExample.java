package module9.webinar.lambdas;

@FunctionalInterface
public interface PersonExample<T, F, P> {
    P create(T t, F f);
}
