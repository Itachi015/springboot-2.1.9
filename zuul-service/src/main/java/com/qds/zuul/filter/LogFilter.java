// package com.qds.zuul.filter;
//
// import com.netflix.zuul.ZuulFilter;
// import com.netflix.zuul.exception.ZuulException;
// import lombok.extern.slf4j.Slf4j;
// import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
// import org.springframework.stereotype.Component;
//
// /**
//  * @author kong
//  */
// @Slf4j
// @Component
// public class LogFilter extends ZuulFilter {
//     @Override
//     public String filterType() {
//         log.info("请求被路由中...");
//         return FilterConstants.ROUTE_TYPE;
//     }
//
//     @Override
//     public int filterOrder() {
//         return -1;
//     }
//
//     @Override
//     public boolean shouldFilter() {
//         return true;
//     }
//
//     @Override
//     public Object run() throws ZuulException {
//         return null;
//     }
// }
