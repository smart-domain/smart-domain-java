package org.domain.smart.core.domain.concept;

public interface Entity<Identity, Description> {
    Identity getIdentity();

    Description getDescription();
}
