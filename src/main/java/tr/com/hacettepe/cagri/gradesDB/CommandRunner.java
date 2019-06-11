package tr.com.hacettepe.cagri.gradesDB;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class CommandRunner implements CommandLineRunner {
    @Autowired
    @Getter
    private GradeRepository gradeRepository;


    @Override
    public void run(String... args) {
        MainClass phy = new MainClass();
        phy.setLessonName("Fundamental Physics");
        phy.setMid1Value(60);
        phy.setMid2Value(70);
        phy.setFinalValue(84);
        phy.setLessonPass(true);

        MainClass math = new MainClass();
        math.setLessonName("Calculus");
        math.setMid1Value(40);
        math.setMid2Value(70);
        math.setFinalValue(24);
        math.setLessonPass(false);

        MainClass che = new MainClass();
        che.setLessonName("Fundamental Chemistry");
        che.setMid1Value(20);
        che.setMid2Value(70);
        che.setFinalValue(84);
        che.setLessonPass(true);

        MainClass cs = new MainClass(); phy.setLessonName("Computer Programing");
        cs.setLessonName("Computer Science");
        cs.setMid1Value(60);
        cs.setMid2Value(70);
        cs.setFinalValue(84);
        cs.setLessonPass(true);



        getGradeRepository().save(phy);
        getGradeRepository().save(math);
        getGradeRepository().save(che);
        getGradeRepository().save(cs);


    }
}
