package com.myexam.onlineexam.config;

import com.myexam.onlineexam.entity.QtnAns;
import com.myexam.onlineexam.repository.OnlineExamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class configuration implements CommandLineRunner {

    @Autowired
    OnlineExamRepository onlineExamRepository;


    @Override
    public void run(String... args) throws Exception {
        onlineExamRepository.save(new QtnAns(1,"what is your name ?"+" \n a) Ravi b) Rupesh c) Sumit"));
        onlineExamRepository.save(new QtnAns(2,"where do you live ?" +" \n a) Nanded b) Amravati c) Pune"));
        onlineExamRepository.save(new QtnAns(3,"what is your occupation ?" +" \n  a) Dancer b) Artist  c) Engineer"));
        onlineExamRepository.save(new QtnAns(4,"which car do you have ?"+"\n a) Renault b) Tata  c) Hundai"));
        onlineExamRepository.save(new QtnAns(5,"which is your favourate City ?"+"\n a) Pune b) Mumbai  c) Nanded"));
    }
}
