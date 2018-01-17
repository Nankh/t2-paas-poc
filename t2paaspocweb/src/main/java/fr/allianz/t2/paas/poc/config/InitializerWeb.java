package fr.allianz.t2.paas.poc.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

@Slf4j
public class InitializerWeb  extends AbstractAnnotationConfigDispatcherServletInitializer{
    public void onStartup(ServletContext servletContext) throws ServletException {
        super.onStartup(servletContext);

        //On déclare le static ressource filter sur l'ensemble des requetes/uri possibles (/*)
        // FilterRegistration.Dynamic staticResourcesFilter = servletContext.addFilter("StaticResourcesFilter", new DelegatingFilterProxy());
        // staticResourcesFilter.addMappingForUrlPatterns(null, false, "/*");

        //On déclare le static session logging filter sur l'ensemble des requetes/uri possibles (/*)
        /*FilterRegistration.Dynamic sessionLoggingFilter = servletContext.addFilter("SessionLoggingFilter", new DelegatingFilterProxy());
        sessionLoggingFilter.addMappingForUrlPatterns(null, false, "/*");
*/
        // FilterRegistration.Dynamic ssoiResourcesFilter = servletContext.addFilter("SooiFilter", new FiltreSSOi());

        log.debug("Avant appel service {}","/user/authenticate/sso");

        //  ssoiResourcesFilter.addMappingForUrlPatterns(null, false, "/orchestrator/user/authenticate/sso");
    }

    /**
     * Mapping : l'ensemble des controllers exposés commenceront obligatoirement par une uri commencant par /orchestrator/
     * @return
     */
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/*"};
    }

    /**
     * Le nom de la servlet exposant les orchestrator Rest (pour éviter une collision avec le SOAPConfig
     * @return
     */
    @Override
    protected String getServletName() {
        return "restServletDispatcher";
    }


    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{ConfigWeb.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{};
    }
}
