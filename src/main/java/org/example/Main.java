package org.example;

import org.example.entity.Brans;
import org.example.entity.Doktor;
import org.example.entity.Hasta;
import org.example.entity.Randevu;
import org.example.repository.BransRepository;
import org.example.repository.DoktorRepository;
import org.example.repository.HastaRepository;
import org.example.repository.RandevuRepository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        kayitEkle();


/**
 *
 *  new DoktorRepository().findById(1L)
 *                 .ifPresent(p->{
 *                     System.out.println(p.getAdi());
 *                     System.out.println(p.getId());
 *                     System.out.println(p.getRandevular());
 *                 });
 *
 */


    }
    private static void kayitEkle() {
        Brans brans = Brans.builder().doktorList(new ArrayList<>()).build();
        Doktor doktor = Doktor.builder().adi("Gokce").brans(brans).build();

        Hasta hasta = Hasta.builder().name("Mehmet").randevular(new ArrayList<>()).build();


        Randevu randevu = Randevu .builder().build();
        hasta.getRandevular().add(randevu);


        DoktorRepository doktorRepository = new DoktorRepository();
        doktorRepository.save(doktor);
    }

    private static void DurumList(){

        DoktorRepository doktorRepository = new DoktorRepository();
        doktorRepository.findAll().forEach(System.out::println);

    }
}