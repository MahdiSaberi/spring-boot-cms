package ir.example.springbootcms.repository;

import ir.example.springbootcms.entity.Admin;
import ir.example.springbootcms.entity.User;
import ir.example.springbootcms.repository.base.BaseUserRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends BaseUserRepository<Admin> {
    @Override
    Admin getByUsername(String username);

    @Override
    Admin getByUsernameAndPassword(String username, String password);
}
