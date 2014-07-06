package com.secrettransaction.reportserver.api;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.Named;

@Api(
	name = "status",
	version = "v1"
)
public class StatusAPI {

	public Status getStatus(@Named("clientId") String clientId) {
		Status s = new Status();
		s.setClientId(clientId);
		s.setTitle("OK");
		s.setMessage("This version is the best");
		s.setLatestVersion("1.0.1");
		
		return s;
	}
}
