package br.com.senai.conf;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import br.com.senai.controller.HomeController;

@EnableWebMvc
@ComponentScan(basePackageClasses= {HomeController.class})
public class AppWebConfiguration {

}
