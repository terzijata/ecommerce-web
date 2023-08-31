package com.terzijata.com.ecommerceweb.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "site_order")
public class SiteOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "site_user_id", nullable = false)
    private SiteUser siteUser;

    @ManyToOne(optional = false)
    @JoinColumn(name = "address_id", nullable = false)
    private Address address;

    @OneToMany(mappedBy = "siteOrder", cascade = CascadeType.REMOVE, orphanRemoval = true)
    private List<SiteOrderQuantities> siteOrderQuantitieses = new ArrayList<>();

    public List<SiteOrderQuantities> getSiteOrderQuantitieses() {
        return siteOrderQuantitieses;
    }

    public void setSiteOrderQuantitieses(List<SiteOrderQuantities> siteOrderQuantitieses) {
        this.siteOrderQuantitieses = siteOrderQuantitieses;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public SiteUser getSiteUser() {
        return siteUser;
    }

    public void setSiteUser(SiteUser siteUser) {
        this.siteUser = siteUser;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}