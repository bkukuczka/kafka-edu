# kafka-edu

## download
https://kafka.apache.org/downloads

## run

`.\bin\windows\zookeeper-server-start.bat config\zookeeper.properties`

`.\bin\windows\kafka-server-start.bat config\server.properties`

`.\bin\windows\kafka-topics.sh --create --topic quickstart-events --bootstrap-server localhost:9092`