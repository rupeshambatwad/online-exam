package com.myexam.onlineexam.repository;


import com.myexam.onlineexam.entity.QtnAns;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OnlineExamRepository extends JpaRepository<QtnAns,Long> {
}
