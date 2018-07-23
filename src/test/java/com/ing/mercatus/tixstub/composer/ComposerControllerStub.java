package com.ing.mercatus.tixstub.composer;

import com.ing.mercatus.tixstub.TixStubApplication;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TixStubApplication.class)
public abstract class ComposerControllerStub {

    @Autowired
    private ComposerController composerController;

    @Before
    public void setUp() {
        RestAssuredMockMvc.standaloneSetup(composerController);
    }
}
