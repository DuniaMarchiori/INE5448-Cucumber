package br.ufsc.serviceimpl;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import br.ufsc.entity.BaseEntity;
import br.ufsc.service.BaseEntityService;

public abstract class BaseEntityServiceImpl<T extends BaseEntity> implements BaseEntityService<T>{
	public Map<Long, T> read(String dataFile){
		 Map<Long, T>  mapEntity = null;
		try {
			FileInputStream arquivo = new FileInputStream(dataFile);
			ObjectInputStream objLeitura = new ObjectInputStream(arquivo);
			mapEntity = (HashMap<Long, T>) objLeitura.readObject();
			objLeitura.close();
		} catch (IOException | ClassNotFoundException e) {
			mapEntity = new HashMap<Long, T>();
		}
		return mapEntity;
	}
	
	private void save(Map<Long, T> mapEntity, String dataFile){
		try {
			FileOutputStream arquivo = new FileOutputStream(dataFile);
			ObjectOutputStream objGravacao = new ObjectOutputStream(arquivo);
			objGravacao.writeObject(mapEntity);
			objGravacao.close();
		} catch (IOException e) {
			System.out.println("Erro ao salvar arquivo " +  dataFile);
			e.printStackTrace();
		}
	}
	
	public T salvar(T object) throws Exception {
		Long id = null;
		Map<Long, T> mapEntity = read(object.getClass().getName());
		if (mapEntity == null) {
			mapEntity = new HashMap<Long, T>();
		}
		
		if(object.getId() == null) {
			id = (long)mapEntity.size()+1;
			while (mapEntity.containsKey(id)) {
				id = id + 1;
			}
			mapEntity.put(id, null);
			object.setId(id);	
		}
		mapEntity.put(object.getId(), object);
		this.save(mapEntity, object.getClass().getName());
		
		return object;
	}
	
	public Boolean excluir(T object) {
		Map<Long, T> mapEntity = read(object.getClass().getName());
		if (mapEntity.remove(object.getId()) != null) {
			this.save(mapEntity, object.getClass().getName());
			return true;
		}
		return false;
	}
	
	public abstract Collection<T> getList();
	public abstract T getById(Long id);
}
