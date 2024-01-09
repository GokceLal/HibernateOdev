package org.example.repository;

import org.example.entity.Doktor;

public class DoktorRepository extends RepositoryManager<Doktor,Long> {
    public DoktorRepository(){
        super(new Doktor());
    }
}
