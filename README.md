# spring-cloud-helper
自动生成springcloud的一些配置，比如FeignClient。

#功能清单
+ 在service接口中自动生成FeignClient注解
  通过分析service接口中声明的方法，将可以声明为微服务API服务的方法生成RequestMapping/GetMapping/PostMapping此类注解。
  不符合微服务API服务，将会被返回。
