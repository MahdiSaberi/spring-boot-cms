package ir.example.springbootcms.service.impl;

import ir.example.springbootcms.base.exception.BadRequestRuntimeException;
import ir.example.springbootcms.base.exception.EntityNotFoundRuntimeException;
import ir.example.springbootcms.base.service.impl.BaseServiceImpl;
import ir.example.springbootcms.entity.MediaCategory;
import ir.example.springbootcms.repository.MediaCategoryRepository;
import ir.example.springbootcms.service.MediaCategoryService;
import ir.example.springbootcms.service.dto.extra.MediaCategoryOperationDTO;
import ir.example.springbootcms.service.dto.extra.MediaCategoryUpdateDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class MediaCategoryServiceImpl extends BaseServiceImpl<MediaCategory, Long, MediaCategoryRepository>
        implements MediaCategoryService {

    public MediaCategoryServiceImpl(MediaCategoryRepository repository) {
        super(repository);
    }

    @Override
    @Transactional
    public MediaCategory save(MediaCategoryOperationDTO categoryDTO) {
        if (repository.existsByTitle(categoryDTO.getTitle())) {
            throw new BadRequestRuntimeException("duplicate category title");
        }

        MediaCategory mediaCategory = new MediaCategory(categoryDTO.getTitle());

        if (categoryDTO.getParentId() != null) {
            Optional<MediaCategory> optionalParent = repository.findById(categoryDTO.getParentId());
            mediaCategory.setParent(
                    optionalParent.orElseThrow(
                            () -> new EntityNotFoundRuntimeException(
                                    "parent category not found"
                            )
                    )
            );
        }

        return repository.save(mediaCategory);
    }

    @Override
    @Transactional
    public MediaCategory update(MediaCategoryUpdateDTO categoryDTO) {
        MediaCategory mediaCategory = repository.findById(categoryDTO.getId())
                .orElseThrow(
                        () -> new EntityNotFoundRuntimeException("category not found")
                );
        if (!mediaCategory.getTitle().equals(categoryDTO.getTitle())) {
            if (repository.existsByTitle(categoryDTO.getTitle())) {
                throw new BadRequestRuntimeException("duplicate category title");
            }
        }

        mediaCategory.setTitle(categoryDTO.getTitle());

        if (categoryDTO.getParentId() != null) {

            Optional<MediaCategory> optionalParent = repository.findById(categoryDTO.getParentId());
            mediaCategory.setParent(
                    optionalParent.orElseThrow(
                            () -> new EntityNotFoundRuntimeException(
                                    "parent category not found"
                            )
                    )
            );

        } else {
            mediaCategory.setParent(null);
        }

        return repository.save(mediaCategory);
    }
}