package model.adt;

import java.util.List;

public interface IMyList<T> {
    List<T> getAll();
    void add(T elem);
    void setList(List<T> l);

}