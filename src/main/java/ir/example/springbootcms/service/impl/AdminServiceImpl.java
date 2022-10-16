package ir.example.springbootcms.service.impl;

import ir.example.springbootcms.entity.Admin;
import ir.example.springbootcms.repository.AdminRepository;
import ir.example.springbootcms.service.AdminService;
import ir.example.springbootcms.service.base.impl.BaseUserServiceImpl;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class AdminServiceImpl extends BaseUserServiceImpl<Admin, AdminRepository> implements AdminService {
    public AdminServiceImpl(AdminRepository repository) {
        super(repository);
    }
}
