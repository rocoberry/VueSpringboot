/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package seu.wh.seuwh_mstc.model.comment;

import seu.wh.seuwh_mstc.model.ArticleInfo;
import seu.wh.seuwh_mstc.model.User;

import java.util.Date;
import java.util.List;

public class CommentSend {
    private Integer id;
    private ArticleInfo articleInfo;
    private User author;
    private Date createdate;
    private String content;
    private Integer likecount;
    private Integer atlevel;
    private List<CommentChildren> childrens;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ArticleInfo getArticleInfo() {
        return articleInfo;
    }

    public void setArticleInfo(ArticleInfo articleInfo) {
        this.articleInfo = articleInfo;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikecount() {
        return likecount;
    }

    public void setLikecount(Integer likecount) {
        this.likecount = likecount;
    }

    public Integer getAtlevel() {
        return atlevel;
    }

    public void setAtlevel(Integer atlevel) {
        this.atlevel = atlevel;
    }

    public List<CommentChildren> getChildrens() {
        return childrens;
    }

    public void setChildrens(List<CommentChildren> childrens) {
        this.childrens = childrens;
    }
}
