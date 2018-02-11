package by.almu.acljavademo.model;

import javax.persistence.*;

@Entity
public class AclEntry {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Integer mask;
    private Boolean granting;
    private Integer aceOrder;
    private Boolean auditSuccess;
    private Boolean auditFailure;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sid")
    private AclSid aclSid;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "acl_object_identity")
    private AclObjectIdentity aclObjectIdentity;
}
