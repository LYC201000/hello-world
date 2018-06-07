package com.kosea.kmove30;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisTest {
	public static void main(String[] args) {

		String resource = "mybatis-config.xml"; /// src 경로
		// "org/mybatis/example/mybatis-config.xml";
		try {
			InputStream inputStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			SqlSession session = sqlSessionFactory.openSession();

			try {
				// Blog blog = session.selectOne("org.mybatis.example.BlogMapper.selectBlog",
				// 101);
				// Member member = new Member();
				
				// 조회시작////////////////////////////////////

//				Member member = session.selectOne("org.mybatis.example.SelectMapper.selectMember", 101);
//				System.out.println("회원 아이디:" + member.getId());
//				System.out.println("회원 비번:" + member.getPass());
//				System.out.println("회원 번호:" + member.getMno());
				// 조회종료////////////////////////////////////

				// 삭제시작////////////////////////////////////
				// int deleteCount=session.delete("org.mybatis.example.SelectMapper.deleteMember",101);
				// System.out.println("삭제건수:" +deleteCount);
				// 삭제종료////////////////////////////////////
				
				// 추가시작////////////////////////////////
//				Member newMember = new Member(102, "testid", "123333");
//				int insertCount= session.insert("org.mybatis.example.SelectMapper.insertMember", newMember);
//				System.out.println("추가건수:" +insertCount);
				// 추가종료////////////////////////////////
				
				// 수정시작////////////////////////////////
				String queryMapping = "org.mybatis.example.SelectMapper.updateMember";
				Member member = new Member(104, "HGDxx","HGDyy");
				int updateCount = session.update(queryMapping, member);
				System.out.println("수정건수:"+ updateCount);
				// 수정종료////////////////////////////////

			} finally {
				session.commit();
				session.close();
			}
		} catch (Exception ex) {
			ex.printStackTrace();

		}
	}

	private static String deleteCount() {
		// TODO Auto-generated method stub
		return null;
	}

}
