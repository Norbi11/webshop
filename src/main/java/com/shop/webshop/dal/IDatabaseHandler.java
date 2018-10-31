package com.shop.webshop.dal;

import java.util.List;

public interface IDatabaseHandler<T> {
	List<T> GetAll();
    T GetById(int id);
    void Insert(T instance);
    void Update(T instance);
    void Delete(int id);
    void Save();
}
