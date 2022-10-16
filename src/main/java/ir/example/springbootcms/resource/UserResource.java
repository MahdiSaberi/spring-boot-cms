package ir.example.springbootcms.resource;

import ir.example.springbootcms.base.resource.BaseResource;
import ir.example.springbootcms.entity.User;
import ir.example.springbootcms.mapper.UserMapper;
import ir.example.springbootcms.service.UserService;
import ir.example.springbootcms.service.dto.UserDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserResource extends BaseResource<User, UserDTO,Long,UserService,UserMapper> {

    public UserResource(UserService baseService, UserMapper baseMapper) {
        super(baseService, baseMapper);
    }

}
