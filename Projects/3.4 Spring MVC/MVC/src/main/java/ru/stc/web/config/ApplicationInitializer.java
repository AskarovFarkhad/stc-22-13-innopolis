package ru.stc.web.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class ApplicationInitializer implements WebApplicationInitializer {
    //«Веб-приложение» — это набор сервлетов и содержимого, установленных в определенном подмножестве пространства имен URL-адресов сервер
    //ServletContext - Определяет набор методов, которые сервлет использует для связи со своим контейнером сервлетов
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        //Класс, нужный для настройки web приложения
        AnnotationConfigWebApplicationContext webApplicationContext = new AnnotationConfigWebApplicationContext();
        //Закидываем настройку приложения
        webApplicationContext.register(ApplicationConfig.class);
        //Контекст веб приложения
        //слушатель при старте/завершении корневого класса Spring WebApplicationContext. Главное назначение -- связывание жизненного цикла ServletContext и ApplicationContext, ну и автоматическое создание ApplicationContext.
        ContextLoaderListener contextLoaderListener = new ContextLoaderListener(webApplicationContext);

        servletContext.addListener(contextLoaderListener);
        //Настройка сервлета
        ServletRegistration.Dynamic dispatcherServlet = servletContext.addServlet(
                "dispatcher", new DispatcherServlet(webApplicationContext));
        dispatcherServlet.setLoadOnStartup(1);
        dispatcherServlet.addMapping("/");
    }
}
