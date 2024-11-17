package pe.edu.cibertec.spring_data_jpa_d.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer customer_id;
    private Integer store_id;
    private String first_name;
    private String last_name;
    private String email;
    private Integer address_id;
    private Integer active;
    private Date create_date;
    private Date last_update;

}
