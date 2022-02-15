package IV;
import BasicIO.BasicForm;

public class IvEditorApp {
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

    private void  insert(int ipLine, int ipStart, String ipText){
        Node lineHead = createLine(ipText);

        if(ipStart < 0){
            insertLine(ipLine, lineHead);
        } else {
            insertText(ipLine, ipStart, lineHead);
        }
    }

    private void insertLine(int ipLine, Node lineHead){
        if(lineHeads[ipLine] == null) {
            lineHeads[ipLine] = lineHead;
        } else {
            Node prev = lineHeads[ipLine];
            Node curr = lineHeads[ipLine + 1];

            for(int i = ipLine +1; i < lineHeads.length; i++){
                curr = lineHeads[i];
                lineHeads[i] = prev;
                prev = curr;
            }

            lineHeads[ipLine] = lineHead;
        }
    }

    private void insertText(int ipLine, int ipStart, Node lineHead){
            System.out.println("setting txt");
            if (ipStart == 0) {


            }else if (ipStart > 0){
                for (int i, i == ipStart)

            }


    }


    private void writeOutput(BasicForm form) {
        StringBuilder output = new StringBuilder();

        for(Node lineHead: lineHeads){
            while(lineHead != null){
                System.out.println(lineHead.data);
                output.append(lineHead.data);
                lineHead = lineHead.next;
            }
            output.append("\r\n");
        }

        form.clear("O");
        form.writeString("O", output.toString());

    }

    public static void main(String[] args){
        IvEditorApp app = new IvEditorApp();

        BasicForm form =app.createForm();

        int ipLine;
        int ipStart;
        int ipEnd;
        String ipText;
        String ipAction;



        do {
            form.accept();
            //1. read inputs
            ipLine = form.readInt("L");
            ipStart = form.readInt("S");
            System.out.println("start : " + ipStart);
            ipEnd = form.readInt("E");
            ipText = form.readString("T");
            ipAction = form.readString("action");


            //2. check action and process
            if(ipAction.equals("Insert")){
                System.out.println(ipAction);
                app.insert(ipLine, ipStart, ipText);

            }else if (ipAction.equals("Delete")){
                System.out.println(ipAction);

            }else if (ipAction.equals("Replace")){
                System.out.println(ipAction);
            }

            //form.writeString("O" , form.readString("T"));
            app.writeOutput(form);
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
