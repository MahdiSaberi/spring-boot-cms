package ir.example.springbootcms.service.dto;

import ir.example.springbootcms.base.dto.BaseDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO extends BaseDTO<Long> {
    private String firstName;
    private String lastName;
    private String username;
    private String password;
}
