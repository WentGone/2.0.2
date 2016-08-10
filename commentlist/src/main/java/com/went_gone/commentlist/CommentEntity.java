package com.went_gone.commentlist;

/**
 * Created by Administrator on 2016/6/20 0020.
 */
public class CommentEntity {
    /**
     * 內容
     */
    private String content;
    /**
     * 姓名1
     */
    private String name1;
    /**
     * 姓名2
     */
    private String name2;
    /**
     * 是否是回復
     */
    private boolean isComment;

    public CommentEntity(String content, String name1, String name2, boolean isComment) {
        this.content = content;
        this.name1 = name1;
        this.name2 = name2;
        this.isComment = isComment;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public boolean isComment() {
        return isComment;
    }

    public void setComment(boolean comment) {
        isComment = comment;
    }
}
