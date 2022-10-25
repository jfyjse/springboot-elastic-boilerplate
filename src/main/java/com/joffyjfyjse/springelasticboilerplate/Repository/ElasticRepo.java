package com.joffyjfyjse.springelasticboilerplate.Repository;
import com.joffyjfyjse.springelasticboilerplate.Model.ElasticModel;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElasticRepo extends ElasticsearchRepository<ElasticModel,String> {

}
