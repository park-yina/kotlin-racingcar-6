# 필요한 함수 정리

## 1.입력에 대해서
### 1-1 가능한 예외 사항

✔ 이름의 길이가 길 경우->5글자 이상이면 오류 발생시켜야함
<br>
✔  ,를 통한 이름의 구분이 제대로 이루어지지 않을 경우도 존재
### 1-2 자동차의 이름 쪼개기

✔ split를 사용해서 ,를 기준으로 데이터 클래스나 배열에 집어넣기
<br>
[X] 입력시 Scanner과 next를 활용하여 쉼표를 구분자로 나누는 것도 가능. 어떤 것이 더 좋을까
->readline()사용해야함
<br>
요구조건 잘 읽기
<br>
    
### 1-3 시도 횟수 받기
✔ 시도 횟수의 경우 pickNumber을 사용하여 받아야함

   ## 2. 계산에 대해서
✔ 아까 입력 받은 시도 횟수를 어떻게 활용할 것인가?
    <br>
    for문이나 while을 쓰면 depth가 너무 깊어질 수도 있을듯. 게임을 실행하는 함수와 회차까지 실행하는 함수를 꼭 분리해야 요구 조건에 맞출 수 있을 것으로 추정

✔ 점수 계산 전 분리 작업
    <br>
    이름과 점수를 짝을 지어 진행하여야 한다.
    ->이러한 기능을 키와 value를 쌍으로 저장하는 map이나 pair을 사용하는 것이 좋을듯
    <br>
✔ ','과 "무작위 숫자의 처리"
<br>
    ✔무작위 숫자의 발생은 PickNumberInRange(시작범위, 끝 범위)로 처리한다
    <br>
    ✔들어온 숫자의 크기가 4이상일 때에만 전진이 가능하다.

## 3. 출력에 대해서
✔ "map의 키 : 맵의 value"의 형태로 실행 결과를 출력하여야한다. 
    repeat사용하여 특정 횟수만큼 특정 문자열을 출력하기

✔ 최종 우승자가 여러명이면 joinTostring을 사용하여 출력형태 맞추기
# 이번 주차를 진행하며 새로 알게된 함수
## .filter()함수
<br>
    말 그대로 filter은 콜렉션에서 어떠한 기준으로 걸러내는 데에 사용할 수 있는 함수
<blockquote>
    홀짝 감별 활용:val evenNumbers = numbers.filter { it % 2 == 0 }
    <br>
    .filterIndexed 활용해서 인덱스와 값을 동시에 활용하는 방법도 있음
</blockquote>
