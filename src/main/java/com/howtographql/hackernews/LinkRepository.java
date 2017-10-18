package com.howtographql.hackernews;

import java.util.List;
import java.util.ArrayList;

public class LinkRepository {
    private List<Link> links;

    public LinkRepository() {
	this.links = new ArrayList<Link>();
	this.links.add(new Link("http://graphql-java.readthedocs.io/en/v5/"," graphql readthedcos"));
	this.links.add(new Link("http://graphql.org/learn/queries/","GraphQl learn the queries"));
    }

    public List<Link> getAllLinks(){
	return this.links;
    }

    public void saveLink(Link link){
	this.links.add(link);
    }

}
