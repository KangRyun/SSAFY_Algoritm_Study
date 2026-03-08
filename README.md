
---

# 🚀 SSAFY A형 취득 목표: 7일 7문제 알고리즘 스터디

> **"꾸준함이 실력을 만든다."**
> 매주 7개의 문제를 풀며 모의 SW 역량테스트 A형 취득을 목표로 하는 스터디입니다.

---

## 📅 주차별 문제 현황

> **문제 업로드 담당자**는 문제를 선정한 후 아래 표에 내용을 업데이트해주세요.

### [1주차] Stack, Queue 2026-03-05 ~ 2026-03-08

| 날짜 | 담당자 | 문제명 | 출처 | 링크 | 상태 |
| --- | --- | --- | --- | --- | --- |
| 03/03 (월) | 전원 | **정기 리뷰 및 문제 선정** | - | - | - |
| 03/05 (목) | 이강륜 | 제로 | BAEKJOON | [Link](https://www.acmicpc.net/problem/10773) | ⬜ |
| 03/06 (금) | 이강륜 | 스택수열 | BAEKJOON | [Link](https://www.acmicpc.net/problem/1874) | ⬜ |
| 03/07 (토) | 안윤주 | 문자열 폭발 | BAEKJOON | [Link](https://www.acmicpc.net/problem/9935) | ⬜ |
| 03/08 (일) | 오민근 | (오큰수) | BAEKJOON | [Link](https://www.acmicpc.net/problem/17298) | ⬜ |

---

## 📝 스터디 운영 규칙

### 1. 목표 및 인원

* **목표:** 매주 7문제 풀이 및 코드 리뷰를 통한 A형 정복
* **스터디원:** 이강륜, 오민근, 황민정, 안윤주 (총 4명)

### 2. 벌금 및 마감

* **마감:** 매주 일요일 23:59 (PR 제출 기준)
* **벌금:** 미제출 시 **1문제당 3,000원**
* **진행:** 월요일 정기 리뷰(풀이 공유 및 실수 정리)

---

## 💻 Shared Repo 워크플로우 (공유 저장소 방식)

> 모든 멤버는 **Collaborator**로 등록되어 있어야 하며, **원본 저장소**를 직접 Clone 하여 사용합니다.

### 🚩 공통 초기 설정 (최초 1회)

```bash
git clone https://github.com/원본-아이디/레포명.git
cd 레포명

```

---

### ⬆️ 상황 1: 내가 "문제 업로드 담당자"일 때

> 문제를 선정하고 **유형을 포함한 폴더**를 생성한 뒤 README의 문제 표를 업데이트합니다.

1. **최신 상태 동기화 및 브랜치 생성**
```bash
git checkout main
git pull origin main
git checkout -b upload/week01-문제명

```


2. **작업 내용**
* `week01/날짜_알고리즘유형_문제이름/` 폴더 생성
* (예: `week01/2026-03-04_DFS_네트워크/`)
* 루트(`/`) 폴더의 `README.md` 내 **주차별 문제 현황** 표 업데이트


3. **푸시 및 PR**
```bash
git add .
git commit -m "Upload: [Week01] 문제명 (담당자이름)"
git push origin upload/week01-문제명

```


4. **Merge:** PR 생성 후, 문제 공지를 위해 즉시 **Merge** 합니다.

---

### ⬇️ 상황 2: 내가 "문제를 풀 때" (Solver)

> 업로드된 문제를 확인하고 지정된 폴더에 내 풀이 코드를 올립니다.

1. **최신 상태 동기화 (필수!)**
```bash
git checkout main
git pull origin main

```


2. **내 브랜치 생성**
```bash
git checkout -b solve/week01-문제명-내이름

```


3. **코드 작성**
* 해당 문제 폴더(`날짜_알고리즘유형_문제이름`) 내에 `내이름.py` 파일 생성


4. **푸시 및 PR**
```bash
git add .
git commit -m "Solve: [Week01] 문제명 (내이름)"
git push origin solve/week01-문제명-내이름

```


5. **리뷰 및 머지**
* PR 생성 시 **Reviewers**에 팀원들을 지정하고, **Approve**를 받은 후 `Merge` 합니다.



---

## 📁 리포지토리 구조 및 파일 규칙

```text
root/
├── README.md (전체 공지 및 문제 리스트)
└── week01/
    └── 2026-03-XX_알고리즘유형_문제이름/  <-- 규칙 수정!
        ├── README.md (문제 요약 및 링크 - 담당자 작성)
        ├── kangryun.py
        ├── mingeun.java
        ├── minjeong.py
        └── yoonju.java

```

* **폴더명 규칙:** `날짜_알고리즘유형_문제이름` (예: `2026-03-04_BFS_미로탐색`)
* **브랜치명:** `upload/주차-문제명` 또는 `solve/주차-문제명-이름`
* **파일명:** 각자 이름의 소문자 파일명 사용 (`yoonju.py` 등)

---

## ✅ 최종 체크리스트

* [ ] 작업 시작 전 `git pull origin main`을 수행했나요?
* [ ] `main` 브랜치에 직접 Push 하지 않고 브랜치를 생성했나요?
* [ ] **폴더명에 알고리즘 유형을 포함했나요?**
* [ ] PR 제목 형식을 준수했나요? `[WeekXX] 문제명 - 이름`

---
