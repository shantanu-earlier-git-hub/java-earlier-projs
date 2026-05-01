package jpa.api.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "emp")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Emp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "join_date")
    //private LocalDate joinDate;
   // private LocalDateTime joinDate;
    //private ZonedDateTime joinDate;
    @Temporal(TemporalType.DATE)
    private Date joinDate;

}
