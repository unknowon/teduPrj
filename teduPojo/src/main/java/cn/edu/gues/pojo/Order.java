package cn.edu.gues.pojo;

import java.util.Date;

/**
 * Order
 *
 * @author lulu
 * @date 2019-07-02
 **/
public class Order {
    private Long id;
    private Long userId;
    private String orderId;
    private String sta;
    private Long addressId;
    private Double payment;
    private Date placed;
    private Date receipt;
    private Date deliver;
    private Date handover;

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

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getSta() {
        return sta;
    }

    public void setSta(String sta) {
        this.sta = sta;
    }

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    public Double getPayment() {
        return payment;
    }

    public void setPayment(Double payment) {
        this.payment = payment;
    }

    public Date getPlaced() {
        return placed;
    }

    public void setPlaced(Date placed) {
        this.placed = placed;
    }

    public Date getReceipt() {
        return receipt;
    }

    public void setReceipt(Date receipt) {
        this.receipt = receipt;
    }

    public Date getDeliver() {
        return deliver;
    }

    public void setDeliver(Date deliver) {
        this.deliver = deliver;
    }

    public Date getHandover() {
        return handover;
    }

    public void setHandover(Date handover) {
        this.handover = handover;
    }
}
