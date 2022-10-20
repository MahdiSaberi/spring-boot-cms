package ir.example.springbootcms.repository;

import ir.example.springbootcms.base.repository.BaseEntityRepository;
import ir.example.springbootcms.entity.MediaCategory;

public interface MediaCategoryRepository extends BaseEntityRepository<MediaCategory, Long> {

    boolean existsByTitle(String title);
}