package ua.goit.repository;

import ua.goit.models.BaseEntity;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Factory {

    private final static Map<String, Base> REPOSITORIES  = new ConcurrentHashMap<>();

    public synchronized static <ID, K extends BaseEntity<ID>> BaseIntf<ID, K> of(Class<K> modelClass) {
        final String modelName = modelClass.getName();
        if (!REPOSITORIES.containsKey(modelName)) REPOSITORIES.put(modelName, new Base<>());
        return REPOSITORIES.get(modelName);
    }

}
