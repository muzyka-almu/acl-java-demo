package by.almu.acljavademo.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class AclObjectIdentity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Boolean entriesInheriting;

    //TODO @OneToOne ?????????????????????????
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "object_id_identity")
    private Item item;

    @OneToOne(mappedBy = "aclObjectIdentity")
    private AclEntry aclEntry;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "owner_id")
    private AclSid aclSid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_object")
    private AclObjectIdentity aclObjectIdentity;

    @OneToMany(mappedBy = "aclObjectIdentity", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<AclObjectIdentity> childAclObjectIdentities;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "object_id_class")
    private AclClass aclClass;
}
