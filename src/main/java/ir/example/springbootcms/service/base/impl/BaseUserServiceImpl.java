package ir.example.springbootcms.service.base.impl;

import ir.example.springbootcms.base.service.impl.BaseServiceImpl;
import ir.example.springbootcms.entity.User;
import ir.example.springbootcms.repository.base.BaseUserRepository;
import ir.example.springbootcms.service.base.BaseUserService;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
public class BaseUserServiceImpl<T extends User,R extends BaseUserRepository<T>>
extends BaseServiceImpl<T,Long,R> implements BaseUserService<T> {

    public BaseUserServiceImpl(R repository) {
        super(repository);
    }

    @Override
    public T getByUsername(String username) {
        return repository.getByUsername(username);
    }

    @Override
    public T getByUsernameAndPassword(String username, String password) {
        return repository.getByUsernameAndPassword(username,password);
    }

    @Override
    public <P> P getByUsername(String username, Class<P> pClass) {
        return repository.getByUsername(username,pClass);
    }
}
