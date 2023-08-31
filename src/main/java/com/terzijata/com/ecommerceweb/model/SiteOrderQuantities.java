package com.terzijata.com.ecommerceweb.model;

import jakarta.persistence.*;

@Entity
@Table(name = "site_order_quantities")
public class SiteOrderQuantities {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    @Column(name = "quantity", nullable = false)
    private Integer quantity;

    @ManyToOne(optional = false)
    @JoinColumn(name = "site_order_id", nullable = false)
    private SiteOrder siteOrder;

    public SiteOrder getSiteOrder() {
        return siteOrder;
    }

    public void setSiteOrder(SiteOrder siteOrder) {
        this.siteOrder = siteOrder;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}