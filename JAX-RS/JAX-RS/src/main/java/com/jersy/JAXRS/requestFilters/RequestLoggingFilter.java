package com.jersy.JAXRS.requestFilters;

import java.io.IOException;
import java.util.Collection;
import java.util.Date;
import java.util.Enumeration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.ws.rs.container.ContainerRequestContext;
import jakarta.ws.rs.container.ContainerRequestFilter;
import jakarta.ws.rs.container.ContainerResponseContext;
import jakarta.ws.rs.container.ContainerResponseFilter;
import jakarta.ws.rs.ext.Provider;


@Provider
public class RequestLoggingFilter implements ContainerRequestFilter,ContainerResponseFilter,Filter {
	 private Logger logger = LoggerFactory.getLogger(RequestLoggingFilter.class);
	@Override
	public void filter(ContainerRequestContext requestContext) throws IOException {
		logger.info("Request filters");
		logger.info("Headers :"+requestContext.getHeaders());
		logger.info("Url of http request :"+requestContext.getUriInfo().getPath());
		//logger.info("Url of http request :"+requestContext.getUriInfo().getQueryParameters());
		
	}
	@Override
	public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext)
			throws IOException {
		
		logger.info("Response filters");
		logger.info("Headers :"+responseContext.getHeaders());
		logger.info("response headers :"+responseContext.getHeaders().values());
		logger.info("response objects :"+responseContext.getEntity().toString());
		logger.info("Headers :"+responseContext.getStatus());
		
	}
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletResponse res=(HttpServletResponse) response;
		Collection<String> headerNames = res.getHeaderNames();
		headerNames.forEach(x->logger.info(x));
    }
		
	

	

}
