package MyTry;

public class InversionControl {
    public static void main(String[] args) {

    }
}
class MyStudent{
    myBoard myBoard;
    MyStudent(myBoard newboard){
      this.myBoard =newboard; //new myBoard("BoardName","Red");
    }
    public void addToBoard(String message){
        myBoard.writeboard(message);
    }

}


 class myBoard{
    String board;
    String name;

     public myBoard(String name,String board) {
         this.name = name;
         this.name = board;
     }

     public String getBoard(){
        return this.board;

    }

    public void writeboard(String str){
        this.board = str;

    }
 }
