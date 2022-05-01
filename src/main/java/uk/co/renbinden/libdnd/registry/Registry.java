package uk.co.renbinden.libdnd.registry;

import java.util.List;
import java.util.function.Predicate;

public interface Registry<T> {

    T getByIdentifier(String identifier);
    List<T> getAllMatching(Predicate<T> predicate);
}
