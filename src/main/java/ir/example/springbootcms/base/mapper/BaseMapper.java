package ir.example.springbootcms.base.mapper;

import ir.example.springbootcms.base.dto.BaseDTO;
import ir.example.springbootcms.base.entity.BaseEntity;

import java.io.Serializable;
import java.util.List;

public interface BaseMapper <E extends BaseEntity<ID>, D extends BaseDTO<ID>, ID extends Serializable>{

    E convertDTOToEntity(D d);

    D convertEntityToDTO(E e);

    List<E> convertDTOListToEntityList(List<D> dList);

    List<D> convertEntityListToDTOList(List<E> eList);
}
