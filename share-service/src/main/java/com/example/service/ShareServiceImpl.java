package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bean.Share;
import com.example.persistence.ShareDao;

@Service
public class ShareServiceImpl implements ShareService {

	@Autowired
	private ShareDao shareDao;
	
	@Override
	public Share findShareById(int id) {
		return shareDao.getById(id);
		
	}

}
