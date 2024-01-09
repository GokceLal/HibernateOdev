package org.example.repository;

import org.example.entity.Randevu;

public class RandevuRepository extends RepositoryManager<Randevu,Long> {
    public RandevuRepository(){
        super(new Randevu());
    }
}
