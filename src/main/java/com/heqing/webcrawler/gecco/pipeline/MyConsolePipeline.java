package com.heqing.webcrawler.gecco.pipeline;

import com.alibaba.fastjson.JSONObject;
import com.geccocrawler.gecco.annotation.PipelineName;
import com.geccocrawler.gecco.pipeline.Pipeline;
import com.geccocrawler.gecco.spider.SpiderBean;

/**
 * @author heqing
 * @since 2021-07-21
 */
@PipelineName("myConsolePipeline")
public class MyConsolePipeline implements Pipeline<SpiderBean> {

    @Override
    public void process(SpiderBean bean) {
        System.out.println("自定义的输出 --> " + JSONObject.toJSONString(bean));
    }
}
