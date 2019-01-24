package com.simile.helper.springCloud.feignClient;

/**
 * Spring Cloud 中的 FeignClient 帮助类
 * 用于自动生成指定Service接口中的FeignClient注解，以及对应的每个方法的接口地址
 * Created by yitao on 2019/1/22.
 */
public interface FeignClientHelper {

    /**
     * 生成指定接口文件的FeignClient注解到目标文件
     *
     * @param src         指定文件路径
     * @param target      目标文件路径
     * @param forceUpdate 是否强制更新目标文件
     */
    void genFeignClient(String src, String target, boolean forceUpdate);

}
