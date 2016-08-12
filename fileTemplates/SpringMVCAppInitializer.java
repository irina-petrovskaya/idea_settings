package ${PACKAGE_NAME};

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 7/18/2016.
 * Project: SpringMvcNewFeaturesTest1
 * *******************************
 */
public class ${NAME} extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{${WEBCONFIG}.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
