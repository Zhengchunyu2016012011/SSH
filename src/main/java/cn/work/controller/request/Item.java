package cn.work.controller.request;



import javax.validation.constraints.NotEmpty;


public class Item {
    @NotEmpty
    private String itemTitle;
    @NotEmpty
    private String itemHead;
    @NotEmpty
    private String itemBody;

    public String getItemTitle() {
        return itemTitle;
    }

    public void setItemTitle(String itemTitle) {
        this.itemTitle = itemTitle;
    }

    public String getItemHead() {
        return itemHead;
    }

    public void setItemHead(String itemHead) {
        this.itemHead = itemHead;
    }

    public String getItemBody() {
        return itemBody;
    }

    public void setItemBody(String itemBody) {
        this.itemBody = itemBody;
    }
}
