package com.howtographql.hackernews;

public class Link {
  private String url;
  private String description;

  public Link(final String url, final String description) {
     this.url = url;
     this.description = description;
  }

  public String getUrl() {
     return this.url;
  }

  public String getDescription(){
     return this.description;
  }

}
