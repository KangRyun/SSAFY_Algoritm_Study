
---

# 🚀 SSAFY A형 취득 목표: 7일 7문제 알고리즘 스터디

> **"꾸준함이 실력을 만든다."**
> 매주 기초 6문제와 A형 기출 1문제를 풀며, SW 역량테스트 A형 취득을 목표로 달리는 스터디입니다.

---

## 📅 주차별 문제 현황

> **문제 업로드 담당자**는 해당 요일에 문제를 선정한 후 아래 표를 업데이트해주세요.
<details>
<summary><b>✅ 지난 주차 문제 리스트 (펼치기/접기)</b></summary>
### [1주차] Stack, Queue 2026-03-05 ~ 2026-03-08

| 날짜 | 담당자 | 문제명 | 출처 | 링크 | 상태 |
| --- | --- | --- | --- | --- | --- |
| 03/03 (월) | 전원 | **정기 리뷰 및 문제 선정** | - | - | - |
| 03/05 (목) | 이강륜 | 제로 | BAEKJOON | [Link](https://www.acmicpc.net/problem/10773) | ⬜ |
| 03/06 (금) | 이강륜 | 스택수열 | BAEKJOON | [Link](https://www.acmicpc.net/problem/1874) | ⬜ |
| 03/07 (토) | 안윤주 | 문자열 폭발 | BAEKJOON | [Link](https://www.acmicpc.net/problem/9935) | ⬜ |
| 03/08 (일) | 오민근 | (오큰수) | BAEKJOON | [Link](https://www.acmicpc.net/problem/17298) | ⬜ |
</details>

### [2주차] 2026-03-09 ~ 2026-03-15
| 날짜 | 담당자 | 유형 | 문제명 | 출처 | 링크 | 상태 |
| :--- | :--- | :---: | :--- | :--- | :--- | :---: |
| **03/09 (월)** | **전원** | **리뷰** | **A형 기출 코드리뷰** | - | - | - |
| 03/10 (화) | 이강륜 | 덱 | 덱 | BAEKJOON | [Link](https://testcase.ac/problems/10866) | ⬜ |
| 03/11 (수) | 이강륜 | 덱 | queuestack| BAEKJOON | [Link](https://www.acmicpc.net/problem/24511) | ⬜ |
| 03/12 (목) | 이강륜 | 연결리스트 | 풍선 터뜨리기 | BAEKJOON | [Link](https://www.acmicpc.net/problem/2346) | ⬜ |
| 03/13 (금) | 이강륜 | **연결리스트+A** | 행운의 바퀴 / 미세먼지 안녕! | BAEKJOON | [Link](https://www.acmicpc.net/problem/2840)/[Link](https://www.acmicpc.net/problem/17144) | ⬜ |
| 03/14 (토) | 이강륜 | 트리 | 트리순회 | BAEKJOON | [Link](https://www.acmicpc.net/problem/1991) | ⬜ |
| 03/15 (일) | 이강륜 | 트리 | 트리의 부모 찾기 | BAEKJOON | [Link](https://www.acmicpc.net/problem/11725) | ⬜ |


---

## 📝 스터디 운영 규칙

### 1. 주간 스케줄
* **월요일:** 지난주 A형 기출 및 기초 문제 코드 리뷰 (풀이 공유/실수 포인트 정리)
* **화~목:** 하루 1개 기초 문제 풀이
* **금요일:** 기초 문제 1개 + **이번 주 A형 기출 문제 출제**
* **토~일:** 하루 1개 기초 문제 풀이

### 2. 벌금 및 마감
* **마감:** 매주 일요일 23:59 (PR 제출 기준)
* **벌금:** 미제출 시 **1문제당 3,000원**
* **인원:** 이강륜, 오민근, 황민정, 안윤주 (총 4명)

---
## 💸 벌금 현황판

> 문제를 풀지 않을 시 **1문제당 3,000원**의 벌금이 부과됩니다. (매주 월요일 정산)

| 주차 | 이강륜 | 오민근 | 황민정 | 안윤주 | 주차별 합계 |
| --- | --- | --- | --- | --- | --- |
| **1주차** | 3000원 | 0원 | 0원 | 0원 | 0원 |
| **2주차** | 0원 | 0원 | 0원 | 0원 | 0원 |
| **누적** | **3000원** | **0원** | **0원** | **0원** | **총 0원** |


---

## 💻 Shared Repo 워크플로우 (`git switch` 기반)

> 모든 멤버는 **Collaborator**로 등록되어 있어야 하며, 원본 저장소를 직접 Clone 하여 사용합니다.

### 🚩 공통 초기 설정 (최초 1회)
```bash
git clone [https://github.com/원본-아이디/레포명.git](https://github.com/원본-아이디/레포명.git)
cd 레포명

```

### ⬆️ 상황 1: 내가 "문제 업로드 담당자"일 때

1. **동기화 및 브랜치 생성:**
```bash
git switch main
git pull origin main
git switch -c upload/weekXX-문제명

```


2. **폴더 생성:** `weekXX/날짜_알고리즘유형_문제이름/` 구조로 폴더 생성
3. **README 업데이트:** 메인 README의 **주차별 문제 현황** 표에 문제 정보 기입
4. **푸시 및 PR:** `add/commit/push` 후 PR 생성 → 즉시 **Merge** 하여 공지

### ⬇️ 상황 2: 내가 "문제를 풀 때" (Solver)

1. **최신 상태 동기화:**
```bash
git switch main
git pull origin main

```


2. **내 브랜치 생성:**
```bash
git switch -c solve/weekXX-문제명-이름

```


3. **코드 작성:** 해당 문제 폴더 내에 `이름.py` 생성 (예: `kangryun.py`)
4. **푸시 및 PR:** `add/commit/push` 후 PR 생성 → **Reviewers**에 팀원 지정 → 승인 후 **Merge**

---

## 📁 리포지토리 구조 및 파일 규칙

```text
root/
├── README.md (전체 공지 및 문제 리스트)
└── week01/
    └── 2026-03-XX_알고리즘유형_문제이름/
        ├── README.md (문제 요약 및 링크 - 담당자 작성)
        ├── kangryun.py
        ├── mingeun.py
        ├── minjeong.py
        └── yoonju.py

```

* **폴더명 규칙:** `날짜_알고리즘유형_문제명` (예: `2026-03-13_A기출_낚시왕`)
* **파일명 규칙:** 각자 이름의 소문자 파일명 사용 (`minjeong.py`, `yoonju.py` 등)

---

## ✅ 최종 체크리스트

* [ ] 작업 시작 전 `git pull origin main`을 통해 최신화했나요?
* [ ] `main` 브랜치에서 직접 Push 하지 않고 **`git switch -c`**로 브랜치를 만들었나요?
* [ ] **폴더명 규칙 [날짜_알고리즘유형_문제명]을 준수했나요?**
* [ ] PR 제목 형식을 지켰나요? `[WeekXX] 문제명 - 이름`
* [ ] PR 본문에 간단한 풀이 요약 및 시간복잡도를 적었나요?

---

**함께 끝까지 완주해서 모두 A형 취득합시다! 🔥**

```

---

### 💡 리드미 적용 방법
1. 로컬 저장소에서 `README.md` 파일을 엽니다.
2. 위 내용을 모두 복사해서 붙여넣습니다.
3. `git add README.md`, `git commit -m "Docs: Initialize README with study rules"`, `git push origin main` 순서대로 입력하여 서버에 반영합니다. (방장이 처음 한 번만 하시면 됩니다!)

이제 이 멋진 리드미와 함께 스터디를 시작해 보세요! 추가로 더 수정하고 싶은 부분이 생기면 언제든 말씀해 주세요. :)

```