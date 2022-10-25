package com.joffyjfyjse.springelasticboilerplate;
import com.joffyjfyjse.springelasticboilerplate.Model.ElasticModel;
import com.joffyjfyjse.springelasticboilerplate.Repository.ElasticRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduleTestDataSend {
    @Autowired
    ElasticRepo elasticRepo;
    @Scheduled(fixedDelay = 10000)
    public void saveElasticData() {
        try {
            ElasticModel elasticModel = new ElasticModel();
            elasticModel.setMajor(1152);
            elasticModel.setMinor(6525);
            elasticModel.setUuid("idbjoffyhkjdi5");
            elasticModel.setDateTime("ythhdkjtimeb");
            elasticModel.setTopic("-topic-test");
            elasticModel.setRssi(69);
            elasticRepo.save(elasticModel);
            System.out.println("save success !!");


        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("failed to create mesh type 1");
        }
    }
}
