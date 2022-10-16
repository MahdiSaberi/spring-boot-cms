package ir.example.springbootcms.repository;

import ir.example.springbootcms.entity.Customer;
import ir.example.springbootcms.repository.base.BaseUserRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends BaseUserRepository<Customer> {
    @Override
    Customer getByUsername(String username);

    @Override
    Customer getByUsernameAndPassword(String username, String password);
}
