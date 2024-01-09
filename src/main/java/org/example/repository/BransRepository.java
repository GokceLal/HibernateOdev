package org.example.repository;

import org.example.entity.Brans;

public class BransRepository extends RepositoryManager<Brans,Long> {
    public BransRepository(){
        super(new Brans());
    }
}
