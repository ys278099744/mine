package cn.farmerspace.dal.dao.entity.authority;

import cn.farmerspace.core.tkmybatis.BaseEntity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "dc_sys_user")
public class SysUserEntity extends BaseEntity{
    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * 用户账号
     */
    @Column(name = "user_id")
    private String userId;

    /**
     * 用户中文名称
     */
    @Column(name = "cn_name")
    private String cnName;

    private String mail;

    /**
     * 个人的平台数据质量分
     */
    private Integer score;

    /**
     * 连续第几次个人的平台数据质量分不达标
     */
    private Short status;

    @Column(name = "job_mail")
    private String jobMail;

    @Column(name = "job_mail_password")
    private String jobMailPassword;

    /**
     * 用户密码
     */
    @Column(name = "user_pwd")
    private String userPwd;

    /**
     * 用户所在部门
     */
    @Column(name = "user_depart")
    private String userDepart;

    /**
     * 是否管理员1：管理员，0：普通用户
     */
    @Column(name = "user_is_audit")
    private String userIsAudit;

    private String appsecret;

    private String appkey;

    /**
     * 联系电话
     */
    @Column(name = "user_phone")
    private String userPhone;

    /**
     * 职务
     */
    @Column(name = "user_duty")
    private String userDuty;

    /**
     * 地址
     */
    @Column(name = "user_add")
    private String userAdd;

    private String creater;

    @Column(name = "gmt_created")
    private Date gmtCreated;

    private String modifier;

    @Column(name = "gmt_modified")
    private Date gmtModified;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取用户账号
     *
     * @return user_id - 用户账号
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置用户账号
     *
     * @param userId 用户账号
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取用户中文名称
     *
     * @return cn_name - 用户中文名称
     */
    public String getCnName() {
        return cnName;
    }

    /**
     * 设置用户中文名称
     *
     * @param cnName 用户中文名称
     */
    public void setCnName(String cnName) {
        this.cnName = cnName;
    }

    /**
     * @return mail
     */
    public String getMail() {
        return mail;
    }

    /**
     * @param mail
     */
    public void setMail(String mail) {
        this.mail = mail;
    }

    /**
     * 获取个人的平台数据质量分
     *
     * @return score - 个人的平台数据质量分
     */
    public Integer getScore() {
        return score;
    }

    /**
     * 设置个人的平台数据质量分
     *
     * @param score 个人的平台数据质量分
     */
    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     * 获取连续第几次个人的平台数据质量分不达标
     *
     * @return status - 连续第几次个人的平台数据质量分不达标
     */
    public Short getStatus() {
        return status;
    }

    /**
     * 设置连续第几次个人的平台数据质量分不达标
     *
     * @param status 连续第几次个人的平台数据质量分不达标
     */
    public void setStatus(Short status) {
        this.status = status;
    }

    /**
     * @return job_mail
     */
    public String getJobMail() {
        return jobMail;
    }

    /**
     * @param jobMail
     */
    public void setJobMail(String jobMail) {
        this.jobMail = jobMail;
    }

    /**
     * @return job_mail_password
     */
    public String getJobMailPassword() {
        return jobMailPassword;
    }

    /**
     * @param jobMailPassword
     */
    public void setJobMailPassword(String jobMailPassword) {
        this.jobMailPassword = jobMailPassword;
    }

    /**
     * 获取用户密码
     *
     * @return user_pwd - 用户密码
     */
    public String getUserPwd() {
        return userPwd;
    }

    /**
     * 设置用户密码
     *
     * @param userPwd 用户密码
     */
    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    /**
     * 获取用户所在部门
     *
     * @return user_depart - 用户所在部门
     */
    public String getUserDepart() {
        return userDepart;
    }

    /**
     * 设置用户所在部门
     *
     * @param userDepart 用户所在部门
     */
    public void setUserDepart(String userDepart) {
        this.userDepart = userDepart;
    }

    /**
     * 获取是否管理员1：管理员，0：普通用户
     *
     * @return user_is_audit - 是否管理员1：管理员，0：普通用户
     */
    public String getUserIsAudit() {
        return userIsAudit;
    }

    /**
     * 设置是否管理员1：管理员，0：普通用户
     *
     * @param userIsAudit 是否管理员1：管理员，0：普通用户
     */
    public void setUserIsAudit(String userIsAudit) {
        this.userIsAudit = userIsAudit;
    }

    /**
     * @return appsecret
     */
    public String getAppsecret() {
        return appsecret;
    }

    /**
     * @param appsecret
     */
    public void setAppsecret(String appsecret) {
        this.appsecret = appsecret;
    }

    /**
     * @return appkey
     */
    public String getAppkey() {
        return appkey;
    }

    /**
     * @param appkey
     */
    public void setAppkey(String appkey) {
        this.appkey = appkey;
    }

    /**
     * 获取联系电话
     *
     * @return user_phone - 联系电话
     */
    public String getUserPhone() {
        return userPhone;
    }

    /**
     * 设置联系电话
     *
     * @param userPhone 联系电话
     */
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    /**
     * 获取职务
     *
     * @return user_duty - 职务
     */
    public String getUserDuty() {
        return userDuty;
    }

    /**
     * 设置职务
     *
     * @param userDuty 职务
     */
    public void setUserDuty(String userDuty) {
        this.userDuty = userDuty;
    }

    /**
     * 获取地址
     *
     * @return user_add - 地址
     */
    public String getUserAdd() {
        return userAdd;
    }

    /**
     * 设置地址
     *
     * @param userAdd 地址
     */
    public void setUserAdd(String userAdd) {
        this.userAdd = userAdd;
    }

    /**
     * @return creater
     */
    public String getCreater() {
        return creater;
    }

    /**
     * @param creater
     */
    public void setCreater(String creater) {
        this.creater = creater;
    }

    /**
     * @return gmt_created
     */
    public Date getGmtCreated() {
        return gmtCreated;
    }

    /**
     * @param gmtCreated
     */
    public void setGmtCreated(Date gmtCreated) {
        this.gmtCreated = gmtCreated;
    }

    /**
     * @return modifier
     */
    public String getModifier() {
        return modifier;
    }

    /**
     * @param modifier
     */
    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    /**
     * @return gmt_modified
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * @param gmtModified
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }
}