/*
 * Created on 2018-09-27 ( Date ISO 2018-09-27 - Time 10:31:43 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.0.0
*/
package com.ifi.service;



import java.util.List;

import javax.transaction.Transactional;

import com.ifi.entity.RefAddressTypes;
import com.ifi.repository.RefAddressTypesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RefAddressTypesServiceImpl implements RefAddressTypesService {

	@Autowired
	private RefAddressTypesRepository refAddressTypesRepository;

	@Override
	public RefAddressTypes getOne(Integer addressTypeCode) {
		return refAddressTypesRepository.getOne(addressTypeCode);
	}

	@Override
	public Boolean delete(Integer addressTypeCode) {
		if (refAddressTypesRepository.getOne(addressTypeCode) != null) {
			refAddressTypesRepository.deleteById(addressTypeCode);
			return true;
		}
		return false;
	}

	@Override
	public RefAddressTypes create(RefAddressTypes refAddressTypes) {
		return refAddressTypesRepository.save(refAddressTypes);
	}

	@Override
	public RefAddressTypes update(RefAddressTypes refAddressTypesToUpdate) {
						RefAddressTypes refAddressTypes = refAddressTypesRepository.getOne(refAddressTypesToUpdate.getAddressTypeCode());
										
				if(refAddressTypesToUpdate.getAddressTypeDescription() !=null) {
			
		}
				return refAddressTypesRepository.save(refAddressTypes);
	}

	@Override
	public Boolean exist(RefAddressTypes refAddressTypes) {
						return refAddressTypesRepository.existsById(refAddressTypes.getAddressTypeCode());
									}

	@Override
	public List<RefAddressTypes> findAll() {
		return refAddressTypesRepository.findAll();
	}

}

