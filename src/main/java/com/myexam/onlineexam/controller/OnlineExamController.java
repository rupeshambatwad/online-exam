package com.myexam.onlineexam.controller;

import com.myexam.onlineexam.entity.QtnAns;
import com.myexam.onlineexam.entity.QtnList;
import com.myexam.onlineexam.service.OnlineExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/exam")
public class OnlineExamController {

    @Autowired
    OnlineExamService onlineExamService;

    @GetMapping("findQtn")
    public void findQtn()
    {
      onlineExamService.findQtnById();
    }

}
