package ir.example.springbootcms.repository;

import ir.example.springbootcms.base.repository.BaseEntityRepository;
import ir.example.springbootcms.entity.Tag;

public interface TagRepository extends BaseEntityRepository<Tag, Long> {

    boolean existsByTitle(String title);

    boolean existsByTitleAndIdIsNot(String title, Long id);

}