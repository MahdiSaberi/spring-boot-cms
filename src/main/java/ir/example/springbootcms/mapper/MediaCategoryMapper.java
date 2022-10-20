package ir.example.springbootcms.mapper;

import ir.example.springbootcms.base.mapper.BaseMapper;
import ir.example.springbootcms.entity.MediaCategory;
import ir.example.springbootcms.service.dto.MediaCategoryDTO;
import org.mapstruct.Mapper;

@Mapper
public interface MediaCategoryMapper extends BaseMapper<MediaCategory, MediaCategoryDTO, Long> {
}