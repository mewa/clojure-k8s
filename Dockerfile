FROM  java:8-jre-alpine

ADD ./target/uberjar/k8s-0.1.0-SNAPSHOT-standalone.jar entry.jar

CMD sh -c "cp /var/run/secrets/kubernetes.io/serviceaccount/ca.crt /usr/local/share/ca-certificates/k8s.crt && update-ca-certificates && java -jar entry.jar"
