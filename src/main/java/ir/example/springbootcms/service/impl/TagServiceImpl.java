package ir.example.springbootcms.service.impl;

import ir.example.springbootcms.base.exception.BadRequestRuntimeException;
import ir.example.springbootcms.base.service.impl.BaseServiceImpl;
import ir.example.springbootcms.entity.Tag;
import ir.example.springbootcms.repository.TagRepository;
import ir.example.springbootcms.service.TagService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class TagServiceImpl extends BaseServiceImpl<Tag, Long, TagRepository> implements TagService {

    public TagServiceImpl(TagRepository repository) {
        super(repository);
    }

    @Override
    public Tag save(Tag tag) {

        if (tag.getTitle() == null || tag.getTitle().isEmpty()) {
            throw new BadRequestRuntimeException("title is empty");
        }

        if (tag.getId() == null) {
            if (repository.existsByTitle(tag.getTitle())) {
                throw new BadRequestRuntimeException("duplicate tag title");
            }
        } else {
            if (repository.existsByTitleAndIdIsNot(tag.getTitle(), tag.getId())) {
                throw new BadRequestRuntimeException("duplicate tag title");
            }
        }
        return super.save(tag);
    }
}