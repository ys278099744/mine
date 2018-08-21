package cn.farmerspace.dal.dao.entity.book;

import javax.persistence.*;

@Table(name = "user")
public class UserEntity {
    @Id
    @GeneratedValue(generator = "JDBC")
    private Long id;

    private String name;

    private String tel;

    private String addr;

    private String university;

    private String major;

    private String academy;

    @Column(name = "time_enrollment")
    private String timeEnrollment;

    @Column(name = "id_number")
    private String idNumber;

    @Column(name = "wx_id")
    private String wxId;

    @Column(name = "nick_name")
    private String nickName;

    @Column(name = "img_url")
    private String imgUrl;

    @Column(name = "addr_province")
    private String addrProvince;

    @Column(name = "addr_city")
    private String addrCity;

    @Column(name = "addr_dormitory")
    private String addrDormitory;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return tel
     */
    public String getTel() {
        return tel;
    }

    /**
     * @param tel
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * @return addr
     */
    public String getAddr() {
        return addr;
    }

    /**
     * @param addr
     */
    public void setAddr(String addr) {
        this.addr = addr;
    }

    /**
     * @return university
     */
    public String getUniversity() {
        return university;
    }

    /**
     * @param university
     */
    public void setUniversity(String university) {
        this.university = university;
    }

    /**
     * @return major
     */
    public String getMajor() {
        return major;
    }

    /**
     * @param major
     */
    public void setMajor(String major) {
        this.major = major;
    }

    /**
     * @return academy
     */
    public String getAcademy() {
        return academy;
    }

    /**
     * @param academy
     */
    public void setAcademy(String academy) {
        this.academy = academy;
    }

    /**
     * @return time_enrollment
     */
    public String getTimeEnrollment() {
        return timeEnrollment;
    }

    /**
     * @param timeEnrollment
     */
    public void setTimeEnrollment(String timeEnrollment) {
        this.timeEnrollment = timeEnrollment;
    }

    /**
     * @return id_number
     */
    public String getIdNumber() {
        return idNumber;
    }

    /**
     * @param idNumber
     */
    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    /**
     * @return wx_id
     */
    public String getWxId() {
        return wxId;
    }

    /**
     * @param wxId
     */
    public void setWxId(String wxId) {
        this.wxId = wxId;
    }

    /**
     * @return nick_name
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * @param nickName
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /**
     * @return img_url
     */
    public String getImgUrl() {
        return imgUrl;
    }

    /**
     * @param imgUrl
     */
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    /**
     * @return addr_province
     */
    public String getAddrProvince() {
        return addrProvince;
    }

    /**
     * @param addrProvince
     */
    public void setAddrProvince(String addrProvince) {
        this.addrProvince = addrProvince;
    }

    /**
     * @return addr_city
     */
    public String getAddrCity() {
        return addrCity;
    }

    /**
     * @param addrCity
     */
    public void setAddrCity(String addrCity) {
        this.addrCity = addrCity;
    }

    /**
     * @return addr_dormitory
     */
    public String getAddrDormitory() {
        return addrDormitory;
    }

    /**
     * @param addrDormitory
     */
    public void setAddrDormitory(String addrDormitory) {


        this.addrDormitory = addrDormitory;
    }
}

