# elastic-apm-service-api
Sample Springboot application with Elastic APM Agent libraries and Elastic APM Agent

This is an experimentation to see how Elastic APM could be used for tracing.

1) First need to setup Elasticsearch, Kibana and Elasctic APM as mentioned in the APM documentation (ver7.10.2).

2) Next download the agent jar from Maven Central. Do not add the agent as a dependency to your application.
(The downloaded agent is included in this repository as "elastic-apm-agent-1.20.0.jar", you might need to download latest depending on Elastic stack version)

3) Run the java command from where the application jar is (in this case elastic-apm-service-api-0.0.1.jar)
<code>
	java -javaagent:<ACTUAL_PATH>/elastic-apm-service-api/elastic-apm-agent-1.20.0.jar
	-Delastic.apm.service_name=elastic-apm-service-api-0.0.1
	-Delastic.apm.server_urls=http://localhost:8200
	-Delastic.apm.secret_token= 
	-Delastic.apm.application_packages=lk.elastic.apm
	-jar elastic-apm-service-api-0.0.1.jar
</code>
	
4) Go to Kibana (http://localhost:5601) -> Observability -> APM. You'll see the service listed under services.

5) Make some requests to http://localhost:9090 and see how the stats change.

6) There are four basic data models that are captured by agents -> Span, Transaction, Error and Metrics
(Agent APIs are there to customize capturing events to some level, check documentation for each agent for a specific language)

7) Meta Data and Custom Contexts could be used to enrich spans and transactions.

References :
1) https://www.elastic.co/guide/en/apm/get-started/current/index.html
2) https://www.elastic.co/guide/en/apm/get-started/current/install-and-run.html
3) https://www.elastic.co/guide/en/apm/get-started/current/apm-features.html
4) https://www.elastic.co/guide/en/apm/agent/java/1.x/index.html
