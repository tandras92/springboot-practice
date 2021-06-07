package com.taytech.springframework.spring5webapp.model;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "publisher")
public class PublisherEntity {

    @Id
    @GeneratedValue(generator = "UUID")
//    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "publisher_id", columnDefinition = "uuid", updatable = false, nullable = false)
    private UUID id;

    @Column(name = "publisher_nm", columnDefinition = "varchar", nullable = false, length = 75)
    private String name;

    @Column(name = "publisher_address", columnDefinition = "varchar", nullable = false, length = 75)
    private String address;

    @Column(name = "publisher_city", columnDefinition = "varchar", nullable = false, length = 75)
    private String city;

    @Column(name = "publisher_state_cd", columnDefinition = "char(2)", nullable = false)
    private String state;

    @Column(name = "publisher_zipcode", columnDefinition = "char(5)", nullable = false)
    private String zipcode;

    @OneToMany
    @JoinColumn(name="publisher_id")
    private Set<BookEntity> books = new HashSet<>();


}
