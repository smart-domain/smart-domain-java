package org.domain.smart.core.domain.concept;

import java.util.Optional;

public interface HasMany<ID, E extends Entity<ID, ?>> {
    Many<E> findAll();

    Optional<E> findByIdentity(ID identifier);
}
