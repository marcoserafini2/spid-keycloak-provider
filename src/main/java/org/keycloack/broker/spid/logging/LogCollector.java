package org.keycloack.broker.spid.logging;

import java.util.Date;

import org.jboss.logging.Logger;
import org.keycloak.saml.common.util.DocumentUtil;
import org.w3c.dom.Document;

/**
 * Log collector a scopo conservazione
 * 
 * @author SERMAR
 *
 */
public class LogCollector {

	protected static final Logger logger = Logger.getLogger(LogCollector.class);

	public static void logDocument(Document document) {
		String assertionWithoutLineSeparators = DocumentUtil.asString(document);
		if (logger.isDebugEnabled()) {
			logger.debugf("Log Collector -> [{%d}]", new Date().getTime());
		}
		logger.info(assertionWithoutLineSeparators.replaceAll("\\r?\\n", ""));
	}

}
