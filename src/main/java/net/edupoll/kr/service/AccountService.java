package net.edupoll.kr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.edupoll.kr.entity.AccountVo;
import net.edupoll.kr.entity.PointVo;
import net.edupoll.kr.repository.mybatis.AccountDao;
import net.edupoll.kr.repository.mybatis.PointDao;

@Service
public class AccountService {

	@Autowired
	PointDao pointDao;

	@Autowired
	AccountDao accountDao;

	public boolean registerNewOne(AccountVo vo) {

		int r = accountDao.insertAc(vo);
		if (r != 1)
			return false;

		PointVo pv = new PointVo();
		pv.setOwner(vo.getId());
		pv.setPt(1000);

		r = pointDao.insertOne(pv);
		return r == 1;
	}

}
