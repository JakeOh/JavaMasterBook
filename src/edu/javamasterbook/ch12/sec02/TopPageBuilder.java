package edu.javamasterbook.ch12.sec02;

public class TopPageBuilder implements Builder {

    private TopPage page;

    public TopPageBuilder() {
        this.page = new TopPage();
    }

    @Override
    public void createHeader() {
        page.setHeader("Top Page Header");
    }

    @Override
    public void createContents() {
        page.setContents("Top Page Contents");
    }

    @Override
    public void createFooter() {
        page.setFooter("Top Page Footer");
    }

    @Override
    public Page getPage() {
        return page;
    }
}
