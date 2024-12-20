# 使用一个 Java 环境的基础镜像
FROM openjdk:17-jdk-slim

# 安装 Tomcat
ENV TOMCAT_VERSION=9.0.63
ENV CATALINA_HOME=/opt/tomcat
RUN apt-get update && \
    apt-get install -y wget && \
    wget https://archive.apache.org/dist/tomcat/tomcat-9/v${TOMCAT_VERSION}/bin/apache-tomcat-${TOMCAT_VERSION}.tar.gz && \
    tar -xvzf apache-tomcat-${TOMCAT_VERSION}.tar.gz && \
    mv apache-tomcat-${TOMCAT_VERSION} /opt/tomcat && \
    rm apache-tomcat-${TOMCAT_VERSION}.tar.gz

# 设置环境变量
ENV PATH=$CATALINA_HOME/bin:$PATH

# 启动 Tomcat
CMD ["catalina.sh", "run"]

# 端口配置
EXPOSE 8080
