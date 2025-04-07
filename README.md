# Springboot-JPA

Spring Boot + JPA를 활용한 웹 애플리케이션 실습 프로젝트  
H2 인메모리 데이터베이스를 기반으로 강좌 내용을 따라 학습하며,  
도메인 중심 설계 및 계층 분리를 경험.

---

## ✅ 기술 스택

- **Backend:** Spring Boot, Spring Data JPA
- **Database:** H2 (In-memory)
- **Template Engine:** Thymeleaf
- **ORM:** Hibernate (JPA 구현체)
- **Lombok**, **Gradle**


---

## 🧱 개발 순서 및 목표

1. **도메인 분석 및 설계**
   - ERD 분석
   - 도메인 모델 설계

2. **JPA 엔티티 클래스 설계**
   - 연관관계 매핑
   - 양방향/단방향 설계

3. **기본 애플리케이션 개발**
   - 프로젝트 설정 및 환경 구성
   - H2 DB 연동

4. **도메인 기능 개발**
   - 회원 도메인
   - 상품 도메인
   - 주문 도메인

5. **서비스 계층 개발**
   - 비즈니스 로직 구현
   - 트랜잭션 처리

6. **웹 계층 개발**
   - 회원 등록/조회 화면
   - 상품 등록/조회
   - 주문 기능 및 주문 내역 조회

---


## ⚙️ 실행 방법

```bash
# 프로젝트 clone
git clone https://github.com/hskhsmm/Springboot-JPA.git
cd Springboot-JPA

# Gradle 빌드 & 실행
./gradlew bootRun
