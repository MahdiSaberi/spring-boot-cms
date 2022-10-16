package ir.example.springbootcms.base.service.impl;

import ir.example.springbootcms.base.repository.BaseEntityRepository;
import ir.example.springbootcms.base.service.BaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Transactional(readOnly = true)
public class BaseServiceImpl<E,ID,R extends BaseEntityRepository<E, ID>> implements BaseService<E,ID> {

    protected final R repository;

    @Override
    public List<E> findAll() {
        return repository.findAll();
    }

    @Override
    @Transactional
    public Optional<E> findById(ID id) {
        return repository.findById(id);
    }

    @Override
    @Transactional
    public E save(E e) {
        return repository.save(e);
    }

    @Override
    @Transactional
    public long count() {
        return repository.count();
    }

    @Override
    @Transactional
    public void deleteById(ID id) {
        repository.deleteById(id);
    }

    @Override
    @Transactional
    public Page findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

}
