package org.springframework.samples.petclinic.system;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
public class OutboundHttpController {

	private final String OUTBOUND_HTTP_API_URL = "https://api.restful-api.dev/objects";

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/objects")
	public String getObjects() {
		Map<String, String> params = new HashMap<>();
		String response = restTemplate.getForObject(OUTBOUND_HTTP_API_URL, String.class, params);

		return response.toString();
	}

}
