package com.iti.entity.stdentarea;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.iti.util.HstoreUserType;

@Entity
@Table(name = "dummyTable")
public class DummyTable {
	
	@Id
	@SequenceGenerator(name = "mySeqGen", sequenceName = "mySeq", initialValue = 5, allocationSize = 100)
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	private String name;
	private String designation;
	@Column(columnDefinition = "hstore")
	@Convert(converter = HstoreUserType.class)
	private Map<String, String> fields = new HashMap<>();
	public DummyTable() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DummyTable(int id, String name, String designation, Map<String, String> fields) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.fields = fields;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Map<String, String> getFields() {
		return fields;
	}
	public void setFields(Map<String, String> fields) {
		this.fields = fields;
	}
	@Override
	public String toString() {
		return "DummyTable [id=" + id + ", name=" + name + ", designation=" + designation + ", fields=" + fields + "]";
	}
	
	
	

}
