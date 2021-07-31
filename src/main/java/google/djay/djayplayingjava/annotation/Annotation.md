

# Annotation

## Base
- 기본적으로 주석과 같다.
- default retention은 CLASS 다
  - 그래서 source에서 참조하려면 ***@Retention(RetentionPolicy.RUNTIME)***
- 적용 Target을 지정할수있다.
  - e.g.
    > @Target({ElementType.TYPE, ElementType.METHOD})
- field와 값을 가질 수 있다
  - field name이 value인경우 생략하고 선언 가능하다.
    - e.g. 
      > @DjayAnnotation(true)  
        @EwanAnnotation(value = true, fatherName = "djay", motherName = "stella")  
        public class Djay

## 활용
- 다음 이시간에.. 넘나졸린것