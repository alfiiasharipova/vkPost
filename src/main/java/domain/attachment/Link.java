package domain.attachment;

public class Link {
    private String url;
    private String title;
    private String caption;
    private String description;
    private Photo photo;
    private boolean isExternal;
    private String previewPage;
    private String previewUrl;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Photo getPhoto() {
        return photo;
    }

    public void setPhoto(Photo photo) {
        this.photo = photo;
    }

    public boolean isExternal() {
        return isExternal;
    }

    public void setExternal(boolean external) {
        isExternal = external;
    }

    public String getPreview_page() {
        return previewPage;
    }

    public void setPreview_page(String preview_page) {
        this.previewPage = preview_page;
    }

    public String getPreview_url() {
        return previewUrl;
    }

    public void setPreview_url(String preview_url) {
        this.previewUrl = preview_url;
    }
}
