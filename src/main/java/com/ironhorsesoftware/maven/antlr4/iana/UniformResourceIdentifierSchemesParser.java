package com.ironhorsesoftware.maven.antlr4.iana;

import org.xml.sax.helpers.DefaultHandler;

public class UniformResourceIdentifierSchemesParser extends DefaultHandler implements Runnable {

	@Override
	public void run() {
		// 1. Fetch https://www.iana.org/assignments/uri-schemes/uri-schemes.xml
		//    * check if it changed using the Last-Modified / "If-Modified-Since: Sat, 23 Nov 2024 14:50:00 GMT" headers
		//    * save the Expires date to avoid fetching if unnecessary
		//    * (store the date of last fetch as well as the expiration date.
		//       If the expiration date passed, send a request if the file changed since the time of last fetch.)

		// 2. Fetch https://www.iana.org/assignments/urn-namespaces/urn-namespaces.xml (if it hasn't changed)

		// 3. Parse both XML files and build a list of registered URI prefixes.
		//    * There should be an option for permanent vs. provisional for uri-schemes.xml
		//    * There should be an option for formal vs. informal for urn-namespaces.xml 

		// 4. Generate a lexer grammar file for these prefixes, which automatically
		//    switches to the correct "rest of the URI" lexical mode. 

		// 5. Write this generated file, plus all of the static lexer and parser grammar files,
		//    to the output directory (which should be the project's ANTLR imports directory).
	}
}
