package app.entities;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@MappedSuperclass
@Data
public abstract class Vehicle {

    @Column(name = "create_time")
    protected LocalDateTime createDate;

    @Column(name = "update_time")
    protected LocalDateTime updateDate;

    @Column(name = "created_by")
    protected String createdBy;

    @Column(name = "updated_by")
    protected String updatedBy;


    @PrePersist
    public void prePersist(){
        this.createDate= LocalDateTime.now();
    }

    @PreUpdate
    public void preUpdate(){
        this.updateDate= LocalDateTime.now();
    }
}
