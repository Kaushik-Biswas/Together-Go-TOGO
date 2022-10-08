package com.service;

import com.model.FACULTY;

import java.util.List;

public interface FACULTYService {

    public List<FACULTY> getAll();

    public void save(FACULTY faculty);

    public FACULTY get(String id);

    public void update(FACULTY faculty);

    public void delete(String id);

}
