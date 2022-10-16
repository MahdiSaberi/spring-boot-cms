package ir.example.springbootcms.mapper;

import ir.example.springbootcms.base.mapper.BaseMapper;
import ir.example.springbootcms.entity.User;
import ir.example.springbootcms.service.dto.UserDTO;
import ir.example.springbootcms.service.dto.UserSearch;
import org.mapstruct.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User, UserDTO,Long> {

}
