package br.com.aprendendo.spring.cloud.eureka.client.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class PegaPalavraController {

	@Autowired
	private DiscoveryClient discoveryClient;

	@RequestMapping("/sentenca")
	public String getSentenca() {
		StringBuffer sentenca = new StringBuffer();
		
		sentenca.append(getWord("EurekaClientPronome"));
		sentenca.append(getWord("EurekaClientAdjetivo"));
		
	    return sentenca.toString();
	}
	
	public String getWord(String service) {
	    List<ServiceInstance> list = discoveryClient.getInstances(service);
	    if (list != null && list.size() > 0 ) {
	      URI uri = list.get(0).getUri();
	  if (uri !=null ) {
	    return (new RestTemplate()).getForObject(uri+"/palavra",String.class);
	  }
	    }
	    return null;
	  }

}
