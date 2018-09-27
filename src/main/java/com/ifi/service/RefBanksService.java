/*
 * Created on 2018-09-27 ( Date ISO 2018-09-27 - Time 10:31:43 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.0.0
*/
package com.ifi.service;

import com.ifi.entity.RefBanks;
import java.util.List;

public interface RefBanksService {

	public RefBanks getOne(Integer bankCode);

	public List<RefBanks> findAll();

	public Boolean delete(Integer bankCode);

	public RefBanks create(RefBanks refBanks);

	public RefBanks update(RefBanks refBanks);

	public Boolean exist(RefBanks refBanks);
}