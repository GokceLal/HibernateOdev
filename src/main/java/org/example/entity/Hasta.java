package org.example.entity;

import jakarta.persistence.*;

import java.util.List;

@lombok.Data
@lombok.Builder
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@Table(name = "tblHasta")
@Entity
public class Hasta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "hasta_adi")
    String name;


    @OneToMany(mappedBy = "hasta")
    List<Randevu> randevular;
}
