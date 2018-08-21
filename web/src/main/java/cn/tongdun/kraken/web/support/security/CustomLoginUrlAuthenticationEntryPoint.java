package cn.tongdun.kraken.web.support.security;

import org.springframework.http.HttpStatus;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.LoginUrlAuthenticationEntryPoint;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by libinsong on 2017/5/10.
 */
public class CustomLoginUrlAuthenticationEntryPoint extends LoginUrlAuthenticationEntryPoint {

    public CustomLoginUrlAuthenticationEntryPoint(String loginFormUrl) {
        super(loginFormUrl);
    }

    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response,
                         AuthenticationException authException) throws IOException, ServletException {
        if(!isAjaxRequest(request)) {
            super.commence(request, response, authException);
        }
        response.setStatus(HttpStatus.UNAUTHORIZED.value());
    }

    public boolean isAjaxRequest(HttpServletRequest request) {
        String requestedWith = request.getHeader("X-Requested-With");
        return requestedWith != null ? "XMLHttpRequest".equals(requestedWith) : false;
    }
}
