package ua.goit.repository;

import ua.goit.models.BaseEntity;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface BaseIntf<ID, K extends BaseEntity<ID>> {

    K getOne(ID id);

    List<K> saveAll(Iterable<K> itrbl);

    Collection<K> findAll();

    void deleteAll();

    void deleteById(ID id);

    long count();

    boolean existsById(ID id);

    Optional<K> findById(ID id);

    K save(K k);

}
