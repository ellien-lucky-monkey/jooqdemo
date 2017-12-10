package com.jooq.demo.config.web;

import com.jooq.demo.service.MyUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author ellien
 * @package com.jooq.demo.config.web
 * @date 2017/12/01 11:39
 */
@Configuration
@EnableWebSecurity
//启用Security注解，例如最常用的@PreAuthorize

@EnableGlobalMethodSecurity(prePostEnabled = true, securedEnabled=true, jsr250Enabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private MyUserDetailsService detailsService;

    //request层面的配置，对应XML Configuration中的<http>元素

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                //不需要认证的
                .antMatchers("/hello").permitAll()
                .antMatchers("/").permitAll()
                .antMatchers("/login").permitAll()
                .antMatchers("/register").permitAll()
                .antMatchers("/demo").permitAll()
                .antMatchers("/registration").permitAll()
                .antMatchers("/manage/*").permitAll()
                .antMatchers("/admin/**").hasAuthority("ADMIN")
                .anyRequest().authenticated()
                .and().formLogin().loginPage("/login").permitAll()
                .and().logout().permitAll()
                .and().csrf().disable();
    }

    //Web层面的配置，一般用来配置无需安全检查的路径

    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("js/**", "css/**", "images/**", "/**/favicon.ico");
    }

    //身份验证配置，用于注入自定义身份验证Bean和密码校验规则

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(detailsService).passwordEncoder(new BCryptPasswordEncoder());
//      auth.inMemoryAuthentication().withUser("admin").password("admin").roles("USER");
    }
}
