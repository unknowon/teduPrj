package cn.edu.gues.pojo;

import java.util.Date;

/**
 * Book
 *
 * @author lulu
 * @date 2019-07-02
 **/
public class Book {
    private Long id;
    private String isbn;
    private String title;
    private String author;
    private Double price;
    private String press;
    private Integer edition;
    private Date published;
    private Integer pages;
    private Integer words;
    private String packaging;
    private String format;
    private String form;

    private String indexImg;
    private String collectImg;
    private String detailImg;
    private String introImg;
    private String detailBigImg;

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", press='" + press + '\'' +
                ", edition=" + edition +
                ", published=" + published +
                ", pages=" + pages +
                ", words=" + words +
                ", packaging='" + packaging + '\'' +
                ", format='" + format + '\'' +
                ", form='" + form + '\'' +
                ", indexImg='" + indexImg + '\'' +
                ", collectImg='" + collectImg + '\'' +
                ", detailImg='" + detailImg + '\'' +
                ", introImg='" + introImg + '\'' +
                ", detailBigImg='" + detailBigImg + '\'' +
                '}';
    }

    public String getIndexImg() {
        return indexImg;
    }

    public void setIndexImg(String indexImg) {
        this.indexImg = indexImg;
    }

    public String getCollectImg() {
        return collectImg;
    }

    public void setCollectImg(String collectImg) {
        this.collectImg = collectImg;
    }

    public String getDetailImg() {
        return detailImg;
    }

    public void setDetailImg(String detailImg) {
        this.detailImg = detailImg;
    }

    public String getIntroImg() {
        return introImg;
    }

    public void setIntroImg(String introImg) {
        this.introImg = introImg;
    }

    public String getDetailBigImg() {
        return detailBigImg;
    }

    public void setDetailBigImg(String detailBigImg) {
        this.detailBigImg = detailBigImg;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public Integer getEdition() {
        return edition;
    }

    public void setEdition(Integer edition) {
        this.edition = edition;
    }

    public Date getPublished() {
        return published;
    }

    public void setPublished(Date published) {
        this.published = published;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public Integer getWords() {
        return words;
    }

    public void setWords(Integer words) {
        this.words = words;
    }

    public String getPackaging() {
        return packaging;
    }

    public void setPackaging(String packaging) {
        this.packaging = packaging;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }
}
