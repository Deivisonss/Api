package com.api3.testando.repositorio;

import io.micrometer.common.lang.NonNull;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.api3.testando.modelo.Pessoa;



@Repository
public interface Repositorio extends CrudRepository<Pessoa, Integer> {
        
    @NonNull
    List<Pessoa> findAll();

}