package ir.example.springbootcms.repository;

import ir.example.springbootcms.base.repository.BaseEntityRepository;
import ir.example.springbootcms.entity.User;
import ir.example.springbootcms.repository.base.BaseUserRepository;

import java.util.List;

public interface UserRepository extends BaseUserRepository<User> {
    @Override
    User getByUsername(String username);

    @Override
    User getByUsernameAndPassword(String username, String password);
}
