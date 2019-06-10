package br.com.carneiro.blog

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class BlogApplicationTests {

    //gradle test --tests org.gradle.SomeTest.someSpecificFeature
    //gradle test --tests *SomeTest.someSpecificFeature
    //gradle test --tests *SomeSpecificTest
    //gradle test --tests all.in.specific.package*
    //gradle test --tests *IntegTest
    //gradle test --tests *IntegTest*ui*
    //gradle test --tests *IntegTest.singleMethod
    //gradle someTestTask --tests *UiTest someOtherTestTask --tests *WebTest*ui
    @Test
    fun contextLoads() {
    }

}
