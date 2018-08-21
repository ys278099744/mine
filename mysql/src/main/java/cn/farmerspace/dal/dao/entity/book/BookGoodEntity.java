package cn.farmerspace.dal.dao.entity.book;

import javax.persistence.*;

@Table(name = "book_good")
public class BookGoodEntity {
    @Id
    @GeneratedValue(generator = "JDBC")
    private Long id;

    private String name;

    private String isbn;

    private String price;

    private Integer storage;

    @Column(name = "owner_id")
    private Long ownerId;

    @Column(name = "img_id")
    private String imgId;

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
     * @return isbn
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * @param isbn
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * @return price
     */
    public String getPrice() {
        return price;
    }

    /**
     * @param price
     */
    public void setPrice(String price) {
        this.price = price;
    }

    /**
     * @return storage
     */
    public Integer getStorage() {
        return storage;
    }

    /**
     * @param storage
     */
    public void setStorage(Integer storage) {
        this.storage = storage;
    }

    /**
     * @return owner_id
     */
    public Long getOwnerId() {
        return ownerId;
    }

    /**
     * @param ownerId
     */
    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * @return img_id
     */
    public String getImgId() {
        return imgId;
    }

    /**
     * @param imgId
     */
    public void setImgId(String imgId) {
        this.imgId = imgId;
    }
}