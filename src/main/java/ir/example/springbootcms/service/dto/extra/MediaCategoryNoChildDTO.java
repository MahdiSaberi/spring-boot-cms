package ir.example.springbootcms.service.dto.extra;


import ir.example.springbootcms.base.dto.BaseDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MediaCategoryNoChildDTO extends BaseDTO<Long> {

    private String title;

    private MediaCategoryNoChildDTO parent;

}
