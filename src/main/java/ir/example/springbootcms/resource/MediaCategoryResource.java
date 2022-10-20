package ir.example.springbootcms.resource;

import ir.example.springbootcms.base.exception.EntityNotFoundRuntimeException;
import ir.example.springbootcms.entity.MediaCategory;
import ir.example.springbootcms.mapper.MediaCategoryMapper;
import ir.example.springbootcms.service.MediaCategoryService;
import ir.example.springbootcms.service.dto.MediaCategoryDTO;
import ir.example.springbootcms.service.dto.extra.MediaCategoryOperationDTO;
import ir.example.springbootcms.service.dto.extra.MediaCategoryUpdateDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping("/api/media-category")
@RequiredArgsConstructor
public class MediaCategoryResource {

    private final MediaCategoryService mediaCategoryService;

    private final MediaCategoryMapper mediaCategoryMapper;

    @GetMapping
    public ResponseEntity<MediaCategoryDTO> getById(@RequestParam Long id) {
        Optional<MediaCategory> optionalMediaCategory = mediaCategoryService.findById(id);
        return ResponseEntity.ok(
                mediaCategoryMapper.convertEntityToDTO(
                        optionalMediaCategory.orElseThrow(
                                () -> new EntityNotFoundRuntimeException("category with id : " + id + ", not found")
                        )
                )
        );
    }

    //    سرویس ایجاد دسته بندی
//    نیازمندی‌ها: بررسی یونیک بودن تایتل دسته بندی و مشخص کردن پدر دسته‌بندی در صورت نیاز
    @PostMapping
    public ResponseEntity<MediaCategoryDTO> save(@RequestBody @Valid MediaCategoryOperationDTO categoryDTO) {

        MediaCategory mediaCategory = mediaCategoryService.save(categoryDTO);
        return ResponseEntity.ok(
                mediaCategoryMapper.convertEntityToDTO(
                        mediaCategory
                )
        );

    }

    @PutMapping
    public ResponseEntity<MediaCategoryDTO> update(@RequestBody @Valid MediaCategoryUpdateDTO categoryDTO) {

        MediaCategory mediaCategory = mediaCategoryService.update(categoryDTO);
        return ResponseEntity.ok(
                mediaCategoryMapper.convertEntityToDTO(
                        mediaCategory
                )
        );

    }
}