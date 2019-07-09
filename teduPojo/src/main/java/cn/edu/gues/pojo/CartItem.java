package cn.edu.gues.pojo;

/**
 * CartItem
 *
 * @author lulu
 * @date 2019-07-02
 **/
public class CartItem {
    private Long id;
    private Long userId;
    private Long product;
    private Integer count;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getProduct() {
        return product;
    }

    public void setProduct(Long product) {
        this.product = product;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
