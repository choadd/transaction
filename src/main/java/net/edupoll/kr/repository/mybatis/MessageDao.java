package net.edupoll.kr.repository.mybatis;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import net.edupoll.kr.entity.MessageVo;

@Repository
public class MessageDao {

	@Autowired
	SqlSession sqlSession;
	
	public List<MessageVo> selectAll() {
		//select Query 문 수행할 때 
		//selectList : 데이터가 여러개일 때, (없으면, List size()==0)
		//selectOne : 데이터가 한개 있거나 없거나(null) 할 때 (primary key 기본키로 검색)
		return sqlSession.selectList("message.selectAll");
	}
	
	public Integer countAll() {
		return sqlSession.selectOne("message.countAll");
	}
	
	public List<Integer> countBySender() {
		return sqlSession.selectList("message.countBySender");
	}

	public Integer countBySender2() {
		return sqlSession.selectOne("message.countBySender");
	}
	
	public int insertOne(MessageVo vo) {
		return sqlSession.insert("message.insertOne", vo);
	}
	
	public List<MessageVo> selectBySender(String sender) {
		return sqlSession.selectList("message.selectBySender", sender);
	}
	
	public List<MessageVo> selectByPeriod(Map<String, Object> param) {
		
		return sqlSession.selectList("message.selectByPeriod", param);
	}
}
