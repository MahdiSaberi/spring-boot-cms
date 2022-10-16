package ir.example.springbootcms.base.resource;

import ir.example.springbootcms.base.dto.BaseDTO;
import ir.example.springbootcms.base.entity.BaseEntity;
import ir.example.springbootcms.base.exception.BadRequestRuntimeException;
import ir.example.springbootcms.base.mapper.BaseMapper;
import ir.example.springbootcms.base.service.BaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.expression.ExpressionException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.Optional;

@RequiredArgsConstructor
public class BaseResource<E extends BaseEntity<ID>,
        D extends BaseDTO<ID>,
        ID extends Serializable,
        S extends BaseService<E,ID>,
        M extends BaseMapper<E,D,ID>> {

    protected final S baseService;

    protected final M baseMapper;

    @GetMapping
    public ResponseEntity<D> getById(@RequestParam ID id){
        Optional<E> optional = baseService.findById(id);
        return ResponseEntity.ok(baseMapper.convertEntityToDTO(optional.orElseThrow(() -> new BadRequestRuntimeException("Not found!"))));
    }

    @PostMapping
    public ResponseEntity<D> save(@RequestBody D d){

        if(d.getId() != null){
                throw new BadRequestRuntimeException("id must be null");
        }

        E e = baseService.save(baseMapper.convertDTOToEntity(d));

         return ResponseEntity.ok(baseMapper.convertEntityToDTO(e));
    }

    @PutMapping
    public ResponseEntity<D> update(@RequestBody D d){

        if(d.getId() == null) {
            throw new BadRequestRuntimeException("id must not be null");
        }

        E e = baseService.save(baseMapper.convertDTOToEntity(d));

        return ResponseEntity.ok(baseMapper.convertEntityToDTO(e));
    }

    @GetMapping("/pageable")
    public ResponseEntity<Page<D>> getPage(Pageable pageable) {
        Page<E> page = baseService.findAll(pageable);
        return ResponseEntity.ok(
                page.map(baseMapper::convertEntityToDTO)
        );
    }
}
