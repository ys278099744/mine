package cn.tongdun.kraken.web.support;

import cn.tongdun.kraken.web.support.security.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import javax.sql.DataSource;

/**
 * Created by xiazhen on 16/12/28.
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    @Qualifier("dataSource")
    private DataSource dataSource;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.headers().frameOptions().disable();

        http.authorizeRequests()
                .antMatchers("/css/**", "/js/**", "/imgs/**", "/_csrf", "/error", "/metrics").permitAll()
                .antMatchers("/api/v1/tables/**").permitAll()
                .antMatchers("/api/v1/table_auth/**").permitAll()
                .antMatchers("/ok.htm", "/v1/**").permitAll()
                .antMatchers("/druid/**").permitAll()
                .antMatchers("/enterprise/userManage/mlCheckAuth").permitAll()
                .antMatchers("/enterprise/relation/graphNetwork/find").permitAll()
                .antMatchers("/enterprise/*").permitAll()
                .antMatchers("/book/**").permitAll()


                .anyRequest().authenticated()

                .and()
                .csrf().disable()
                .formLogin().defaultSuccessUrl("/", true)
                .failureHandler(new UserNameAuthenticationFailureHandler())
                .successHandler(new SessionAuthenticationSuccessHandler())
                .permitAll()

                .and()
                .exceptionHandling()
                .authenticationEntryPoint(new CustomLoginUrlAuthenticationEntryPoint("/login"))

                .and()
                .logout()
                .permitAll()

                .and()
                .rememberMe()
                .userDetailsService(new LdapUserDetailsService())
                .tokenValiditySeconds(15 * 24 * 60 * 60); //15天
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.authenticationProvider(authenticationProvider());
    }

    @Bean
    public AuthenticationProvider authenticationProvider() {
        return new AuthProvider();
    }

}