package cz.itnetwork.springblog.models.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class ArticleDTO {

    private long articleId;

    @NotBlank(message = "Vyplňte titulek")
    @NotNull(message = "Vyplňte titulek")
    @Size(max = 100, message = "Titulek je příliš dlouhý")
    private String title;

    @NotBlank(message = "Vyplňte popisek")
    @NotNull(message = "Vyplňte popisek")
    private String description;

    @NotBlank(message = "Vyplňte obsah")
    @NotNull(message = "Vyplňte obsah")
    private String content;

    //region: Getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getArticleId() {
        return articleId;
    }

    public void setArticleId(long articleId) {
        this.articleId = articleId;
    }
    //endregion
}
