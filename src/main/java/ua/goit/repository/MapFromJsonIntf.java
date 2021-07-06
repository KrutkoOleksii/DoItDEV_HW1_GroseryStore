package ua.goit.repository;

public interface MapFromJsonIntf <T> {

    T getMapFromJson();

    static MapFromJson of() {
        return new MapFromJson();
    }
}
