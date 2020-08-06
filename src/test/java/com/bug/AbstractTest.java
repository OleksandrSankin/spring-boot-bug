package com.bug;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.web.client.RestTemplate;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
abstract class AbstractTest {

	@LocalServerPort private int port;

	@Autowired private RestTemplateBuilder restTemplateBuilder;

	//Ignore this line and spring-boot will not run a separate instance of Tomcat per test
	@SpyBean private HelloService helloService;

	protected RestTemplate getRestTemplate() {
		return restTemplateBuilder.build();
	}

	protected String getUrl() {
		return "http://localhost:" + port;
	}
}
