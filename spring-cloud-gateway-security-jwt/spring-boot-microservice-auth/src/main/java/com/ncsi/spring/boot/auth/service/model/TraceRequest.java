package com.ncsi.spring.boot.auth.service.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 *TraceRequest
 * 
 */

@Entity
@Table
public class TraceRequest {
	@Id
	//defining id as column name
	@Column
	private int id;
	@Column
    private String urlName;	

	/**
	 * @param cid
	 * @param urlName
	 */
	public TraceRequest(int id, String urlName) {
		this.id= id;
		this.urlName= urlName;
		
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}



	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the urlName
	 */
	public String getUrlName() {
		return urlName;
	}
	/**
	 * @param urlName the urlName to set
	 */
	public void setUrlName(String urlName) {
		this.urlName = urlName;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return Objects.hash(id, urlName);
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TraceRequest other = (TraceRequest) obj;
		return id == other.id && Objects.equals(urlName, other.urlName);
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ExchangeRates [id=" + id + ", urlName=" + urlName + "]";
	}

}
