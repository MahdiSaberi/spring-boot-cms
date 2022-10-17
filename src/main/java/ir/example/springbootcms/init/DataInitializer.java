package ir.example.springbootcms.init;

import ir.example.springbootcms.entity.Admin;
import ir.example.springbootcms.enumeration.Gender;
import ir.example.springbootcms.enumeration.UserType;
import ir.example.springbootcms.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@RequiredArgsConstructor
public class DataInitializer {

    private final AdminService adminService;

    @PostConstruct
    public void initData(){
        initAdmin();
    }

    public void initAdmin(){

        if(adminService.count() == 0) {

            Admin admin = new Admin();

            admin.setFirstName("Mahdi");
            admin.setLastName("Saberi");
            admin.setUsername("admin");
            admin.setPassword("admin");
            admin.setGender(Gender.MALE);
            admin.setUserType(UserType.ADMIN.name());
            adminService.save(admin);
        }
    }
}
