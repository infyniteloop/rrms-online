package com.infyniteloop.rrmsbackend.daoimpl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.infyniteloop.rrmsbackend.dao.ZoneDAO;
import com.infyniteloop.rrmsbackend.dto.Zone;

@Repository("zoneDAO")
public class ZoneDAPImpl implements ZoneDAO {

	@Override
	public List<Zone> list() {
		// TODO Auto-generated method stub
		return null;
	}

}
