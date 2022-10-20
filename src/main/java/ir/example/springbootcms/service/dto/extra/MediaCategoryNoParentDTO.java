package ir.example.springbootcms.service.dto.extra;

import ir.example.springbootcms.base.dto.BaseDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MediaCategoryNoParentDTO extends BaseDTO<Long> {

    private String title;

    private Set<MediaCategoryNoParentDTO> childrenCategories = new HashSet<>();
}