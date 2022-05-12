FROM maven:3.8.5-jdk-11

RUN cp /app/* /build

WORKDIR /build

CMD ["mvn", "compile"]