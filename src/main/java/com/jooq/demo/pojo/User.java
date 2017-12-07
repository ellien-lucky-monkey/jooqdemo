package com.jooq.demo.pojo;


import javax.persistence.Column;
import javax.persistence.Entity;


/**
 * package:com.qincai.ye.entity.domain.secondary.user
 * author:jiangkui
 * date: 2017/08/17 16:09
 */
@Entity
public class User extends BaseEntity {
	/**
	 * 男
	 */
	public static final Integer SEX_MAN = 1;
	/**
	 * 女
	 */
	public static final Integer SEX_WOMAN = 2;
	/**
	 * 用户状态-已激活
	 */
	public static final Integer STATUS_ACTIVATED = 1;
	/**
	 * 用户状态-未激活
	 */
	public static final Integer STATUS_NOT_ACTIVATED = 2;
	/**
	 * 系统创建
	 */
	public static final Integer TYPE_SYSTEM = 1;
	/**
	 * 注册用户
	 */
	public static final Integer TYPE_REGISTER = 2;
	/**
	 * 注册类型-邮箱注册
	 */
	public static final Integer REGISTER_TYPE_EMAIL = 1;
	/**
	 * 注册类型-手机号注册
	 */
	public static final Integer REGISTER_TYPE_PHONE = 2;
	/**
	 * 有效
	 */
	public static final Integer VALIDATE_YES = 1;
	/**
	 * 无效
	 */
	public static final Integer VALIDATE_NO = 2;

	/**
	 * 手机号
	 */
	@Column(name = "mobile")
	private String mobile;
	/**
	 * 性别
	 * {@link User#SEX_MAN}
	 * {@link User#SEX_WOMAN}
	 */
	@Column(name = "sex")
	private Integer sex;
	/**
	 * 用户名
	 */
	@Column(name = "username")
	private String username;
	/**
	 * 邮箱
	 */
	private String email;
	/**
	 * 昵称
	 */
	@Column(name = "nickname")
	private String nickname;
	/**
	 * 密码
	 */
	@Column(name = "password")
	private String password;
	/**
	 * 职业
	 */
	@Column(name = "occupation")
	private Integer occupation;

	/**
	 * 用户状态
	 */
	private Integer status;
	/**
	 * 用户类型
	 */
	private Integer type;
	/**
	 * 注册类型
	 */
	private Integer registerType;
	/**
	 * 是否有效
	 */
	private Integer validateStatus;


	public Integer getValidateStatus() {
		return validateStatus;
	}

	public void setValidateStatus(Integer validateStatus) {
		this.validateStatus = validateStatus;
	}

	public Integer getRegisterType() {
		return registerType;
	}

	public void setRegisterType(Integer registerType) {
		this.registerType = registerType;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getOccupation() {
		return occupation;
	}

	public void setOccupation(Integer occupation) {
		this.occupation = occupation;
	}
}
