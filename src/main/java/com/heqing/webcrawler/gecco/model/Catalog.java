package com.heqing.webcrawler.gecco.model;

import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.Request;
import com.geccocrawler.gecco.request.HttpRequest;
import com.geccocrawler.gecco.spider.HrefBean;
import com.geccocrawler.gecco.spider.HtmlBean;
import lombok.Data;

import java.util.List;

/**
 * @author heqing
 * @since 2021-07-21
 */
@Data
@Gecco(pipelines={"consolePipeline", "catalogConsolePipeline"})
public class Catalog implements HtmlBean {

    @Request
    private HttpRequest request;

    @HtmlField(cssPath=".typecont span a")
    private List<HrefBean> poemUrlList;

}
