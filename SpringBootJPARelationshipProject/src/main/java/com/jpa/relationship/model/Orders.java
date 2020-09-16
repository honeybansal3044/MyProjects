package com.jpa.relationship.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Orders {

	@Id
	@GeneratedValue
	@Column(name = "id", nullable = false)
	private Long id;

	@OneToMany(mappedBy = "orders")
	private List<Items> items = new ArrayList<Items>();

}
