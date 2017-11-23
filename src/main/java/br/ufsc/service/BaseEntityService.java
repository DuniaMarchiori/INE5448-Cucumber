package br.ufsc.service;

import java.util.Collection;
import java.util.Map;

import br.ufsc.entity.BaseEntity;

public interface BaseEntityService <T extends BaseEntity> {
	public T salvar(T object) throws Exception;
	public Boolean excluir(T object);
	public abstract T getById(Long id);
	public Map<Long, T> read(String dataFile);
	public Collection<T> getList();
}
