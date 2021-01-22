# elastic-apm-service-api
Sample Springboot application with Elastic APM Agent libraries and Elastic APM Agent

This is an experimentation to see how Elastic APM could be used for tracing.

1) First need to setup Elasticsearch, Kibana and Elasctic APM as mentioned in the APM documentation (ver7.10.2).
2) Next download the agent jar from Maven Central. Do not add the agent as a dependency to your application.
(The downloaded agent is included in this repository as "elastic-apm-agent-1.20.0.jar", you might need to download latest depending on Elastic stack version)
3) Run the java command from where the application jar is (in this case elastic-apm-service-api-0.0.1.jar)
java -javaagent:../elastic-apm-agent-elastic-apm-agent-1.20.0.jar \
	 -Delastic.apm.service_name=elastic-apm-service \
     -Delastic.apm.server_urls=http://localhost:8200 \
     -Delastic.apm.secret_token= \
     -Delastic.apm.application_packages=lk.elastic.apm \
     -jar elastic-apm-service-api-0.0.1.jar



References :<br>
1) https://www.elastic.co/guide/en/apm/get-started/current/index.html
2) https://www.elastic.co/guide/en/apm/get-started/current/install-and-run.html
