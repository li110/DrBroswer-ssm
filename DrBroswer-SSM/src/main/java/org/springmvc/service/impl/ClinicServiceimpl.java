package org.springmvc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springmvc.dao.ClinicMapper;
import org.springmvc.pojo.Clinic;
import org.springmvc.service.ClinicService;

import java.util.List;

@Service
public class ClinicServiceimpl implements ClinicService {

    @Autowired
    public ClinicMapper clinicMapper;

    @Override
    public Clinic getAllInfo(String idcard){return clinicMapper.selectByPrimaryKey(idcard);}

    @Override
    public List<Clinic> getAll(){return clinicMapper.selectAll();}

    @Override
    public int account(){return clinicMapper.getAccount();}

    @Override
    public List<Clinic> getAllInfo1(String idcard){return clinicMapper.selectAllInfo(idcard);}
}
