package by.almu.acljavademo.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Set;

@Entity
public class AclSid {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String sid;
    private Boolean principal;

    @ManyToMany(mappedBy = "aclSids")
    private Collection<User> users;
    @OneToMany(mappedBy = "aclSid", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<AclEntry> aclEntries;
    @OneToMany(mappedBy = "aclSid", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<AclObjectIdentity> aclObjectIdentities;
}
