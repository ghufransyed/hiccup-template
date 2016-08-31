FROM java:8-alpine
MAINTAINER Your Name <you@example.com>

ADD target/uberjar/hiccup-template.jar /hiccup-template/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/hiccup-template/app.jar"]
