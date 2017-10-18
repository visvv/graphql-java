package com.howtographql.hackernews;

import com.coxautodev.graphql.tools.SchemaParser;
import javax.servlet.annotation.WebServlet;
import graphql.servlet.SimpleGraphQLServlet;
import graphql.schema.GraphQLSchema;

@WebServlet(urlPatterns = "/graphql")
public class GraphQLEndpoint extends SimpleGraphQLServlet {
    public GraphQLEndpoint(){
	super(buildSchema());
    }
    public static GraphQLSchema buildSchema () { 
	LinkRepository linkRepository = new LinkRepository();
	return SchemaParser.newParser()
	    .file("schema.graphqls") //parse the schema file created earlier
	    .resolvers(new Query(linkRepository))
	    .build()
	    .makeExecutableSchema();
    }
}
