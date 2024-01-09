package org.example.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tbl_randevu")
@Entity
public class Randevu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @ManyToOne
    @JoinColumn(name = "doktor_id")
    Doktor doktor;

    @ManyToOne
    @JoinColumn(name = "hasta_id")
    Hasta hasta;

    @Column(name = "tarih")
    @Temporal(TemporalType.TIMESTAMP)
    Date tarih;
}
