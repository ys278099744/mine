package cn.tongdun.kraken.web.util;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * Created by xiazhen on 17/2/17.
 */
public class AuthUtil {

    public static boolean checkIfLogined() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth != null && auth instanceof UsernamePasswordAuthenticationToken) {
            return true;
        }
        return false;
    }

    public static String currentUserName() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth != null && auth instanceof UsernamePasswordAuthenticationToken) {
            UsernamePasswordAuthenticationToken ga = (UsernamePasswordAuthenticationToken) auth;
            return ga.getName();
        }
        return "";
    }
}