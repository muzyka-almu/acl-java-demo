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
}
