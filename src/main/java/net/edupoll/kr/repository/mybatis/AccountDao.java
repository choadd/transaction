package net.edupoll.kr.repository.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import net.edupoll.kr.entity.AccountVo;

@Repository
public class AccountDao {
	
	@Autowired
	SqlSession sqlSession;
	
	public int insertAc(AccountVo vo) {
		return sqlSession.insert("account.insert", vo);
	}
	
	public List selectAll() {
		return sqlSession.selectList("account.selectAll");
	}

}
