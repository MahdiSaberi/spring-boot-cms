package ir.example.springbootcms.service;

import ir.example.springbootcms.base.service.BaseService;
import ir.example.springbootcms.entity.MediaCategory;
import ir.example.springbootcms.service.dto.extra.MediaCategoryOperationDTO;
import ir.example.springbootcms.service.dto.extra.MediaCategoryUpdateDTO;

public interface MediaCategoryService extends BaseService<MediaCategory, Long> {

    MediaCategory save(MediaCategoryOperationDTO categoryDTO);

    MediaCategory update(MediaCategoryUpdateDTO categoryDTO);
}