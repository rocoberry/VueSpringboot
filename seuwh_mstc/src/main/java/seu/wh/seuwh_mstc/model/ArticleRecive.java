/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package seu.wh.seuwh_mstc.model;

import java.util.Date;
import java.util.List;

public class ArticleRecive {
    private Integer id;
    private String title;
    private Category category;
    private String summary;
    private List<TagId> tags;
    private ArticleBody body;

    public void setCategory(Category category) {
        this.category = category;
    }



    public String getSummary() {
        return summary;
    }

    public Category getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "ArticleRecive{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", category=" + category +
                ", summary='" + summary + '\'' +
                ", tags=" + tags +
                ", body=" + body +
                '}';
    }


    public void setSummary(String summary) {
        this.summary = summary;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }




    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public List<TagId> getTags() {
        return tags;
    }

    public void setTags(List<TagId> tags) {
        this.tags = tags;
    }

    public ArticleBody getBody() {
        return body;
    }

    public void setBody(ArticleBody body) {
        this.body = body;
    }

}
