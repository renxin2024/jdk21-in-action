FROM alibabadragonwell/dragonwell:21.0.6.0.6.7
# 复制jar包到工作目录
COPY build/libs/jdk21-in-action-0.0.1.jar /app/jdk21-in-action-0.0.1.jar

# 切换工作目录到jar包目录
WORKDIR /app

# 使用 JSON 数组形式定义 ENTRYPOINT，提高命令解析的可靠性
ENTRYPOINT ["java", "-Xms128m", "-Xmx128m", "-jar", "jdk21-in-action-0.0.1.jar"]

# 明确暴露端口（假设应用默认使用 8080 端口）
EXPOSE 80
