package com.ps.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ps.entity.Registration;
import com.ps.repository.RegDao;
@Service
public class RegServicesImpl implements RegServices {

	@Autowired
	private RegDao regDao;
	
	@Override
	@Transactional
	public Registration addReg(Registration reg) {
		
		return regDao.save(reg);
	}

}
