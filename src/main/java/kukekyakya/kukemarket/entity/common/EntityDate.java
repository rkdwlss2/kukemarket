package kukekyakya.kukemarket.entity.common;

import lombok.Getter;
import org.hibernate.type.LocalDateType;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass
@Getter
public abstract class EntityDate {
    @CreatedDate
    @Column(nullable = false,updatable = false)
    private LocalDateType createdAt;

    @LastModifiedDate
    @Column(nullable = false,updatable = false)
    private LocalDateType modifiedAt;
}
