public class Story {
    private Situation start_story;
    public Situation current_situation;

    public Story() {
        System.out.println("На земле началась страшная эпидемия 21 века!" + "\n" +
                "Страшная болезнь начала губить множество жизней..." + "\n" +
                "Чтобы выжить и обезопасить себя, ВЫ решаете уехать на остров архипелага Ламу в юго-восточной Кении на 6 месяцев." + "\n" +
                "Ваша цель - выжить на острове, построить жилище, сделать оружие для вашей безопасноти.");
        start_story = new Situation("Первая встреча.", "Вы причалили к острову, ноги коснулись теплого песка, а солнце ярко светило в глаза." + "\n" + "Во время поездки вы проголодались и решили перекусить. Что вы предпримите?"
                + "\n" + "(1) Я взял немного еды с собой, поем то,что взял." + "\n" +
                "(2) Немного оглянувшись я увидел съедобные дикорастущие растения." + "\n" +
                "(3) Подойду поближе к пальмам...что это? вскрытый спелый кокос, то что нужно!", 3, 0, 0, 0);

        start_story.direction[0] = new Situation("Еда с собой.", "Вы съели все,что взяли в рюкзаке, в следующий раз вам придется идти на охоту", 0, +10, -10, 0);
        start_story.direction[1] = new Situation("Дикорастущие растения.", "Упс! Кажется вы не так хорошо разбираетесь в растениях, растение оказалось не съедобным!", 0, -20, 5, 0);
        start_story.direction[2] = new Situation("Кокос.", "Неплохо! Вы уталили жажду и вам стало немного легче", 0, +10, 10, 0);
        current_situation = start_story;

    }

    public void go(int num) {
        if (num <= current_situation.direction.length) {
            current_situation = current_situation.direction[num - 1];
        } else {
            System.out.println("Вы можете выбирать из " + current_situation.direction.length + " вариантов");
        }
    }

    public boolean isEnd() {
        return current_situation.direction.length == 0;
    }

}
