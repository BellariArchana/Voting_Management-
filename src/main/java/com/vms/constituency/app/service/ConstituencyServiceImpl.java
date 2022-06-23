package com.vms.constituency.app.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vms.constituency.app.constantmessage.ConstantMessages;
import com.vms.constituency.app.entity.Constituency;
import com.vms.constituency.app.exception.IdNotFoundException;
import com.vms.constituency.app.exception.NoSuchRecordException;
import com.vms.constituency.app.repository.IConstituencyRepository;

@Service("IConstituencyService")
public class ConstituencyServiceImpl implements IConstituencyService {

	@Autowired
	IConstituencyRepository iConstituencyRepository;
	
	@Override
	public Constituency addConstituency(Constituency constituency) {
		return iConstituencyRepository.save(constituency);
	}
	
	@Override
	public Constituency updateConstituency(Constituency constituency) {
		return iConstituencyRepository.save(constituency);
	}

	@Override
	public List<Constituency> getAllConstituency() {
		List<Constituency> list = iConstituencyRepository.findAll();
		if (!list.isEmpty()) {
			return iConstituencyRepository.findAll();
		}
		else{
			throw new NoSuchRecordException(ConstantMessages.RECORDMSG);
		}
	}

	@Override
	public Constituency getConstituencyById(int constituencyId) {
		Optional<Constituency> id = iConstituencyRepository.findById(constituencyId);
		if (id.isPresent())
			return id.get();
		else
			throw new IdNotFoundException(ConstantMessages.IDMSG + constituencyId);
	}

	@Override
	public void deleteConstituencyById(int constituencyId) {
		if (iConstituencyRepository.existsById(constituencyId)) {
			iConstituencyRepository.deleteById(constituencyId);
		} else
			throw new IdNotFoundException(ConstantMessages.FAILMSG + constituencyId);
	}
}
