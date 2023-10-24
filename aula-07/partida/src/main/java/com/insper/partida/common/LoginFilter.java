package main.java.com.insper.partida.common;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import com.insper.partida.common.game.PartidaService;
import java.io.IOException;

@Component
@Order(1)
public class LoginFilter implements Filter {

    @Autowired
    private PartidaService partidaService;

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        String token = ((HttpServletRequest) request).getHeader("token");
        String uri = ((HttpServletRequest) request).getRequestURI();
        String method = ((HttpServletRequest) request).getMethod();

        partidaService.validarUsuario(token);

        chain.doFilter(request, response);

    }
}