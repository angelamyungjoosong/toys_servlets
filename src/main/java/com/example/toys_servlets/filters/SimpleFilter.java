package com.example.study_servlet.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

// @WebFilter(urlPatterns = "/*")  // url의 모든 것은 이 필터를 거치게 해줌(어떤 servlet이든 거쳐가게 됨)
public class SimpleFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)  // filterchain을 해줘야 필터에서 끝나지 않고 다음 서블릿으로 넘어갈 수 있음
            throws IOException, ServletException {
        try {
            System.out.println(request.getRemoteHost());
            System.out.println(request.getRemoteAddr());
            chain.doFilter(request, response); // 필터에서 체크를 거친 뒤 다음 업무로 보내줘야 함.
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    

// //interface(대략으로 선언되었기 때문에) 직접 구현 필요. 
// //서블릿 들어가기 전 무조건  이거 거쳐서 들어가게 만들려고 함. 
// // 클라이언트는 특정 url로 들어옴. 따라서 확인 방법은 url. 
// import javax.servlet.annotation.WebFilter;

// //@WebFilter(urlPatterns = "/*") //이렇게 하면 모든 게 필터를 거치게 된다. 
// public class SimpleFilter implements Filter {

//     @Override
//     public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
//         {
//             try {
//                 System.out.println(request.getRemoteHost());//클라이언트가 헤더한테 쏘아보내는 내용 
//                 System.out.println(request.getRemoteAddr());
//                 chain.doFilter(request, response); //다시 서블릿으로 가도록 연결해주는 필터체인 만들어줘야함. 
//             } catch (Exception e) {
//                 System.out.println(e.getMessage());
//             }
//         }
}


