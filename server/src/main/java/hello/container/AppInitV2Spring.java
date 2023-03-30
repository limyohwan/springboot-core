package hello.container;

import hello.spring.HelloConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletRegistration;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class AppInitV2Spring implements AppInit{
    @Override
    public void onStartup(ServletContext servletContext) {
        System.out.println("AppInitV2Spring.onStartup");

        //create spring container
        AnnotationConfigWebApplicationContext appContext = new AnnotationConfigWebApplicationContext();
        appContext.register(HelloConfig.class);

        //create spring mvc dispatcher servlet and connect spring container
        DispatcherServlet dispatcher = new DispatcherServlet(appContext);

        //enroll dispatcher servlet to spring container
        ServletRegistration.Dynamic servlet = servletContext.addServlet("dispatcherV2", dispatcher);
        servlet.addMapping("/spring/*");
    }
}
