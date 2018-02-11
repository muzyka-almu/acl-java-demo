package by.almu.acljavademo.model;

import javax.persistence.*;

@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String info;
    private Integer price;

    @OneToOne(mappedBy = "item")
    private AclObjectIdentity aclObjectIdentity;

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", info='" + info + '\'' +
                ", price=" + price +
                ", aclObjectIdentity=" + aclObjectIdentity +
                '}';
    }

    public AclObjectIdentity getAclObjectIdentity() {
        return aclObjectIdentity;
    }

    public void setAclObjectIdentity(AclObjectIdentity aclObjectIdentity) {
        this.aclObjectIdentity = aclObjectIdentity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
