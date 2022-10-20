package ir.example.springbootcms.service.dto;

import ir.example.springbootcms.base.dto.BaseDTO;
import ir.example.springbootcms.service.dto.extra.MediaCategoryNoChildDTO;
import ir.example.springbootcms.service.dto.extra.MediaCategoryNoParentDTO;
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
public class MediaCategoryDTO extends BaseDTO<Long> {

    private String title;

    private MediaCategoryNoChildDTO parent;

    private Set<MediaCategoryNoParentDTO> childrenCategories = new HashSet<>();
}