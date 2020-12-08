package swagger;


import org.glassfish.jersey.server.ResourceConfig;

import io.swagger.jaxrs.config.BeanConfig;
public class BackendApplication extends ResourceConfig {
	public BackendApplication() {
		register(new BackendBinder());
		register(io.swagger.jaxrs.listing.ApiListingResource.class);
		register(io.swagger.jaxrs.listing.SwaggerSerializers.class);
		BeanConfig beanConfig = new BeanConfig();
		beanConfig.setVersion("1.6.0");
		beanConfig.setSchemes(new String[] { "http" });
		beanConfig.setTitle("Salesken-Core");
		beanConfig.setHost("localhost:8080");
		beanConfig.setBasePath("/api");
		beanConfig.setResourcePackage("io.swagger.resources");
		//beanConfig.setScan(true);
		packages("myservice");
	}
}
