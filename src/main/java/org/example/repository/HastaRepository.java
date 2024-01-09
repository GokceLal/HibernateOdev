package org.example.repository;

import org.example.entity.Hasta;

public class HastaRepository extends RepositoryManager<Hasta,Long> {
    public HastaRepository(){
        super (new Hasta());
    }
}
