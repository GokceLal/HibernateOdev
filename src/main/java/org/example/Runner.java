package org.example;

import org.example.entity.Brans;
import org.example.entity.Doktor;
import org.example.entity.Hasta;
import org.example.entity.Randevu;
import org.example.repository.BransRepository;
import org.example.repository.DoktorRepository;
import org.example.repository.HastaRepository;

import java.util.ArrayList;
import java.util.List;

public class Runner {

        public static void main(String[] args) {

            // Branş oluştur
            Brans brans = new Brans();
            brans.setAdi("Psikiyatri");
            new BransRepository().save(brans);


            Brans brans1 = new Brans();
            brans1.setAdi("KBB");
            new BransRepository().save(brans1);

            Brans brans2= new Brans();
            brans2.setAdi("Dahiliye");
            new BransRepository().save(brans2);

            // Doktorlar oluşturuluyor
            Doktor doktor1 = new Doktor();
            doktor1.setAdi("Dr. Ahmet");
            doktor1.setBrans(brans2);

            new DoktorRepository().save(doktor1);

            Doktor doktor2= new Doktor();
            doktor2.setAdi("Dr. Gokce");
            doktor2.setBrans(brans);

            new DoktorRepository().save(doktor2);

            Doktor doktor3= new Doktor();
            doktor3.setAdi("Dr. Mehmet");
            doktor3.setBrans(brans1);

            new DoktorRepository().save(doktor3);

            // Hastalar oluşturuluyor
            Hasta hasta1 = new Hasta();
            hasta1.setName("Gül");
            List<Randevu> randevular= new ArrayList<>();

            hasta1.setRandevular(randevular);

            new HastaRepository().save(hasta1);


            Hasta hasta2 = new Hasta();
            hasta2.setName("Ayse");
            randevular = new ArrayList<>();
            hasta2.setRandevular(randevular);
            new HastaRepository().save(hasta2);


            Hasta hasta3 = new Hasta();
            hasta3.setName("Cenk");
            randevular = new ArrayList<>();

            hasta3.setRandevular(randevular);
            new HastaRepository().save(hasta3);


            // Randevular oluşturuluyor
            Randevu randevu1 = new Randevu();
            randevu1.setDoktor(doktor1);
            randevu1.setHasta(hasta1);


            Randevu randevu2 = new Randevu();
            randevu1.setDoktor(doktor2);
            randevu1.setHasta(hasta2);

            Randevu randevu3 = new Randevu();
            randevu1.setDoktor(doktor3);
            randevu1.setHasta(hasta3);

            Randevu randevu4 = new Randevu();
            randevu1.setDoktor(doktor2);
            randevu1.setHasta(hasta1);

            Randevu randevu5 = new Randevu();
            randevu1.setDoktor(doktor3);
            randevu1.setHasta(hasta2);




        }
    }





