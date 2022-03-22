package com.github.jvanheesch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class Application {
    @Autowired
    private VerslagRepository verslagRepository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @PostConstruct
    public void init() {
        Notitie notitie1 = new Notitie();
        notitie1.setNotitieText("notitie1");
        notitie1.setVerslagText("verslagText1");
        verslagRepository.save(notitie1);

        Memo memo1 = new Memo();
        memo1.setMemoText("memo1");
        memo1.setVerslagText("verslagText2");
        verslagRepository.save(memo1);

        Notitie notitie2 = new Notitie();
        notitie2.setNotitieText("notitie2");
        notitie2.setVerslagText("verslagText3");
        verslagRepository.save(notitie2);
    }
}
