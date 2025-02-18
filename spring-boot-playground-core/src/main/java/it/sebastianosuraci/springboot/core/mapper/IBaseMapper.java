package it.sebastianosuraci.springboot.core.mapper;

import java.io.Serializable;
import java.util.List;

import it.sebastianosuraci.springboot.core.domain.BaseEntity;
import it.sebastianosuraci.springboot.core.dto.BaseDTO;

public interface IBaseMapper<T extends BaseEntity<K>, D extends BaseDTO<K>, K extends Serializable> {
    D entityToDto(T entity);

	List<D> entityToDtoList(List<T> entity);

	T dtoToEntity(D dto);
}
