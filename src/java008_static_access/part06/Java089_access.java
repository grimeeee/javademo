package java008_static_access.part06;

import java008_static_access.part05.Java087_access;

/*
 * 클래스 관계
 * 1. has a : 포함관계
 * 2. is a : 상속관계
 */
public class Java089_access extends Java087_access{

	public static void main(String[] args) {
//		Java087_access p = new Java087_access();
		Java089_access p = new Java089_access();
//		System.out.printf("var_private:%d\n", p.var_private);
//		System.out.printf("var_default:%d\n", p.var_defalut);
		System.out.printf("var_protected:%d\n", p.var_protected);
		System.out.printf("var_public:%d\n", p.var_public);

	}

}

/*
 *  UML(Unified Modeling Language: 통합 모델링 언어)
 *  1. UML은 소프트웨어 시스템을 개발할 때 팀언 간의 아이디어를 도출하거나, 
 *  개발할 시스템의 구조와 시스템의 동적인 관점을 표현할 때 사용하는
 *  모델링 언어이다.
 *  2. 시스템을 시각화 하거나 시스템의 사양이나 설계를 문서화하기 위한 표준 표현 방법이다.
 */
 
