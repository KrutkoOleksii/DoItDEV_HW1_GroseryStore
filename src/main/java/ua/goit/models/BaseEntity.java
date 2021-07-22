package ua.goit.models;

@FunctionalInterface
public interface BaseEntity <ID> {
    ID getId();
}