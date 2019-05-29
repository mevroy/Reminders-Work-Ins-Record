/**
 * 
 */
package com.yourpackagename.yourwebproject.model.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import com.yourpackagename.framework.data.JpaEntity;

/**
 * @author dsouzam5
 *
 */
@Entity
@Table(name = "group_work_instruction_record")
public class GroupWorkInstructionRecord extends JpaEntity<Long> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6008784753076695261L;

	@Column(unique = true)
	private String jobNumber;

	@Column(unique = true)
	private String orderNumber;

	@Column
	private String client;

	@Column
	private Date date;

	@Column(unique = true)
	private String quoteNumber;

	@Column
	private String material;

	@Column
	private String surfacePreparation;

	@Column
	private String lighting;

	@Column
	private boolean power;

	@Column
	private boolean suitableAccess;

	@Column
	private String ewpAccessEquipment;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "serialNumber")
	private GroupMember groupMember;
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "userId")
	private User user;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@LazyCollection(LazyCollectionOption.FALSE)
	@JoinColumn(name = "groupId")
	private Groups group;
	
	@Column(columnDefinition = "TEXT")
	private String additionalRequirements;

	
	@OneToMany(cascade = CascadeType.ALL, targetEntity = GroupWorkItems.class)
	@LazyCollection(LazyCollectionOption.FALSE)
	@JoinColumn(name = "groupWorkInstructionRecordId", referencedColumnName = "id")
	private List<GroupWorkItems> groupWorkItems;
	
	/**
	 * @return the material
	 */
	public String getMaterial() {
		return material;
	}

	/**
	 * @param material
	 *            the material to set
	 */
	public void setMaterial(String material) {
		this.material = material;
	}

	/**
	 * @return the surfacePreparation
	 */
	public String getSurfacePreparation() {
		return surfacePreparation;
	}

	/**
	 * @param surfacePreparation
	 *            the surfacePreparation to set
	 */
	public void setSurfacePreparation(String surfacePreparation) {
		this.surfacePreparation = surfacePreparation;
	}

	/**
	 * @return the lighting
	 */
	public String getLighting() {
		return lighting;
	}

	/**
	 * @param lighting
	 *            the lighting to set
	 */
	public void setLighting(String lighting) {
		this.lighting = lighting;
	}

	/**
	 * @return the power
	 */
	public boolean isPower() {
		return power;
	}

	/**
	 * @param power
	 *            the power to set
	 */
	public void setPower(boolean power) {
		this.power = power;
	}

	/**
	 * @return the suitableAccess
	 */
	public boolean isSuitableAccess() {
		return suitableAccess;
	}

	/**
	 * @param suitableAccess
	 *            the suitableAccess to set
	 */
	public void setSuitableAccess(boolean suitableAccess) {
		this.suitableAccess = suitableAccess;
	}

	/**
	 * @return the ewpAccessEquipment
	 */
	public String getEwpAccessEquipment() {
		return ewpAccessEquipment;
	}

	/**
	 * @param ewpAccessEquipment
	 *            the ewpAccessEquipment to set
	 */
	public void setEwpAccessEquipment(String ewpAccessEquipment) {
		this.ewpAccessEquipment = ewpAccessEquipment;
	}

	/**
	 * @return the additionalRequirements
	 */
	public String getAdditionalRequirements() {
		return additionalRequirements;
	}

	/**
	 * @param additionalRequirements
	 *            the additionalRequirements to set
	 */
	public void setAdditionalRequirements(String additionalRequirements) {
		this.additionalRequirements = additionalRequirements;
	}


	/**
	 * @return the jobNumber
	 */
	public String getJobNumber() {
		return jobNumber;
	}

	/**
	 * @param jobNumber
	 *            the jobNumber to set
	 */
	public void setJobNumber(String jobNumber) {
		this.jobNumber = jobNumber;
	}

	/**
	 * @return the orderNumber
	 */
	public String getOrderNumber() {
		return orderNumber;
	}

	/**
	 * @param orderNumber
	 *            the orderNumber to set
	 */
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	/**
	 * @return the client
	 */
	public String getClient() {
		return client;
	}

	/**
	 * @param client
	 *            the client to set
	 */
	public void setClient(String client) {
		this.client = client;
	}

	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date
	 *            the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * @return the quoteNumber
	 */
	public String getQuoteNumber() {
		return quoteNumber;
	}

	/**
	 * @param quoteNumber
	 *            the quoteNumber to set
	 */
	public void setQuoteNumber(String quoteNumber) {
		this.quoteNumber = quoteNumber;
	}

	/**
	 * @return the groupWorkItems
	 */
	public List<GroupWorkItems> getGroupWorkItems() {
		return groupWorkItems;
	}

	/**
	 * @param groupWorkItems
	 *            the groupWorkItems to set
	 */
	public void setGroupWorkItems(List<GroupWorkItems> groupWorkItems) {
		this.groupWorkItems = groupWorkItems;
	}

	/**
	 * @return the groupMember
	 */
	public GroupMember getGroupMember() {
		return groupMember;
	}

	/**
	 * @param groupMember the groupMember to set
	 */
	public void setGroupMember(GroupMember groupMember) {
		this.groupMember = groupMember;
	}

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * @return the group
	 */
	public Groups getGroup() {
		return group;
	}

	/**
	 * @param group the group to set
	 */
	public void setGroup(Groups group) {
		this.group = group;
	}


}
