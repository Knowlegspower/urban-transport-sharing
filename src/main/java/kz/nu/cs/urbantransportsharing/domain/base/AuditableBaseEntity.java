package kz.nu.cs.urbantransportsharing.domain.base;

import javax.persistence.*;

@MappedSuperclass
public abstract class AuditableBaseEntity<U, ID> extends Auditable<U> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    protected ID id;

    public ID getId() {
        return id;
    }

    public void setId(ID id) {
        this.id = id;
    }
}
