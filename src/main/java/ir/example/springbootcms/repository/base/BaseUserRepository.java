package ir.example.springbootcms.repository.base;

import ir.example.springbootcms.base.repository.BaseEntityRepository;
import ir.example.springbootcms.entity.User;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface BaseUserRepository<T extends User> extends BaseEntityRepository<T,Long> {
    T getByUsername(String username);
    T getByUsernameAndPassword(String username, String password);
}
