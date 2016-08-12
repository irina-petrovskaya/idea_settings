package ${PACKAGE_NAME};

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * *******************************
 * Created by ${USER} on ${DATE}.
 * Project: ${PROJECT_NAME}
 
 * *******************************
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "${PACKAGE_NAME}")
public class ${NAME} extends WebMvcConfigurerAdapter
{
    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        registry.jsp();
        super.configureViewResolvers(registry);
    }


}


