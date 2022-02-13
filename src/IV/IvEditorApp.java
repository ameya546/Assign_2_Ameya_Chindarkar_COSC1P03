package IV;
import BasicIO.BasicForm;

public class IvEditorApp {
    Node [] lineHeads = new Node[50];

    public static void main(String[] args){
        IvEditorApp app = new IvEditorApp();

        BasicForm form =app.createForm()

        int ipLine;
        String ipStart;



        do {
            form.accept();
            //1. read inputs
            ipLine = form.readInt("L");
            System.out.println(form.readString("S"));
            System.out.println(form.readString("E"));
            System.out.println(form.readString("T"));
            System.out.println(form.readString("action"));

            //2. check action and process
            if(ipAction.equals("Insert")){

            } else if
            form.writeString("O" , form.readString("T"));
        }while(true);
   }

   private BasicForm createForm() {
       String[] RadioLabel = {"Insert","Delete","Replace"};
       BasicForm form = new BasicForm("Apply Edit","Exit");
       form.addTextField("L","Line",4,15,10);
       form.addTextField("S","Start",4,100,10);
       form.addTextField("E","End",4,200,10);
       form.addTextField("T","Text",30);
       form.addRadioButtons("action","Edit Action",false,RadioLabel);
       form.addTextArea("O","OutPut",20,40);
        return  form;
   }

   private void insert(int ipLine, int ipStart, int ipEnd) {
        System.out.println("in insert");
   }
}
