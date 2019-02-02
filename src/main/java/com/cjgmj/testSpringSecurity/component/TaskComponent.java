package com.cjgmj.testSpringSecurity.component;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.security.core.session.SessionRegistry;
import org.springframework.stereotype.Component;

@Component("taskComponent")
public class TaskComponent {

	private static final Log LOG = LogFactory.getLog(TaskComponent.class);
	
	@Autowired
	@Qualifier("sessionRegistry")
	private SessionRegistry sessionRegistry;
	
	@Scheduled(fixedDelay=300000)
	public void doTask() {
		LOG.info("Hay " + sessionRegistry.getAllPrincipals().size() + " usuarios conectados en la aplicación.");
	}
}
