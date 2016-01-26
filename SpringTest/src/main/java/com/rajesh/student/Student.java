/**
 * 
 */
package com.rajesh.student;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author rajesh
 *
 */
@Entity
public class Student implements Serializable{

	private static final long serialVersionUID = -5370971311005432483L;
	
	@Id
	private long id;

	@Column
	private String name;

	@Column
	private String address;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
