package ir.example.springbootcms.service.base;

import ir.example.springbootcms.base.service.BaseService;
import ir.example.springbootcms.entity.User;

public interface BaseUserService<T extends User> extends BaseService<T,Long> {

    T getByUsername(String username);

    T getByUsernameAndPassword(String username, String password);

    <P> P getByUsername(String username, Class<P> pClass);
}
