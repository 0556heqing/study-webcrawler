package com.heqing.webcrawler.gecco.model;

import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.RequestParameter;
import com.geccocrawler.gecco.annotation.Text;
import com.geccocrawler.gecco.spider.HtmlBean;
import lombok.Data;

/**
 * @author heqing
 * @since 2021-07-21
 */
@Data
@Gecco(matchUrl="https://so.gushiwen.org/shiwenv_{id}.aspx", pipelines="myConsolePipeline")
public class Poem implements HtmlBean {

    @RequestParameter("id")
    private String id;

    @Text
    @HtmlField(cssPath=".cont h1")
    private String title;

    @Text
    @HtmlField(cssPath=".cont p a b")
    private String author;

    @Text
    @HtmlField(cssPath=".cont .contson")
    private String content;

}
