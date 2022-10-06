## Ch 2. The Mythical Man-Month

많은 수의 software 프로젝트는 다른 이유보다 일정 상의 문제로 실패하는 경우가 많다. 이런 실패가 발생하는 몇가지 이유는 다음과 같다.

> Estimating technique의 부족
> 
> Effort / Progress의 혼동. Man / Month가 보완 가능하다는 착각
> 
> Estimation에 확신이 없어 문제가 발생한다
> 
> 스케쥴 진행에 대한 monitoring이 적다.
> 
> 스케쥴이 문제가 생기면 manpower를 증가시키는데, 이는 상황을 악화시킨다.




### Optimism
----
모든 프로그래머들은 낙관론자이다. 그들은 Happy Ending을 꿈꾼다. Scheduling에 있어 첫 번째 실수는 낙관론인다.
> "이제 진짜 실행될거야", "나는 마지막 버그를 찾았어"

Idea, Implementation, Interactuib의 3단계로 나눌 때, Idea 단계에서는 모호함과 불확실성, 또 그에 따른 낙관을 갖는다. 이는 Implementation 과정에서 실제로 마주하게 된다.


### The Man-Month
----
Man과 Month가 보완적이라는 미신을 갖는다. 실제로는 task가 independent하지 않고, 많은 communication이 필요하다.

Communication은 train과 intercommunication으로 구분된다. # of workers를 n이라 할 때
> train은 n에 비례
>
>  intercommunication은 n(n-1)/2에 비례


### System Test
----
System test의 시간은 mis-schedule되기 쉽다. 이는 error가 예측 불가능하고, code를 정확하게 잘 짤 것이라는 낙관기인한다.

> Scheduling의 바람직한 계획의 예시는 다음과 같다.
> 1/3:  planning
> 1/6:  coding
> 1/4:	component test and early system test
> 1/4:	system test, all components in hand


### Regenerative Schedule Disaster
----
Project Delay를 발견하면, 우리는 주로 manpower를 추가한다.


