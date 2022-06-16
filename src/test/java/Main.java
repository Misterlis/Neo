import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.*;

import static java.lang.Thread.sleep;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.$;

import java.awt.*;


public class Main {
    String input1 = "北京位於華北平原的西北边缘，背靠燕山，有永定河流经老城西南，毗邻天津市、河北省，是一座有三千余年建城历史、八百六十余年建都史的历史文化名城，历史上有金、元、明、清、中华民国（北洋政府时期）等五个朝代在此定都，以及数个政权建政于此，荟萃了自元明清以来的中华文化，拥有众多历史名胜古迹和人文景观。《不列颠百科全书》将北京形容为全球最伟大的城市之一，而且断言，“这座城市是中国历史上最重要的组成部分。在中国过去的八个世纪里，不论历史是否悠久，几乎北京所有主要建筑都拥有着不可磨灭的民族和历史意义”。北京古迹众多，著名的有故宫、天坛、颐和园、圆明园、北海公园等。";
    String input2 = "#@%^%#$@#$@#.com";
    String input3 = "Iñtërnâtiônàlizætiøn☃";
    String input4 = "एक जल्दी भूरी लोमड़ी आलसी कुत्ते पर कूदता";
    String input5 = "-1 ";
    String input6 = "ᴮᴵᴳᴮᴵᴿᴰ";


    @BeforeEach
    public void beforeAll() {
    }

    @AfterEach
    public void afterAll() {
    }

    @Test
    public void Test1() throws AWTException, InterruptedException {

        open("http://ossetianpie.ru/", neo.class)
                .clickbuttonPIROGI()
                .clickbuttonCART()
                .clickbuttonCART2()
                .input1()
                .input2()
                .input3()
                .input4()
                .input5()
                .input6()
                .clickbuttonOFORMIT();
    }
}

