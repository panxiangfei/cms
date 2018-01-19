package com.icare.cms.systemconfig.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

/**
 * TUser entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_user")
public class TUser implements java.io.Serializable {

	// Fields
	private static final long serialVersionUID = -40394044026470406L;
	private Long id;
	private String bizId;
	private String username;
	private String password;
	private String usertype;
	private String msn;
	private Integer ctlLevel;
	private Integer loginNum;
	private String localUser;
	private String cmuId;
	private String state;
	private String memo;
	private String platformid;
	private String creator;
	private Date createdate;
	private Date lastLogindate;
	private Long groupId;
	private String lastLoginIp;
	private String isUpdatePwd;

	@Column(name = "lastloginip",length = 16)
	public String getLastLoginIp() {
		return lastLoginIp;
	}

	public void setLastLoginIp(String lastLoginIp) {
		this.lastLoginIp = lastLoginIp;
	}

	// Constructors
	@Column(name = "groupid",length = 20)
	public Long getGroupId() {
		return groupId;
	}

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}

	/** default constructor */
	public TUser() {
	}

	/** minimal constructor */
	public TUser(Date createDate, Date lastLoginDate) {
		this.createdate = createDate;
		this.lastLogindate = lastLoginDate;
	}

	/** full constructor */
	public TUser(String bizId, String username, String password, String usertype,
			String msn, Integer ctlLevel, Integer loginNum, String localUser,
			String cmuId, String state, String memo, String platformid,
			String creator, Date createDate, Date lastLoginDate) {
		this.bizId = bizId;
		this.username = username;
		this.password = password;
		this.usertype = usertype;
		this.msn = msn;
		this.ctlLevel = ctlLevel;
		this.loginNum = loginNum;
		this.localUser = localUser;
		this.cmuId = cmuId;
		this.state = state;
		this.memo = memo;
		this.platformid = platformid;
		this.creator = creator;
		this.createdate = createDate;
		this.lastLogindate = lastLoginDate;
	}

	// Property accessors
	@GenericGenerator(name = "generator", strategy = "identity")
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "id", unique = true, nullable = false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "bizid", length = 32)
	public String getBizId() {
		return this.bizId;
	}

	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	@Column(name = "username", length = 32)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "password", length = 64)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "usertype", length = 32)
	public String getUsertype() {
		return this.usertype;
	}

	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}

	@Column(name = "msn", length = 32)
	public String getMsn() {
		return this.msn;
	}

	public void setMsn(String msn) {
		this.msn = msn;
	}

	@Column(name = "ctllevel")
	public Integer getCtlLevel() {
		return this.ctlLevel;
	}

	public void setCtlLevel(Integer ctlLevel) {
		this.ctlLevel = ctlLevel;
	}

	@Column(name = "loginnum")
	public Integer getLoginNum() {
		return this.loginNum;
	}

	public void setLoginNum(Integer loginNum) {
		this.loginNum = loginNum;
	}

	@Column(name = "localuser", length = 1)
	public String getLocalUser() {
		return this.localUser;
	}

	public void setLocalUser(String localUser) {
		this.localUser = localUser;
	}

	@Column(name = "cmuid", length = 32)
	public String getCmuId() {
		return this.cmuId;
	}

	public void setCmuId(String cmuId) {
		this.cmuId = cmuId;
	}

	@Column(name = "state", length = 1)
	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Column(name = "memo", length = 512)
	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	@Column(name = "platformid", length = 32)
	public String getPlatformid() {
		return this.platformid;
	}

	public void setPlatformid(String platformid) {
		this.platformid = platformid;
	}

	@Column(name = "creator", length = 32)
	public String getCreator() {
		return this.creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}
	


	@Column(name = "isupdatepwd",length = 1)
	public String getIsUpdatePwd() {
		return isUpdatePwd;
	}

	public void setIsUpdatePwd(String isUpdatePwd) {
		this.isUpdatePwd = isUpdatePwd;
	}
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "createdate", nullable = false)
	public Date getCreatedate() {
		return createdate;
	}

	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "lastlogindate", nullable = true)
	public Date getLastLogindate() {
		return lastLogindate;
	}

	public void setLastLogindate(Date lastLogindate) {
		this.lastLogindate = lastLogindate;
	}
	
	

}