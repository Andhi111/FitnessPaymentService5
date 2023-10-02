FROM openjdk:11-jre-slim
COPY build/libs/FitnessPaymentService5.jar /FitnessPaymentService5.jar
CMD ["java", "-jar", "/FitnessPaymentService5.jar"]