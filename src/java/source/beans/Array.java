package source.beans;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jinda
 */
public class Array implements java.io.Serializable{

    String[] category = {"General Knowledge", "Java", "Maths", "Science", "Sports"};

    int[] value = {100, 200, 300, 400, 500};

    Question[] questions = new Question[25];

    public void loadQuestions() {
        questions[0] = new Question("General Knowledge", "Which of the five senses develops first?", 100, "Sight", "Taste", "Smell", "Hear", "Smell","Think about food whats attracts you towards it? ");
        questions[1] = new Question("General Knowledge", "Which element is coal mainly composed of?", 200, "Hydrogen", "Carbon", "Sulphur", "Nitrogen", "Carbon","Its black");
        questions[2] = new Question("General Knowledge", "Who wrote the line: ' A thing of beauty is a joy forever'?", 300, "John Keats", "Robert Browing", "P.B.Shelley", "William Wordsworth", "John Keats","Oops I forgot a hint,here!");
        questions[3] = new Question("General Knowledge", "Which two letters are worth the most in a game of Scrabble?", 400, "A and Z", "Q and Z", "P and Q", "S and T", "Q and Z","Its last but not the least");
        questions[4] = new Question("General Knowledge", "The ozone layer restricts?", 500, "Visible light", "Infrared radiation", "X-rays", "Ultraviolet radiation", "Ultraviolet radiation","UV");

        questions[5] = new Question("Java", "Which of these classes implements Set interface?", 100, " ArrayList", "HashSet", " LinkedList", "DynamicList", "HashSet","the Name has answer itself.");
        questions[6] = new Question("Java", "This is the parent of Error and Exception classes.", 200, "Catchable", "Throwable", "MainError", "MainException", "Throwable","Its easy!");
        questions[7] = new Question("Java", "In JSP Action tags which tags are used for bean development?", 300, "jsp:useBean", "jsp:setProperty", "jsp:getProperty", "All mentioned", "All mentioned","It is more than one!");
        questions[8] = new Question("Java", "Which of these keywords can be used to prevent Method overriding?", 400, " static ", "constant", "protected", " final", " final","Its a keyword!");
        questions[9] = new Question("Java", "A special method that is used to initialize a class object ?", 500, "Abstract Method", "static method", "Constructor", "overloaded method", "Constructor","We used 2 of them in jeopardy");

        questions[10] = new Question("Maths", "What number must you add to 66 to make the sum of 121?", 100, "187", "-55", "55", "45", "55","Do u really need a hint!");
        questions[11] = new Question("Maths", "What's the next number? 10, 5, 30, 15, 90, ...", 200, "45", "120", "60", "50", "45","Divide last number by 2");
        questions[12] = new Question("Maths", "If f(x) is an odd function, then | f(x) | is", 300, "an odd function","even function", "neither odd nor even", "even and odd","even function","Its other word for smooth");
        questions[13] = new Question("Maths", "106 × 106 – 94 × 94 = ? ", 400, "2004","2400", "1904", "1906", "2400","Calculate!");
        questions[14] = new Question("Maths", "2p2 -15p + 25 =", 500, "(p - 5)(2p - 5)", "(p - 5)(2p + 5)", "(p + 5)(2p - 5)", "(2p - 15)(p + 5)", "(p - 5)(2p - 5)","Use middle term splitting!");

        questions[15] = new Question("Science", "The loudness of a sound is determined by what property of a sound wave?", 100, "Frequency", "Wavelength", "Velocity", "Amplitude", "Amplitude","It gives magnitude.....");
        questions[16] = new Question("Science", "Which kind of waves are used to make and receive cellphone calls?", 200, "Micro Waves", "Radio Waves", "Infra-red rays", "Gamma-rays", "Radio Waves","We used it to listen music/news");
        questions[17] = new Question("Science", "Which of the following is used in pencils?", 300, "Graphite", "Silicon", "Charcoal", "Phosphorous", "Graphite","Do u really need a hint!");
        questions[18] = new Question("Science", "Which of the following is the symbol for gold?", 400, "G", "Ag", "Au", "Go", "Au","Starts with A");
        questions[19] = new Question("Science", "Enzymes and anti-bodies are mainly made of ?", 500, "Proteins", "Fats", "Carbohydrates", "Vitamins", "Proteins","They r healthy!");

        questions[20] = new Question("Sports", "Which is the national sport of Canada? ", 100, "Ice hockey", "Cricket", "Field hockey", "Volleyball", "Ice hockey","It freezes");
        questions[21] = new Question("Sports", "Which horse won the Melbourne Cup in 2002?", 200, "Media Puzzle", "Mr. Prudent", "Beekeeper", "Vinnie Roe", "Media Puzzle","Its a puzzle");
        questions[22] = new Question("Sports", "Ricky Ponting is also known as what?", 300, "The Rickster", "Ponts", "Ponter", "Punter", "Punter","Guess!");
        questions[23] = new Question("Sports", "In which sport is the participant called pugilist?", 400, "Sprinter", "Boxing", "Wrestling", "Javelin Throw", "Boxing","Its needs boxing gloves");
        questions[24] = new Question("Sports", "The nickname of Glenn McGrath is what?", 500, "Ooh Ahh", "Penguin", "Big Bird", "Pigeon", "Pigeon","Guess it!");
    }

    public Question getQuestion(int i){
        return questions[i];
    }
    
}
