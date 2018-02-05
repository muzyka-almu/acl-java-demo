package by.almu.acljavademo.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class AclClass {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "class")
    private String name;

    @OneToMany(mappedBy = "aclClass", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<AclObjectIdentity> aclObjectIdentities;
}
