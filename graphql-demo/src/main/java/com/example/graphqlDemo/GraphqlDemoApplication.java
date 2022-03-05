package com.example.graphqlDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * {@link com.coxautodev.graphql.tools.GraphQLQueryResolver}
 * {@link com.coxautodev.graphql.tools.GraphQLMutationResolver}
 *
 * */
@SpringBootApplication
public class GraphqlDemoApplication  {

	public static void main(String[] args) {
		SpringApplication.run(GraphqlDemoApplication.class, args);
	}
//    @Bean
//    GraphQLSchema schema() {
//        return GraphQLSchema.newSchema()
//            .query(GraphQLObjectType.newObject()
//                .name("query")
//                .field(field -> field
//                    .name("getById")
//                    .type(Scalars.GraphQLString)
//                )
//                .build())
//            .build();
//    }
}
