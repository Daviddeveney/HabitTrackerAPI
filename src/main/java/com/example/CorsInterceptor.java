//package com.example;
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.logging.Logger;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.apache.log4j.spi.LoggerFactory;
//import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
//
//public class CorsInterceptor extends HandlerInterceptorAdapter {
//    
//
//    public static final String REQUEST_ORIGIN_NAME = "Origin";
//
//    public static final String CREDENTIALS_NAME = "Access-Control-Allow-Credentials";
//    public static final String ORIGIN_NAME = "Access-Control-Allow-Origin";
//    public static final String METHODS_NAME = "Access-Control-Allow-Methods";
//    public static final String HEADERS_NAME = "Access-Control-Allow-Headers";
//    public static final String MAX_AGE_NAME = "Access-Control-Max-Age";
//
//    private final List<String> origins;
//    
//    public CorsInterceptor(String origins) {
//        this.origins = Arrays.asList(origins.trim().split("( )*,( )*"));
//    }
//
//    @Override
//    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        response.setHeader(CREDENTIALS_NAME, "true");
//        response.setHeader(METHODS_NAME, "GET, OPTIONS, POST, PUT, DELETE");
//        response.setHeader(HEADERS_NAME, "Origin, X-Requested-With, Content-Type, Accept");
//        response.setHeader(MAX_AGE_NAME, "3600");
//        
//        String origin = request.getHeader(REQUEST_ORIGIN_NAME);
//        if (origins.contains(origin)) {
//            response.setHeader(ORIGIN_NAME, origin);
//            return true; // Proceed
//        } else {
//            // Include an origin to provide a clear browser error
//            response.setHeader(ORIGIN_NAME, origins.iterator().next());
//            return false; // No need to find handler
//        }
//    }
//
//}