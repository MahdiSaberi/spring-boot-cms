package ir.example.springbootcms.service;

import ir.example.springbootcms.base.service.BaseService;
import ir.example.springbootcms.entity.User;
import ir.example.springbootcms.service.dto.UserSearch;

import java.util.List;
import java.util.Optional;

public interface UserService extends BaseService<User,Long> {
    User getByUsername(String username);

    List<User> findAllByAdvanceSearch(UserSearch userSearch);

    List<User> findAll();

    void printUser();

    Optional<User> findById(Long id);
}
