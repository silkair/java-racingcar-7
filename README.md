# java-racingcar-precourse

## 프로젝트 개요
자동차 경주 게임은 주어진 횟수 동안 여러 대의 자동차가 무작위로 전진하거나 멈추는 게임     
각 자동차는 이름을 가지고 있으며, 우승자는 가장 멀리 전진한 자동차이다. 사용자는 자동차 이름과 이동 횟수를 입력하여 게임을 진행할 수 있다.

## 기능 목록

### 1. 사용자 입력
- [ ] **자동차 이름 입력 받기**: 사용자는 쉼표(`,`)로 구분된 여러 자동차 이름을 입력할 수 있다.        
  - 각 자동차의 이름은 최대 5자 이하로 제한
  
- [ ] **이동 횟수 입력 받기**: 사용자는 자동차가 이동할 횟수를 입력할 수 있습니다.
  - 예: `5`

### 2. 게임 진행
- [ ] **랜덤 값에 따른 자동차 전진**: 각 턴에서 0부터 9 사이의 랜덤 값을 생성하며, 값이 4 이상이면 자동차는 전진한다.
 
- [ ] **자동차 이름과 함께 결과 출력**: 각 자동차가 전진할 때마다 현재까지의 전진 결과를 이름과 함께 출력
 
### 3. 결과 처리
- [ ] **우승자 계산**: 주어진 이동 횟수 후에 가장 많이 전진한 자동차가 우승자로 결정
  - 우승자가 여러 명일 경우 쉼표로 구분하여 출력
 
- [ ] **잘못된 입력 처리**: 자동차 이름이나 이동 횟수가 잘못 입력된 경우 `IllegalArgumentException`을 발생시키고, 애플리케이션을 종료
  - 이름이 5자를 초과하는 경우 등.

