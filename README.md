
---

# 🚀 SSAFY A형 취득 목표: 7일 7문제 알고리즘 스터디

> **"꾸준함이 실력을 만든다."**
> 매주 7개의 문제를 풀며 모의 SW 역량테스트 A형 취득을 목표로 하는 스터디입니다. 함께 끝까지 완주해서 모두 A형을 따봅시다! 🔥

---

## 📚 주차별 문제 리스트

> 담당자는 문제를 선정한 후 아래 표에 내용을 업데이트해주세요.

### [1주차] 2026-03-02 ~ 2026-03-08

| 날짜 | 담당자 | 문제명 | 출처 | 링크 | 상태 |
| --- | --- | --- | --- | --- | --- |
| 03/03 (월) | 전원 | **정기 리뷰 및 문제 선정** | - | - | - |
| 03/04 (화) | 이강륜 | (문제명) | BAEKJOON | [Link](https://www.google.com/search?q=) | ⬜ |
| 03/05 (수) | 오민근 | (문제명) | SWEA | [Link](https://www.google.com/search?q=) | ⬜ |
| 03/06 (목) | 황민정 | (문제명) | BAEKJOON | [Link](https://www.google.com/search?q=) | ⬜ |
| 03/07 (금) | 안윤주 | (문제명) | SWEA | [Link](https://www.google.com/search?q=) | ⬜ |
| 03/08 (토) | 오민근 | (문제명) | BAEKJOON | [Link](https://www.google.com/search?q=) | ⬜ |
| 03/09 (일) | 안윤주 | (문제명) | SWEA | [Link](https://www.google.com/search?q=) | ⬜ |

---

## 📅 스터디 운영 방식

### 1. 목표 및 인원

* **목표:** 매주 기출/유형별 7문제 풀이 및 코드 리뷰를 통한 A형 정복
* **스터디원:** 이강륜, 오민근, 황민정, 안윤주 (총 4명)

### 2. 벌금 및 마감 규칙

* **마감 기한:** 매주 일요일 23:59까지 (PR 제출 기준)
* **벌금 규칙:** 미제출 시 **1문제당 3,000원** 벌금
* **판단 기준:** 마감 전까지 해당 주차 문제에 대한 Pull Request가 생성되지 않은 경우

---

## 📁 리포지토리 구조 및 파일 규칙

```text
root/
└── week01/
    └── 2026-03-XX_문제이름/
        ├── README.md (문제 요약 및 링크 - 담당자 작성)
        ├── kangryun.py
        ├── mingeun.java
        ├── minjeong.py
        └── yoonju.java

```

* **폴더명:** `week01`, `week02` ...
* **파일명:** 각자 지정된 이름의 소문자 파일명 사용 (`kangryun.py` 등)

---

## 💻 친절한 GitHub 사용 가이드 (Fork & PR)

> "Git이 처음이라도 괜찮아요! 차근차근 따라오면 누구나 할 수 있습니다. 😊"

### 1️⃣ 딱 한 번만! 초기 설정하기

1. **Fork 하기:** 상단 **Fork** 버튼을 눌러 이 레포지토리를 내 계정으로 가져옵니다.
2. **Clone 하기:** 내 컴퓨터로 코드를 내려받습니다. (내 아이디 확인!)
```bash
git clone https://github.com/내-아이디/레포명.git
cd 레포명

```


3. **Upstream 연결:** 원본 저장소의 소식을 들을 수 있게 'upstream'이라는 이름으로 등록해줍니다.
```bash
git remote add upstream https://github.com/스터디-원본-아이디/레포명.git

```



### 2️⃣ 매일매일! 문제를 풀 때 (루틴)

1. **최신 상태 동기화:** 작업 전, 원본의 새 문제를 내 컴퓨터로 가져옵니다.
```bash
git checkout main
git pull upstream main
git push origin main

```


2. **내 브랜치 만들기:** `main`은 소중하니까, 문제마다 새 브랜치를 만들어 작업해요.
```bash
git checkout -b week01-문제명-내이름

```


3. **코드 저장(Commit):** 풀이가 끝났다면 정성스럽게 커밋을 남깁니다.
```bash
git add .
git commit -m "Solve: [Week01] 백준 1234번 (이름)"

```


4. **내 저장소에 올리기(Push):** 내 포크(origin)에 브랜치를 업로드합니다.
```bash
git push origin week01-문제명-내이름

```



### 3️⃣ 드디어! PR(Pull Request) 날리기

1. 내 GitHub 포크 저장소에 들어가면 **[Compare & pull request]** 버튼이 떠있을 거예요. 클릭!
2. **화살표 방향**을 꼭 확인하세요!
* `base repository: 원본` ← `head repository: 내 포크`


3. 제목과 내용을 예쁘게 적고 **[Create pull request]**를 누르면 제출 완료! 🎉

---

## ✅ PR 체크리스트

* [ ] 정해진 폴더 구조와 파일명을 지켰나요?
* [ ] 문제 리스트 테이블을 업데이트했나요?
* [ ] 마감 시간(일요일 23:59)을 준수했나요?

---