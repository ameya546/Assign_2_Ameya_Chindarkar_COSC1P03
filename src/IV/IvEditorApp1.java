package IV;
import BasicIO.BasicForm;

public class IvEditorApp1 {
    Node [] lineHeads = new Node[50];

    private  Node createLine (String str) {
          Node dummy = new Node(' ');

          if(str == null || str.length() == 0) {
              return dummy.next;
          }

          Node prev = dummy;

         for(char c: str.toCharArray()){
             prev.next = new Node(c);
              prev = prev.next;
         }

         return dummy.next;

    }

    private void print(){
        for(Node node: lineHeads) {
            while(node != null) {
                System.out.print(node.data);
                node = node.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        String text;

        String[] RadioLabel = {"Insert","Delete","Replace"};
        BasicForm form = new BasicForm("Apply Edit","Exit");
        form.addTextField("L","Line",4,15,10);
        form.addTextField("S","Start",4,100,10);
        form.addTextField("E","End",4,200,10);
        form.addTextField("T","Text",30);
        form.addRadioButtons("action","Edit Action",false,RadioLabel);
        form.addTextArea("O","OutPut",20,40);


        do {
            form.accept();
            System.out.println(form.readString("L"));
            System.out.println(form.readString("S"));
            System.out.println(form.readString("E"));
            System.out.println(form.readString("T"));
            System.out.println(form.readString("action"));
            form.writeString("O" , form.readString("T"));
        }while(true);


//        IvEditorApp app = new IvEditorApp();
//
//        //create and insert new lined
//        app.lineHeads[5] = app.createLine("swapnil mehta");
//        app.lineHeads[7] = app.createLine("ameya chindarkar");
//
//        // traverse
//        app.print();
    }
}
