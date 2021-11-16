package com.heqing.webcrawler.jsoup;

import lombok.Data;

/**
 * @author heqing
 * @since 2021-07-21
 */
@Data
public class Poem {

    private String url;
    private String title;
    private String author;
    private String content;

}
