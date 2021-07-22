package ua.goit.repository;

import ua.goit.models.BaseEntity;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

public class Base<ID, K extends BaseEntity<ID>> implements BaseIntf<ID, K> {

    private final Map<ID, K> base = new ConcurrentHashMap<>();

    @Override
    public K getOne(ID id) {
        return findById(id)
                .map(e -> e)
                .orElseThrow(()-> new RuntimeException("Entity with id " + id + " not found"));
    }

    @Override
    public List<K> saveAll(Iterable<K> itrbl) {

        return null;
    }

    @Override
    public Collection<K> findAll() {

        return null;
    }

    @Override
    public void deleteAll() {
        base.clear();
    }

    @Override
    public void deleteById(ID id) {
        base.remove(id);
    }

    @Override
    public long count() {
        return base.size();
    }

    @Override
    public boolean existsById(ID id) {

        return false;
    }

    @Override
    public Optional<K> findById(ID id) {
        if (id == null) return Optional.empty();
        return base.containsKey(id) ? Optional.of(base.get(id)) : Optional.empty();
    }

    @Override
    public K save(K k) {
        base.put(k.getId(), k);
        return k;
    }

}
