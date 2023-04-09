package com.hha.services;

import com.hha.entities.Partner;

import java.util.List;

public interface PartnerService {
    Partner create(Partner p);

    Partner update(long id, Partner p);

    void delete(long id);

    boolean hidden(long id);

    Partner getById(long id);

    List<Partner> getAll();

}
