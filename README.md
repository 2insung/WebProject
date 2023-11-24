# KNU CSE Solve

## 프로젝트 소개

> KNU CSE Solve는 경북대학교 컴퓨터학부 커뮤니티입니다. 경북대학교 컴퓨터학부는 1000명 이상의 학생 수에 걸맞게 많은 수업이 있고, 하나의 수업에서도 많은 학생 수를 배정할 수 없어 여러 분반으로 나뉘어져 있으며, 수업을 진행하시는 교수님 또한 분반마다 다른 경우가 많습니다. <br> 대형과이며, 복수전공자가 많은 학부 특성상 혼자서 수업을 듣거나 수업의 내용을 따라가기 힘든 경우가 많습니다. 이러한 불편함을 KNU CSE Solve 커뮤니티 속에서 함께 공유하며, 과제나 시험에 좋은 결과를 얻게 될 수 있을 것으로 기대됩니다.
> 

## 배포 주소


> [https://www.knucsesolve.com/](https://www.knucsesolve.com/)
> 

## 데모 동영상 주소


> [https://youtu.be/3N-cxHPmVwQ?si=2ShA6Jl5NkE4lzyO](https://youtu.be/3N-cxHPmVwQ?si=2ShA6Jl5NkE4lzyO)
>
[![Video Label](http://img.youtube.com/vi/3N-cxHPmVwQ/0.jpg)](https://youtu.be/3N-cxHPmVwQ)

## 개발 환경

```
Spring Boot Version :       v2.7.0
JDK version :               JDK11
Build Tool:                 Gradle 7.6.1
ORM :                       Spring Data JPA
Auth:                       Spirng Security 
Template Engine:            Thymeleaf
Database:                   MySQL community
```

## Stacks

### IDE
![IntelliJ IDEA Ultimate](https://img.shields.io/badge/IntelliJ_IDEA_Ultimate-000000?style=for-the-badge&logo=intellij-idea&logoColor=white)
![Visual Studio Code](https://img.shields.io/badge/Visual%20Studio%20Code-007ACC?style=for-the-badge&logo=visual-studio-code&logoColor=white)
![Git](https://img.shields.io/badge/Git-F05032?style=for-the-badge&logo=git&logoColor=white)
![GitHub](https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white)
![MySQL Workbench](https://img.shields.io/badge/MySQL_Workbench-4479A1?style=for-the-badge&logo=mysql&logoColor=white)


### Development
![Java](https://img.shields.io/badge/Java-007396?style=for-the-badge&logo=java&logoColor=white)
![Thymeleaf](https://img.shields.io/badge/Thymeleaf-005C0F?style=for-the-badge)
![HTML5](https://img.shields.io/badge/HTML5-E34F26?style=for-the-badge&logo=html5&logoColor=white)
![CSS3](https://img.shields.io/badge/CSS3-1572B6?style=for-the-badge&logo=css3&logoColor=white)
![JavaScript](https://img.shields.io/badge/JavaScript-F7DF1E?style=for-the-badge&logo=javascript&logoColor=black)

## 프로젝트 폴더 구조
```
└─src
    ├─main
    │  ├─java
    │  │  └─com
    │  │      └─insung
    │  │          └─knucsesolve
    │  │              ├─config
    │  │              ├─controller
    │  │              │  ├─auth
    │  │              │  │  └─dto
    │  │              │  │      └─rest
    │  │              │  ├─community
    │  │              │  │  └─dto
    │  │              │  │      ├─board
    │  │              │  │      │  ├─rest
    │  │              │  │      │  └─view
    │  │              │  │      ├─comment
    │  │              │  │      │  ├─rest
    │  │              │  │      │  └─view
    │  │              │  │      └─post
    │  │              │  │          ├─rest
    │  │              │  │          └─view
    │  │              │  ├─file
    │  │              │  └─my
    │  │              │      └─dto
    │  │              │          ├─rest
    │  │              │          └─view
    │  │              ├─domain
    │  │              │  ├─board
    │  │              │  ├─comment
    │  │              │  ├─member
    │  │              │  └─post
    │  │              ├─exception
    │  │              ├─handler
    │  │              ├─repository
    │  │              │  ├─board
    │  │              │  ├─comment
    │  │              │  ├─member
    │  │              │  └─post
    │  │              ├─service
    │  │              │  ├─auth
    │  │              │  ├─community
    │  │              │  ├─file
    │  │              │  └─my
    │  │              └─util
```
## 시스템 아키텍처
![image](https://github.com/2insung/KNU-CSE-SOLVE/assets/84179188/4b2dbedc-78f7-4ba1-95ba-caab488770b8)

## 화면 구성
| 로그인 페이지 | 회원가입 페이지 | 
| --- | --- |
| ![image](https://github.com/2insung/springAWS2/assets/84179188/fac750d0-ffae-4708-95a1-823291e1532d) | ![image](https://github.com/2insung/springAWS2/assets/84179188/438c5741-8a08-408d-a6ae-b4c83fd13497) |
| 루트 페이지 | 루트 페이지(2) |
| ![image](https://github.com/2insung/springAWS2/assets/84179188/f8516793-564d-479e-8278-17dcb2f5b362) |  ![image](https://github.com/2insung/springAWS2/assets/84179188/472b62d9-25a1-4ee0-87b1-08f5a7f88763) |
| 게시판 페이지 | 게시판 페이지(2)|
| ![image](https://github.com/2insung/springAWS2/assets/84179188/5bcdcc89-7493-42e6-b92c-e5d287cce9e9) | ![image](https://github.com/2insung/springAWS2/assets/84179188/8f3105e4-1389-44ad-aa99-b0de966c9c75) |
| 게시판 페이지(3) | 게시판 페이지(4)|
|![image](https://github.com/2insung/springAWS2/assets/84179188/f35bc681-6120-478b-a90a-2bc954c258a7) | ![image](https://github.com/2insung/springAWS2/assets/84179188/450b8bb9-75d3-4fca-bb1a-bc1dd393fa0e) |
| 게시글 페이지 | 게시글 페이지 (2)|
|![image](https://github.com/2insung/springAWS2/assets/84179188/d4509917-7d9d-468a-93bc-db0548707718) | ![image](https://github.com/2insung/springAWS2/assets/84179188/7f607245-ceb6-467a-8524-ed028bd95cce) |
| 게시글 작성 페이지 | 게시글 수정 페이지 |
|![image](https://github.com/2insung/springAWS2/assets/84179188/5a55130b-6d24-4797-ae57-8e46b8ee647f) | ![image](https://github.com/2insung/springAWS2/assets/84179188/94913c2a-cf7b-4570-a176-85797a59e0cd) |
| 마이페이지 | 사용자 작성글 페이지 |
|![image](https://github.com/2insung/springAWS2/assets/84179188/9b54b2de-1ca4-4653-997a-e5a6c3d44402) | ![image](https://github.com/2insung/springAWS2/assets/84179188/ea88003a-72e4-471e-bb0e-0eeacd42aef2) |
| 사용자 작성댓글 페이지 | 사용자 스크랩 페이지 |
|![image](https://github.com/2insung/springAWS2/assets/84179188/1ec9f115-3836-4f81-9318-c200f8f8b4a4) | ![image](https://github.com/2insung/springAWS2/assets/84179188/d4e19bee-9f62-42d4-adac-b026104e263f) |
| 사용자 정보 수정 페이지 | 사용자 비밀번호 변경 페이지|
|![image](https://github.com/2insung/springAWS2/assets/84179188/d4c39bcf-e83e-4e80-b9ab-4671d29fce67)|![image](https://github.com/2insung/springAWS2/assets/84179188/4def4a9c-fa3c-4ebd-b8de-3fac1ead708e)|
| 사용자 계정 비활성화 페이지 | 모든 게시판 페이지 |
|![image](https://github.com/2insung/springAWS2/assets/84179188/ab756086-b0af-4622-a1b9-46ea7bb46da7) | ![image](https://github.com/2insung/springAWS2/assets/84179188/d48c8269-b572-463e-ab8b-bbf9b22328f5) |


## API 설계
### 커뮤니티 관련 api
#### view
| Method | URL | 기능 |
| --- | --- | --- |
| GET | / | RootPage로 이동 |
| GET | /board/{boardId}?page={page} | 게시판의 게시글의 page번째 페이지로 이동 |
| GET | /board/{boardId}?hot=true&page={page} | 게시판의 인기 게시글의 page번째 페이지로 이동 |
| GET | /post/{postId} | 게시글로 이동 |
| GET | /post/{postId}?page={page} | 게시글로 이동 및 게시판의 page번째 페이지를 출력 |
| GET | /write/{boardId} | 게시판에 게시글을 작성하는 페이지로 이동 |
| GET | /rewrite/{postAuthorId}/{postId} | postAuthorId가 작성한 postId에 해당하는 게시글을 수정하는 페이지로 이동 |
| GET | /read-comment/{postId}?page={page} | 게시글의 page번째 댓글 페이지를 출력 |
| GET | /manage-board | 게시판 관리 페이지로 이동 |
| GET | /all-board | 모든 게시판 페이지로 이동 |
| GET | /board-menu | 상위 n개의 게시판 미리보기를 출력 |
#### rest
| Method | URL | 기능 |
| --- | --- | --- |
| POST | /api/save-post | 게시글을 저장 |
| PATCH | /api/update-post | 게시글을 수정 |
| DELETE | /api/delete-post | 게시글을 삭제 |
| POST | /api/save-comment | 댓글을 저장 |
| DELETE | /api/delete-comment | 댓글을 삭제 |
| POST | /api/inc-post-recommend | 게시글의 추천수 증가 및 게시글에 추천한 사용자 등록 |
| POST | /api/inc-comment-recommend | 댓글의 추천수 증가 및 댓글에 추천한 사용자 등록 |
| POST | /api/inc-post-scrap | 게시글의 스크랩 수 증가 및 게시글을 스크랩한 사용자 등록 |
| POST | /api/save-board | 게시판을 저장 |
### 마이페이지 관련 api
#### view
| Method | URL | 기능 |
| --- | --- | --- |
| GET | /my/{memberId} | 사용자의 마이페이지로 이동 |
| GET | /my/post/{memberId}?page={page} | 사용자가 작성한 게시글의 page 번째 페이지로 이동 |
| GET | /my/comment/{memberId}}?page={page} | 사용자가 작성한 게시글의 page 번째 페이지로 이동 |
| GET | /my/scrap/{memberId}}?page={page} | 사용자가 작성한 게시글의 page 번째 페이지로 이동 |
| GET | /my-edit/{memberId} | 사용자의 프로필 수정 페이지로 이동 |
| GET | /my-edit/pw/{memberId} | 사용자의 비밀번호 수정 페이지로 이동 |
| GET | /my-edit/withdraw/{memberId} | 사용자의 계정 활성화 여부 수정 페이지로 이동 |
#### rest
| Method | URL | 기능 |
| --- | --- | --- |
| POST | /api/update-my | 사용자 프로필 정보 수정 |
| DELETE | /api/delete-my-post | 사용자 작성 게시글 삭제 |
| DELETE | /api/delete-my-comment | 사용자 작성 댓글 삭제 |
| POST | /api/delete-my-scrap | 사용자 스크랩 기록 삭제 |
| PATCH | /api/update-my-password | 사용자 비밀번호 수정 |
| PATCH | /api/withdraw | 사용자 계정 비활성화 |
### 사용자 인증 관련 api
#### view
| Method | URL | 기능 |
| --- | --- | --- |
| GET | /login | 로그인 페이지로 이동 |
| GET | /signup | 회원가입 페이지로 이동 |
#### rest
| Method | URL | 기능 |
| --- | --- | --- |
| POST | /login | 스프링 시큐리티 로그인 |
| POST | /logout | 스프링 시큐리티 로그아웃 |
| POST | /api/signup | 회원가입 |

## ERD 
![image](https://github.com/2insung/KNU-CSE-SOLVE/assets/84179188/83f45676-f7a1-47da-a181-2e2c1c684318)


## 엔티티 설계
### member - 회원

| 컬럼명 | 데이터 타입 | 조건 | 설명 |
| --- | --- | --- | --- |
| id | int | Primary Key | 아이디 |
| is_deleted | boolean | not null | 비활성화 여부 |
| created_at | timestamp | not null | 가입 시간 |

### member_auth - 회원 인증 정보

| 컬럼명 | 데이터 타입 | 조건 | 설명 |
| --- | --- | --- | --- |
| id | int | Primary Key | 아이디 |
| member_id | int | Foreign Key | 회원 아이디 |
| username | varchar(50) | unique not null | 유저네임 |
| password | varchar(200) | not null | 비밀번호 |
| role | varchar(20) | not null | 권한 |

### member_detail - 회원 프로필 정보

| 컬럼명 | 데이터 타입 | 조건 | 설명 |
| --- | --- | --- | --- |
| id | int | Primary Key | 아이디 |
| member_id | int | Foreign Key | 회원 아이디 |
| nickname | varchar(20) | unique not null | 회원 닉네임 |
| profile_image | varchar(255) |  | 프로필 이미지 |
| description | varchar(100) |  | 자기소개 |
| grade | varchar(1) |  | 학년 |
| admission_year | varchar(4) |  | 입학년도 |
| department | varchar(20) |  | 학과 |

### board - 게시판
| 컬럼명 | 데이터 타입 | 조건 | 설명 |
| --- | --- | --- | --- |
| id | int | Primary Key | 아이디 |
| alias | varchar(20) | unique not null | 게시판 이름 |
| description | varchar(100) | not null | 게시판 설명 |
| category | varchar(20) | not null | 게시판 카테고리 |

### board_stat - 게시판 통계

| 컬럼명 | 데이터 타입 | 조건 | 설명 |
| --- | --- | --- | --- |
| id | int | Primary Key | 아이디 |
| board_id | varchar(50) | Foreign Key | 게시판 아이디  |
| post_count | varchar(20) | not null | 게시글 수 |
| hot_post_count | varchar(100) | not null | 인기 게시글 수 |

### post - 게시글

| 컬럼명 | 데이터 타입 | 조건 | 설명 |
| --- | --- | --- | --- |
| id | int | Primary Key | 아이디 |
| board_id | varchar(50) | Foreign key | 게시판 아이디 |
| member_id | varchar(20) | Foreign key | 작성자 아이디 |
| priority | varchar(100) | not null | 게시글 우선순위 |
| is_notice | varchar(20) | not null | 공지사항 여부 |
| is_hot | boolean | not null | 인기글 여부 |
| is_deleted | boolean | not null | 삭제 여부 |
| created_at | timestamp | not null | 생성 시간 |
| hot_registered_at | timestamp |  | 인기글 등록시간 |
| category | varchar(20) | not null | 카테고리 |

### post_content - 게시글 내용

| 컬럼명 | 데이터 타입 | 조건 | 설명 |
| --- | --- | --- | --- |
| id | int | Primary Key | 아이디 |
| post_id | int | Foreign Key | 게시글 아이디  |
| title | varchar(50) | not null | 게시글 제목 |
| body | text | not null | 게시판 본문 |
| summary | varchar(100) | not null | 게시판 요약 |
| thumbnail | varchar(200) |  | 게시글 썸네일 |
| updated_at | timestamp |  | 게시글 수정시간 |

### post_stat - 게시글 통계

| 컬럼명 | 데이터 타입 | 조건 | 설명 |
| --- | --- | --- | --- |
| id | int | Primary Key | 아이디 |
| post_id | int | Foreign Key | 게시글 아이디 |
| hit_count | int | not null | 조회 수 |
| recommend_count | int | not null | 추천 수 |
| comment_count | int | not null | 댓글 수 |
| total_comment_count | int | not null | 전체 댓글 수 |
| scrap_count | int | not null | 스크랩 수 |

### post_recommend_member - 게시글에 추천한 회원

| 컬럼명 | 데이터 타입 | 조건 | 설명 |
| --- | --- | --- | --- |
| id | int | Primary Key | 아이디 |
| post_id | int | Foreign Key | 게시글 아이디 |
| member_id | int | Foreign Key | 추천한 회원 아이디 |

### post_scrap_member - 게시글에 스크랩한 회원

| 컬럼명 | 데이터 타입 | 조건 | 설명 |
| --- | --- | --- | --- |
| id | int | Primary Key | 아이디 |
| post_id | int | Foreign Key | 게시글 아이디 |
| member_id | int | Foreign Key | 스크랩한 회원 아이디 |
| scrapped_at | timestamp | not null | 스크랩 등록 시간 |

### comment - 댓글

| 컬럼명 | 데이터 타입 | 조건 | 설명 |
| --- | --- | --- | --- |
| id | int | Primary Key | 아이디 |
| member_id | varchar(50) | unique not null | 댓글 작성자 아이디  |
| post_id | varchar(20) | unique not null | 게시글 아이디 |
| parent_member_id | varchar(100) | not null | 부모 댓글 작성자 아이디 |
| root_comment_id | varchar(20) | not null | 루트 댓글 아이디 |
| is_post_author | boolean | not null | 게시글 작성자의 댓글 여부 |
| is_root | boolean | not null | 루트 댓글 여부 |
| is_root_child | boolean | not null | 루트 댓글의 자식 여부 |
| is_deleted | boolean | not null | 삭제 여부 |
| body | varchar(500) | not null | 댓글 본문 |
| created_at | timestamp | not null | 생성 시간 |
| group_created_at | timestamp | not null | 댓글 그룹 생성 시간 |
| child_count | int | not null | 자식 댓글 수 |

### comment_stat - 댓글 통계

| 컬럼명 | 데이터 타입 | 조건 | 설명 |
| --- | --- | --- | --- |
| id | int | Primary Key | 아이디 |
| comment_id | int | Foreign Key | 댓글 아이디  |
| recommend_count | int | not null | 추천 수 |

### comment_recommend_member - 댓글에 추천한 회원

| 컬럼명 | 데이터 타입 | 조건 | 설명 |
| --- | --- | --- | --- |
| id | int | Primary Key | 아이디 |
| comment_id | int | Foreign Key | 댓글 아이디 |
| member_id | int | Foreign Key | 추천한 회원 아이디 |
