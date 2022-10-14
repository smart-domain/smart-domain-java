package org.domain.smart.core.domain.concept;

public interface HasOne<E extends Entity<?, ?>> {
    E get();
}
