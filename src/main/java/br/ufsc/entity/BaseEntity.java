package br.ufsc.entity;

import java.io.Serializable;

public abstract class BaseEntity implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3751435314798942136L;
	private Long id = null;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
