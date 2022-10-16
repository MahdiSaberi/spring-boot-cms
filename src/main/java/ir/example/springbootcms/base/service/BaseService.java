package ir.example.springbootcms.base.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface BaseService<E,ID> {

    Optional<E> findById(ID id);

    List<E> findAll();

    E save(E e);

    long count();

    void deleteById(ID id);

    Page findAll(Pageable pageable);
}
