/*
 * package com.spring.data.rest.example1.configuration;
 * 
 * import org.springframework.context.annotation.Configuration; import
 * org.springframework.data.rest.core.mapping.RepositoryDetectionStrategy.
 * RepositoryDetectionStrategies; import
 * org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
 * 
 * @Configuration public class RestConfiguration implements
 * RepositoryRestConfigurer {
 * 
 * @Override public void configureRepositoryRestConfiguration(
 * org.springframework.data.rest.core.config.RepositoryRestConfiguration
 * restConfiguration) { restConfiguration.setRepositoryDetectionStrategy(
 * RepositoryDetectionStrategies.ANNOTATED);
 * RepositoryRestConfigurer.super.configureRepositoryRestConfiguration(
 * restConfiguration); }
 * 
 * 
 * }
 */