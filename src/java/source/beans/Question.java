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
public class Question implements java.io.Serializable{
private String category;
        private String question;
        private int value;
        private String answer1;
        private String answer2;
        private String answer3;
        private String answer4;
        private String correctAnswer;
       private String hint;
       public Question () {
       category="";
       question="";
       value=0;
       answer1="";
       answer2="";
       answer3="";
       answer4="";
       correctAnswer="";
       hint="";}
      
       public Question(String category ,String question,int value, String answer1, String answer2, String answer3, String answer4, String correctAnswer, String hint ){
       this.category= category;
       this.question= question;
       this.value=value;
       this.answer1=answer1;
       this.answer2=answer2;
       this.answer3=answer3;
       this.answer4=answer4;
       this.correctAnswer=correctAnswer;
       this.hint=hint; 
       }
      
        
      // setters
     public void setCategory(String category){
     this.category=category;
     }
     
     public void setQuestion(String question){
     this.question=question;
     }
     
     public void setValue(int value){
     this.value=value;
     }
     public void setAnswer1(String answer1){
     this.answer1=answer1;
     }
     public void setAnswer2(String answer2){
     this.answer2=answer2;
     }
     public void setAnswer3(String answer3){
     this.answer3=answer3;
     }
     public void setAnswer4(String answer4){
     this.answer4=answer4;
     }
     public void setCorrectAnswer(String correctAnswer){
     this.correctAnswer=correctAnswer;
     }
     
     public void setHint(String hint){
     this.hint=hint;
     }
     
     
     // Getters
     public String getCategory(){
     return category;
     }
     public String getQuestion(){
     return question;
     }
    
      public int getValue(){
     return value;
     }
      
    public String getAnswer1(){
     return answer1;
     }
   
   public String getAnswer2(){
     return answer2;
     }
   public String getAnswer3(){
     return answer3;
     }
   public String getAnswer4(){
     return answer4;
     }
     
      public String getCorrectAnswer(){
     return correctAnswer;
     }
     public String getHint(){
     return hint;
     }


public String checkMethod(int num){
if(num==1){
return getAnswer1();

}
else if(num==2){
return getAnswer2();
}
else if (num==3){
return getAnswer3();

}
else return getAnswer4();
}
}  
       
       
       
       
       
       
    
    

