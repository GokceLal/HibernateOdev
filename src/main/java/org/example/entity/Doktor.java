package org.example.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tbl_doktor")
@Entity
public class Doktor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "adi")
    private String adi;

    @ManyToOne
    @JoinColumn(name = "brans_id")
     Brans brans;


    @OneToMany(mappedBy = "doktor")
    List<Randevu> randevular;



}
