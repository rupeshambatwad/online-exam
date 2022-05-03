package com.myexam.onlineexam.service;

import com.myexam.onlineexam.entity.QtnAns;
import com.myexam.onlineexam.entity.QtnList;
import com.myexam.onlineexam.repository.OnlineExamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Service
public class ExamServiceImpl implements OnlineExamService{

    @Autowired
    OnlineExamRepository onlineExamRepository;
    @Override
    public void findQtnById() {

        List<QtnAns> questions =onlineExamRepository.findAll();
        List<QtnList> qtnLists=new ArrayList<>();
        qtnLists.add(new QtnList(questions.get(0).getQtnAns(),"a"));
        qtnLists.add(new QtnList(questions.get(0).getQtnAns(),"b"));
        qtnLists.add(new QtnList(questions.get(1).getQtnAns(),"b"));
        qtnLists.add(new QtnList(questions.get(2).getQtnAns(),"c"));
        qtnLists.add(new QtnList(questions.get(3).getQtnAns(),"a"));
        qtnLists.add(new QtnList(questions.get(4).getQtnAns(),"a"));

        Scanner getInputAns= new Scanner(System.in);
        int score=0;
        for(int i=0;i<qtnLists.size();i++)
        {
            System.out.println(qtnLists.get(i).getQtnName());
            String answer= getInputAns.nextLine();
            if(answer.equals(qtnLists.get(i).getCorrectAnswer()))
            {
                score=score+1;
            }
        }
        System.out.println("\n Your score is "+score+" out of "+qtnLists.size() +" Total Questions");
        if(score==5)
        {
            System.out.println("\n You Achieved Grade A ");
        }else if(score>=2)
        {
            System.out.println("\n Sorry You Failed ");
        }
    }



}
