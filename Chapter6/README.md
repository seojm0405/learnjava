# 클래스 심화   

## 알아볼 것   

~~~java
public static void main(String[] args)
~~~

위 메인메서드를 뜯어서 이해해보자   

___   

# 접근제어자   

* 외부에서 접근할 수 있는 허용 범위
    * 제약이 강한 순서 private > protected > public  
    * ex) public은 어느곳에서든 해당 객체를 참조할 수 있다.    
* 여러 종류를 지정할 수 있지만, main함수만은 public을 지정해야한다.   

|    |외부 클래스|하위 클래스|동일 패키지|내부 클래스|
|---|---|---|---|---|
public     |O|O|O|O
protected|X|O|O|O
default|X|X|O|O
private|X|X|X|O   

___   

## static   

### static : static은 이 함수임을 의미

* 자바의 변수나 함수의 메모리 할당방법
    * static영역
    * heap영역 
        * 가비지컬렉터에 정리되지 않는다.   
* static 으로 함수 또는 클래스를 선언했을 경우 해당 객체는 컴파일 단계에서 정의가 된다.
* 그 이후 static이 아닌 객체가 정의된다.   
* 따라서 static객체에서 static객체가 아닌 객체를 호출 할 수 없다.   

___   

## void   

### void : 리턴되는 값이 없고, 해당 함수가 종료된 후 호출한 부분으로 이동   

* void자리에 int를 넣을경우 어떠한 처리를 실행한 후 정수형 데이터를 돌려보내겠다 라는 의미   
    * String은 문자열을 돌려보냄   

___   

## String[] args   

### args 문자열을 배열로 사용하겠다라는 의미 (args는 변수명)   

* main함수는 프로그램 실행시 처음으로 수행되는 함수이기 떄문에, 외부로 부터 값을 입력받을 수 있어야 한다.   
* 그러므로 항상 문자열 인자를 받게된다




