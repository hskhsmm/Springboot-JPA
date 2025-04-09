# Springboot-JPA

Spring Boot + JPA를 활용한 웹 애플리케이션 실습 프로젝트  
H2 인메모리 데이터베이스를 기반으로 강좌 내용을 따라 학습하며,  
도메인 중심 설계 및 계층 분리를 경험.

---

## ✅ 기술 스택

- **Backend:** Spring Boot, Spring Data JPA
- **Database:** H2 (In-memory) - sql로 추후 변동 가능
- **Template Engine:** Thymeleaf
- **ORM:** Hibernate (JPA 구현체)
- **Lombok**, **Gradle**


---

## 🧱 개발 순서 및 목표

### jpashop1

1. **도메인 분석 및 설계**


2. **JPA 엔티티 클래스 설계**


3. **기본 애플리케이션 개발**


4. **도메인 기능 개발**


5. **서비스 계층 개발**


6. **웹 계층 개발**


7. **API 개발**
- 회원 등록,수정,조회
- 엔티티 DTO로 변환,조회
- 컬렉션 조회
- OSIV
---


## ⚙️ 실행 방법

```bash
# 프로젝트 clone
git clone https://github.com/hskhsmm/Springboot-JPA.git
cd Springboot-JPA

# Gradle 빌드 & 실행
./gradlew bootRun
