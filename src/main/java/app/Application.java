package app;

import app.config.AppConfig;
import app.model.AnimalsCage;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        for (int i = 0; i < 5; i++) {
            AnimalsCage bean =
                    applicationContext.getBean(AnimalsCage.class);
            bean.whatAnimalSay();
            System.out.println(bean.getTimer().getTime());
        }
    }

}

//        4) На основе класса Timer создайте бин. Свяжите с AnimalCage. Проверьте, что при выполнении метода main время, которое пишет таймер, одно и тоже.
//        5) Раскоментировать тест из заготовки и проверить своё решение.