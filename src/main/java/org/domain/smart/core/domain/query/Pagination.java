package org.domain.smart.core.domain.query;

import org.domain.smart.core.domain.concept.Entity;
import org.domain.smart.core.domain.concept.Many;

public class Pagination<E extends Entity<?, ?>> {
    private int pageSize;
    private Many<E> many;
    private final int total;

    public Pagination(int pageSize, Many<E> many) {
        this.pageSize = pageSize;
        this.many = many;
        this.total = many.size();
    }

    public Many<E> page(int pageNum) {
        Many<E> current = many.subCollection(pageNum * pageSize, Math.min(total, (pageNum + 1) * pageSize));
        return current;
    }

    public boolean isPageExist(int pageNum) {
        return pageNum >= 0 && pageNum * pageSize <= total;
    }
}
