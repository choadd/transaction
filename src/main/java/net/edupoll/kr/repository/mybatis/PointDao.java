package net.edupoll.kr.repository.mybatis;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import net.edupoll.kr.entity.PointVo;

@Repository
public class PointDao {

	@Autowired
	SqlSession sqlSession;

	public int insertOne(PointVo vo) {

		if (Math.random() > 0.5) {

			return sqlSession.insert("point.insertOne", vo);
		}
		return 0;
	}

}
