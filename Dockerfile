From openjdk:8
copy ./build/libs/spring-continuous-delivery-test-*.jar spring-continuous-delivery-test.jar
CMD ["java","-jar","spring-continuous-delivery-test.jar"]
