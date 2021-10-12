package DiceGame;

import java.util.Scanner;

public class DiceGamblingGame {

public static void main(String[ ] args) {

      Dice dice = new Dice();

      System.out.println("Do you want to play a game? Y/N");
      Scanner scanner =  new Scanner(System.in)   ;
      String choose = scanner.next();
      int prize = 0;
      boolean devam = true;

      if(choose.equals("Y")) {
          while(devam && prize <50 )  {
              System.out.println("Your prize is: " + prize + " Continue ? Y/N");
              String devamedelim = scanner.next() ;
              if(devamedelim.equals("Y")){
                  int diceAmount = dice.rollTheDice();
                  System.out.println("Dice comes :" + diceAmount);

                  if(diceAmount < 3)  {
                      System.out.println("GameOver");
                      prize = prize;
                      devam = false;
                  }
                        else if(diceAmount == 3){
                            System.out.println("You can not earn money. Try Again");
                            
                  }
                        else{
                            prize = prize + diceAmount ;
                  }


                        }
                                                                      
              else if(devamedelim.equals("N"))   {
                  System.out.println("Your prize = " + prize);
              }
              else{
                  System.out.println("Please write Y or N");
              }

             }
}

      else if(choose.equals("N"))      {
          System.out.println("come on go on");
                     }
      else     {
          System.out.println("Please rerun this program and write Y or N");
                   }
              System.out.println("Your final prize is : " + prize);
              scanner.close();
                        }





  }



